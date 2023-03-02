package kz.abylay.composenavigation.ui.data

sealed class Screen(val route: String) {
    object SplashScreen : Screen(SPLASH)
    object MainScreen : Screen(MAIN)
    object DetailScreen : Screen(DETAIL)

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }

    companion object {
        const val MAIN = "main_screen"
        const val DETAIL = "detail_screen"
        const val SPLASH = "splash_screen"
    }
}
