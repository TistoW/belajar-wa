package com.robeth.whatsapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.robeth.whatsapp.ActivitySetelan.AkunActivity
import com.robeth.whatsapp.ActivitySetelan.AvatarActivity
import com.robeth.whatsapp.ActivitySetelan.BantuanActivity
import com.robeth.whatsapp.ActivitySetelan.ChatActivity
import com.robeth.whatsapp.ActivitySetelan.FavoritActivity
import com.robeth.whatsapp.ActivitySetelan.NotivicationActivity
import com.robeth.whatsapp.ActivitySetelan.PembaruanApilkasiActivity
import com.robeth.whatsapp.ActivitySetelan.PemyimpananDataActivity
import com.robeth.whatsapp.ActivitySetelan.PrivasiActivity
import com.robeth.whatsapp.ActivitySetelan.ProfilActivity
import com.robeth.whatsapp.ActivitySetelan.UndangantemanActivity
import com.robeth.whatsapp.databinding.HomeSetelanBinding

class HomeSetelanActivity:AppCompatActivity() {
    private lateinit var binding: HomeSetelanBinding

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        binding = HomeSetelanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainButton()
    }

    private fun mainButton(){
        binding.apply {
            btnakun.setOnClickListener {
                val intent = Intent(this@HomeSetelanActivity, AkunActivity::class.java)
                startActivity(intent)
            }
            btnAvatar.setOnClickListener {
                val intent = Intent(this@HomeSetelanActivity, AvatarActivity::class.java)
                startActivity(intent)
            }
            btnBantuan.setOnClickListener {
                val intent = Intent(this@HomeSetelanActivity, BantuanActivity::class.java)
                startActivity(intent)
            }
            btnChat.setOnClickListener {
                val intent = Intent(this@HomeSetelanActivity, ChatActivity::class.java)
                startActivity(intent)
            }
            btnFavorit.setOnClickListener {
                val intent = Intent(this@HomeSetelanActivity, FavoritActivity::class.java)
                startActivity(intent)
            }
            btnNotivikations.setOnClickListener{
                val intent = Intent(this@HomeSetelanActivity, NotivicationActivity::class.java)
                startActivity(intent)
            }
            btnPembaruanAplikasi.setOnClickListener {
                val intent = Intent(this@HomeSetelanActivity, PembaruanApilkasiActivity::class.java)
                startActivity(intent)
            }
            btnPenyimpananData.setOnClickListener {
                val intent = Intent(this@HomeSetelanActivity, PemyimpananDataActivity::class.java)
                startActivity(intent)
            }
            btnPrivasi.setOnClickListener {
                val intent = Intent(this@HomeSetelanActivity, PrivasiActivity::class.java)
                startActivity(intent)
            }
            btnUndangTeman.setOnClickListener {
                val intent = Intent(this@HomeSetelanActivity, UndangantemanActivity::class.java)
                startActivity(intent)
            }
            btnprofil.setOnClickListener {
                val intent = Intent(this@HomeSetelanActivity, ProfilActivity::class.java)
                startActivity(intent)
            }
            btnKembali.setOnClickListener {
                finish()
            }


        }
    }
}