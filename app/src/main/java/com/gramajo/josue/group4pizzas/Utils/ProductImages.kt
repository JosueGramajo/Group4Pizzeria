package com.gramajo.josue.group4pizzas.Utils

import com.gramajo.josue.group4pizzas.R

/**
 * Created by josuegramajo on 10/30/18.
 */
class ProductImages{
    fun getProductImageById(id:Int) : Int{
        when(id){
            1 -> return R.drawable.pizza1
            2 -> return R.drawable.pizza2
            3 -> return R.drawable.pizza3
            4 -> return R.drawable.pizza4
            5 -> return R.drawable.pizza5
            6 -> return R.drawable.pizza6
            7 -> return R.drawable.pizza7
            8 -> return R.drawable.pizza8
            9 -> return R.drawable.lasagna
            else -> return 0
        }
    }
}