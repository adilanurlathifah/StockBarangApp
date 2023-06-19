package org.assesment3

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity", "Jumlah data: " + getData().size)
    }

    private fun getData(): List<Product> {
        return listOf(
            Product("Khong Guan", "Biskuit Kaleng Khong Guan"),
            Product("Indomie", "Mie Instan Goreng Original"),
            Product("Pronas", "Kornet Daging Sapi"),
            Product("Sariwangi", "Teh Sari Murni"),
            Product("Ultramilk", "Susu Rasa Coklat"),
            Product("Cimory", "Yogurt Drink Low Fat"),
            Product("Sedaap", "Minyak Goreng 2liter"),
            Product("Shinzui", "Body Cleanser 450Ml"),
            Product("Bango", "Kecap Manis 600ml"),
            Product("Maspion", "Setrika Spray"),
        )
    }
}