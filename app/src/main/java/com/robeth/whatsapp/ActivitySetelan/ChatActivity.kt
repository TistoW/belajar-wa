package com.robeth.whatsapp.ActivitySetelan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.robeth.whatsapp.databinding.ActivityakunBinding

class ChatActivity:AppCompatActivity() {
    private lateinit var binding: ActivityakunBinding

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        binding = ActivityakunBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mainButton()


    }

    private fun mainButton() {
        binding.btnKembali.setOnClickListener() {
            finish()

        }
    }
}