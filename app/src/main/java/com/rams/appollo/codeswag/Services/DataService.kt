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
            Products("graphic beanie","$10","hat01"),
            Products("graphic beanie2","$10","hat02"),
            Products("graphic beanie3","$10","hat03"),
            Products("graphic beanie4","$10","hat04")
    )

    val hoodies = listOf(
            Products("graphic beanie","$10","hoodie01"),
            Products("graphic beanie2","$10","hoodie02"),
            Products("graphic beanie3","$10","hoodie03"),
            Products("graphic beanie4","$10","hoodie04")
    )

    val shirts = listOf(
            Products("graphic shirts","$10","shirt01"),
            Products("graphic shirts2","$10","shirt02"),
            Products("graphic shirts3","$10","shirt03"),
            Products("graphic shirts4","$10","shirt04"),
            Products("graphic shirts5","$10","shirt05")
    )

}