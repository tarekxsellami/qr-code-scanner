package com.socialcode.qrcodescanner.core.data

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by SocialCode
 *
 * Collaborate on coding projects with SocialCode (https://socialcode.club)
 * Copyright (c) 2024 SocialCode,
 * all rights reserved
 */

@Entity(tableName = "qr_code")
data class QRCode(@PrimaryKey(autoGenerate = true) val id: Int)
