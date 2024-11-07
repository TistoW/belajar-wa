package com.robeth.whatsapp.ActivitySetelan.Akun

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.robeth.whatsapp.databinding.ActivityalamatemailBinding

class alamatEmailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityalamatemailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityalamatemailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnKembali.setOnClickListener {
            finish()

        }

    }
}