package com.example.thursdaytrivia1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*

import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.thursdaytrivia1.ui.theme.ThursdayTrivia1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThursdayTrivia1Theme {
                HomeScreen()
            }
        }
    }
}

@Preview
@Composable
fun HomeScreen(){
    LandingPage(modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.TopCenter)
    )
}

@Composable
fun LandingPage(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            ImageBitmap.imageResource(R.drawable.compose),
            modifier = Modifier.size(300.dp),
            contentDescription = "compose logo",
            contentScale = ContentScale.Fit

        )

//        Spacer(modifier = Modifier.height(10.dp))
        Text("Srijan Shovit",

            color = Color(56, 112, 179, 255),
            fontWeight = FontWeight.ExtraBold,
            fontSize = 30.sp
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text("❤",
            fontSize = 50.sp

//            color = Color(8, 48, 66, 255),
//            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text("Jetpack Compose",

            color = Color(8, 48, 66, 255),
            fontWeight = FontWeight.Bold,
            fontSize = 35.sp
        )
    }
}


