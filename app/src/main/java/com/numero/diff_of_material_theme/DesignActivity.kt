package com.numero.diff_of_material_theme

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_design.*

class DesignActivity : AppCompatActivity() {

    private val appTheme by lazy { intent.getSerializableExtra(BUNDLE_APP_THEME) as AppTheme }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(appTheme.styleId)

        setContentView(R.layout.activity_design)

        fab.setOnClickListener {
            Snackbar.make(coordinatorLayout, "Snackbar", Snackbar.LENGTH_SHORT).show()
        }
    }

    companion object {
        private const val BUNDLE_APP_THEME = "BUNDLE_APP_THEME"

        fun createIntent(context: Context, theme: AppTheme): Intent = Intent(context, DesignActivity::class.java).apply {
            putExtra(BUNDLE_APP_THEME, theme)
        }
    }
}