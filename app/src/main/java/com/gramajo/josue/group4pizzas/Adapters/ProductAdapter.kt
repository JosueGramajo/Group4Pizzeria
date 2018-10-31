package com.gramajo.josue.group4pizzas.Adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.gramajo.josue.group4pizzas.Objects.Product
import com.gramajo.josue.group4pizzas.R
import com.gramajo.josue.group4pizzas.Utils.ProductImages
import org.jetbrains.anko.find

/**
 * Created by josuegramajo on 10/30/18.
 */
class ProductAdapter(val list:List<Product>, val itemClick:(Product) -> Unit) : RecyclerView.Adapter<ProductAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.menu_cell, parent, false))
    }

    override fun getItemCount(): Int = list.count()

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = list.get(position)

        holder.productName.text = product.name
        holder.productImage.setImageResource(ProductImages().getProductImageById(product.id!!))

        holder.productImage.setOnClickListener { itemClick(product) }
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val productName = itemView.find<TextView>(R.id.cell_text)
        val productImage = itemView.find<ImageView>(R.id.cell_image)
    }

}