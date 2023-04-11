package johan.kovalsikoski.rpgbookshelper

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import johan.kovalsikoski.rpgbookshelper.ui.theme.RPGBooksHelperTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RPGBooksHelperTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
private fun ScreenWhite() {
    Column(modifier = Modifier.background(Color.White)) {

    }
}

@Composable
private fun ScreenRed() {
    Column(modifier = Modifier.background(Color.Red)) {

    }
}

@Composable
private fun ScreenGreen() {
    Column(modifier = Modifier.background(Color.Green)) {

    }
}

@Composable
private fun ScreenBlue() {
    Column(modifier = Modifier.background(Color.Blue)) {

    }
}
