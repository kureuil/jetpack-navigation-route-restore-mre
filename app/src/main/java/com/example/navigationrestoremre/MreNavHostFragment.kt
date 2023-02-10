package com.example.navigationrestoremre

import androidx.navigation.NavHostController
import androidx.navigation.createGraph
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.fragment
import androidx.navigation.navigation
import com.example.navigationrestoremre.ui.dashboard.DashboardFragment
import com.example.navigationrestoremre.ui.home.HomeFragment
import com.example.navigationrestoremre.ui.notifications.NotificationsFragment

class MreNavHostFragment : NavHostFragment() {
    override fun onCreateNavHostController(navHostController: NavHostController) {
        super.onCreateNavHostController(navHostController)
        navHostController.setGraph(
            navHostController.createGraph(startDestination = "home") {
                navigation("home-index", "home") {
                    fragment<HomeFragment>("home-index")
                }
                navigation("dashboard-index", "dashboard") {
                    fragment<DashboardFragment>("dashboard-index")
                }
                navigation("notifications-index", "notifications") {
                    fragment<NotificationsFragment>("notifications-index")
                }
            },
            null,
        )
    }
}