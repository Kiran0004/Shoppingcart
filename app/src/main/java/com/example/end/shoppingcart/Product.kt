package com.example.end.shoppingcart


import com.google.gson.annotations.SerializedName

/**
 * Created by Kiran.
 */


data class Product(

    @SerializedName("id")
    var id: Int? = null,

    @SerializedName("name")
    var name: String? = null,

    @SerializedName("price")
    var price: Int = 0,

    @SerializedName("image")
    var photos: String? = null
)