package com.example.android_hw_3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    List<Country> countryList;

    public
    Adapter(List<Country> countryList) {
        this.countryList = countryList;
    }

    @NonNull
    @Override
    public
    ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( parent.getContext() ).inflate( R.layout.item_list, parent, false );
        return new ViewHolder( view );
    }

    @Override
    public
    void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        int resource = countryList.get( position ).getImageView();
        String country = countryList.get( position ).getCountry();
        String capital = countryList.get( position ).getCapital();

        holder.onBind( resource, country, capital );
    }

    @Override
    public
    int getItemCount() {
        return countryList.size();
    }

    public
    class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView flag;
        private TextView state;
        private TextView gorod;

        public
        ViewHolder(@NonNull View itemView) {
            super( itemView );
            flag = itemView.findViewById( R.id.flag );
            state = itemView.findViewById( R.id.kg );
            gorod = itemView.findViewById( R.id.capital );
        }

        public
        void onBind(int resource, String country, String capital) {

            flag.setImageResource( resource );
            state.setText( country );
            gorod.setText( capital );

        }
    }
}
