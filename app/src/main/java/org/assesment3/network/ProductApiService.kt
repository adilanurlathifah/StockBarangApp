package org.assesment3.network

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

private const val BASE_URL = "https://raw.githubusercontent.com/adilanurlathifah/json-StockQuantity/main/"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface ProductApiService {
    @GET("product.json")
    suspend fun getProduct(): String
}
object ProductApi {
    val service: ProductApiService by lazy {
        retrofit.create(ProductApiService::class.java)
    }
}