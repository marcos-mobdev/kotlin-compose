package br.com.appforge.kotlincompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import br.com.appforge.kotlincompose.ui.components.InstaTopBar
import br.com.appforge.kotlincompose.ui.theme.KotlinComposeTheme

class InstagramActivity : ComponentActivity() {
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
                        BottomAppBar {
                            Text(text = "Bottom App Bar")
                        }
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
            Text(text = "Hello, there!")
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
