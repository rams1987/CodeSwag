package com.rams.appollo.codeswag.Services

import com.rams.appollo.codeswag.Model.Category
import com.rams.appollo.codeswag.Model.Products

object DataService {

    val categories = listOf(
            Category("SHIRTS","Shirtimage"),
            Category("HOODIES","hoodieimage"),
            Category("HATS","hatimage"),
            Category("DIGITAL","digitalgoodsimage"),
            Category("SHIRTS","Shirtimage"),
            Category("HOODIES","hoodieimage"),
            Category("HATS","hatimage"),
            Category("DIGITAL","digitalgoodsimage"),
            Category("SHIRTS","Shirtimage"),
            Category("HOODIES","hoodieimage"),
            Category("HATS","hatimage"),
            Category("DIGITAL","digitalgoodsimage")

    )

    val hats = listOf(
            Products("graphic beanie","$10","hat1"),
            Products("graphic beanie2","$10","hat2"),
            Products("graphic beanie3","$10","hat3"),
            Products("graphic beanie4","$10","hat4")
    )

    val hoodies = listOf(
            Products("graphic beanie","$10","hoodie1"),
            Products("graphic beanie2","$10","hoodie2"),
            Products("graphic beanie3","$10","hoodie3"),
            Products("graphic beanie4","$10","hoodie4")
    )

    val shirts = listOf(
            Products("graphic shirts","$10","shirt1"),
            Products("graphic shirts2","$10","shirt2"),
            Products("graphic shirts3","$10","shirt3"),
            Products("graphic shirts4","$10","shirt4"),
            Products("graphic shirts5","$10","shirt5")
    )

    val digitalGood = listOf<Products>()

    fun getProducts(category: String) : List<Products>{
        return when(category){
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGood
        }
    }

}