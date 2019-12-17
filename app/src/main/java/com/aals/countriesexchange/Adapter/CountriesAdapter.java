package com.aals.countriesexchange.Adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aals.countriesexchange.Model.Country;
import com.aals.countriesexchange.R;
import com.pixplicity.sharp.Sharp;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class CountriesAdapter extends RecyclerView.Adapter<CountriesAdapter.ViewHolder> implements Filterable {

    private List<Country> fullCountries;
    private List<Country> mCountries;
    private Context context;
    private OnCountryListener onCountryListener;

    public CountriesAdapter(List<Country> countries, OnCountryListener onCountryListener) {
        this.fullCountries = countries;
        mCountries = new ArrayList<Country>(countries);
        this.onCountryListener = onCountryListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View contactView = inflater.inflate(R.layout.item_country, parent, false);
        ViewHolder viewHolder = new ViewHolder(contactView, onCountryListener);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Country country = fullCountries.get(position);
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
        return fullCountries.size();
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                List<Country> filteredList = new ArrayList<>();
                if (constraint.length() == 0 || constraint == null) {
                    filteredList.addAll(mCountries);
                } else {
                    fullCountries.clear();
                    fullCountries.addAll(mCountries);
                    String filterPattern = constraint.toString().toLowerCase().trim();
                    for (Country item : fullCountries) {
                        if (item.getName().toLowerCase().contains(filterPattern) || item.getCallingCodes().get(0).toLowerCase().contains(filterPattern))
                            filteredList.add(item);
                    }

                }
                FilterResults results = new FilterResults();
                results.values = filteredList;
                return results;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {
                fullCountries.clear();
                fullCountries.addAll((List) results.values);
                notifyDataSetChanged();

            }
        };
    }


    public interface OnCountryListener {
        void onCountryClick(int position);
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView nameTV;
        public TextView languageTV;
        public TextView callingCodeTV;
        public ImageView flagIV;
        OnCountryListener onCountryListener;


        public ViewHolder(final View itemView, OnCountryListener onCountryListener) {
            super(itemView);
            nameTV = itemView.findViewById(R.id.country_name);
            languageTV = itemView.findViewById(R.id.country_language);
            callingCodeTV = itemView.findViewById(R.id.country_calling_code);
            flagIV = itemView.findViewById(R.id.country_flag);
            this.onCountryListener = onCountryListener;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            onCountryListener.onCountryClick(getAdapterPosition());
        }
    }
}
