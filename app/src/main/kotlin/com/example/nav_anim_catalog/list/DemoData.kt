package com.example.nav_anim_catalog.list

import androidx.annotation.IdRes

data class DemoData(
    val title: String,
    val description: String,
    @IdRes val resId: Int
)
