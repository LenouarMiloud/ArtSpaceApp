package com.fsociety.spaceart

import android.util.Log
import android.widget.Space
import android.widget.Toast
import androidx.collection.intListOf
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun spaceArt(){

    val imagesVal = intListOf(
        R.drawable.art1,
        R.drawable.art2,
        R.drawable.art3,
        R.drawable.art4,
        R.drawable.art5,
        R.drawable.art6,
    )
    var img = imagesVal[0]

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Image(
            modifier = Modifier
                .height(450.dp)
                .width(400.dp),
            painter = painterResource(img), contentDescription = "")
        Spacer(modifier = Modifier.height(200.dp))
        Text(text = "text 1 ", fontSize = 25.sp, fontWeight = FontWeight.Bold,
            modifier = Modifier.background(Color(0xFFBDC0BE)))
        Row() {
            Button(onClick = {
                
            },
                Modifier
                    .weight(1f)
                    .padding(start = 10.dp, end = 10.dp, top = 25.dp)) {
                Text(text = "Previous", fontSize = 25.sp, fontWeight = FontWeight.Bold)
            }
            Button(onClick = {

            },
                Modifier
                    .weight(1f)
                    .padding(start = 10.dp, end = 10.dp, top = 25.dp)) {
                Text(text = "Next", fontSize = 25.sp,  fontWeight = FontWeight.Bold)
            }
        }
    }
}