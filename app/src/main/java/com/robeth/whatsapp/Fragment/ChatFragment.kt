package com.robeth.whatsapp.Fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.robeth.whatsapp.HomeSetelanActivity
import com.robeth.whatsapp.databinding.FragmentChatBinding

class ChatFragment : Fragment() {
    private var _binding: FragmentChatBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentChatBinding.inflate(inflater, container, false)
        buttonAtas()
        return binding.root
    }
    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }

    private fun buttonAtas() {
        binding.apply {
            buttonCamera.setOnClickListener {

            }
            buttonCari.setOnClickListener {

            }
            btnSetelan.setOnClickListener {
                startActivity(Intent(requireActivity(), HomeSetelanActivity::class.java))
            }

        }

    }
}