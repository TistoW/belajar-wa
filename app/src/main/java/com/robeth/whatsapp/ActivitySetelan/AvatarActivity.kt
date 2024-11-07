package com.robeth.whatsapp.ActivitySetelan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.robeth.whatsapp.databinding.ActivityavatarBinding

class AvatarActivity : AppCompatActivity() {
    private lateinit var binding: ActivityavatarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityavatarBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mainButton()


    }

    private fun mainButton() {
        binding.btnKembali.setOnClickListener() {
            finish()
        }
    }
}