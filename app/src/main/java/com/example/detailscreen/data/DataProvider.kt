package com.example.detailscreen.data

import com.example.detailscreen.R

object DataProvider {

    val item =
        Item(
            id = 1,
            title = "Krzesło",
            building = 34,
            room = 84,
            description = "To krzesło znajduje się w budynku 34 oraz w sali 84.",
            itemImageId = R.drawable.p1
        )

    val itemList = listOf(
        item,
        Item(
            id = 2,
            title = "Stół",
            building = 34,
            room = 84,
            description = "Ten stół znajduje się w sali 84",
            itemImageId = R.drawable.p2
        ),
        Item(
            id = 3,
            title = "Komputer",
            building = 34,
            room = 84,
            description = "Komputer ten znajduje się w sali komputerowej budynku 34",
            itemImageId = R.drawable.p3
        ),
    )
}