package com.reinaldodosan.lojavirtualapi.apidummyjson

data class ResultProducts(
    val limit: Int,
    val products: List<Product>,
    val skip: Int,
    val total: Int
)