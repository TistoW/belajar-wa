package com.robeth.whatsapp.ActivitySetelan.Akun

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.robeth.whatsapp.R
import com.robeth.whatsapp.databinding.ActivitynotifikasikeamananBinding

class notifikasiKeamananActivity : AppCompatActivity() {
    private lateinit var binding: ActivitynotifikasikeamananBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitynotifikasikeamananBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnKembali.setOnClickListener {
            finish()

        }
    }
}