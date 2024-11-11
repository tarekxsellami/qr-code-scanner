package com.socialcode.qrcodescanner.core.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.socialcode.qrcodescanner.core.data.QRCode

/**
 * Created by SocialCode
 *
 * Collaborate on coding projects with SocialCode (https://socialcode.club)
 * Copyright (c) 2024 SocialCode,
 * all rights reserved
 */

@Database(entities = [QRCode::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
}