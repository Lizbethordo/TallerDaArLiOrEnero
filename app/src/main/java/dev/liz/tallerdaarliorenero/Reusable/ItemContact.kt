package dev.liz.tallerdaarliorenero.Reusable

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.clickable
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavHostController

@Composable
fun ItemContact(name: String, icon: ImageVector, icon2: ImageVector, navController: NavHostController) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth()
            .padding(24.dp)

    ) {
        Row (){
            Icon(
                imageVector = icon, contentDescription = name,
                tint = Color.Green
            )
            Text(
                text = name,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 12.dp).clickable{
                    navController.navigate("param/$name")

                }
            )
            Icon(
                imageVector = icon2, contentDescription = name,
                tint = Color.Black
            )
        }
    }
}