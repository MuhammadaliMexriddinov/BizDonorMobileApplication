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

@Composable
fun SignInScreen(navController: NavController){
    BizDonorMobileApplicationTheme {

        var textUserName by remember { mutableStateOf(TextFieldValue("")) }
        var textPassword by remember { mutableStateOf(TextFieldValue("")) }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White).paint(painterResource(id = R.drawable.signupres), contentScale = ContentScale.Crop),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.mainlogo  ),
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
                text = "Sign in to continue",
                color = Color("#28527D".toColorInt()),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(350.dp)
                    .padding(horizontal = 32.dp)
                    .padding(top = 12.dp)
                ,
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Spacer(modifier = Modifier.height(4.dp))
                TextField(
                    value = textUserName, onValueChange = {
                        textUserName = it
                    },
                    singleLine = true,
                    label = { Text(text = "Username") },
                    //  placeholder = { Text(text = "Name /") },
                    colors = TextFieldDefaults.colors(
                        cursorColor = Color.Black,
                        disabledLabelColor = Color("#C1D0E9".toColorInt()),
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,

                    ),
                    shape = RoundedCornerShape(8.dp)
                )
                Spacer(modifier = Modifier.height(4.dp))
                TextField(
                    value = textPassword, onValueChange = {
                        textPassword = it
                    },
                    singleLine = true,
                    label = { Text(text = "Password") },
                    //  placeholder = { Text(text = "Name /") },
                    colors = TextFieldDefaults.colors(
                        cursorColor = Color.Black,
                        disabledLabelColor = Color("#C1D0E9".toColorInt()),
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledContainerColor = Color("#C1D0E9".toColorInt())
                    ),
                    shape = RoundedCornerShape(8.dp)
                )
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                ) {

                    Button(
                        onClick = {
                                  navController.navigate("MainScreen")
                        },
                        colors = ButtonDefaults.buttonColors(Color("#CCE4F7".toColorInt())),
                        modifier = Modifier
                            .padding(16.dp).fillMaxWidth(),
                        shape = RoundedCornerShape(16.dp)
                    ) {
                        Text(text = "Log In", color = Color("#28527D".toColorInt()))
                    }

                }

            }
        }
    }
}

