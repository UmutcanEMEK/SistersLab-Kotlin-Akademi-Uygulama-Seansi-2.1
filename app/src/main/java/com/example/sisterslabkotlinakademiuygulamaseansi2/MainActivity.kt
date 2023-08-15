package com.example.sisterslabkotlinakademiuygulamaseansi2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sisterslabkotlinakademiuygulamaseansi2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val intent = Intent(this, tarifEkrani::class.java)
        binding.btnKaydet.setOnClickListener {
            intent.putExtra("yemekAdi", binding.edtTxtAd.text.toString())
            intent.putExtra("yemekTarifi", binding.edtTxtTarif.text.toString())
            startActivity(intent)
        }
    }
}