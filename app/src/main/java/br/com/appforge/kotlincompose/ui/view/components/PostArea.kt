package br.com.appforge.kotlincompose.ui.view.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import br.com.appforge.kotlincompose.data.remote.model.Post

@Composable
fun PostArea(
    postList : List<Post>,
    modifier: Modifier = Modifier
){
    LazyColumn(modifier = modifier) {
        items(postList){ post->
            PostItem(post)
        }

    }

}