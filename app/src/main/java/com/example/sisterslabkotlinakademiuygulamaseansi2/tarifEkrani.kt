package com.example.sisterslabkotlinakademiuygulamaseansi2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sisterslabkotlinakademiuygulamaseansi2.databinding.ActivityTarifEkraniBinding

class tarifEkrani : AppCompatActivity() {
    private lateinit var binding: ActivityTarifEkraniBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityTarifEkraniBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val intent = this.intent.getStringExtra("yemekAdi").toString()
        val intent2 = this.intent.getStringExtra("yemekTarifi").toString()

        binding.textView3.text = intent
        binding.textView5.text = intent2

    }
}