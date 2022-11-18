package lisadupeyroux.isis.myapplication

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import java.util.jar.Attributes

@Composable
fun Profil (windowClass : WindowSizeClass, navController: NavController){
    when (windowClass.widthSizeClass) {
        WindowWidthSizeClass.Compact -> {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                ImagePrint()
                Nom()
                Description()
                Contact()
                Bouton(navController)
            }
        }
    else ->{
        Row(
            modifier = Modifier.fillMaxSize(),
        ) {
            ImagePrint()
            Nom()
            Description()
            Contact()
            Bouton(navController)
        }
    }
    }
}

@Composable
fun ImagePrint() {
    Image(
        painterResource(id = R.drawable.photoprofil),
        contentScale = ContentScale.Crop,
        contentDescription = "photoDeProfil",
        modifier = Modifier
            .size(150.dp)
            .clip(CircleShape)
            .border(BorderStroke(2.dp, Gray), CircleShape)
    )
}

@Composable
    fun Nom() {
        Text(
            text = "Lisa Dupeyroux",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )
    Spacer(Modifier.height(20.dp))
    }

@Composable
    fun Description() {
    Text (
        text = "Etudiante en système d'information pour la santé",
        fontSize = 15.sp
    )
    Text(
        text = "Ecole d'ingénieur ISIS-INU Champollion",
        fontSize = 15.sp,
        fontStyle = FontStyle.Italic
    )
    }

    @Composable
    fun Contact() {
        Row() {
            Image(
                painterResource(R.drawable.iconmail),
                contentDescription = "icon_email",
                modifier = Modifier.size(20.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = "lisa.dupeyroux@etud.univ-jfc.fr",
                fontSize = 15.sp
            )
        }
        Row() {
            Image(
                painterResource(R.drawable.iconin),
                contentDescription = "icon_linkedin",
                modifier = Modifier.size(20.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = "www.linkedin.com/in/lisa-dupeyroux",
                fontSize = 15.sp
            )
        }
    }

    @Composable
    fun Bouton(navController: NavController) {
        Button(onClick = {
            navController.navigate("film")
        }) {
            Text("Démarrer")
            }
        }



