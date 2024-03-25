//package com.example.myapp
//
//import android.content.Intent
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.foundation.text.ClickableText
//import androidx.compose.material3.Button
//import androidx.compose.material3.ButtonDefaults
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Surface
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.RectangleShape
//import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.AnnotatedString
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import com.example.myapp.ui.theme.MyAppTheme
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//
//                    Greeting()
//
//
//        }
//    }
//}
//@Preview(showBackground = true)
//@Composable
//fun Greeting() {
//    Column(
//
//        modifier = Modifier
//            .fillMaxSize()
//            .background(color = Color.Cyan)
//            .padding(10.dp)
//
//
//    ) {
//
//
//        Image(painter = painterResource(id = R.drawable.tomato), contentDescription = "name" )
//
//        Text(text = "about us ", color = Color.Black)
//
//          val jj = AnnotatedString("you want to go home ? click here")
//          val ll = LocalContext.current
//          ClickableText(text = jj , onClick = {})
//
//
//          ll.startActivity(Intent(ll , AboutActivity :: class.java ))
//          Button(onClick = { }) {
//
//              ll.startActivity(Intent(ll , AboutActivity :: class.java ))
//              Text(text = "MOGUL")
//
//
//              Text(text = "1. maxwell")
//              Text(text = "2. kuol")
//
//              val home = LocalContext.current
//              Button(onClick = {
//                  home.startActivity(Intent(home, AboutActivity::class.java))
//
//              },
//                  colors = ButtonDefaults.outlinedButtonColors(Color.Cyan)
//                  border = BorderStroke(2.dp,Color.Black)
//                  shape = RectangleShape
//                  shape = RoundedCornerShape(6.dp)
//
////
////                  Column (
////                      modifier = Modifier
////
////                          .background(Color.Black)
////                          .padding(10dp)
////                          .fillMaxSize()
////
////
////
////
////
////                  )
////
//
//
////              val jj = AnnotatedString("maxwell is a beast click here to continue?? ")
////               val kk = LocalContext.current
////                  ClickableText(text = jj , onClick = {})
////
////                  kk.startActivity(Intent(kk , AboutActivity::class.java))
////
////
////                  {
////
////                  }
////
////
////
////
////
////
////              ) {
////
////              }
////
////          }
////
//
//
//
//
//          }
//
//
//        }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
