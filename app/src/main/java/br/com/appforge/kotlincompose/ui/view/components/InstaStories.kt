package br.com.appforge.kotlincompose.ui.view.components

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import br.com.appforge.kotlincompose.data.remote.dto.User
import br.com.appforge.kotlincompose.data.remote.model.Story

@Composable
fun InstaStories(
    usersList :List<User>,
    modifier: Modifier = Modifier,

    ){
    LazyRow (modifier = Modifier){
        items(usersList){ user->
            InstaStoriesItem(user)
        }
    }
}