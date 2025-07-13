package com.example.mykotlinjourney

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.unit.dp

@Composable
fun CounterScreen() {
    var count by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = "count, $count",
            style = MaterialTheme.typography.headlineMedium

        )
        Spacer(modifier = Modifier.height(16.dp))

        Row {
            Button(
                onClick = {count--},
                modifier = Modifier.padding(end = 8.dp)

            ) { Text("Decrease") }
        }
        Button(
            onClick = {count++},
            modifier = Modifier.padding(end = 8.dp)
        ) { Text("Increase") }
    }

}