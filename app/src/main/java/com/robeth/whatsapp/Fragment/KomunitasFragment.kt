package com.robeth.whatsapp.Fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.robeth.whatsapp.HomeSetelanActivity
import com.robeth.whatsapp.databinding.FragmentKomunitasBinding

class KomunitasFragment : Fragment() {
    private var _binding: FragmentKomunitasBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentKomunitasBinding.inflate(inflater, container, false)
        binding.btnSetelan.setOnClickListener() {
            val intent = Intent(requireActivity(), HomeSetelanActivity::class.java)
            startActivity(intent)
            buttonAtas()
        }
        return binding.root
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }

    private fun buttonAtas() {
        binding.apply {

            btnSetelan.setOnClickListener {
                startActivity(Intent(requireActivity(), HomeSetelanActivity::class.java))
            }
        }
    }
}