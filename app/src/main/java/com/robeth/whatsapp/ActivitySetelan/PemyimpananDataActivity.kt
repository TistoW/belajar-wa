package com.robeth.whatsapp.ActivitySetelan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.robeth.whatsapp.databinding.ActivitypenyimpanandandataBinding
class PemyimpananDataActivity:AppCompatActivity() {
    private lateinit var binding: ActivitypenyimpanandandataBinding

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        binding = ActivitypenyimpanandandataBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mainButton()


    }

    private fun mainButton() {
        binding.btnKembali.setOnClickListener() {
            finish()

        }
    }
}