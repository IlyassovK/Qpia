package kz.qpia.ui.nav

sealed class Destinations(val route: String) {
    object Start: Destinations("StartScreen")
}