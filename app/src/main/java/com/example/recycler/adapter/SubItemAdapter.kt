package com.example.recycler.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycler.R
import com.example.recycler.databinding.SubItemOneBinding
import com.example.recycler.model.SubItem

class SubItemAdapter(var subItemList: ArrayList<SubItem>) : RecyclerView.Adapter<SubItemAdapter.SubItemViewHolder>() {

    inner class SubItemViewHolder(val binding: SubItemOneBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(subItem : SubItem){
            //
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SubItemViewHolder {
        val binding = SubItemOneBinding.inflate(LayoutInflater.from(parent.context),parent,false)

        return  SubItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return subItemList.size
    }

    override fun onBindViewHolder(holder: SubItemViewHolder, position: Int) {
        val subItem = subItemList[position]
        holder.onBind(subItem)
    }
}