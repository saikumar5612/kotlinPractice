package com.example.mykotlinjourney

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.key.onKeyEvent
import androidx.compose.ui.unit.dp

@Composable

fun TodoScreen(){
    var task by remember { mutableStateOf("") }
    var taskList = remember { mutableStateListOf<String>() }

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Top

    )
    {
        OutlinedTextField(
            value = task,
            onValueChange = {task=it},
            label = {Text ("Enter task")},
            modifier = Modifier.fillMaxWidth()

        )

        Spacer(modifier = Modifier.height(12.dp))

        Button(
            onClick = {
                if (task.isNotBlank())
                {
                    taskList.add(task)
                    task = ""
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) { Text("Add task") }

        Spacer(modifier = Modifier.height(24.dp))

        LazyColumn {
            items(taskList) {item ->

                Text(
                    text = ".$item",
                    modifier = Modifier
                        .padding(8.dp)
                )
            }
        }

    }

}