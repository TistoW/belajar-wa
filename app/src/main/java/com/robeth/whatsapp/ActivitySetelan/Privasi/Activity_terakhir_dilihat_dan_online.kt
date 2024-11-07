package com.robeth.whatsapp.ActivitySetelan.Privasi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.robeth.whatsapp.R
import com.robeth.whatsapp.databinding.ActivityTerakhirDilihatDanOnlineBinding

class Activity_terakhir_dilihat_dan_online : AppCompatActivity() {
    private lateinit var binding: ActivityTerakhirDilihatDanOnlineBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTerakhirDilihatDanOnlineBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mainButton()

    }
    private fun mainButton(){
        binding.apply {
            btnKembali.setOnClickListener {
                finish()
            }
        }
    }
}