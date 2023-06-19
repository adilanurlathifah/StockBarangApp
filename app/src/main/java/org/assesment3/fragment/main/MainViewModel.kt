package org.assesment3.fragment.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.assesment3.R
import org.assesment3.model.Product

class MainViewModel : ViewModel() {
    private val data = MutableLiveData<List<Product>>()

    init {
            data.value = initData()
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