package com.example.myinformation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    MyInformation()
                }
            }
        }
    }
}

@Composable
fun MyInformation() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
            .padding(horizontal = 20.dp, vertical = 12.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        //отступ сверху
        Spacer(modifier = Modifier.weight(0.5f))

        //профидь
        Image(
            painter = painterResource(R.drawable.profile),
            contentDescription = stringResource(R.string.profile_image_description),
            modifier = Modifier.size(120.dp),
            contentScale = ContentScale.Fit
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = stringResource(R.string.full_name),
            fontSize = 32.sp,
            color = Color.Black,
            textAlign = TextAlign.Center,
            lineHeight = 36.sp,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = stringResource(R.string.job_title),
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )

        //расстояние до контактных данных
        Spacer(modifier = Modifier.weight(0.8f))

        //контакты
        Column(
            modifier = Modifier.padding(bottom = 12.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            ContactRow(
                icon = R.drawable.phone,
                text = stringResource(R.string.phone_number)
            )

            ContactRow(
                icon = R.drawable.tg,
                text = stringResource(R.string.social_handle)
            )

            ContactRow(
                icon = R.drawable.mail,
                text = stringResource(R.string.email_address)
            )
        }
        Spacer(modifier = Modifier.weight(0.5f))
    }
}

@Composable
fun ContactRow(
    icon: Int,
    text: String
) {
    Row(
        modifier = Modifier.width(260.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(icon),
            contentDescription = null,
            modifier = Modifier.size(38.dp),
            contentScale = ContentScale.Fit
        )

        Spacer(modifier = Modifier.width(16.dp))

        Text(
            text = text,
            fontSize = 16.sp,
            color = Color.Black
        )
    }
}
