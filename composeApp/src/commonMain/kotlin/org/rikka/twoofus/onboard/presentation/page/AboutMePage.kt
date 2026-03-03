package org.rikka.twoofus.onboard.presentation.page

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.rikka.twoofus.core.theme.Black
import org.rikka.twoofus.core.theme.Neutral0
import org.rikka.twoofus.core.theme.Pacifico
import org.rikka.twoofus.core.theme.TextStyles
import org.rikka.twoofus.core.theme.TwogetherColors
import org.rikka.twoofus.onboard.component.InfoInputForm

/**
 * Created by rikka on 3/3/26.
 **/

@Composable
fun AboutMePage() {
  Column(
    verticalArrangement = Arrangement.spacedBy(12.dp)
  ) {
    Text(
      text = "About me",
      modifier = Modifier.fillMaxWidth(),
      textAlign = TextAlign.Center,
      style = TextStyle(
        fontFamily = Pacifico,
        fontSize = 24.sp,
        color = Black
      )
    )
    
    InfoInputForm()
    
    Box(
      modifier = Modifier
        .height(56.dp)
        .fillMaxWidth()
        .background(
          brush = TwogetherColors.colors.gradientPrimary,
          shape = RoundedCornerShape(16.dp)
        ),
      contentAlignment = Alignment.Center
    ) {
      Text(
        text = "Continue",
        style = TextStyles.Title20Bold.copy(color = Neutral0),
      )
    }
  }
}