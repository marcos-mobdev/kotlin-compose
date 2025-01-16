package br.com.appforge.kotlincompose.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import br.com.appforge.kotlincompose.model.Story

@Composable
fun InstaStoriesItem(
    story: Story,
    modifier: Modifier = Modifier
){
    Column (modifier = modifier.padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(story.profileImageRes),
            contentDescription = null,
            modifier = Modifier
                .clip(CircleShape)
                .size(56.dp),
            contentScale = ContentScale.Crop
        )
        Text(
            text = story.name,
            style = MaterialTheme.typography.titleMedium
        )
    }

}