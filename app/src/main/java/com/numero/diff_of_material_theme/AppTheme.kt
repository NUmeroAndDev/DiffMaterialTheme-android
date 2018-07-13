package com.numero.diff_of_material_theme

import androidx.annotation.StringRes
import androidx.annotation.StyleRes

enum class AppTheme(@StyleRes val styleId: Int, @StringRes val titleId: Int) {
    APP_COMPAT(R.style.AppCompatTheme, R.string.theme_app_compat),
    MATERIAL(R.style.MaterialTheme, R.string.theme_material)
}