package com.robeth.whatsapp.ActivitySetelan

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import com.robeth.whatsapp.ActivitySetelan.Akun.gantiNomorActivity
import com.robeth.whatsapp.databinding.ActivityprofilBinding

class ProfilActivity : AppCompatActivity() {
    private lateinit var binding: ActivityprofilBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityprofilBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mainButton()
    }

    private fun mainButton() {
        binding.apply {
            btnKembali.setOnClickListener() {
                finish()
            }
            btnrprofilTelepon.setOnClickListener {
                val intent = Intent(this@ProfilActivity, gantiNomorActivity::class.java)
                startActivity(intent)
            }
        }
    }
}