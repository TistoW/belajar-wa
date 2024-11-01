package com.robeth.whatsapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.robeth.whatsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // untuk menambahkan layout menggunakan view binding
    // ActivityMainBinding itu mengambil dari layout activity_main.xml, menyesuaikan namanya
    private lateinit var binding: ActivityMainBinding
    private val TAG = "TAG"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // untuk menambahkan layout menggunakan view binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        mainButton()
        binding.apply {

        }

    }

    private fun showChatFragment() {
        val fragment = ChatFragment() // Buat instance fragment
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment) // Ganti container dengan fragment
        transaction.addToBackStack(null) // Tambahkan ke back stack jika ingin memungkinkan tombol kembali
        transaction.commit() // Jalankan perubahan
    }


    private fun showPembaruanFragment() {
        val fragment = PembaruanFragment() // Buat instance fragment
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment) // Ganti container dengan fragment
        transaction.addToBackStack(null) // Tambahkan ke back stack jika ingin memungkinkan tombol kembali
        transaction.commit() // Jalankan perubahan
    }

    private fun mainButton() {
        binding.barBawah.apply {
            LLchat.setOnClickListener {
                showChatFragment()
            }

            LLpembaruan.setOnClickListener {
                showPembaruanFragment()
            }

            LLkomunitas.setOnClickListener {
                intent = Intent(this@MainActivity, FragmentKomunitasActivity::class.java).also {
                    startActivity(it)
                }
            }

            LLpanggilan.setOnClickListener {
                intent = Intent(this@MainActivity, FragmentPanggilanActivity::class.java).also {
                    startActivity(it)
                }
            }
        }
    }

    // ketika activity di hancurkan / di tutup
    override fun onDestroy() {
        Log.d(TAG, "onDestroy: ELSHA")
        super.onDestroy()
    }

    // ketika aktiviti mulai nyala
    override fun onStart() {
        Log.d(TAG, "onStart: ABRROR")
        super.onStart()
    }

    //ketia activity berhenti
    override fun onStop() {
        Log.d(TAG, "onStop: BIK MULL")
        super.onStop()
    }

    // ketia activity memulai lagi 
    override fun onRestart() {
        Log.d(TAG, "onRestart: ROBET")
        super.onRestart()
    }

    // ketia activity melanjtkan
    override fun onResume() {
        Log.d(TAG, "onResume: ROBET ")
        super.onResume()
    }
}