package com.example.secondapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.secondapp.R
import com.example.secondapp.ui.theme.SecondAppTheme

@Composable
fun SecondScreen() {
    Column {
        Text(text = "Just for you")
        Card {
            Image(
                painter = painterResource(id = R.drawable.cats),
                contentDescription = "cats"
            )
            Text(text = "What makes great art, great")
            Text(text = "The know-how to help you out")
            Row {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "duration icon"
                )
                Text(text = "11 mins Listen")
                Spacer(modifier = Modifier.weight(1f))
                Icon(
                    imageVector = Icons.Default.FavoriteBorder,
                    contentDescription = "bookmark icon"
                )
            }
        }
        Row {
            Text(text = "Art")
            Spacer(modifier = Modifier.weight(1f))
            Text(text = "More")
        }
        Row {
            Card {
                Text(text = "What makes great art, great")
                Text(text = "The know-how to help you out")
                Row {
                    Icon(
                        imageVector = Icons.Default.AccountCircle,
                        contentDescription = "duration icon"
                    )
                    Text(text = "11 mins Listen")
                    Spacer(modifier = Modifier.weight(1f))
                    Icon(
                        imageVector = Icons.Default.FavoriteBorder,
                        contentDescription = "bookmark icon"
                    )
                }
            }
            Card {
                Text(text = "What makes great art, great")
                Text(text = "The know-how to help you out")
                Row {
                    Icon(
                        imageVector = Icons.Default.AccountCircle,
                        contentDescription = "duration icon"
                    )
                    Text(text = "11 mins Listen")
                    Spacer(modifier = Modifier.weight(1f))
                    Icon(
                        imageVector = Icons.Default.FavoriteBorder,
                        contentDescription = "bookmark icon"
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SecondScreenPreview() {
    SecondAppTheme {
        SecondScreen()
    }
}
