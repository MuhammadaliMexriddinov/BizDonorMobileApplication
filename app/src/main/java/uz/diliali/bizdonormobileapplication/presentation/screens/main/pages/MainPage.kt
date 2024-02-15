package uz.diliali.bizdonormobileapplication.presentation.screens.main.pages

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.DefaultMarqueeSpacing
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.MarqueeAnimationMode
import androidx.compose.foundation.background
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.NotificationsActive
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.google.accompanist.pager.ExperimentalPagerApi
import uz.diliali.bizdonormobileapplication.R
import uz.diliali.bizdonormobileapplication.presentation.ui.theme.BizDonorMobileApplicationTheme
import uz.diliali.bizdonormobileapplication.utils.AutoSlidingCarousel

@OptIn(ExperimentalFoundationApi::class, ExperimentalPagerApi::class)
@Composable
fun MainPage(navController: NavController) {

    val images = listOf(
        R.drawable.facepager,
        R.drawable.signupemail,
        R.drawable.facepager,
        R.drawable.signupemail,
    )
    BizDonorMobileApplicationTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .background(Color("#709CC4".toColorInt()))
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(2f),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.dilnoza),
                            contentDescription = "",
                            modifier = Modifier
                                .width(76.dp)
                                .height(76.dp)
                                .border(
                                    BorderStroke(2.dp, Color("#28527D".toColorInt())),
                                    shape = RoundedCornerShape(50.dp)
                                )
                                .clip(RoundedCornerShape(50.dp))
                        )
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(4f)
                    ) {
                        Column(
                            modifier = Modifier.fillMaxSize(),
                            horizontalAlignment = Alignment.Start,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text(
                                text = "Dilnoza Sulaymonova",
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color("#28527D".toColorInt())
                            )
                            Text(
                                text = "@dilbegim_05",
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color("#C1D0E9".toColorInt()),
                                textAlign = TextAlign.Start
                            )
                        }
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(2f)
                            .padding(16.dp),
                        horizontalArrangement = Arrangement.End,
                        verticalAlignment = Alignment.Top
                    ) {
                        Icon(
                            imageVector = Icons.Default.NotificationsActive,
                            contentDescription = "",
                            modifier = Modifier
                                .height(56.dp)
                                .height(56.dp)
                                .padding(2.dp)
                        )
                        Icon(
                            imageVector = Icons.Default.Menu,
                            contentDescription = "",
                            modifier = Modifier
                                .height(56.dp)
                                .height(56.dp)
                                .padding(2.dp)
                        )


                    }
                }
            }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(4f)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(0.8f)
                ) {
                    Text(
                        modifier = Modifier
                            .background(Color("#C1D0E9".toColorInt()))
                            .basicMarquee(
                                Int.MAX_VALUE, MarqueeAnimationMode.Immediately,
                                0, 0,
                                DefaultMarqueeSpacing, 100.dp
                            ),
                        text = "News News News News News News News News News News News News News News News"
                    )

                    Card(
                        modifier = Modifier.padding(6.dp),
                        shape = RoundedCornerShape(16.dp),
                    ) {
                        AutoSlidingCarousel(
                            itemsCount = images.size,
                            itemContent = { index ->
                                AsyncImage(
                                    model = ImageRequest.Builder(LocalContext.current)
                                        .data(images[index])
                                        .build(),
                                    contentDescription = null,
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier.height(120.dp)
                                )
                            }
                        )
                    }


                }

                Column(
                    modifier = Modifier
                        .padding(12.dp)
                        .fillMaxSize()
                        .weight(1.5f)
                        .padding(12.dp)
                ) {

                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .weight(1f),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.menu_icon1),
                                contentDescription = "",
                                modifier = Modifier
                                    .height(92.dp)
                                    .width(92.dp)
                            )
                            Text(
                                text = "donate blood", fontSize = 14.sp,
                                fontWeight = FontWeight.Bold, color = Color("#28527D".toColorInt())
                            )
                        }
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .weight(1f),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.menu_icon3),
                                contentDescription = "",
                                modifier = Modifier
                                    .height(92.dp)
                                    .width(92.dp)
                            )
                            Text(
                                text = "AI assistant", fontSize = 14.sp,
                                fontWeight = FontWeight.Bold, color = Color("#28527D".toColorInt())
                            )
                        }

                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .weight(1f),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.menu_icon2),
                                contentDescription = "",
                                modifier = Modifier
                                    .height(92.dp)
                                    .width(92.dp)
                            )
                            Text(
                                text = "news", fontSize = 14.sp,
                                fontWeight = FontWeight.Bold, color = Color("#28527D".toColorInt())
                            )
                        }
                    }

                    Spacer(modifier = Modifier
                        .fillMaxWidth()
                        .height(12.dp))

                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .weight(1f),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.menu_icon6),
                                contentDescription = "",
                                modifier = Modifier
                                    .height(92.dp)
                                    .width(92.dp).padding(6.dp)
                            )
                            Text(
                                text = "FAQ", fontSize = 14.sp,
                                fontWeight = FontWeight.Bold, color = Color("#28527D".toColorInt())
                            )
                        }

                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .weight(1f),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.menu_icon5),
                                contentDescription = "",
                                modifier = Modifier
                                    .height(92.dp)
                                    .width(92.dp)
                            )
                            Text(
                                text = "notes", fontSize = 14.sp,
                                fontWeight = FontWeight.Bold, color = Color("#28527D".toColorInt())
                            )
                        }

                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .weight(1f),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.menu_icon4),
                                contentDescription = "",
                                modifier = Modifier
                                    .height(92.dp)
                                    .width(92.dp)
                            )
                            Text(
                                text = "Other", fontSize = 14.sp,
                                fontWeight = FontWeight.Bold, color = Color("#28527D".toColorInt())
                            )
                        }

                    }
                }

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                ) {
                    LazyRow(modifier = Modifier.fillMaxHeight().padding(6.dp)){
                        item {
                            Box(modifier = Modifier.fillMaxSize()){
                                Image(painter = painterResource(id = R.drawable.rowitem1), contentDescription = "")
                            }
                            Spacer(modifier = Modifier.width(4.dp))
                        }


                        item {
                            Box(modifier = Modifier.fillMaxSize()){
                                Image(painter = painterResource(id = R.drawable.rowitem2), contentDescription = "")
                            }
                            Spacer(modifier = Modifier.width(4.dp))
                        }

                        item {
                            Box(modifier = Modifier.fillMaxSize()){
                                Image(painter = painterResource(id = R.drawable.rowitem3), contentDescription = "")
                            }
                            Spacer(modifier = Modifier.width(4.dp))
                        }

                        item {
                            Box(modifier = Modifier.fillMaxSize()){
                                Image(painter = painterResource(id = R.drawable.rowitem1), contentDescription = "")
                            }
                            Spacer(modifier = Modifier.width(4.dp))
                        }

                        item {
                            Box(modifier = Modifier.fillMaxSize()){
                                Image(painter = painterResource(id = R.drawable.rowitem2), contentDescription = "")
                            }
                        }
                    }

                }


            }



        }

    }

}


@Preview
@Composable
fun MyViewPreview() {
    MainPage(navController = rememberNavController())
}

/**
 * 1.StartPage
 * 2.SignUp
 * 3.SignIn
 * 4.MainPage
 * */