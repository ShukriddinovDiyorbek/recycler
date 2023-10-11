package com.example.recycler.model

data class Item(val title: String,val description: String, var subItemList: ArrayList<SubItem>)