package br.com.appforge.kotlincompose.ui.view.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import br.com.appforge.kotlincompose.data.remote.dto.User
import br.com.appforge.kotlincompose.data.remote.model.Story
import coil3.compose.AsyncImage

@Composable
fun InstaStoriesItem(
    user: User,
    modifier: Modifier = Modifier
){
    Column (modifier = modifier.padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        AsyncImage(
            model = user.image,
            contentDescription = null,
            modifier = Modifier
                .background(Color.LightGray, CircleShape)
                .clip(CircleShape)
                .size(56.dp),
            contentScale = ContentScale.Crop
        )
        Text(
            text = user.firstName,
            style = MaterialTheme.typography.titleMedium
        )
    }

}