package com.robeth.whatsapp.ActivitySetelan.Privasi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.robeth.whatsapp.R
import com.robeth.whatsapp.databinding.ActivityFotoProfilBinding
import com.robeth.whatsapp.databinding.ActivityKontakDiblokirBinding

class Activity_kontak_diblokir : AppCompatActivity() {
    private lateinit var binding: ActivityKontakDiblokirBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityKontakDiblokirBinding.inflate(layoutInflater)
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