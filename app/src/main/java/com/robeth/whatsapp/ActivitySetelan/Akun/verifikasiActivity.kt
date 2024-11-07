package com.robeth.whatsapp.ActivitySetelan.Akun

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.robeth.whatsapp.databinding.ActivityveriifikasiDuaLangkahBinding

class verifikasiActivity : AppCompatActivity() {
    private lateinit var binding: ActivityveriifikasiDuaLangkahBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityveriifikasiDuaLangkahBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnKembali.setOnClickListener {
            finish()

        }
    }
}