package com.example.recycler.model

data class SubItem(
    val viewType: Int,
    val isFinished: Boolean,
    val isCurrent: Boolean,
    val isLocked: Boolean,
)