package com.robeth.whatsapp.ActivitySetelan.Akun

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.robeth.whatsapp.databinding.ActivitygantiNomorBinding

class gantiNomorActivity : AppCompatActivity() {
    private lateinit var binding: ActivitygantiNomorBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitygantiNomorBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mainButton()

    }
    private fun mainButton() {
        binding.btnKembali.setOnClickListener {
            finish()
        }
    }
}