package dev.liz.tallerdaarliorenero.Components

import android.view.Menu
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun MenuScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                navigationIcon = {
                    IconButton(
                        onClick = { navController.popBackStack() })
                    {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Go to Back"
                        )
                    }
                },
                title = {
                    Text(text = "Listado de PLatos")
                })
        }
    ) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            var checkedValue by remember {
                mutableStateOf(false)
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(16.dp).clickable {
                    checkedValue = !checkedValue
                }
            ) {
                Checkbox(
                    checked = checkedValue,
                    onCheckedChange = {
                        checkedValue = it
                    }
                )
                Text(text = "Seco de pollo")
            }
            HorizontalDivider()
            var checkedValue2 by remember {
                mutableStateOf(false)
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(16.dp).clickable {
                    checkedValue = !checkedValue
                }
            ) {
                Checkbox(
                    checked = checkedValue2,
                    onCheckedChange = {
                        checkedValue2 = it
                    }
                )
                Text(text = "Seco de carne")
            }
            HorizontalDivider()
            var checkedValue3 by remember {
                mutableStateOf(false)
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(16.dp).clickable {
                    checkedValue = !checkedValue
                }
            ) {
                Checkbox(
                    checked = checkedValue3,
                    onCheckedChange = {
                        checkedValue3 = it
                    }
                )
                Text(text = "Tilapia Asada")
            }
            HorizontalDivider()
            var checkedValue4 by remember {
                mutableStateOf(false)
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(16.dp).clickable {
                    checkedValue = !checkedValue
                }
            ) {
                Checkbox(
                    checked = checkedValue4,
                    onCheckedChange = {
                        checkedValue4 = it
                    }
                )
                Text(text = "Maito de pescado")
            }
            HorizontalDivider()
            var checkedValue5 by remember {
                mutableStateOf(false)
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(16.dp).clickable {
                    checkedValue = !checkedValue
                }
            ) {
                Checkbox(
                    checked = checkedValue5,
                    onCheckedChange = {
                        checkedValue5 = it
                    }
                )
                Text(text = "Guanta al Horno")
            }
            Box(
                modifier = Modifier
                    .fillMaxSize(),
                contentAlignment = Alignment.BottomCenter
            ) {
                ElevatedButton(
                    onClick = { navController.navigate("home") },
                    modifier = Modifier.padding(16.dp).width(300.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent,
                    ),
                ) {
                    Text(
                        "Regresar",
                        fontSize = 24.sp,
                        color = Color.Black
                    )
                }
            }
        }
    }
}