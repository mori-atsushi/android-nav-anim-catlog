package com.example.nav_anim_catalog.sample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.nav_anim_catalog.databinding.FragmentSampleBinding

class SampleFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentSampleBinding.inflate(inflater, container, false)
        return binding.root
    }
}
