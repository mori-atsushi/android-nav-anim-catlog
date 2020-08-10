package com.example.nav_anim_catalog.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nav_anim_catalog.databinding.ItemDemoBinding

class DemosAdapter(
    private val list: List<DemoData>,
    private val onClick: (DemoData) -> Unit
) : RecyclerView.Adapter<DemosAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemDemoBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = list[position]
        holder.binding.also {
            it.title.text = data.title
            it.description.text = data.description
            it.root.setOnClickListener {
                onClick(data)
            }
        }
    }

    class ViewHolder(
        val binding: ItemDemoBinding
    ) : RecyclerView.ViewHolder(binding.root)
}
