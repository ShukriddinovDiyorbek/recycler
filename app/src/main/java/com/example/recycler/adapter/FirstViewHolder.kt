package com.example.recycler.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.recycler.R
import com.example.recycler.databinding.SubItemOneBinding
import com.example.recycler.model.SubItem

class FirstViewHolder(private val binding : SubItemOneBinding) :RecyclerView.ViewHolder(binding.root) {
    fun onBind(subItem: SubItem, position:Int){
        if (subItem.isCurrent) {
            binding.apply {
                isCurrentIcon.visibility = View.VISIBLE
                isFinishidIcon.visibility = View.GONE
                isLockedIcon.visibility = View.GONE
                startIcon.visibility = View.VISIBLE
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
        when(position%7){
            0 -> {
                binding.orangeIconOne.visibility = View.VISIBLE
                binding.orangeIconTwo.visibility = View.GONE
                binding.orangeIconThree.visibility = View.GONE
                binding.orangeIconFour.visibility = View.GONE
            }
            1 -> {
                binding.orangeIconOne.visibility = View.GONE
                binding.orangeIconTwo.visibility = View.VISIBLE
                binding.orangeIconThree.visibility = View.GONE
                binding.orangeIconFour.visibility = View.GONE
            }
            3 -> {
                binding.orangeIconOne.visibility = View.GONE
                binding.orangeIconTwo.visibility = View.GONE
                binding.orangeIconThree.visibility = View.VISIBLE
                binding.orangeIconFour.visibility = View.GONE
            }
            5 -> {
                binding.orangeIconOne.visibility = View.GONE
                binding.orangeIconTwo.visibility = View.GONE
                binding.orangeIconThree.visibility = View.GONE
                binding.orangeIconFour.visibility = View.VISIBLE
            }
        }
    }
}