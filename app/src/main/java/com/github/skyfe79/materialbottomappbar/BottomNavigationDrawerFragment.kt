package com.github.skyfe79.materialbottomappbar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.navigation.NavigationView

class BottomNavigationDrawerFragment: BottomSheetDialogFragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_bottomsheet, container, false)

        val navigationView = view.findViewById<NavigationView>(R.id.navigationView)
        navigationView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.nav1 -> Toast.makeText(context, "Clicked Navigation 01", Toast.LENGTH_SHORT).show()
                R.id.nav2 -> Toast.makeText(context, "Clicked Navigation 02", Toast.LENGTH_SHORT).show()
                R.id.nav3 -> Toast.makeText(context, "Clicked Navigation 03", Toast.LENGTH_SHORT).show()
            }
            true
        }

        return view
    }
}