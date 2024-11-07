package com.robeth.whatsapp.ActivitySetelan

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.robeth.whatsapp.ActivitySetelan.Akun.alamatEmailActivity
import com.robeth.whatsapp.ActivitySetelan.Akun.gantiNomorActivity
import com.robeth.whatsapp.ActivitySetelan.Akun.hapusAkunActivity
import com.robeth.whatsapp.ActivitySetelan.Akun.kunciSandiActivity
import com.robeth.whatsapp.ActivitySetelan.Akun.mintaInfoAkunActivity
import com.robeth.whatsapp.ActivitySetelan.Akun.notifikasiKeamananActivity
import com.robeth.whatsapp.ActivitySetelan.Akun.verifikasiActivity
import com.robeth.whatsapp.databinding.ActivityakunBinding

class AkunActivity:AppCompatActivity() {
    private lateinit var binding: ActivityakunBinding

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        binding = ActivityakunBinding.inflate(layoutInflater)
        setContentView(binding.root)
        btnAkun()

    }

    private fun btnAkun(){
        binding.apply {
            btnKembali.setOnClickListener {
                finish()
            }
            btnAkun1.setOnClickListener {
                val intent = Intent(this@AkunActivity, notifikasiKeamananActivity::class.java)
                startActivity(intent)
            }
            btnAkun2.setOnClickListener {
                val intent = Intent(this@AkunActivity, kunciSandiActivity::class.java)
                startActivity(intent)
            }
            btnAkun3.setOnClickListener {
                val intent = Intent(this@AkunActivity, alamatEmailActivity::class.java)
                startActivity(intent)
            }
            btnAkun4.setOnClickListener {
                val intent = Intent(this@AkunActivity, verifikasiActivity::class.java)
                startActivity(intent)
            }
            btnAkun5.setOnClickListener {
                val intent = Intent(this@AkunActivity, gantiNomorActivity::class.java)
                startActivity(intent)
            }
            btnAkun6.setOnClickListener {
                val intent = Intent(this@AkunActivity, mintaInfoAkunActivity::class.java)
                startActivity(intent)
            }
            btnAkun8.setOnClickListener {
                val intent = Intent(this@AkunActivity, hapusAkunActivity::class.java)
                startActivity(intent)
            }


        }
    }
}