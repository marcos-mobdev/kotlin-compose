package br.com.appforge.kotlincompose.ui.view.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import br.com.appforge.kotlincompose.data.remote.model.Post

@Composable
fun PostItem(
    post : Post,
    modifier: Modifier = Modifier
){
    Column (modifier = Modifier.padding(top = 8.dp, bottom = 8.dp)){
        //Profile Info
        Row(
            modifier = Modifier.padding(16.dp,8.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                modifier = Modifier
                    .size(56.dp)
                    .clip(CircleShape),
                painter = painterResource(id = post.profileImageRes),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
            Text(
                text = post.name,
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(start = 8.dp),
                )
        }
        //Post Info
        Image(
            modifier = Modifier.fillMaxWidth(),
            painter = painterResource(id = post.photoRes),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Text(
            text = post.description,
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.padding(16.dp,4.dp),

            )

    }

}