package uz.diliali.bizdonormobileapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.google.accompanist.pager.ExperimentalPagerApi
import uz.diliali.bizdonormobileapplication.presentation.screens.auth.SignInScreen
import uz.diliali.bizdonormobileapplication.presentation.screens.auth.SignUpScreen
import uz.diliali.bizdonormobileapplication.presentation.screens.auth.StartScreen
import uz.diliali.bizdonormobileapplication.presentation.screens.main.MainScreen
import uz.diliali.bizdonormobileapplication.presentation.screens.main.pages.MainPage
import uz.diliali.bizdonormobileapplication.presentation.ui.theme.BizDonorMobileApplicationTheme
import uz.diliali.bizdonormobileapplication.utils.AutoSlidingCarousel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BizDonorMobileApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                      MyNavigation()
                   // MainPage(navController = rememberNavController())
                   //    MySlider()
                }
            }
        }
    }

    @Composable
    fun MyNavigation() {
        val navController = rememberNavController()
        NavHost(navController = navController, startDestination = "StartScreen") {
            composable("StartScreen") {
                StartScreen(navController = navController)
            }
            composable("SignUpScreen") {
                SignUpScreen(navController = navController)
            }
            composable("SignInScreen") {
                SignInScreen(navController = navController)
            }
            composable("MainScreen") {
                MainScreen(navController = navController)
            }
        }
    }


}