package org.assesment3.fragment.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.assesment3.R
import org.assesment3.model.Product
import org.assesment3.network.ProductApi

class MainViewModel : ViewModel() {
    private val data = MutableLiveData<List<Product>>()

    init {
        data.value = initData()
        retrieveData()
    }

    private fun retrieveData() {
        viewModelScope.launch (Dispatchers.IO) {
            try {
                val result = ProductApi.service.getProduct()
                Log.d("MainViewModel", "Success: $result")
            } catch (e: Exception) {
                Log.d("MainViewModel", "Failure: ${e.message}")
            }
        }
    }

    private fun initData(): List<Product> {
        return listOf(
            Product("Khong Guan", "Biskuit Kaleng Khong Guan", R.drawable.biskuit),
            Product("Indomie", "Mie Instan Goreng Original", R.drawable.indomie),
            Product("Pronas", "Kornet Daging Sapi", R.drawable.kornet),
            Product("Sariwangi", "Teh Sari Murni", R.drawable.teh_sarimurni),
            Product("Ultramilk", "Susu Rasa Coklat", R.drawable.ultramilk),
            Product("Cimory", "Yogurt Drink Low Fat", R.drawable.yoghurt),
            Product("Sedaap", "Minyak Goreng 2liter", R.drawable.minyak_goreng),
            Product("Shinzui", "Body Cleanser 450Ml", R.drawable.shinzui),
            Product("Bango", "Kecap Manis 600ml", R.drawable.kecap_bango),
            Product("Maspion", "Setrika Spray", R.drawable.setrika),
        )
    }
    fun getData(): LiveData<List<Product>> = data
}