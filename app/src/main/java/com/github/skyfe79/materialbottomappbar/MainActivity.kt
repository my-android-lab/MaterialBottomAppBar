package com.github.skyfe79.materialbottomappbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.google.android.material.bottomappbar.BottomAppBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(bottomAppbar)

        fab.setOnClickListener {
            bottomAppbar.fabAlignmentMode = when (bottomAppbar.fabAlignmentMode) {
                BottomAppBar.FAB_ALIGNMENT_MODE_END -> BottomAppBar.FAB_ALIGNMENT_MODE_CENTER
                BottomAppBar.FAB_ALIGNMENT_MODE_CENTER -> BottomAppBar.FAB_ALIGNMENT_MODE_END
                else -> BottomAppBar.FAB_ALIGNMENT_MODE_CENTER
            }
        }


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.bottombar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            android.R.id.home -> {
                val bottomNavigationDrawerFragment = BottomNavigationDrawerFragment()
                bottomNavigationDrawerFragment.show(supportFragmentManager, bottomNavigationDrawerFragment.tag)
            }
            R.id.app_bar_search -> Toast.makeText(this, "Clicked Search Button", Toast.LENGTH_SHORT).show()
            R.id.app_bar_setting -> Toast.makeText(this, "Clicked Setting Button", Toast.LENGTH_SHORT).show()
        }
        return true
    }
}
