package com.example.recycler.model

data class SubItem(
    val position: Int,
    val isFinished: Boolean,
    val isCurrent: Boolean,
    val isLocked: Boolean
)