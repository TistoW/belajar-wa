package com.robeth.whatsapp.ActivitySetelan

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.robeth.whatsapp.ActivitySetelan.Privasi.Activity_Info
import com.robeth.whatsapp.ActivitySetelan.Privasi.Activity_Timer_pesan_default
import com.robeth.whatsapp.ActivitySetelan.Privasi.Activity_foto_profil
import com.robeth.whatsapp.ActivitySetelan.Privasi.Activity_grup
import com.robeth.whatsapp.ActivitySetelan.Privasi.Activity_kontak_diblokir
import com.robeth.whatsapp.ActivitySetelan.Privasi.Activity_kunci_aplikasi
import com.robeth.whatsapp.ActivitySetelan.Privasi.Activity_kunci_chat
import com.robeth.whatsapp.ActivitySetelan.Privasi.Activity_lanjutan
import com.robeth.whatsapp.ActivitySetelan.Privasi.Activity_lokasi_terkini
import com.robeth.whatsapp.ActivitySetelan.Privasi.Activity_panggilan
import com.robeth.whatsapp.ActivitySetelan.Privasi.Activity_pemeriksaan_privasi
import com.robeth.whatsapp.ActivitySetelan.Privasi.Activity_status
import com.robeth.whatsapp.ActivitySetelan.Privasi.Activity_terakhir_dilihat_dan_online
import com.robeth.whatsapp.databinding.ActivityFotoProfilBinding
import com.robeth.whatsapp.databinding.ActivityGrupBinding
import com.robeth.whatsapp.databinding.ActivityInfoBinding
import com.robeth.whatsapp.databinding.ActivityKontakDiblokirBinding
import com.robeth.whatsapp.databinding.ActivityKunciAplikasiBinding
import com.robeth.whatsapp.databinding.ActivityKunciChatBinding
import com.robeth.whatsapp.databinding.ActivityLanjutanBinding
import com.robeth.whatsapp.databinding.ActivityLokasiTerkiniBinding
import com.robeth.whatsapp.databinding.ActivityPanggilanBinding
import com.robeth.whatsapp.databinding.ActivityPemeriksaanPrivasiBinding
import com.robeth.whatsapp.databinding.ActivityStatusBinding
import com.robeth.whatsapp.databinding.ActivityTerakhirDilihatDanOnlineBinding
import com.robeth.whatsapp.databinding.ActivityTimerPesanDefaultBinding
import com.robeth.whatsapp.databinding.ActivityprivasiBinding

class PrivasiActivity:AppCompatActivity() {
    private lateinit var binding: ActivityprivasiBinding

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        binding = ActivityprivasiBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mainButton()

    }

    private fun mainButton() {
        binding.apply {
            btnKembali.setOnClickListener() {
                finish()
            }
            btnTerakhirDilihatDanOnline.setOnClickListener {
                val intent = Intent(this@PrivasiActivity,Activity_terakhir_dilihat_dan_online::class.java)
                startActivity(intent)
            }
            btnFotoProvil.setOnClickListener {
                val intent = Intent(this@PrivasiActivity, Activity_foto_profil::class.java)
                startActivity(intent)
            }
            btnInfo.setOnClickListener {
                val intent = Intent(this@PrivasiActivity, Activity_Info::class.java)
                startActivity(intent)
            }
            btnStatus.setOnClickListener {
                val intent = Intent(this@PrivasiActivity, Activity_status::class.java)
                startActivity(intent)
            }
            btnTimerPesanDefault.setOnClickListener {
                val intent = Intent(this@PrivasiActivity, Activity_Timer_pesan_default::class.java)
                startActivity(intent)
            }
            btnGrup.setOnClickListener {
                val intent = Intent(this@PrivasiActivity, Activity_grup::class.java)
                startActivity(intent)
            }
            btnLokasiTerkini.setOnClickListener {
                val intent = Intent(this@PrivasiActivity, Activity_lokasi_terkini::class.java)
                startActivity(intent)
            }
            btnPanggilan.setOnClickListener {
                val intent = Intent(this@PrivasiActivity, Activity_panggilan::class.java)
                startActivity(intent)
            }
            btnKontakDiblokir.setOnClickListener {
                val intent = Intent(this@PrivasiActivity, Activity_kontak_diblokir::class.java)
                startActivity(intent)
            }
            btnKunciAplikasi.setOnClickListener {
                val intent = Intent(this@PrivasiActivity, Activity_kunci_aplikasi::class.java)
                startActivity(intent)
            }
            btnKunciChat.setOnClickListener {
                val intent = Intent(this@PrivasiActivity, Activity_kunci_chat::class.java)
                startActivity(intent)
            }
            btnLanjutan.setOnClickListener {
                val intent = Intent(this@PrivasiActivity, Activity_lanjutan::class.java)
                startActivity(intent)
            }
            btnPemeriksaanPrivasi.setOnClickListener {
                val intent = Intent(this@PrivasiActivity, Activity_pemeriksaan_privasi::class.java)
                startActivity(intent)
            }
        }
    }
}