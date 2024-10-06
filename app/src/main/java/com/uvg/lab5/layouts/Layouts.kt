package com.uvg.lab5.layouts

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.ContextCompat.startActivity
import com.uvg.lab5.R

@Composable
    fun Pantalla() {
        MaterialTheme {
            Layout()
        }
    }

@Composable
fun Layout() {
    val context = LocalContext.current
    Spacer(modifier = Modifier.width(32.dp))

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color.White),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .background(Color.Cyan)
        ){
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                Box(
                    modifier = Modifier
                        .weight(2f)
                        .aspectRatio(1f)
                ){
                    Icon(
                        modifier = Modifier,
                        painter = painterResource(id = R.drawable.refresh),
                        contentDescription = "refresh",
                    )
                }
                Text(modifier = Modifier
                    .weight(7f)
                    .padding(horizontal = 8.dp),
                    text = "Actualización Disponible",
                    fontSize = 16.sp,
                )

                TextButton(
                    modifier = Modifier.weight(4f),
                    onClick = {
                        val uri = Uri.parse("https://play.google.com/store/apps/details?id=com.grindrapp.android")
                        val intent = Intent(Intent.ACTION_VIEW, uri)
                        context.startActivity(intent)
                    },

                    ) {
                    Text("Descargar")
                }


            }
        }
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier
                    .weight(0.5f)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Viernes",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Start,
                    modifier = Modifier
                        .padding(bottom = 8.dp)
                        .fillMaxWidth()
                )
                Text(
                    text = "19 de Enero",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Start,
                    modifier = Modifier
                        .padding(bottom = 8.dp)
                        .fillMaxWidth()
                )
            }

            TextButton(
                onClick = { /* Acción del botón */ },
                shape = RoundedCornerShape(8.dp), // Bordes redondeados
                border = BorderStroke(1.dp, color = Color.Black)
            ) {
                Text(
                    text = "Terminar jornada",
                    color = Color(0xFF6200EA) // Color morado para el texto
                )
            }
        }
        Spacer(modifier = Modifier.width(8.dp))


        Card(
            shape = RoundedCornerShape(4.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                // Contenedor para el texto
                Column(
                    modifier = Modifier
                        .align(Alignment.CenterStart) // Alinea el contenido al inicio (izquierda) del Box
                ) {
                    Text(
                        text = "FamilyBond",
                        fontSize = 24.sp,
                        style = MaterialTheme.typography.labelLarge,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )
                    Text(
                        text = "Zona 15, Cayala, Ciudad de Guatemala",
                        fontSize = 16.sp,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )
                    Text(
                        text = "8:00AM - 7:00PM",
                        fontSize = 16.sp,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )
                }

                // Icono en la esquina superior derecha
                IconButton(
                    onClick = {
                        val uriMap = Uri.parse("geo:0,0?q=Zona+15,+Ciudad+de+Guatemala")
                        val mapIntent = Intent(Intent.ACTION_VIEW, uriMap)
                        mapIntent.setPackage("com.google.android.apps.maps")
                        context.startActivity(mapIntent)
                    },
                    modifier = Modifier
                        .align(Alignment.TopEnd) // Alinea el icono en la esquina superior derecha
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.directions),
                        contentDescription = "Directions"
                    )
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp), // Opcional: agrega un poco de padding horizontal
                horizontalArrangement = Arrangement.SpaceBetween // Espacio entre los botones
            ) {
                Button(
                    onClick = {
                        Toast.makeText(
                            context,
                            "Javier Cifuentes Carredano :)",
                            Toast.LENGTH_SHORT
                        ).show()
                    },
                    colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.primary),
                    modifier = Modifier
                        .weight(1f) // Ocupa la mitad del espacio disponible
                        .clip(RoundedCornerShape(12.dp)) // Bordes redondeados
                ) {
                    Text("Iniciar")
                }

                Spacer(modifier = Modifier.width(8.dp)) // Espacio entre los botones

                Button(
                    onClick = {
                        Toast.makeText(
                            context,
                            "Cafeteria\nQQQ",
                            Toast.LENGTH_SHORT
                        ).show()
                    },
                    colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.tertiary),
                    modifier = Modifier
                        .weight(1f) // Ocupa la mitad del espacio disponible
                        .clip(RoundedCornerShape(12.dp)) // Bordes redondeados
                ) {
                    Text("Detalles")
                }
            }
        }




            }
        }



    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        Pantalla()
    }

