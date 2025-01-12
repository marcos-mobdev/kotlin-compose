package br.com.appforge.kotlincompose.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CustomButton(
    text:String,
    onClick: () -> Unit
){
    Button(
        onClick = onClick,
        //modifier = Modifier.fillMaxWidth()
        ) {
        Text(text = "+ ")
        Text(text = text)
        Text(text = "+ ")

    }

}

@Preview
@Composable
fun ButtonPreview(){
    CustomButton(text = "Marcos") {
        println("CustomButton clicked!")
    }
}
