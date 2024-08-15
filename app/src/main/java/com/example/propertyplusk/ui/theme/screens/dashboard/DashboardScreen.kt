package com.example.propertyplusk.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.propertyplusk.R
import com.example.propertyplusk.navigation.ADD_PRODUCTS_URL
import com.example.propertyplusk.navigation.ROUT_HOME
import com.example.propertyplusk.navigation.ROUT_PROPERTY
import com.example.propertyplusk.navigation.VIEW_PRODUCTS_URL
import com.example.propertyplusk.ui.theme.Blue
import com.example.propertyplusk.ui.theme.Lavender
import com.example.propertyplusk.ui.theme.Purple40
import com.example.propertyplusk.ui.theme.Purple80


@Composable

fun DashboardScreen(navController: NavController){

    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "",
            fontSize = 50.sp,
            fontFamily = FontFamily.Cursive,
            color = Lavender

        )
        Spacer(modifier = Modifier.height(5.dp))
        Image(
            painter = painterResource(id = com.example.propertyplusk.R.drawable.homeicon),
            contentDescription ="home",
            modifier = Modifier
                .size(150.dp),
            contentScale = ContentScale.Crop

        )
        Spacer(modifier = Modifier.height(8.dp))


        Text(
            text = "Manage your property with ease",
            fontSize = 25.sp,
            color = Blue
        )
        Spacer(modifier = Modifier.height(8.dp))


        Column (modifier = Modifier.verticalScroll(rememberScrollState())){
            //Start of card
              Card(modifier = Modifier.clickable {  }
                  .fillMaxWidth()
                  .height(650.dp),
                  shape = RoundedCornerShape(topStart = 60.dp, topEnd = 60.dp),
                  colors = CardDefaults.cardColors(Lavender)
              ) {
                  //Row 1
                  Row (modifier = Modifier.padding(20.dp)){
                      //Card1
                      Card(modifier = Modifier
                          .width(160.dp)
                          .height(165.dp)
                          .clickable { navController.navigate(ROUT_HOME) },
                          elevation = CardDefaults.cardElevation(27.dp)) {
                          Column {
                              Spacer(modifier = Modifier.height(10.dp))

                              Box (modifier = Modifier.fillMaxWidth(),
                                  contentAlignment = Alignment.Center){
                                  Image(painter = painterResource(id = R.drawable.homeb),
                                      contentDescription ="home" ,
                                      modifier = Modifier
                                          .size(80.dp))

                              }
                              Spacer(modifier = Modifier.height(10.dp))

                              Text(text = "Home",
                                  fontSize = 24.sp,
                                  modifier = Modifier.fillMaxWidth(),
                                  textAlign = TextAlign.Center)

                          }

                      }
                      //Card1 ends
                      Spacer(modifier = Modifier.width(20.dp))


                      //Card2 starts
                      Card(modifier = Modifier
                          .width(160.dp)
                          .height(165.dp)
                          .clickable { navController.navigate(ROUT_PROPERTY) }, elevation = CardDefaults.cardElevation(27.dp)) {
                          Column {
                              Spacer(modifier = Modifier.height(10.dp))

                              Box (modifier = Modifier.fillMaxWidth(),
                                  contentAlignment = Alignment.Center){
                                  Image(painter = painterResource(id = R.drawable.property),
                                      contentDescription ="home" ,
                                      modifier = Modifier
                                          .size(80.dp))

                              }
                              Spacer(modifier = Modifier.height(10.dp))

                              Text(text = "Property",
                                  fontSize = 24.sp,
                                  modifier = Modifier.fillMaxWidth(),
                                  textAlign = TextAlign.Center)

                          }

                      }
                      //Card2 ends
                  }

                  //End of Row 1
                  //Row 2
                  Row (modifier = Modifier.padding(20.dp)){
                      //Card1
                      Card(modifier = Modifier
                          .width(160.dp)
                          .height(165.dp), elevation = CardDefaults.cardElevation(27.dp)) {
                          Column {
                              Spacer(modifier = Modifier.height(10.dp))

                              Box (modifier = Modifier.fillMaxWidth().clickable { navController.navigate( ADD_PRODUCTS_URL ) },
                                  contentAlignment = Alignment.Center){
                                  Image(painter = painterResource(id = R.drawable.settings),
                                      contentDescription ="home" ,
                                      modifier = Modifier
                                          .size(80.dp))

                              }
                              Spacer(modifier = Modifier.height(10.dp))

                              Text(text = "Settings",
                                  fontSize = 24.sp,
                                  modifier = Modifier.fillMaxWidth(),
                                  textAlign = TextAlign.Center)

                          }

                      }
                      //Card1 ends
                      Spacer(modifier = Modifier.width(20.dp))


                      //Card2 starts
                      Card(modifier = Modifier
                          .width(160.dp)
                          .height(165.dp), elevation = CardDefaults.cardElevation(27.dp)) {
                          Column {
                              Spacer(modifier = Modifier.height(10.dp))

                              Box (modifier = Modifier.fillMaxWidth().clickable { navController.navigate(ADD_PRODUCTS_URL ) },
                                  contentAlignment = Alignment.Center){
                                  Image(painter = painterResource(id = R.drawable.profile),
                                      contentDescription ="home" ,
                                      modifier = Modifier
                                          .size(80.dp))

                              }
                              Spacer(modifier = Modifier.height(10.dp))

                              Text(text = "Admin",
                                  fontSize = 24.sp,
                                  modifier = Modifier.fillMaxWidth(),
                                  textAlign = TextAlign.Center)

                          }

                      }
                      //Card2 ends
                  }

                  //End of Row 2
                  //Row 3
                  Row (modifier = Modifier.padding(20.dp)){
                      //Card1
                      Card(modifier = Modifier.clickable { navController.navigate(ADD_PRODUCTS_URL ) }
                          .width(160.dp)
                          .height(165.dp), elevation = CardDefaults.cardElevation(27.dp)) {
                          Column {
                              Spacer(modifier = Modifier.height(10.dp))

                              Box (modifier = Modifier.fillMaxWidth(),
                                  contentAlignment = Alignment.Center){
                                  Image(painter = painterResource(id = R.drawable.add),
                                      contentDescription ="home" ,
                                      modifier = Modifier
                                          .size(80.dp))

                              }
                              Spacer(modifier = Modifier.height(10.dp))

                              Text(text = "Add",
                                  fontSize = 24.sp,
                                  modifier = Modifier.fillMaxWidth(),
                                  textAlign = TextAlign.Center)

                          }

                      }
                      //Card1 ends
                      Spacer(modifier = Modifier.width(20.dp))


                      //Card2 starts
                      Card(modifier = Modifier.clickable { navController.navigate(VIEW_PRODUCTS_URL ) }
                          .width(160.dp)
                          .height(165.dp), elevation = CardDefaults.cardElevation(27.dp)) {
                          Column {
                              Spacer(modifier = Modifier.height(10.dp))

                              Box (modifier = Modifier.fillMaxWidth(),
                                  contentAlignment = Alignment.Center){
                                  Image(painter = painterResource(id = R.drawable.view),
                                      contentDescription ="home" ,
                                      modifier = Modifier
                                          .size(80.dp))

                              }
                              Spacer(modifier = Modifier.height(10.dp))

                              Text(text = "View",
                                  fontSize = 24.sp,
                                  modifier = Modifier.fillMaxWidth(),
                                  textAlign = TextAlign.Center)

                          }

                      }
                      //Card2 ends
                  }

                  //End of Row 3



              }
            //End of card
        }



    }

}




@Composable
@Preview(showBackground = true)
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())


}