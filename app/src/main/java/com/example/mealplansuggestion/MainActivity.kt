package com.example.mealplansuggestion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          Column(
             horizontalAlignment = Alignment.CenterHorizontally,
              modifier = Modifier.fillMaxSize()
          ) {
              var mealsuggestion by remember {
                  mutableStateOf("")
              }

              var meal_of_the_day by remember {
                  mutableStateOf("")
              }
              Column(
                  horizontalAlignment = Alignment.CenterHorizontally,
                  modifier = Modifier.fillMaxSize()
              ) {
                       Text(text = "mealtime planner",
                         fontSize = 30.sp,
                           fontWeight = FontWeight.Black
                           
                  )
                  Divider()
                  Spacer(modifier = Modifier.size(45.dp))

                  OutlinedTextField(value = mealsuggestion,
                      onValueChange ={text->
                          mealsuggestion=text
                      },
                      placeholder = {


                          Text(text =

                          "Enter time of the day:")
                      }
                  )
                  Row {
                      Button(onClick = {
                          mealsuggestion   = when(mealsuggestion) {
                              "morning" ->"Eggs"

                                  "mid morning" ->"fruit"

                                      "afternoon"->"sandwich"


                              "afternoonsnack" ->"Cake"
                              "dinner" ->"pasta"
                              "afterdinner" ->"ice cream"


                              "Supper" ->"1:Beef stew"
                              else->"invalid meal suggestion"    }

                      })


                      {
                          Text(text = "search")
                      }




                      Button(onClick = {
                          mealsuggestion =""
                          meal_of_the_day =""}) {
                          Text(text = "reset")
                      }
                  }
                  Text(text = "meal of the day is:  $mealsuggestion ",
                      fontSize = 30.sp)

              }

          }
          }



        }


}







