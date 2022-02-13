package com.example.viewpager

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.viewpager.databinding.LayoutPagerItemBinding

class PagerAdapter(val context: Context, val pagerItem: Int) :
    RecyclerView.Adapter<PagerAdapter.Holder>() {

    class Holder(val binding: LayoutPagerItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val inflater = LayoutInflater.from(parent.context)
        val binding =
            LayoutPagerItemBinding.inflate(inflater, parent, false)
        
        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.binding.tvNumber.text = position.toString()
    }

    override fun getItemCount(): Int {
        return pagerItem
    }
}