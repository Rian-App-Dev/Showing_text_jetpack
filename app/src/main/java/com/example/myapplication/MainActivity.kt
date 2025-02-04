package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val names = arrayOf("Rian", "Rimon", "Riazul", "Ferdous", "Syed")
        setContent {
            Column {
                Text(text = "My name is Rian".repeat(5), fontSize = 30.sp, fontStyle = FontStyle.Italic,
                    color = Color.Red, fontFamily = FontFamily.Cursive, textAlign = TextAlign.Center,
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier.background(Color.Black).fillMaxWidth().padding(10.dp)
                )

                for(i in names){
                    Text(i, fontSize = 30.sp, fontStyle = FontStyle.Italic,
                        color = Color.Red, fontFamily = FontFamily.Cursive, textAlign = TextAlign.Center,
                        fontWeight = FontWeight.ExtraBold,
                        modifier = Modifier.background(Color.Black).fillMaxWidth().padding(10.dp))
                }
                ShowText()
            }
        }

    }

    @Preview(showBackground = true)
    @Composable
    fun ShowText(){
        Text(text = "Text of function's inside", fontFamily = FontFamily.Cursive, fontSize = 30.sp, color = Color.Black, textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth().padding(10.dp)
        )
    }
}

