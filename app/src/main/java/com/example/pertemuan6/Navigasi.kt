package com.example.pertemuan6

enum class Navigasi {
    Formulirku,
    Detail
}

@Composable
fun DataApp (
    navController: NavHostController = rememberNavController()
) {
    Scaffold { isiRuang->
        NavHost(
            navController = navController,
            startDestination = Navigasi.Formulirku.name,
