package com.gramajo.josue.group4pizzas.Activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.gramajo.josue.group4pizzas.Objects.Product
import com.gramajo.josue.group4pizzas.R
import com.gramajo.josue.group4pizzas.Utils.ProductImages
import kotlinx.android.synthetic.main.activity_scroll.*

/**
 * Created by josuegramajo on 10/30/18.
 */
class ScrollActivity : AppCompatActivity(){

    var selectedProduct = Product()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scroll)

        if (actionBar != null) {
            actionBar.setTitle("Pizza Pepperoni")
        }

        intent?.let {
            selectedProduct = intent.getSerializableExtra("selectedProduct") as Product
            iv_scroll.setImageResource(ProductImages().getProductImageById(selectedProduct.id!!))
            tv_description.text = "${selectedProduct.name} \n\n${selectedProduct.description} \n\nPRECIO: Q.${selectedProduct.price}"
        }

    }
}