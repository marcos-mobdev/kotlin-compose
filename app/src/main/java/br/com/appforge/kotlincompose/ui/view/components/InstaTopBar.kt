package br.com.appforge.kotlincompose.ui.view.components

import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import br.com.appforge.kotlincompose.ui.theme.Primary

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InstaTopBar(
    modifier: Modifier = Modifier
){
    TopAppBar(
        modifier = modifier

        ,
        title = {
            Text(text = "Instagram")
        },
        /*
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Primary,
            navigationIconContentColor = Color.White,
            titleContentColor = Color.White,
            actionIconContentColor = Color.White
        ),
        navigationIcon = {
          Icon(
              imageVector = Icons.Default.Home,
              contentDescription = null
          )
        },

         */
        actions = {
            Row {
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = null
                    )
                }
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = null
                    )
                }
            }
        }

    )
}

@Preview
@Composable
fun InstaTopBarPreview(){
    InstaTopBar()
}