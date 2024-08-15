package com.example.propertyplusk.navigation

import android.window.SplashScreen
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.propertyplusk.ui.theme.screens.about.AboutScreen
import com.example.propertyplusk.ui.theme.screens.dashboard.DashboardScreen
import com.example.propertyplusk.ui.theme.screens.details.DetailsScreen
import com.example.propertyplusk.ui.theme.screens.home.HomeScreen
import com.example.propertyplusk.ui.theme.screens.intent.IntentScreen
import com.example.propertyplusk.ui.theme.screens.login.LoginScreen
import com.example.propertyplusk.ui.theme.screens.products.AddProductsScreen
import com.example.propertyplusk.ui.theme.screens.products.ViewProductsScreen
import com.example.propertyplusk.ui.theme.screens.property.PropertyScreen
import com.example.propertyplusk.ui.theme.screens.signup.SignUpScreen
import com.example.propertyplusk.ui.theme.screens.splash.SplashScreen


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination:String = ROUT_SPLASH
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {

        composable(ROUT_HOME) {
            HomeScreen(navController = navController)
        }

        composable(ROUT_DETAIL) {
            DetailsScreen(navController = navController)
        }

        composable(ROUT_ABOUT) {
            AboutScreen(navController = navController)
        }

        composable(ROUT_SPLASH) {
            SplashScreen(navController = navController)
        }

        composable(ROUT_PROPERTY) {
            PropertyScreen(navController = navController)
        }

        composable(ROUT_INTENT) {
            IntentScreen(navController = navController)
        }
        composable(ROUT_SIGNUP) {
            SignUpScreen(navController = navController)
        }
        composable(ROUT_LOGIN) {
            LoginScreen(navController = navController)
        }
        composable(ROUT_DASHBOARD) {
            DashboardScreen(navController = navController)
        }
        composable(ADD_PRODUCTS_URL) {
            AddProductsScreen(navController = navController)
        }
        composable(VIEW_PRODUCTS_URL) {
            ViewProductsScreen(navController = navController)
        }

    }
}