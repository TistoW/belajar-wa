package com.robeth.whatsapp.ActivitySetelan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.robeth.whatsapp.databinding.ActivitypembaruanaplikasiBinding

class PembaruanApilkasiActivity:AppCompatActivity() {
    private lateinit var binding: ActivitypembaruanaplikasiBinding

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        binding = ActivitypembaruanaplikasiBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mainButton()


    }

    private fun mainButton() {
        binding.btnKembali.setOnClickListener() {
            finish()

        }
    }
}