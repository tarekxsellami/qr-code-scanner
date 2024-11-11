package com.socialcode.qrcodescanner.core.repositories

import com.socialcode.qrcodescanner.core.data.QRCode

/**
 * Created by SocialCode
 *
 * Collaborate on coding projects with SocialCode (https://socialcode.club)
 * Copyright (c) 2024 SocialCode,
 * all rights reserved
 */

class QRCodeRepository : IQRCodeRepository{

    override fun getAllQRCodes(): List<QRCode> {
        TODO("Not yet implemented")
    }

    override fun addNewQRCode(qrCode: QRCode) {
        TODO("Not yet implemented")
    }
}

interface IQRCodeRepository {
    fun getAllQRCodes(): List<QRCode>
    fun addNewQRCode(qrCode: QRCode)
}