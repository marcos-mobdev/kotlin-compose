package br.com.appforge.kotlincompose

import android.os.Bundle
import android.provider.CalendarContract
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import br.com.appforge.kotlincompose.ui.components.CustomButton
import br.com.appforge.kotlincompose.ui.theme.KotlinComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KotlinComposeTheme {
                FirstApp()
            }//ComposeTheme
        }//setContent
    }//onCreate
}//Activity


@Composable
fun FirstApp(){

    /*
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color.Gray)
        ,
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text("Ana", color = Color.Red, fontSize = 36.sp)
        Text("Bruno", color = Color.Red, fontSize = 36.sp)
        Text("Carla", color = Color.Red, fontSize = 36.sp)
    }

     */


   Column(
       modifier = Modifier
           .fillMaxWidth()
           .fillMaxHeight()
           .background(color = Color.Gray)
       ,
       verticalArrangement = Arrangement.SpaceAround,
       horizontalAlignment = Alignment.CenterHorizontally
   ) {
       Text("Ana", color = Color.Red, fontSize = 36.sp)
       Text("Bruno", color = Color.Red, fontSize = 36.sp)
       Text("Carla", color = Color.Red, fontSize = 36.sp)
       CustomButton(text = "Marcos") {
           println("CustomButton clicked!")
       }
   }




}

@Preview
@Composable
fun FirstAppPreview(){
    FirstApp()
}
