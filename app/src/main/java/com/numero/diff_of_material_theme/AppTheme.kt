package com.numero.diff_of_material_theme

import androidx.annotation.StyleRes

enum class AppTheme(@StyleRes val styleId: Int) {
    APP_COMPAT(R.style.AppCompatTheme),
    MATERIAL(R.style.MaterialTheme)
}