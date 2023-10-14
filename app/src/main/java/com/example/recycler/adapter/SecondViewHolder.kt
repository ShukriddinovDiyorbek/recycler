package com.example.recycler.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.recycler.R
import com.example.recycler.databinding.SubItemTwoBinding
import com.example.recycler.model.SubItem

class SecondViewHolder(val binding : SubItemTwoBinding) : RecyclerView.ViewHolder(binding.root) {
    fun onBind(subItem: SubItem, position:Int){
        if (subItem.isCurrent) {
            binding.apply {
                isCurrentIcon.visibility = View.VISIBLE
                isFinishidIcon.visibility = View.GONE
                isLockedIcon.visibility = View.GONE
                startIcon.visibility = View.VISIBLE
                currentNumber.visibility = View.VISIBLE
                currentNumber.text = position.toString()
            }
        }
        if (subItem.isFinished) {
            binding.apply {
                isCurrentIcon.visibility = View.GONE
                isFinishidIcon.visibility = View.VISIBLE
                isLockedIcon.visibility = View.GONE
                startIcon.visibility = View.GONE
                currentNumber.visibility = View.GONE
            }
        }
        if (subItem.isLocked) {
            binding.apply {
                isCurrentIcon.visibility = View.GONE
                isFinishidIcon.visibility = View.GONE
                isLockedIcon.visibility = View.VISIBLE
                startIcon.visibility = View.GONE
                currentNumber.visibility = View.GONE
            }
        }
    }
}