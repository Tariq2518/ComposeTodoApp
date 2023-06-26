package com.tariq.composetodoapp.navigation

sealed class Screen(val route: String){
    object SplashScreen: Screen("splash_screen")
    object ListScreen: Screen("list_screen")
    object TaskScreen: Screen("task_screen/{taskId}"){
        fun passTaskId(taskId: Int): String{
            return "hero_screen/$taskId"
        }
    }
    object SearchScreen: Screen("search_screen")
}