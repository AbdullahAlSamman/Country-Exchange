package com.aals.countriesexchange.Adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aals.countriesexchange.Model.Country;
import com.aals.countriesexchange.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Countries adapter for Recycler View in MainActivity.
 */
public class CountriesAdapter extends RecyclerView.Adapter<CountriesAdapter.ViewHolder> implements Filterable {

    private List<Country> fullCountries;
    private List<Country> mCountries;
    private Context context;
    private OnCountryListener onCountryListener;

    /**
     * Instantiates a new Countries adapter.
     *
     * @param countries         the countries
     * @param onCountryListener the on country listener to detect clicks on each item in recycler view
     */
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
            LinearLayout llTextArea = holder.llTextArea;
            llTextArea.getBackground().setAlpha(40);
            TextView countryName = holder.nameTV;
            countryName.setText(country.getName());
            TextView countryLanguage = holder.languageTV;
            countryLanguage.setText(country.languagesToString());
            TextView countryCallingCodes = holder.callingCodeTV;
            countryCallingCodes.setText(country.callingCodesToString());
            ImageView flagImage = holder.flagIV;
            flagImage.setImageBitmap(country.getFlagImage().getBitmap());
        } catch (Exception e) {
            Log.e(this.getClass().getSimpleName(), e.getMessage());
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


    /**
     * The interface On country listener.
     */
    public interface OnCountryListener {
        /**
         * On country click.
         *
         * @param position the item position in recycler view
         */
        void onCountryClick(int position);
    }

    /**
     * The type View holder.
     */
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        /**
         * The TextView Name.
         */
        public TextView nameTV;
        /**
         * The TextView Language.
         */
        public TextView languageTV;
        /**
         * The Text View Calling code.
         */
        public TextView callingCodeTV;
        /**
         * The Image View Flag.
         */
        public ImageView flagIV;
        /**
         * The Linear Layout text area.
         */
        public LinearLayout llTextArea;
        /**
         * The On country listener.
         */
        OnCountryListener onCountryListener;


        /**
         * Instantiates a new View holder.
         *
         * @param itemView          the item view
         * @param onCountryListener the Custom on country listener
         */
        public ViewHolder(final View itemView, OnCountryListener onCountryListener) {
            super(itemView);
            llTextArea = itemView.findViewById(R.id.ll_ic_text_area);
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
