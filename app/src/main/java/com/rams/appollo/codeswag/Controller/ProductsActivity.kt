package com.rams.appollo.codeswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.rams.appollo.codeswag.R
import com.rams.appollo.codeswag.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_products)
        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)

        println(categoryType)
    }
}
