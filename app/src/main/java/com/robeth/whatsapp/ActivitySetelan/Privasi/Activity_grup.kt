package com.robeth.whatsapp.ActivitySetelan.Privasi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.robeth.whatsapp.databinding.ActivityGrupBinding

class Activity_grup : AppCompatActivity() {
    private lateinit var binding: ActivityGrupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGrupBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mainButton()
    }
    private fun mainButton(){
        binding.apply {
            btnKembali.setOnClickListener {
                finish()
            }
        }
    }
}