package com.example.recycler

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycler.adapter.ItemAdapter
import com.example.recycler.databinding.FragmentHomeBinding
import com.example.recycler.model.Item
import com.example.recycler.model.SubItem

class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding
    lateinit var itemList: ArrayList<Item>
    lateinit var subItemList: ArrayList<SubItem>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        initViews()
        return binding.root
    }

    private fun initViews() {
        itemList = ArrayList()
        subItemList = ArrayList()
        loadData()
        binding.homeRecycler.adapter = ItemAdapter(itemList)
    }

    private fun loadData() {
        subItemList.add(SubItem(1,true,true,true))
        subItemList.add(SubItem(1,true,true,true))
        subItemList.add(SubItem(1,true,true,true))
        subItemList.add(SubItem(1,true,true,true))
        itemList.add(Item("title", "ddesc", subItemList))
        itemList.add(Item("title", "ddesc", subItemList))
        itemList.add(Item("title", "ddesc", subItemList))
        itemList.add(Item("title", "ddesc", subItemList))
        itemList.add(Item("title", "ddesc", subItemList))

    }

}