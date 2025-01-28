package dev.liz.tallerdaarliorenero.Components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Fax
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomePlace(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(

                title = { Text(text = "HOME",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center) },



                )
        }
    ) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)
            .verticalScroll(rememberScrollState())
        ) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                IconButton(onClick = { navController.popBackStack() }) {
                    Icon(
                        imageVector = Icons.Default.Face,
                        contentDescription = "Go to back",
                        modifier = Modifier.size(100.dp),
                        // Ajusta el tamaño si es necesario
                    )
                }
            }

            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                Text(text = "user:",
                    modifier = Modifier.padding(24.dp),
                    fontSize = 24.sp)
                var username by rememberSaveable { mutableStateOf("") }

                // Campo de usuario
                OutlinedTextField(
                    value = username,
                    onValueChange = { username = it },
                    label = { Text("Usuario") },
                    modifier = Modifier.padding(16.dp)
                )
            }

            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                Text(text = "Password",
                    fontSize = 24.sp)
                var showPassword by rememberSaveable { mutableStateOf(false) }


                var password by rememberSaveable { mutableStateOf("") }

                // Campo de contraseña
                OutlinedTextField(
                    value = password,
                    onValueChange = { password = it },
                    label = { Text("Contraseña") },
                    visualTransformation = if (showPassword) VisualTransformation.None else PasswordVisualTransformation(),
                    trailingIcon = {
                        IconButton(onClick = { showPassword = !showPassword }) {
                            Icon(
                                imageVector = if (showPassword) Icons.Default.Visibility else Icons.Default.VisibilityOff,
                                contentDescription = null
                            )
                        }
                    },
                    modifier = Modifier.padding(16.dp)
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                ElevatedButton(
                    onClick = { navController.navigate("user") },
                    modifier = Modifier.padding(16.dp).width(300.dp),

                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Red
                    ),


                    ) {
                    Text("Lista usuarios",
                        fontSize = 24.sp)
                }

                ElevatedButton(
                    onClick = { navController.navigate("menu") },
                    modifier = Modifier.padding(16.dp).width(300.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Red
                    ),
                ) {
                    Text("Lista de platos",
                        fontSize = 24.sp)
                }

                ElevatedButton(
                    onClick = { navController.navigate("param") },
                    modifier = Modifier.padding(16.dp).width(300.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Red
                    ),
                ) {
                    Text("Envio Parametros",
                        fontSize = 24.sp)
                }

            }
            // Botón para ir a la pantalla de CheckBox

        }


    }}
