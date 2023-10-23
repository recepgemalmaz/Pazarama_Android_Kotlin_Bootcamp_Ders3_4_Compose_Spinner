package com.recepgemalmaz.pazarama_bootcamp_ders_3_4_jackpack_compase_spinner

import com.recepgemalmaz.pazarama_bootcamp_ders_3_4_jackpack_compase_spinner.ui.theme.Pazarama_Bootcamp_Ders_3_4_Jackpack_Compase_SpinnerTheme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


class MainActivity : ComponentActivity() {

    lateinit var kategorikParcalar:MutableList<Parca>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            kategorikParcalar = mutableListOf<Parca>()

            Pazarama_Bootcamp_Ders_3_4_Jackpack_Compase_SpinnerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Pazarama_Bootcamp_Ders_3_4_Jackpack_Compase_SpinnerTheme {
        Greeting("Android")
    }
}