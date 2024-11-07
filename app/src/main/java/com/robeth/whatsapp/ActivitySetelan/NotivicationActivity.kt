package com.robeth.whatsapp.ActivitySetelan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.robeth.whatsapp.databinding.ActivitynotifikasiBinding

class NotivicationActivity:AppCompatActivity() {
    private lateinit var binding: ActivitynotifikasiBinding

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        binding = ActivitynotifikasiBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mainButton()


    }

    private fun mainButton() {
        binding.btnKembali.setOnClickListener() {
            finish()

        }
    }
}