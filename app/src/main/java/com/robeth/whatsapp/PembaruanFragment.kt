package com.robeth.whatsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.robeth.whatsapp.databinding.FragmentBaruBinding
import com.robeth.whatsapp.databinding.FragmentPembaruanBinding

class PembaruanFragment : Fragment() {

    private var _binding: FragmentPembaruanBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPembaruanBinding.inflate(layoutInflater)

        return binding.root
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }

}