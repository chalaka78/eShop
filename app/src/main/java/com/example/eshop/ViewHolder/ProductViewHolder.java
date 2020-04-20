package com.example.eshop.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eshop.Interface.ItemClickListner;
import com.example.eshop.R;

public class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView txtproductName, txtproductDescription, txtProductPrice;
    public ImageView imageView;
    public ItemClickListner listner;

    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);

        imageView = (ImageView) itemView.findViewById(R.id.product_image);
        txtproductName = (TextView) itemView.findViewById(R.id.product_name);
        txtproductDescription = (TextView) itemView.findViewById(R.id.product_description);
        txtProductPrice = (TextView) itemView.findViewById(R.id.product_price);
    }

    public void setItemClickListner(ItemClickListner listner){
        this.listner = listner;
    }

    @Override
    public void onClick(View v) {
        listner.onClick(v, getAdapterPosition(), false );
    }
}
