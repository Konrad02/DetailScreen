package com.example.detailscreen

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Profile
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import com.example.detailscreen.data.Item
import com.example.detailscreen.ui.theme.DetailScreenTheme

@Suppress("DEPRECATION")
class ProfileActivity : AppCompatActivity() {

    private val item: Item by lazy {
        intent?.getSerializableExtra(ITEM_ID) as Item
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DetailScreenTheme {
                Text(text = "Hello ${item.title}")
            }
        }
    }

    companion object {
        private const val ITEM_ID = "item_id"
        fun newIntent(context: Context, item: Item) =
            Intent(context, ProfileActivity::class.java).apply {
                putExtra(ITEM_ID, item)
            }
    }
}