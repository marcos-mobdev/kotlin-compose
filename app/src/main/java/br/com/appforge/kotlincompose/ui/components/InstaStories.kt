package br.com.appforge.kotlincompose.ui.components

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import br.com.appforge.kotlincompose.model.Story

@Composable
fun InstaStories(
    storiesList :List<Story>,
    modifier: Modifier = Modifier,

){
    LazyRow (modifier = Modifier){
        items(storiesList){ story->
            InstaStoriesItem(story)
        }
    }
}