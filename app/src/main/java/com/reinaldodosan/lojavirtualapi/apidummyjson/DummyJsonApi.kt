package com.reinaldodosan.lojavirtualapi.apidummyjson

import retrofit2.Response
import retrofit2.http.GET


interface DummyJsonApi {
    @GET("products")
    suspend fun getProducts(): Response<ProductsResponse>

}