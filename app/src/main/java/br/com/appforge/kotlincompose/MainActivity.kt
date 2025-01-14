package br.com.appforge.kotlincompose

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.appforge.kotlincompose.model.User
import br.com.appforge.kotlincompose.ui.theme.KotlinComposeTheme

class MainActivity : ComponentActivity() {

    private val users = listOf(
        User("Ana",18),
        User("Beto",23),
        User("Carla",25),
        User("Daniel",33),
        User("Ellen",62),
        User("Fernando",34),
        User("Gabriela",61),
        User("Homero",22),
        User("Iara",18),
        User("Jamil",19),
        User("Kellen",25),
        User("Larissa",21),
        User("Marcos",20),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KotlinComposeTheme {
                FirstApp()
            }//ComposeTheme
        }//setContent
    }//onCreate

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




       Column(
           modifier = Modifier
               //.fillMaxWidth()
               //.fillMaxHeight()
               .width(200.dp)
               //.height(200.dp)
               .background(color = Color.Gray)
               .border(2.dp,Color.Red)
               .padding(30.dp,10.dp)
               .border(2.dp,Color.Green)
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

      */
        /*
        Column(modifier = Modifier
            .background(Color.Gray)
            .border(2.dp, Color.Red)
            .padding(30.dp, 10.dp)
            .padding(30.dp)
            .fillMaxHeight()
            .fillMaxWidth()
        ) {

            Text(text = "Marcos", fontSize = 20.sp)
            Column (
                modifier = Modifier
                    .height(100.dp)
                    .width(100.dp)
                    //.clip(CircleShape)
                    //.clip(RoundedCornerShape(topStart = 20.dp, topEnd = 30.dp))
                    .clip(CutCornerShape(8.dp))
                    .border(2.dp, Color.Red, CircleShape)
                    .clip(CircleShape)
                    .background(Color.Yellow),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center

            ) {
                Text(
                    text = "MP",
                    fontSize = 32.sp,
                    modifier = Modifier
                        //.padding(top = 30.dp, end = 30.dp, start = 20.dp, bottom = 10.dp)
                )


            }
            Image(
                painter = painterResource(id = R.drawable.anvil),
                contentDescription = null,
                modifier = Modifier
                    .height(200.dp)
                    .width(200.dp)
                    .border(2.dp,Color.Red),
                contentScale = ContentScale.Crop,
                alignment = Alignment.TopStart
            )
            Icon(
                //painter = painterResource(R.drawable.ic_add_alert_24),
                imageVector = Icons.Default.AddCircle,
                contentDescription = null,
                /*
                modifier = Modifier
                    .height(30.dp)
                    .width(30.dp)

                 */
            )
            Button(onClick = {}) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    if(true){
                        Icon(
                            imageVector = Icons.Default.Lock,
                            contentDescription = null
                        )
                    }else{
                        Icon(
                            imageVector = Icons.Default.Delete,
                            contentDescription = null
                        )
                    }

                    Text(text = "Lock")
                }
            }
        }

         */
        /*
        Column {
            for (i in 1..4){
                Image(
                    painter = painterResource(id = R.drawable.anvil),
                    contentDescription = null,
                    modifier = Modifier
                        .height(200.dp)
                        .width(200.dp)
                        .border(2.dp,Color.Red),
                    contentScale = ContentScale.Crop,
                    alignment = Alignment.TopStart
                )
            }
        }

         */
        /*
        LazyColumn (
            modifier = Modifier.padding(16.dp).background(Color.Gray)
        ){
            items(users.size){ index ->
                val name = users[index].name
                val age = users[index].age

                Row(
                    modifier = Modifier
                        .padding(top = 16.dp, bottom = 16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Image(
                        painter = painterResource(id = R.drawable.anvil),
                        contentDescription = null,
                        modifier = Modifier
                            .height(80.dp)
                            .width(80.dp)
                            .border(2.dp,Color.Red),
                        contentScale = ContentScale.Crop,
                        alignment = Alignment.TopStart,

                    )
                    Text(text = "$name - $age",
                        fontSize = 32.sp,
                        modifier = Modifier.padding(start = 16.dp)

                    )
                }//Row


                Box(modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(Color.LightGray)
                )

            }
        }

         */
        /*
        LazyVerticalGrid(
            //columns = GridCells.Adaptive(122.dp)
            columns = GridCells.Fixed(3)
        ) {
            items(users.size){ index ->
                val name = users[index].name
                val age = users[index].age

                Column {
                    Image(
                        painter = painterResource(id = R.drawable.anvil),
                        contentDescription = null,
                        modifier = Modifier
                            .height(80.dp)
                            .width(80.dp)
                            .border(2.dp,Color.Red),
                        contentScale = ContentScale.Crop,
                        alignment = Alignment.TopStart,

                        )
                    Text(text = name)
                }
            }
        }

         */

        LazyHorizontalGrid(
            rows = GridCells.Fixed(3),
            modifier = Modifier.padding(16.dp)
                .height(150.dp)

        ) {
            items(users.size){ index ->
                val name = users[index].name
                val age = users[index].age

                Column {
                    Image(
                        painter = painterResource(id = R.drawable.anvil),
                        contentDescription = null,
                        modifier = Modifier
                            .height(80.dp)
                            .width(80.dp)
                            .border(2.dp,Color.Red),
                        contentScale = ContentScale.Crop,
                        alignment = Alignment.TopStart,

                        )
                    Text(text = name)
                }
            }
        }


    }

    @Preview
    @Composable
    fun FirstAppPreview(){
        FirstApp()
    }


}//Activity


