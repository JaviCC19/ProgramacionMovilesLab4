package com.uvg.lab4.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.uvg.lab4.R
import com.uvg.lab4.ui.theme.Lab4Theme

@Composable
fun Front(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .border(8.dp, MaterialTheme.colorScheme.primary)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Box(modifier = Modifier.weight(0.12f)) {}
            Box(
                modifier = Modifier
                    .weight(0.76f)
                    .paint(
                        painter = painterResource(id = R.drawable.logouvg),
                        contentScale = ContentScale.Fit,
                        alpha = 0.50f
                    )
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween

                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()

                    ) {
                        Text(
                            text = "Universidad Del Valle de Guatemala",
                            modifier = Modifier.align(Alignment.Center),
                            fontWeight = FontWeight.Bold,
                            style = MaterialTheme.typography.headlineLarge,
                            textAlign = TextAlign.Center
                        )
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Text(
                            text = "Programación de plataformas móviles",
                            modifier = Modifier.align(Alignment.Center),
                            style = MaterialTheme.typography.headlineMedium,
                            textAlign = TextAlign.Center
                        )
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Box(
                            modifier = Modifier.weight(0.50f)
                        ) {
                            Text(
                                text = "Integrantes",
                                modifier = Modifier.align(Alignment.Center),
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Center,

                            )
                        }
                        Box(
                            modifier = Modifier.weight(0.50f)
                        ) {
                            Text(
                                text = "Javier Cifuentes \nBrandon Rivera \nPedro Avila",
                                modifier = Modifier.align(Alignment.Center),
                                textAlign = TextAlign.Center,

                            )
                        }

                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Box(
                            modifier = Modifier.weight(0.50f)
                        ) {
                            Text(
                                text = "Catedratico",
                                modifier = Modifier.align(Alignment.Center),
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Center,

                            )
                        }
                        Box(
                            modifier = Modifier.weight(0.50f)
                        ) {
                            Text(
                                text = "Juan Carlos Durini",
                                modifier = Modifier.align(Alignment.Center),
                                textAlign = TextAlign.Center,

                            )
                        }

                    }
                    Box (modifier = Modifier
                        .fillMaxWidth()) {
                        Text(
                            text = "Javier Cifuentes \n23079",
                            modifier = Modifier.align(Alignment.Center),
                            textAlign = TextAlign.Center,
                        )
                    }
                }
            }
            Box(modifier = Modifier.weight(0.12f)) {}
        }
    }
}


@Preview
@Composable
fun TestFront() {
    Lab4Theme{
        Surface(modifier = Modifier.fillMaxSize()){
            Front()
        }
    }

}