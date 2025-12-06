package mx.edu.utez.regalonavidad.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import mx.edu.utez.regalonavidad.ui.theme.RegaloNavidadTheme

@Composable
fun CajaDeRegalo(abrir: () -> Unit){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .clip(RoundedCornerShape(size = 16.dp))
            .background(Color(0xFF032FC0))
            .clickable{abrir()}

    ){
        Box(
            modifier = Modifier
                .fillMaxSize()
                .width(30.dp)
                .background(Color(0xFFFFE100))
                .align(Alignment.Center)
        )
        Surface (
            shape = RoundedCornerShape(50),
            color = Color(0xFF032FC0),
            modifier = Modifier
                .size(60.dp)
                .align(Alignment.Center)
        ){
            Box(contentAlignment = Alignment.Center){
                Text(text = "\uD83C\uDF80", style = MaterialTheme.typography.headlineLarge)
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewCajaDeRegalo(){
    RegaloNavidadTheme {
        CajaDeRegalo{}
    }
}