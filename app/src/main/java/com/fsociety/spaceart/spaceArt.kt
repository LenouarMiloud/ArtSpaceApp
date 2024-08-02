package com.fsociety.spaceart

import android.util.Log
import android.widget.Space
import android.widget.Toast
import androidx.collection.intListOf
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun spaceArt(Picture: Int, Title: String, ArtistName: String, modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = Picture),
            contentDescription = null,
            modifier = Modifier
                .padding(20.dp)
                .height(300.dp)
                .width(300.dp)
                .border(border = BorderStroke(2.dp, Color.Gray), shape = RectangleShape)
                .shadow(elevation = 4.dp)
                .padding(10.dp)
        )
        Card(
            modifier = Modifier
                .padding(horizontal = 45.dp, vertical = 90.dp)

        ){
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = Title,
                    fontSize = 25.sp,
                    textAlign = TextAlign.Start,
                    lineHeight = 30.sp
                )
                Text(
                    text = ArtistName,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = modifier.padding(top = 8.dp)
                )
            }
        }
    }
}

@Composable
fun ArtSpace(){
    var result by remember {
        mutableStateOf(0)
    }
    //make the change of picture
    when (result) {
        1-> spaceArt(
            Picture = R.drawable.edvardmunch,
            Title = stringResource(R.string.TEdvardMunch),
            ArtistName = stringResource(id = R.string.EdvardMunch)
        )
        2-> spaceArt(
            Picture = R.drawable.johannes,
            Title = stringResource(R.string.TJohannes),
            ArtistName = stringResource(id = R.string.JohannesVermeer)
        )
        3-> spaceArt(
            Picture = R.drawable.georges,
            Title = stringResource(R.string.TGeorgesSeurat),
            ArtistName = stringResource(id = R.string.George)
        )
        4-> spaceArt(
            Picture = R.drawable.selfportrait,
            Title = stringResource(R.string.TSelfPortrait),
            ArtistName = stringResource(id = R.string.SelfPortrait)
        )
        5-> spaceArt(
            Picture = R.drawable.eugenedelacroix,
            Title = stringResource(R.string.TEugeneDelacroix),
            ArtistName = stringResource(id = R.string.EugeneDelacroix)
        )
        else -> spaceArt(
            Picture = R.drawable.jean_antoine,
            Title = stringResource(R.string.TJeanAntoine),
            ArtistName = stringResource(id = R.string.JeanAntoine)
        )
    }
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 800.dp)

    ) {
        Button(
            //show the previous picture
            onClick = { result-- }) {
            Text(
                text = "Previous",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

        }
        Button(
            //show the next picture
            onClick = { result++ }) {
            Text(text = "Next",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

        }
    }
}
