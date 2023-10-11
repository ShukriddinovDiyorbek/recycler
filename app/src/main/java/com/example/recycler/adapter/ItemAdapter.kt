package com.example.recycler.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycler.databinding.ItemMainBinding
import com.example.recycler.model.Item

class ItemAdapter(var itemList: ArrayList<Item>) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    inner class ItemViewHolder(var binding: ItemMainBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(item: Item){
            val subItemAdapter = SubItemAdapter(item.subItemList)
            binding.apply {
                recyclerMain.adapter = subItemAdapter
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = ItemMainBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = itemList[position]
        holder.onBind(item)
    }
}