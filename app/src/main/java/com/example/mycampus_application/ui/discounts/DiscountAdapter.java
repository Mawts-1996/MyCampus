package com.example.mycampus_application.ui.discounts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.mycampus_application.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DiscountAdapter extends RecyclerView.Adapter<DiscountAdapter.ViewHolder> {

    private ArrayList<String> mDiscountImage;
    private ArrayList<String> mDiscountName;
    private Context mContext;

    public DiscountAdapter(ArrayList<String> mDiscountImage, ArrayList<String> mDiscountName, Context mContext) {
        this.mDiscountImage = mDiscountImage;
        this.mDiscountName = mDiscountName;
        this.mContext  = mContext;
    }

    @NonNull
    @Override
    public DiscountAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_discount,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Glide.with(mContext)
                .asBitmap()
                .load(mDiscountImage.get(position))
                .into(holder.discount_image);
        holder.discount_name.setText(mDiscountName.get(position));
        holder.parent_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return mDiscountName.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView discount_image;
        TextView discount_name;
        RelativeLayout parent_layout;


        public ViewHolder(View itemView) {
            super(itemView);
            discount_image = itemView.findViewById(R.id.discount_image);
            discount_name = itemView.findViewById(R.id.discount_name);
            parent_layout = itemView.findViewById(R.id.discount_parent_layout);

        }
    }



}
