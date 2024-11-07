package com.robeth.whatsapp.ActivitySetelan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.robeth.whatsapp.databinding.FragmentChatBinding

class BaruActivity:AppCompatActivity() {
    private lateinit var binding: FragmentChatBinding

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        binding = FragmentChatBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mainButton()


    }

    private fun mainButton(){

    }
}