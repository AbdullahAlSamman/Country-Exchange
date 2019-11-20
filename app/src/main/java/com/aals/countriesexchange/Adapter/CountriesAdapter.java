package com.aals.countriesexchange.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aals.countriesexchange.Model.Country;
import com.aals.countriesexchange.R;
import com.pixplicity.sharp.Sharp;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

public class CountriesAdapter extends RecyclerView.Adapter<CountriesAdapter.ViewHolder> {

    private List<Country> mCountries;

    public CountriesAdapter(List<Country> countries) {
        this.mCountries = countries;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View contactView = inflater.inflate(R.layout.item_country, parent, false);
        ViewHolder viewHolder = new ViewHolder(contactView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Country country = mCountries.get(position);
        try {
            TextView countryName = holder.nameTV;
            countryName.setText(country.getName());
            TextView countryLanguage = holder.languageTV;
            countryLanguage.setText(country.languagesToString());
            TextView countryCallingCodes = holder.callingCodeTV;
            countryCallingCodes.setText(country.callingCodesToString());
            ImageView flagImage = holder.flagIV;
            InputStream targetStream = new ByteArrayInputStream(country.getFlagImage());
            Sharp.loadInputStream(targetStream).into(flagImage);
        } catch (Exception e) {
            //TODO:right handling
            e.printStackTrace();
        }
    }

    @Override
    public int getItemCount() {
        return mCountries.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView nameTV;
        public TextView languageTV;
        public TextView callingCodeTV;
        public ImageView flagIV;


        public ViewHolder(View itemView) {
            super(itemView);
            nameTV = itemView.findViewById(R.id.country_name);
            languageTV = itemView.findViewById(R.id.country_language);
            callingCodeTV = itemView.findViewById(R.id.country_calling_code);
            flagIV = itemView.findViewById(R.id.country_flag);
        }
    }
}
