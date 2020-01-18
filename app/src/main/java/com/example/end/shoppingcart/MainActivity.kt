package com.example.end.shoppingcart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import io.paperdb.Paper
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by Kiran.
 */


class MainActivity : AppCompatActivity() {

    private lateinit var productAdapter: ProductAdapter

    private var products = listOf<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Paper.init(this)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        products_recyclerview.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        cart_size.text = ShoppingCart.getShoppingCartSize().toString()
        getProducts()

        // This will show list of shopping cart items.
        showCart.setOnClickListener {
            startActivity(Intent(this, ShoppingCartActivity::class.java))
        }
    }

    // This function is used to list all products and assign to adapter
    fun getProducts() {
        var listofVechileName:ArrayList<Product>?= ArrayList<Product>()
        for(i in 1..50){
            var prod: Product = Product()
            prod.name = "Test Shirt ${i}"
            prod.id = i
            prod.photos = "https://media.endclothing.com/media/f_auto,q_auto,w_760,h_760/prodmedia/media/catalog/product/2/6/26-03-2018_gosha_rubchinskiyxadidas_copaprimeknitboostmidsneaker_yellow_g012sh12-220_ka_1.jpg"
            prod.price = 199
            listofVechileName!!.add(prod)
        }
        products = listofVechileName!!
        productAdapter = ProductAdapter(this@MainActivity, products)
        products_recyclerview.adapter = productAdapter
        swipeRefreshLayout.isRefreshing = false
        swipeRefreshLayout.isEnabled = false
    }
}