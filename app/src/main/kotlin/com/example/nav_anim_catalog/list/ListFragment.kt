package com.example.nav_anim_catalog.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.nav_anim_catalog.R
import com.example.nav_anim_catalog.databinding.FragmentListBinding

class ListFragment : Fragment() {
    companion object {
        private val list = listOf(
            DemoData("Nothing", "without animation", R.id.to_sample_nothing)
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentListBinding.inflate(inflater, container, false)
        val adapter = DemosAdapter(list) {
            navigate(it)
        }
        binding.recyclerView.adapter = adapter

        return binding.root
    }

    private fun navigate(data: DemoData) {
        findNavController().navigate(data.resId)
    }
}
