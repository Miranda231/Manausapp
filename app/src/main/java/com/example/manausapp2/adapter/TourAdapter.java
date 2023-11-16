package com.example.manausapp2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.manausapp2.databinding.TourItemBinding;
import com.example.manausapp2.model.Tour;

import java.util.ArrayList;

public class TourAdapter extends RecyclerView.Adapter<TourAdapter.TourViewHolder> {

    private final ArrayList<Tour> tourList;
    private final Context context;

    public TourAdapter(ArrayList<Tour> tourList, Context context) {
        this.tourList = tourList;
        this.context = context;
    }

    @NonNull
    @Override
    public TourViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        TourItemBinding listItem;
        listItem = TourItemBinding.inflate(LayoutInflater.from(context), parent, false);
        return new TourViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull TourViewHolder holder, int position) {
        holder.binding.imgTour.setBackgroundResource(tourList.get(position).getImgTour());
        holder.binding.textTourName.setText(tourList.get(position).getTourName());
        holder.binding.textTourDescription.setText(tourList.get(position).getFourDescription());

    }

    @Override
    public int getItemCount() {
        return tourList.size();
    }

    public static class TourViewHolder extends RecyclerView.ViewHolder{

        TourItemBinding binding;

        public TourViewHolder(TourItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
