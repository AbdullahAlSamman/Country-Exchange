package com.aals.countriesexchange.DataControllers;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import com.aals.countriesexchange.DB.AppDB;
import com.aals.countriesexchange.Model.ExchangeODS;
import com.aals.countriesexchange.Model.Quotes;
import com.aals.countriesexchange.R;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ExchangeCallBack implements Callback<List<ExchangeODS>> {

    private Context baseContext;
    private List<ExchangeODS> exchangeOdsList = new ArrayList<ExchangeODS>();
    private Quotes quotes;

    public void setBaseContext(Context baseContext) {
        this.baseContext = baseContext;
    }

    @Override
    public void onResponse(Call<List<ExchangeODS>> call, Response<List<ExchangeODS>> response) {
        if (response.isSuccessful()) {

            exchangeOdsList = response.body();

            quotes = exchangeOdsList.get(0).getExchangeRates().getQuotes();
            quotes.setTimestamp(new Date(exchangeOdsList.get(0).getExchangeRates().getTimestamp()));
            quotes.setBase(exchangeOdsList.get(0).getExchangeRates().getSource());

            new DBInsert().execute(null, null, null);

        } else {
            //TODO: handel error
            Log.e("Error", response.errorBody().toString());
        }
    }

    @Override
    public void onFailure(Call<List<ExchangeODS>> call, Throwable t) {
        //TODO: Handel error
        call.cancel();
    }


    public class DBInsert extends AsyncTask<Void, Void, Void> {


        @Override
        protected Void doInBackground(Void... voids) {

            try {
                AppDB.getInstance(baseContext).exchangeRatesDao().insertRates(quotes);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            DataManager dataManager = new DataManager(baseContext.getResources().getString(R.string.server_url));
            dataManager.startGetCountries();
        }
    }
}
