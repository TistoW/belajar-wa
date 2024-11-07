package com.robeth.whatsapp.ActivitySetelan.Akun

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.robeth.whatsapp.databinding.ActivityhapusAkunBinding

class hapusAkunActivity : AppCompatActivity() {
    private lateinit var binding: ActivityhapusAkunBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityhapusAkunBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnKembali.setOnClickListener {
            finish()

        }
    }
}