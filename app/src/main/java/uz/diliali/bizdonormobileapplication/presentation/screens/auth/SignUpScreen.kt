package uz.diliali.bizdonormobileapplication.presentation.screens.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import uz.diliali.bizdonormobileapplication.R
import uz.diliali.bizdonormobileapplication.presentation.ui.theme.BizDonorMobileApplicationTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpScreen(navController: NavController) {


    BizDonorMobileApplicationTheme {
        var text by remember { mutableStateOf(TextFieldValue("")) }
        var textGmail by remember { mutableStateOf(TextFieldValue("")) }
        var textPassword by remember { mutableStateOf(TextFieldValue("")) }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .paint(painterResource(id = R.drawable.signupres), contentScale = ContentScale.Crop),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.mainlogo),
                contentDescription = "BizDonor",
                modifier = Modifier
                    .height(72.dp)
                    .width(72.dp)
            )
            Text(
                text = "Welcome !",
                color = Color("#28527D".toColorInt()),
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Create new Account",
                color = Color("#28527D".toColorInt()),
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Already Registered? Log in here.",
                color = Color("#28527D".toColorInt()),
                fontSize = 18.sp,
            )
            Spacer(modifier = Modifier.height(12.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp)
                    .padding(horizontal = 32.dp)
                    .padding(top = 12.dp)
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
                            painter = painterResource(id = R.drawable.signupperson),
                            contentDescription = "BizDonor",
                            modifier = Modifier
                                .height(42.dp)
                                .width(42.dp)
                        )
                    }

                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(3f)
                    ) {
                        Text(text = "Name", fontSize = 14.sp, color = Color.Black)
                        Spacer(modifier = Modifier.height(8.dp))
                        TextField(
                            value = text, onValueChange = {
                                text = it
                            },
                            singleLine = true,
                            label = { Text(text = "Jiara Mrtines") },
                          //  placeholder = { Text(text = "Name /") },

                            colors = TextFieldDefaults.colors(
                                cursorColor = Color.Black,
                                disabledLabelColor = Color("#C1D0E9".toColorInt()),
                                focusedIndicatorColor = Color.Transparent,
                                unfocusedIndicatorColor = Color.Transparent
                            ),
                            shape = RoundedCornerShape(8.dp)
                        )
                    }

                }
                Spacer(modifier = Modifier.height(12.dp))
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
                            painter = painterResource(id = R.drawable.signupemail),
                            contentDescription = "BizDonor",
                            modifier = Modifier
                                .height(42.dp)
                                .width(42.dp)
                        )
                    }

                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(3f)
                    ) {
                        Text(text = "Email", fontSize = 14.sp, color = Color.Black)
                        Spacer(modifier = Modifier.height(8.dp))
                        TextField(
                            value = textGmail, onValueChange = {
                                textGmail = it
                            },
                            singleLine = true,
                            label = { Text(text = "martines09@gmail.com") },
                          //  placeholder = { Text(text = "Name /") },
                            colors = TextFieldDefaults.colors(
                                cursorColor = Color.Black,
                                disabledLabelColor = Color("#C1D0E9".toColorInt()),
                                focusedIndicatorColor = Color.Transparent,
                                unfocusedIndicatorColor = Color.Transparent
                            ),
                            shape = RoundedCornerShape(8.dp)
                        )
                    }

                }
                Spacer(modifier = Modifier.height(12.dp))
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
                            painter = painterResource(id = R.drawable.signuppassword),
                            contentDescription = "BizDonor",
                            modifier = Modifier
                                .height(42.dp)
                                .width(42.dp)
                        )
                    }

                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(3f)
                    ) {
                        Text(text = "Password", fontSize = 14.sp, color = Color.Black)
                        Spacer(modifier = Modifier.height(8.dp))
                        TextField(
                            value = textPassword, onValueChange = {
                                textPassword = it
                            },
                            singleLine = true,
                            label = { Text(text = "123abc") },
                          //  placeholder = { Text(text = "Name /") },
                            colors = TextFieldDefaults.colors(
                                cursorColor = Color.Black,
                                disabledLabelColor = Color("#C1D0E9".toColorInt()),
                                focusedIndicatorColor = Color.Transparent,
                                unfocusedIndicatorColor = Color.Transparent
                            ),
                            shape = RoundedCornerShape(8.dp)
                        )
                    }

                }
                Spacer(modifier = Modifier.height(12.dp))
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                ) {

                    Button(
                        onClick = {   navController.navigate("MainScreen") },
                        colors = ButtonDefaults.buttonColors(Color("#C1D0E9".toColorInt())),
                        modifier = Modifier
                            .padding(16.dp)
                            .fillMaxWidth(),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Text(text = "Sign Up", color = Color("#28527D".toColorInt()))
                    }

                }

            }
        }
    }
}

