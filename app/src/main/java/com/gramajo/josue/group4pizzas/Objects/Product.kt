package com.gramajo.josue.group4pizzas.Objects

import java.io.Serializable

/**
 * Created by josuegramajo on 10/30/18.
 */
class Product : Serializable{
    var id : Int? = 0
    var name : String? = null
    var description : String? = null
    var price : Float = 0.toFloat()

    constructor(){}

    constructor(id:Int, name:String, description:String, price: Float){
        this.id = id
        this.name = name
        this.description = description
        this.price = price
    }

}