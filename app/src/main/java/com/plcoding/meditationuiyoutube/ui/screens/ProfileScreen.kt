package com.plcoding.meditationuiyoutube.ui.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.plcoding.meditationuiyoutube.R


@Preview
@Composable
fun ProfileScreen() {
    Box(
    modifier = Modifier
    .fillMaxSize()){
  Column(
      Modifier
          .fillMaxHeight()
          .fillMaxWidth()
          .background(color = Color(android.graphics.Color.parseColor("#ececec"))),
      horizontalAlignment = Alignment.CenterHorizontally){

      Icon(
          painter = painterResource(id = R.drawable.customer),
          contentDescription = "ImageProfile",
          tint = Color.White,

      )

//      ConstraintLayout {
//          val (topImg) = createRefs()
//          Image(painterResource(id = R.drawable.customer), null,
//              Modifier
//                  .constrainAs(topImg){
//                      top.linkTo(parent.bottom)
//                      start.linkTo(parent.start)
//                      end.linkTo(parent.end)
//                  })
//      }

      Text("Name Surname",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top=16.dp),
          color = Color(android.graphics.Color.parseColor("#747679"))

      )
      Text("id:345678",
              fontSize = 20.sp,
          color = Color(android.graphics.Color.parseColor("#747679"))
            )
      Button(onClick = { /*TODO*/ },
          Modifier
              .fillMaxWidth()
              .height(80.dp)
              .padding(start = 32.dp, end = 32.dp, top = 16.dp, bottom = 16.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color(android.graphics.Color.parseColor("#373ebf"))),
                shape = RoundedCornerShape(35)
                ) {
          Text("Log out", color= Color.White, fontSize = 18.sp, fontWeight = FontWeight.Bold)

      }
  }

}}


