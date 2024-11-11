package com.socialcode.qrcodescanner.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

/**
 * Created by SocialCode
 *
 * Collaborate on coding projects with SocialCode (https://socialcode.club)
 * Copyright (c) 2024 SocialCode,
 * all rights reserved
 */

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80,
    background = Color.Black
)

@Composable
fun QRCodeScannerTheme(
    content: @Composable () -> Unit
) {

    MaterialTheme(
        colorScheme = DarkColorScheme,
        typography = Typography,
        content = content
    )
}