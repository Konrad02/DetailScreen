package com.example.detailscreen.data

import android.icu.text.CaseMap.Title
import java.io.Serializable

data class Item(
    val id: Int,
    val title: String,
    val building: Int,
    val room: Int,
    val description: String,
    val itemImageId: Int = 0
) : Serializable