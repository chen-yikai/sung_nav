package com.example.sung_nav

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.example.sung_nav.ui.theme.Sung_navTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Home()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Home() {
    Column(
        Modifier
            .systemBarsPadding()
            .fillMaxSize()
    ) {
        Nav()
//        BoxExample()
        List()
    }
}

@Preview
@Composable
fun BoxExample() {
    Box(
        Modifier
            .height(100.dp)
            .fillMaxWidth()
            .background(Color(0xff64F580))
    ) {
        Text(
            "Hello", modifier = Modifier
                .align(Alignment.Center)
                .zIndex(1f)
        )
        Icon(
            Icons.Default.Home,
            contentDescription = "",
            tint = Color.Red,
            modifier = Modifier
                .align(Alignment.Center)
                .zIndex(0f)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun List() {
    val pet = listOf<String>("Cat", "Dog", "Frog", "Fox", "Sung")
    LazyColumn(
        modifier = Modifier
            .padding(horizontal = 20.dp)
    ) {
        items(pet) {
            Text(it)
        }
        item(5) {
            repeat(5) {
                HorizontalDivider()
                Sh()
                Box(
                    Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .background(Color(0xff64F580))
                )
                Sh()
                Text(
                    """
            Lorem ipsum dolor sit amet, sit magna cupidatat quis commodo lorem incididunt ut qui qui sunt anim ad sunt deserunt minim enim proident eiusmod
        """.trimIndent()
                )
                Sh()
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun Nav() {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(10.dp), verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(Icons.Default.Home, contentDescription = "")
        Row(
            Modifier
                .border(1.dp, Color.Gray)
                .height(40.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                "USER_NAME",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
            )
            TextButton(onClick = {}) {
                Text("Button")
            }
        }
    }
}

@Composable
fun Sh(h: Dp = 10.dp) {
    Spacer(Modifier.height(h))
}