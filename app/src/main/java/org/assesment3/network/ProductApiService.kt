package org.assesment3.network

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import org.assesment3.model.Product
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

private const val BASE_URL = "https://raw.githubusercontent.com/adilanurlathifah/json-StockQuantity/main/"

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

interface ProductApiService {
    @GET("product.json")
    suspend fun getProduct(): List<Product>
}
object ProductApi {
    val service: ProductApiService by lazy {
        retrofit.create(ProductApiService::class.java)
    }
    fun getProductUrl(imageId: String): String {
        return "$BASE_URL$imageId.jpg"
    }

}

enum class ApiStatus { LOADING, SUCCESS, FAILED }
