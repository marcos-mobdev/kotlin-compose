package br.com.appforge.kotlincompose.ui.view

import android.os.Bundle
import android.widget.Toast

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.appforge.kotlincompose.R
import br.com.appforge.kotlincompose.data.remote.model.User
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

    private val radioOptions = listOf("Android", "iOS", "Flutter", "React Native")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KotlinComposeTheme {
                SecondApp()
            }//ComposeTheme
        }//setContent
    }//onCreate

    @Composable
    fun ItemCard(user: User){
        Card(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth()
            ,
            elevation = CardDefaults.cardElevation(
                defaultElevation = 8.dp),
            shape = RoundedCornerShape(16.dp),
            //colors = CardDefaults.cardColors(containerColor = Color.Magenta, contentColor = Color.Blue),
            onClick = {
                Toast.makeText(this, "Toasty!", Toast.LENGTH_SHORT).show()
            }
        ) {
            Row (
                Modifier.padding(16.dp,8.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(id = R.drawable.anvil),
                    contentDescription = null,
                    modifier = Modifier
                        .height(60.dp)
                        .width(60.dp),
                    contentScale = ContentScale.Crop,
                    alignment = Alignment.TopStart,

                    )
                Text(text = "${user.name} - ${user.age}",
                    fontSize = 22.sp,
                    modifier = Modifier.padding(start = 16.dp)

                )
            }
        }
    }

    @Composable
    fun SecondApp(){
        var counter by remember{
            mutableStateOf(0)
        }
        var name by remember{
            mutableStateOf("")
        }
        var usersList by remember{
            mutableStateOf(listOf<User>())
        }

        var checked by remember{
            mutableStateOf(false)
        }

        var selectedItemRadio by remember{
            mutableStateOf(radioOptions[0])
        }

        Column(modifier = Modifier
            .background(Color.White)
            .padding(30.dp)
            .fillMaxWidth()
            .fillMaxHeight()
        ) {
            /*
            Row {
                OutlinedTextField(
                    value = name,
                    onValueChange = { value->
                        name = value
                        Log.i("info_app", "typed: $value")
                    },
                    placeholder = {Text(text = "Type your name:")}
                )
                Spacer(modifier = Modifier.width(8.dp))
                Button(onClick = {
                    val user = User(name,0)
                    usersList = usersList + user
                    name = ""
                }) {
                    Icon(
                        painter = painterResource(R.drawable.ic_add_24),
                        contentDescription = null,
                        modifier = Modifier.size(40.dp)
                    )
                }

            }//Row

             */
            /*
            LazyColumn (
                modifier = Modifier.padding(
                    top = 16.dp,
                    bottom = 16.dp
                )
            ){
                items(usersList){ user->
                    Text(text = "+) ${user.name}", modifier = Modifier.padding(8.dp) )
                    HorizontalDivider()
                }
            }

             */

            //Other interface components:
            /*
            FloatingActionButton(
                containerColor = Color.Blue,
                contentColor = Color.LightGray,
                onClick = {}
            ) {
                Icon(
                    painter = painterResource(R.drawable.ic_add_24),
                    contentDescription = null
                )
            }

             */
            /*
            ExtendedFloatingActionButton(
                containerColor = Color.Blue,
                contentColor = Color.LightGray,
                onClick = {}
            ) {
                Text(text = "Search")
            }

             */
            /*
            Switch(
                checked = checked,
                onCheckedChange = { value ->
                    checked = value
                })

             */
            /*
            Checkbox(
                checked = checked,
                onCheckedChange = { value ->
                    checked = value
                })

             */
            /*
            radioOptions.forEach { option ->
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    RadioButton(
                        selected = option == selectedItemRadio,
                        onClick = {
                            selectedItemRadio = option
                        }
                    )
                    Text(text = option)
                }
            }

             */

            LazyColumn {
                items(users){ user->
                    ItemCard(user)
                }
            }



        }//Column
    }

    @Preview
    @Composable
    fun AppPreview(){
        SecondApp()
    }

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
            modifier = Modifier
                .padding(16.dp)
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
                            .border(2.dp, Color.Red),
                        contentScale = ContentScale.Crop,
                        alignment = Alignment.TopStart,

                        )
                    Text(text = name)
                }
            }
        }


    }




}//Activity


