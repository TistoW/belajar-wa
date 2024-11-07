package com.robeth.whatsapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.robeth.whatsapp.Fragment.ChatFragment
import com.robeth.whatsapp.Fragment.KomunitasFragment
import com.robeth.whatsapp.Fragment.PanggilanFragment
import com.robeth.whatsapp.Fragment.PembaruanFragment
import com.robeth.whatsapp.databinding.ActivityMainBinding

class MainActivity:AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mainButton()


    }
    private fun chat() {
        val fragment = ChatFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
    private fun pembaruan() {
        val fragment = PembaruanFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
    private fun Komunitas() {
        val fragment = KomunitasFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
    private fun Panggilan() {
        val fragment = PanggilanFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }


    private fun mainButton(){
        binding.apply {

            binding.LLchat.setOnClickListener{
                chat()
            }
            binding.LLpembaruan.setOnClickListener{
                pembaruan()
            }
            binding.LLkomunitas.setOnClickListener{
                Komunitas()
            }

            binding.LLpanggilan.setOnClickListener{
                Panggilan()
            }

        }

    }
}