package com.example.myapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.DisplayMode.Companion.Input

import androidx.compose.material3.OutlinedTextField

import androidx.compose.material3.Text
import androidx.compose.material3.TextField

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import java.nio.file.WatchEvent


class MaxwellCodes : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting2()

        }
    }
}
@Preview(showBackground = true)
@Composable
fun Greeting2() {

  Column (
      modifier = Modifier
          .padding(10.dp)
          .fillMaxSize()
          .background(Color.Cyan),


      verticalArrangement = Arrangement.Center,
       horizontalAlignment = Alignment.CenterHorizontally







  ) {


      Image(painter = painterResource(id = R.drawable.tomato), contentDescription = "",
          modifier = Modifier
              .background(Color.Cyan)
              .size(300.dp),
//               colorFilter = ColorFilter.tint(Color.White),





          )
      
      
      var Input by  remember   { mutableStateOf(TextFieldValue("")) }
      OutlinedTextField(value = Input, onValueChange = {Input = it} , label = { Text(text = "Input")})
      
      Spacer(modifier = Modifier.height(20.dp))

      var phone by remember { mutableStateOf(TextFieldValue(""))  }
      OutlinedTextField(value = phone, onValueChange = {phone = it} , label = { Text(text = "Phone")} )

      Spacer(modifier = Modifier.height(20.dp))







      var name by remember { mutableStateOf(TextFieldValue(""))  }
      OutlinedTextField(value = name, onValueChange = {name = it} ,  label = { Text(text = "Name"  )}  )

      Spacer(modifier = Modifier.height(20.dp))



      var email by remember { mutableStateOf(TextFieldValue(""))  }
      OutlinedTextField(value = email, onValueChange = {email = it}, label = { Text(text = "Username")} )

      Spacer(modifier = Modifier.height(20.dp))


      val aa = AnnotatedString("no account? click here to create an account",
            spanStyle = SpanStyle(Color.Blue)
        )


      val bb = LocalContext.current
        ClickableText(text = aa, onClick = {

            bb.startActivity(Intent(bb, MainActivity::class.java))

        })






  }




}

class MainActivity {

}

