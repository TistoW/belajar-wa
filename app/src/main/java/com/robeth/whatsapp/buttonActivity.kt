package com.robeth.whatsapp

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class buttonActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.button_bar_bottom)

        val btn1= findViewById<LinearLayout>(R.id.LLchat)
        val btn2= findViewById<LinearLayout>(R.id.LLpembaruan)
        val btn3= findViewById<LinearLayout>(R.id.LLkomunitas)
        val btn4= findViewById<LinearLayout>(R.id.LLpanggilan)

        btn1.setOnClickListener{

        }
        btn2.setOnClickListener{
            intent = Intent(this, FragmentPembaruanActivity::class.java).also {
                startActivity(it)
            }

            }
        btn3.setOnClickListener{
            intent = Intent(this, FragmentKomunitasActivity::class.java).also {
                startActivity(it)
            }
        }
        btn4.setOnClickListener{
            intent = Intent(this, FragmentPanggilanActivity::class.java).also {
                startActivity(it)
            }
        }

    }
}