package com.rams.appollo.codeswag.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.ArrayAdapter
import android.widget.Toast
import com.rams.appollo.codeswag.Adapters.CategoryAdapter
import com.rams.appollo.codeswag.Adapters.CategoryRecycleAdaptor
import com.rams.appollo.codeswag.Model.Category
import com.rams.appollo.codeswag.R
import com.rams.appollo.codeswag.Services.DataService
import com.rams.appollo.codeswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // Initialize adapter - customAdaptor examples
    lateinit var adapter: CategoryRecycleAdaptor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdaptor(this,DataService.categories) {category ->
            println(category.title)
            val productIntent = Intent(this, ProductsActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY, category.title)


            startActivity(productIntent)
        }
        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)


        // click for list view
//        categoryListView.setOnItemClickListener { parent, view, position, id ->
//            val category = DataService.categories[position]
//            Toast.makeText(this, "you clicked on the ${category.title} cell",Toast.LENGTH_SHORT).show()
//        }

    }
}
