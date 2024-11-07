package com.robeth.whatsapp.ActivitySetelan.Akun

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.robeth.whatsapp.databinding.ActivitymintaInfoAkunBinding
class mintaInfoAkunActivity : AppCompatActivity() {
    private lateinit var binding: ActivitymintaInfoAkunBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitymintaInfoAkunBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnKembali.setOnClickListener {
            finish()

        }
    }
}