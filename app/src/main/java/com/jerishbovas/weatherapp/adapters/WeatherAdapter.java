package com.jerishbovas.weatherapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jerishbovas.weatherapp.R;

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.ViewHolder> {

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView loc_name, temp_value;
        public ImageView loc_img, weather_img, warn_img, next_img;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            loc_name = (TextView) itemView.findViewById(R.id.loc_name);
            temp_value = (TextView) itemView.findViewById(R.id.temp_value);
            loc_img = (ImageView) itemView.findViewById(R.id.loc_img);
            weather_img = (ImageView) itemView.findViewById(R.id.weather_img);
            warn_img = (ImageView) itemView.findViewById(R.id.warn_img);
            next_img = (ImageView) itemView.findViewById(R.id.next_img);
        }
    }

    @NonNull
    @Override
    public WeatherAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View weatherView = inflater.inflate(R.layout.card_view, parent, false);

        ViewHolder viewHolder = new ViewHolder(weatherView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull WeatherAdapter.ViewHolder holder, int position) {
        holder.loc_name.setText("Toronto");
        holder.temp_value.setText("7˚C");
        int id = R.drawable.rainy;
        holder.weather_img.setImageResource(id);
    }

    @Override
    public int getItemCount() {
        return 1;
    }
}
