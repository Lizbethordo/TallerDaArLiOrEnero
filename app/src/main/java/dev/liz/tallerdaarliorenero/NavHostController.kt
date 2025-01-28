package dev.liz.tallerdaarliorenero

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import dev.liz.tallerdaarliorenero.Components.HomePlace
import dev.liz.tallerdaarliorenero.Components.MenuScreen
import dev.liz.tallerdaarliorenero.Components.ParamScreen
import dev.liz.tallerdaarliorenero.Components.ParamScreen2
import dev.liz.tallerdaarliorenero.Components.UserList
@Composable
fun NavHostController() {
    val navController= rememberNavController()
    NavHost(navController= navController, startDestination= "home"){
        composable(route="home"){ HomePlace(navController) }
        composable(route="user"){ UserList(navController) }
        composable(route="menu"){ MenuScreen(navController) }
        composable(
            route = "param/{userName}",
            arguments = listOf(
                navArgument("userName") {
                    type = NavType.StringType
                }
            )
        ) { stackEntry ->
            val userName = stackEntry.arguments?.getString("userName")
            ParamScreen(navController, userName)
        }
        composable(
            route = "param2/{userName}",
            arguments = listOf(
                navArgument("userName") {
                    type = NavType.StringType
                }
            )
        ) { stackEntry ->
            val userName = stackEntry.arguments?.getString("userName")
            ParamScreen2(navController, userName)
        }

    }
}