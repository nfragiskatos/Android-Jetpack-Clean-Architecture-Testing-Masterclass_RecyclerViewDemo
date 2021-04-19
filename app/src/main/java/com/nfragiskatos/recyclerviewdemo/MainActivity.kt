package com.nfragiskatos.recyclerviewdemo

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val fruitsList =
        listOf<Fruit>(
            Fruit("Mango", "Tom"),
            Fruit("Apple", "Chevy"),
            Fruit("Banana", "Andy"),
            Fruit("Lemon", "Brock"),
            Fruit("Guava", "Sharron"),
            Fruit("Pineapple", "Molly"),
            Fruit("Pear", "Simone"),
            Fruit("Orange", "Yogi")
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.my_recyclerView).also {
            it.setBackgroundColor(Color.YELLOW)
            it.layoutManager = LinearLayoutManager(this)
            it.adapter = MyRecyclerViewAdapter(fruitsList, {f -> listItemClicked(f)})
        }
    }

    private fun listItemClicked(fruit: Fruit) {
        Toast.makeText(this@MainActivity, "Supplier name is ${fruit.supplier}", Toast.LENGTH_SHORT ).show()
    }
}