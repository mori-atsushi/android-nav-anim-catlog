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
            DemoData("Nothing", "without animation", R.id.to_sample_nothing),
            DemoData("Fade In / Fade Out", "default animation", R.id.to_sample_fade),
            DemoData("Slide In / Slide Out", "slide and fade animation", R.id.to_sample_slide),
            DemoData("Zoom In / Zoom Out", "zoom and fade animation", R.id.to_sample_zoom)
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
