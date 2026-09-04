package com.example.profilapp_245150201111024ihyaulumuddin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.profilapp_245150201111024ihyaulumuddin.ui.theme.ProfilApp_245150201111024IhyaUlumuddinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfilApp_245150201111024IhyaUlumuddinTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .background(Color.Gray)
                            .padding(innerPadding)
                            .padding(24.dp)
                            .fillMaxWidth()
                            .background(Color.LightGray)
                            .padding(24.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.foto_profil),
                            contentDescription = "Foto Profil",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(120.dp)
                                .clip(CircleShape)
                        )
                        Spacer(modifier = Modifier.height(12.dp))
                        Text("Nama Lengkap: Ihya' Ulumuddin", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                        Spacer(modifier = Modifier.height(8.dp))
                        Text("NIM: 245150201111024")
                        Spacer(modifier = Modifier.height(8.dp))
                        Text("Mahasiswa Teknik Informatika 2024")
                        Spacer(modifier = Modifier.height(12.dp))
                        FollowButton()
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun FollowButton() {
    var isFollowed by remember { mutableStateOf(false) }
    Button(onClick = { isFollowed = !isFollowed }) {
        Text(if (isFollowed) "Unfollow" else "Follow")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ProfilApp_245150201111024IhyaUlumuddinTheme {
        Greeting("Android")
    }
}
