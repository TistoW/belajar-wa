package com.robeth.whatsapp.ActivitySetelan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.robeth.whatsapp.databinding.ActivityundangtemanBinding
class UndangantemanActivity:AppCompatActivity() {
    private lateinit var binding: ActivityundangtemanBinding

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        binding = ActivityundangtemanBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mainButton()
        
    }

    private fun mainButton() {
        binding.btnKembali.setOnClickListener() {
            finish()

        }
    }
}