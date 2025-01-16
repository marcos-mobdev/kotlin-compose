package br.com.appforge.kotlincompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.appforge.kotlincompose.model.Post
import br.com.appforge.kotlincompose.model.Story
import br.com.appforge.kotlincompose.ui.components.InstaBottomBar
import br.com.appforge.kotlincompose.ui.components.InstaStories
import br.com.appforge.kotlincompose.ui.components.InstaTopBar
import br.com.appforge.kotlincompose.ui.components.PostArea
import br.com.appforge.kotlincompose.ui.theme.KotlinComposeTheme

class InstagramActivity : ComponentActivity() {

    private val storiesList = listOf(
        Story(R.drawable.perfil_01, "Ana"),
        Story(R.drawable.perfil_02, "Bruno"),
        Story(R.drawable.perfil_03, "Carla"),
        Story(R.drawable.perfil_01, "Daniel"),
        Story(R.drawable.perfil_02, "Elaine"),
        Story(R.drawable.perfil_03, "Fabricio"),
        Story(R.drawable.perfil_01, "Gabriela"),
        Story(R.drawable.perfil_02, "Herasmo"),
        Story(R.drawable.perfil_03, "Iara"),
        Story(R.drawable.perfil_01, "João"),
    )

    private val postList = listOf(
        Post(R.drawable.perfil_01, "Ana", photoRes = R.drawable.anvil,"My anvil is forging"),
        Post(R.drawable.perfil_02, "Bruno", photoRes = R.drawable.praia,"Mussum Ipsum, cacilds vidis litro abertis.  Casamentiss faiz malandris se pirulitá. Admodum accumsan disputationi eu sit. Vide electram sadipscing et per. Nulla id gravida magna, ut semper sapien. Pellentesque nec nulla ligula. Donec gravida turpis a vulputate ultricies."),
        Post(R.drawable.perfil_03, "Carla", photoRes = R.drawable.floresta,"Mussum Ipsum, cacilds vidis litro abertis.  Casamentiss faiz malandris se pirulitá. Admodum accumsan disputationi eu sit. Vide electram sadipscing et per. Nulla id gravida magna, ut semper sapien. Pellentesque nec nulla ligula. Donec gravida turpis a vulputate ultricies."),
        Post(R.drawable.perfil_01, "Ana", photoRes = R.drawable.anvil,"My anvil is forging"),
        Post(R.drawable.perfil_02, "Bruno", photoRes = R.drawable.praia,"Mussum Ipsum, cacilds vidis litro abertis.  Casamentiss faiz malandris se pirulitá. Admodum accumsan disputationi eu sit. Vide electram sadipscing et per. Nulla id gravida magna, ut semper sapien. Pellentesque nec nulla ligula. Donec gravida turpis a vulputate ultricies."),
        Post(R.drawable.perfil_03, "Carla", photoRes = R.drawable.floresta,"Mussum Ipsum, cacilds vidis litro abertis.  Casamentiss faiz malandris se pirulitá. Admodum accumsan disputationi eu sit. Vide electram sadipscing et per. Nulla id gravida magna, ut semper sapien. Pellentesque nec nulla ligula. Donec gravida turpis a vulputate ultricies."),
        Post(R.drawable.perfil_01, "Ana", photoRes = R.drawable.anvil,"My anvil is forging"),
        Post(R.drawable.perfil_02, "Bruno", photoRes = R.drawable.praia,"Mussum Ipsum, cacilds vidis litro abertis.  Casamentiss faiz malandris se pirulitá. Admodum accumsan disputationi eu sit. Vide electram sadipscing et per. Nulla id gravida magna, ut semper sapien. Pellentesque nec nulla ligula. Donec gravida turpis a vulputate ultricies."),
        Post(R.drawable.perfil_03, "Carla", photoRes = R.drawable.floresta,"Mussum Ipsum, cacilds vidis litro abertis.  Casamentiss faiz malandris se pirulitá. Admodum accumsan disputationi eu sit. Vide electram sadipscing et per. Nulla id gravida magna, ut semper sapien. Pellentesque nec nulla ligula. Donec gravida turpis a vulputate ultricies."),
        Post(R.drawable.perfil_01, "Ana", photoRes = R.drawable.anvil,"My anvil is forging"),
        Post(R.drawable.perfil_02, "Bruno", photoRes = R.drawable.praia,"Mussum Ipsum, cacilds vidis litro abertis.  Casamentiss faiz malandris se pirulitá. Admodum accumsan disputationi eu sit. Vide electram sadipscing et per. Nulla id gravida magna, ut semper sapien. Pellentesque nec nulla ligula. Donec gravida turpis a vulputate ultricies."),
        Post(R.drawable.perfil_03, "Carla", photoRes = R.drawable.floresta,"Mussum Ipsum, cacilds vidis litro abertis.  Casamentiss faiz malandris se pirulitá. Admodum accumsan disputationi eu sit. Vide electram sadipscing et per. Nulla id gravida magna, ut semper sapien. Pellentesque nec nulla ligula. Donec gravida turpis a vulputate ultricies."),
        Post(R.drawable.perfil_01, "Ana", photoRes = R.drawable.anvil,"My anvil is forging"),
        Post(R.drawable.perfil_02, "Bruno", photoRes = R.drawable.praia,"Mussum Ipsum, cacilds vidis litro abertis.  Casamentiss faiz malandris se pirulitá. Admodum accumsan disputationi eu sit. Vide electram sadipscing et per. Nulla id gravida magna, ut semper sapien. Pellentesque nec nulla ligula. Donec gravida turpis a vulputate ultricies."),
        Post(R.drawable.perfil_03, "Carla", photoRes = R.drawable.floresta,"Mussum Ipsum, cacilds vidis litro abertis.  Casamentiss faiz malandris se pirulitá. Admodum accumsan disputationi eu sit. Vide electram sadipscing et per. Nulla id gravida magna, ut semper sapien. Pellentesque nec nulla ligula. Donec gravida turpis a vulputate ultricies."),

        )

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KotlinComposeTheme {
                Scaffold(
                    topBar = {
                        InstaTopBar()
                    },
                    bottomBar = {
                        InstaBottomBar()
                    },
                    floatingActionButton = {
                        FloatingActionButton(onClick = {}) {
                            Icon(painter = painterResource(R.drawable.ic_add_24), contentDescription = null)
                        }
                    },
                    //floatingActionButtonPosition = FabPosition.End
                ) {innerPadding->
                    Home(Modifier.padding(innerPadding))
                }
            }//KotlinComposeTheme
        }//setContent
    }//onCreate


    @Composable
    fun Home(modifier: Modifier = Modifier) {
        Column(modifier = modifier){
            //Stories
            InstaStories(storiesList)
            HorizontalDivider()
            //Posts
            PostArea(postList)
        }

    }

    @Preview(showBackground = true)
    @Composable
    fun AppPreview() {
        KotlinComposeTheme {
            Home()
        }
    }
}//Activity
