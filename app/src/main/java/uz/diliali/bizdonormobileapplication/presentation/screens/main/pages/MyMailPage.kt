package uz.diliali.bizdonormobileapplication.presentation.screens.main.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController

@Composable
fun MyMailPage(navController: NavController) {
    Column(modifier = Modifier
        .fillMaxSize()
        ) {
Text(text = "MyMailPage")
    }
}