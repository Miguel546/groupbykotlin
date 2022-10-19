package com.proyecto.groupby

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Paleta(
    @field:Json(name = "Nro")
    var Nro: String?,
    @field:Json(name = "LoadNumber")
    val LoadNumber: String?,
    @field:Json(name = "PalNum")
    val PalNum: String?,
    @field:Json(name = "Plant")
    val Plant: String?,
    @field:Json(name = "LogisticLot")
    val LogisticLot: String?,
    @field:Json(name = "SKU")
    val SKU: String?,
    @field:Json(name = "WorkId")
    val WorkId: String?,
    @field:Json(name = "CentRecSAP")
    val CentRecSAP: String?,
    @field:Json(name = "UOM")
    val UOM: String?,
    @field:Json(name = "Quantity")
    val Quantity: Double?,
    @field:Json(name = "LotGeneric")
    val LotGeneric: String?,
    @field:Json(name = "FlagPaleta")
    val FlagPaleta: String?,
    @field:Json(name = "Estado")
    var Estado: String?,
    @field:Json(name = "CT")
    val CT: String?,
    @field:Json(name = "Num_Transporte")
    val Num_Transporte: String?,
    @field:Json(name = "Flag_Proc")
    val Flag_Proc: String?
)