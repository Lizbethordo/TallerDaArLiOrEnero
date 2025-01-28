package dev.liz.tallerdaarliorenero.Reusable

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun ItemContact2(name: String, icon: ImageVector, icon2: ImageVector, navController: NavHostController) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth()
            .padding(24.dp)

    ) {
        Row (){
            Icon(
                imageVector = icon, contentDescription = name,
                tint = Color.Black
            )
            Text(
                text = name,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 12.dp).clickable{
                    navController.navigate("param2/$name")

                }
            )
            Icon(
                imageVector = icon2, contentDescription = name,
                tint = Color.Black
            )
        }
    }
}