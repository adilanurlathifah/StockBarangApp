package org.assesment3

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import org.assesment3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding.recyclerView) {
            addItemDecoration(DividerItemDecoration(context, RecyclerView.VERTICAL))
            adapter = MainAdapter(getData())
            setHasFixedSize(true)
        }
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