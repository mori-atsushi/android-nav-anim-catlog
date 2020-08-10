package com.example.nav_anim_catalog.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.nav_anim_catalog.databinding.FragmentListBinding

class ListFragment : Fragment() {
    companion object {
        private val list = listOf(
            DemoData("Nothing", "without animation")
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentListBinding.inflate(inflater, container, false)
        val adapter = DemosAdapter(list)
        binding.recyclerView.adapter = adapter

        return binding.root
    }
}
