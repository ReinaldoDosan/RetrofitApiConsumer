package com.reinaldodosan.lojavirtualapi.apidummyjson

data class ProductsResponse(
    val products: List<ResultProducts>,
    val total: Int,
    val skip: Int,
    val limit: Int
)
