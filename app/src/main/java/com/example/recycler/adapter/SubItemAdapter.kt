package com.example.recycler.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycler.databinding.SubItemOneBinding
import com.example.recycler.databinding.SubItemThreeBinding
import com.example.recycler.databinding.SubItemTwoBinding
import com.example.recycler.model.SubItem

class SubItemAdapter(var subItemList: ArrayList<SubItem>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    companion object{
        const val FIRSTVIEW = 1
        const val SECONDVIEW = 2
        const val THIRDVIEW = 3
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when(viewType){
            FIRSTVIEW->FirstViewHolder(SubItemOneBinding.inflate(LayoutInflater.from(parent.context), parent, false ))
            SECONDVIEW->SecondViewHolder(SubItemTwoBinding.inflate(LayoutInflater.from(parent.context), parent, false ))
            THIRDVIEW->ThirdViewHolder(SubItemThreeBinding.inflate(LayoutInflater.from(parent.context), parent, false ))
            else->throw IllegalArgumentException("invalid item type")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        return when(subItemList[position].viewType){
            FIRSTVIEW->(holder as FirstViewHolder).onBind(subItemList[position], subItemList.size-position)
            SECONDVIEW->(holder as SecondViewHolder).onBind(subItemList[position], subItemList.size-position)
            THIRDVIEW->(holder as ThirdViewHolder).onBind(subItemList[position], subItemList.size-position)
            else->throw IllegalArgumentException("invalid item type")
        }
    }

    override fun getItemCount(): Int {
        return subItemList.size
    }
    override fun getItemViewType(position: Int): Int {
        return subItemList[position].viewType
    }

}