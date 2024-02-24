package ua.edu.lntu.cw3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ua.edu.lntu.cw3.ui.theme.IPZ_KR_3_Syvylo_RomanTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IPZ_KR_3_Syvylo_RomanTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ItemColumn()
                }
            }
        }
    }
}



@Composable
fun ItemColumn(modifier: Modifier = Modifier) {
    Card(
        shape =  RoundedCornerShape(25.dp),
        modifier = modifier){
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .background(color = Color.Yellow)
                .fillMaxWidth()
        ){
            Image(
                painter = painterResource(id = R.drawable.image_1),
                contentDescription = null,
                modifier = Modifier
                    .clip(RoundedCornerShape(50.dp))
            )
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(15.dp)) {
                Text(text = "some text")
                Spacer(modifier = Modifier.height(16.dp))
                Text("some little text")
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    IPZ_KR_3_Syvylo_RomanTheme {
        ItemColumn()
    }
}