package com.robeth.whatsapp.ActivitySetelan.Privasi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.robeth.whatsapp.databinding.ActivityFotoProfilBinding

class Activity_foto_profil : AppCompatActivity() {
    private lateinit var binding: ActivityFotoProfilBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFotoProfilBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mainButton()
    }

    private fun mainButton() {
        binding.apply {
            btnKembali.setOnClickListener {
                finish()
            }
        }

    }
}