package kz.qpia.ui.screens.start

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import org.koin.androidx.compose.koinViewModel

@Composable
fun StartScreen(
    navController: NavController,
    viewModel: StartViewModel = koinViewModel()
) {
    StartContent(
        navController = navController,
        viewModel = viewModel
    )
}

@Composable
fun StartContent(
    navController: NavController,
    viewModel: StartViewModel
) {
    Text(text = "test")
}