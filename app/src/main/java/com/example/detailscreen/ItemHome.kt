package com.example.detailscreen

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import com.example.detailscreen.data.DataProvider
import com.example.detailscreen.data.Item

@Composable
fun BarkHomeContent(navigateToProfile: (Item) -> Unit) {
    val items = remember { DataProvider.itemList }
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ) {
        items(
            items = items,
            itemContent = {
                ItemListItem(item = it, navigateToProfile)
            }
        )
    }
}

