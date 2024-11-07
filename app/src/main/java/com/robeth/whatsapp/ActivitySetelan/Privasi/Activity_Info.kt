package com.robeth.whatsapp.ActivitySetelan.Privasi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.robeth.whatsapp.databinding.ActivityInfoBinding

class Activity_Info : AppCompatActivity() {
    private lateinit var binding: ActivityInfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInfoBinding.inflate(layoutInflater)
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