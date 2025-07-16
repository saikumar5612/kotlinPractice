package com.example.mykotlinjourney

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.internal.rememberComposableLambdaN
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable

fun MoodTrackerScreen() {

    var moodMessage by remember { mutableStateOf("How are you feeling today?") }

    Column (

        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) { Text(
          text = moodMessage,
          fontSize = 20.sp,
          modifier = Modifier.padding(bottom = 32.dp)


    )
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text("keep smiling", fontSize = 32.sp, modifier = Modifier.clickable {
                moodMessage="Keep smiling"
            })

            Text("take a break", fontSize = 32.sp, modifier = Modifier.clickable {
                moodMessage= "take a break and breath"
            })

            Text("feel down", fontSize = 32.sp, modifier = Modifier.clickable {
                moodMessage = " its ok to feel down, you got this"
            })

            Text("step away", fontSize = 32.sp, modifier = Modifier.clickable {
                moodMessage = "step away, come back stronger"
            })
            Text("need rest", fontSize = 32.sp, modifier = Modifier.clickable {
                moodMessage = "take some rest"
            })
        }

    }

}