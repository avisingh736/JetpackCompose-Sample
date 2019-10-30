package com.example.compose_example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.*
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.MaterialTheme
import androidx.ui.res.imageResource
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontFamily
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Greeting("Android")
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column(
            crossAxisSize = LayoutSize.Expand,
            modifier = Spacing(16.dp)
    ) {
        Container(expanded = true, height = 150.dp) {
            Clip(shape = RoundedCornerShape(size = 5.dp)) {
                DrawImage(+imageResource(R.drawable.abc_1))
            }
        }
        Row(mainAxisAlignment = MainAxisAlignment.Center,
            mainAxisSize = LayoutSize.Expand) {
            Text(text = "Hello $name!",style = TextStyle(color = Color.DarkGray, fontSizeScale = 2.toFloat(), fontSize = 16.sp, fontFamily = FontFamily.Serif))
        }
        Row(mainAxisAlignment = MainAxisAlignment.Center,
            mainAxisSize = LayoutSize.Expand,
            modifier = Spacing(16.dp)) {
            Text(text = "This is an example of android jetpack compose toolkit",style = TextStyle(color = Color.DarkGray, fontSize = 16.sp, fontFamily = FontFamily.Serif))
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    MaterialTheme {
        Greeting("Android")
    }
}
