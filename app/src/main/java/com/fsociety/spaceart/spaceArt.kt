package com.fsociety.spaceart

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun spaceArt(){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Image(
            modifier = Modifier.size(350.dp),
            painter = painterResource(id = R.drawable.art1), contentDescription = "")
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "text 1 ", fontSize = 25.sp, fontWeight = FontWeight.Bold)
        Row() {
            Button(onClick = { /*TODO*/ }) {}
            Button(onClick = { /*TODO*/ }) {}
        }
    }
}