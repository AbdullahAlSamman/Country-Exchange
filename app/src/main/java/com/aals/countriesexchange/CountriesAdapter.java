package com.aals.countriesexchange;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CountriesAdapter extends RecyclerView.Adapter<CountriesAdapter.ViewHolder> {

    private ArrayList<Country> mCountries;

    public CountriesAdapter(ArrayList<Country> countries) {
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

        // Set item views based on your views and data model
        TextView textView = holder.nameTextView;
        textView.setText(country.getName());
        Button button = holder.messageButton;
        button.setText(country.getPopulation() + "");
        button.setEnabled(true);
    }

    @Override
    public int getItemCount() {
        return mCountries.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView nameTextView;
        public Button messageButton;


        public ViewHolder(View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.country_name);
            messageButton = itemView.findViewById(R.id.message_button);
        }
    }
}
