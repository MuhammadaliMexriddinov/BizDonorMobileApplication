package uz.diliali.bizdonormobileapplication.presentation.screens.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import uz.diliali.bizdonormobileapplication.R
import uz.diliali.bizdonormobileapplication.presentation.ui.theme.BizDonorMobileApplicationTheme


@Composable
fun StartScreen(navController: NavController) {
    BizDonorMobileApplicationTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White).paint(painterResource(id = R.drawable.imagestartres), contentScale = ContentScale.Crop)
        ) {




            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(0.2f)

            ) {
                Box(modifier = Modifier.fillMaxSize()) {
                    Text(
                        text = "BizDonor",
                        color = Color.White,
                        style = TextStyle(fontWeight = FontWeight.Bold),
                        fontSize = 24.sp,
                        modifier = Modifier.padding(16.dp)
                    )

                    Button(
                        onClick = { },
                        colors = ButtonDefaults.buttonColors(Color("#C1D0E9".toColorInt())),
                        modifier = Modifier
                            .align(androidx.compose.ui.Alignment.TopEnd)
                            .padding(16.dp),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Text(text = "Language", color = Color("#28527D".toColorInt()))
                    }
                }
            }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Welcome to",
                    fontSize = 42.sp,
                    color = Color("#28527D".toColorInt()),
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "BizDonor !",
                    fontSize = 42.sp,
                    color = Color("#B22F30".toColorInt()),
                    fontWeight = FontWeight.Bold
                )
                Image(
                    painter = painterResource(id = R.drawable.mainlogo),
                    contentDescription = "BizDonor",
                    modifier = Modifier
                        .height(72.dp)
                        .width(72.dp)
                )
                Text(
                    text = "We'll do the job, you'll save a life",
                    fontSize = 24.sp,
                    color = Color("#28527D".toColorInt()),
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Cursive,
                    modifier = Modifier.padding(12.dp)
                )

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(300.dp)
                        .padding(horizontal = 32.dp)
                        .padding(top = 24.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                    ) {
                        Button(
                            onClick = { },
                            colors = ButtonDefaults.buttonColors(Color("#B22F30".toColorInt())),
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(4.dp),
                            shape = RoundedCornerShape(8.dp)
                        ) {
                            Text(text = "Need Blood?", color = Color.White, fontSize = 18.sp)
                        }
                    }

                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                    ) {
                        Row(modifier = Modifier.fillMaxSize()) {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .weight(1f)
                            ) {
                                Button(
                                    onClick = { },
                                    colors = ButtonDefaults.buttonColors(Color("#C1D0E9".toColorInt())),
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(4.dp),
                                    shape = RoundedCornerShape(8.dp)
                                ) {
                                    Text(
                                        text = "How to use",
                                        fontSize = 18.sp,
                                        color = Color("#28527D".toColorInt())
                                    )
                                }
                            }

                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .weight(1f)
                            ) {
                                Button(
                                    onClick = { },
                                    colors = ButtonDefaults.buttonColors(Color("#C1D0E9".toColorInt())),
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(4.dp),
                                    shape = RoundedCornerShape(8.dp)
                                ) {
                                    Text(
                                        text = "About BizDonor",
                                        fontSize = 18.sp,
                                        color = Color("#28527D".toColorInt())
                                    )
                                }
                            }
                        }
                    }

                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                    ) {
                        Button(
                            onClick = {
                                navController.navigate("SignInScreen")
                            },
                            colors = ButtonDefaults.buttonColors(Color("#C1D0E9".toColorInt())),
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(4.dp),
                            shape = RoundedCornerShape(8.dp)
                        ) {
                            Text(
                                text = "Sign In as Donor",
                                fontSize = 18.sp,
                                color = Color("#28527D".toColorInt())
                            )
                        }
                    }
                }
            }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(0.3f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Already Have Account?", fontSize = 18.sp,
                    color = Color("#000000".toColorInt())
                )
                Text(
                    text = "Login !", fontSize = 18.sp,
                    color = Color("#28527D".toColorInt()),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.clickable {
                        navController.navigate("SignUpScreen")
                    }
                )
            }
        }
    }


}

