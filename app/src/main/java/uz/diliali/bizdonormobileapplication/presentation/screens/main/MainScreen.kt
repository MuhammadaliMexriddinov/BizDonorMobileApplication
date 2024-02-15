package uz.diliali.bizdonormobileapplication.presentation.screens.main

import android.annotation.SuppressLint
import android.graphics.drawable.Icon
import android.media.Image
import android.widget.ImageView
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.unit.dp
import androidx.core.graphics.toColorInt
import androidx.navigation.NavController
import uz.diliali.bizdonormobileapplication.R
import uz.diliali.bizdonormobileapplication.presentation.screens.main.pages.MainPage
import uz.diliali.bizdonormobileapplication.presentation.screens.main.pages.MyMailPage
import uz.diliali.bizdonormobileapplication.presentation.screens.main.pages.ProfilePage
import uz.diliali.bizdonormobileapplication.presentation.screens.main.pages.ServicesPage

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen(navController: NavController) {
    val navigationBarItemList = prepareNavigationBarItems()
    val contextForToast = LocalContext.current.applicationContext
    val pageNumber = remember { mutableIntStateOf(0) }

    var selectedItemIndex by remember {
        mutableIntStateOf(0) // or use mutableStateOf(0)
    }

    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .padding(bottom = 76.dp) // add bottom margin for the navigation bar
                .fillMaxSize()
        ) {
            when (pageNumber.value) {
                0 -> MainPage(navController = navController)
                1 -> ServicesPage(navController = navController)
                2 -> MyMailPage(navController = navController)
                3 -> ProfilePage(navController = navController)
            }

        }

        NavigationBar(
            modifier = Modifier.align(alignment = Alignment.BottomCenter).clip(shape = RoundedCornerShape(topEnd = 24.dp, topStart = 24.dp)),
            containerColor = Color("#709CC4".toColorInt()),
          //  contentColor = Color("#CCE4F7".toColorInt())
        ) {
            navigationBarItemList.forEachIndexed { index, item ->
                NavigationBarItem(
                    icon = {
                        Image(
                            painterResource(id = item.icon), "", modifier = Modifier
                                .height(24.dp)
                                .width(24.dp)
                        )
                    },
                    label = { Text(text = item.label) },
                    selected = selectedItemIndex == index,
                    onClick = {
                        selectedItemIndex = index
                        pageNumber.value = index
                    },
                    colors = androidx.compose.material3.NavigationBarItemDefaults
                        .colors(
                            selectedIconColor = Color.White,
                            indicatorColor = Color("#437399".toColorInt()),
                            selectedTextColor = Color("#437399".toColorInt()),
                            unselectedTextColor = Color.White

                            // indicatorColor = MaterialTheme.colorScheme.surfaceColorAtElevation(LocalAbsoluteTonalElevation.current)
                        )
                )
            }
        }
    }
}


private fun prepareNavigationBarItems(): List<NavigationBarData> {
    val navigationBarItemsList = arrayListOf<NavigationBarData>()

    // add items
    navigationBarItemsList.add(NavigationBarData(label = "Home", R.drawable.bottom1))
    navigationBarItemsList.add(NavigationBarData(label = "Profile", R.drawable.bottom2))
    navigationBarItemsList.add(NavigationBarData(label = "Cart", R.drawable.bottom3))
    navigationBarItemsList.add(NavigationBarData(label = "Settings", R.drawable.bottom4))

    return navigationBarItemsList
}

data class NavigationBarData(val label: String, val icon: Int)

