package com.example.recycler.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycler.R
import com.example.recycler.databinding.ItemMainBinding
import com.example.recycler.model.Item

class ItemAdapter(private var itemList: List<Item>) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    inner class ItemViewHolder(private var binding: ItemMainBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(item: Item){
            val subItemAdapter = SubItemAdapter(item.subItemList)
            binding.apply {
                recyclerMain.adapter = subItemAdapter
                when(item.status){
                    1-> {
                        mainHeader.setBackgroundResource(R.color.orangeLayout)
                        topicColorOrange.visibility = View.VISIBLE
                        topicColorGreen.visibility = View.GONE
                        topicColorRed.visibility = View.GONE
                    }
                    2->{
                        mainHeader.setBackgroundResource(R.color.pinkLayout)
                        topicColorOrange.visibility = View.GONE
                        topicColorGreen.visibility = View.GONE
                        topicColorRed.visibility = View.VISIBLE
                    }
                    0->{
                        mainHeader.setBackgroundResource(R.color.greenLayout)
                        topicColorOrange.visibility = View.GONE
                        topicColorGreen.visibility = View.VISIBLE
                        topicColorRed.visibility = View.GONE
                    }
                }
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