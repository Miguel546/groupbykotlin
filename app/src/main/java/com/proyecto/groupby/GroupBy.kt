package com.proyecto.groupby

import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory

fun main(args: Array<String>){
    val string = "[{\"CT\":\"\",\"CentRecSAP\":\"8043\",\"Estado\":\"Pendiente\",\"FlagPaleta\":\"1\",\"Flag_Proc\":\"1\",\"LoadNumber\":\"430000222982\",\"LogisticLot\":\"GEN0000001\",\"LotGeneric\":\"T20402140\",\"Nro\":\"1\",\"Num_Transporte\":\"0002956600\",\"PalNum\":\"1\",\"Plant\":\"5040\",\"Quantity\":17.0,\"SKU\":\"250029\",\"UOM\":\"CS\",\"WorkId\":\"13515\"},{\"CT\":\"\",\"CentRecSAP\":\"8043\",\"Estado\":\"Pendiente\",\"FlagPaleta\":\"1\",\"Flag_Proc\":\"1\",\"LoadNumber\":\"430000222983\",\"LogisticLot\":\"GEN0000001\",\"LotGeneric\":\"T20102140\",\"Nro\":\"2\",\"Num_Transporte\":\"0002956600\",\"PalNum\":\"2\",\"Plant\":\"5040\",\"Quantity\":1.0,\"SKU\":\"250416\",\"UOM\":\"CS\",\"WorkId\":\"13515\"},{\"CT\":\"\",\"CentRecSAP\":\"8043\",\"Estado\":\"Pendiente\",\"FlagPaleta\":\"1\",\"Flag_Proc\":\"1\",\"LoadNumber\":\"430000222984\",\"LogisticLot\":\"GEN0000001\",\"LotGeneric\":\"T22101140\",\"Nro\":\"3\",\"Num_Transporte\":\"0002956600\",\"PalNum\":\"4\",\"Plant\":\"5040\",\"Quantity\":1.0,\"SKU\":\"250418\",\"UOM\":\"CS\",\"WorkId\":\"13515\"},{\"CT\":\"\",\"CentRecSAP\":\"8043\",\"Estado\":\"Pendiente\",\"FlagPaleta\":\"1\",\"Flag_Proc\":\"1\",\"LoadNumber\":\"430000222985\",\"LogisticLot\":\"GEN0000001\",\"LotGeneric\":\"T22801140\",\"Nro\":\"4\",\"Num_Transporte\":\"0002956600\",\"PalNum\":\"1\",\"Plant\":\"5040\",\"Quantity\":13.0,\"SKU\":\"250430\",\"UOM\":\"CS\",\"WorkId\":\"13515\"},{\"CT\":\"\",\"CentRecSAP\":\"8043\",\"Estado\":\"Pendiente\",\"FlagPaleta\":\"1\",\"Flag_Proc\":\"1\",\"LoadNumber\":\"430000222981\",\"LogisticLot\":\"GEN0000001\",\"LotGeneric\":\"T21701140\",\"Nro\":\"5\",\"Num_Transporte\":\"0002956600\",\"PalNum\":\"1\",\"Plant\":\"5040\",\"Quantity\":1.0,\"SKU\":\"250431\",\"UOM\":\"CS\",\"WorkId\":\"13515\"},{\"CT\":\"\",\"CentRecSAP\":\"8043\",\"Estado\":\"Pendiente\",\"FlagPaleta\":\"1\",\"Flag_Proc\":\"1\",\"LoadNumber\":\"430000222981\",\"LogisticLot\":\"GEN0000001\",\"LotGeneric\":\"T32001140\",\"Nro\":\"6\",\"Num_Transporte\":\"0002956600\",\"PalNum\":\"1\",\"Plant\":\"5040\",\"Quantity\":2.0,\"SKU\":\"250433\",\"UOM\":\"CS\",\"WorkId\":\"13515\"},{\"CT\":\"\",\"CentRecSAP\":\"8043\",\"Estado\":\"Pendiente\",\"FlagPaleta\":\"1\",\"Flag_Proc\":\"1\",\"LoadNumber\":\"430000222981\",\"LogisticLot\":\"GEN0000001\",\"LotGeneric\":\"T22901140\",\"Nro\":\"7\",\"Num_Transporte\":\"0002956600\",\"PalNum\":\"1\",\"Plant\":\"5040\",\"Quantity\":9.0,\"SKU\":\"250435\",\"UOM\":\"CS\",\"WorkId\":\"13515\"},{\"CT\":\"\",\"CentRecSAP\":\"8043\",\"Estado\":\"Pendiente\",\"FlagPaleta\":\"1\",\"Flag_Proc\":\"1\",\"LoadNumber\":\"430000222981\",\"LogisticLot\":\"GEN0000001\",\"LotGeneric\":\"T22101140\",\"Nro\":\"8\",\"Num_Transporte\":\"0002956600\",\"PalNum\":\"1\",\"Plant\":\"5040\",\"Quantity\":1.0,\"SKU\":\"250795\",\"UOM\":\"CS\",\"WorkId\":\"13515\"},{\"CT\":\"\",\"CentRecSAP\":\"8043\",\"Estado\":\"Pendiente\",\"FlagPaleta\":\"1\",\"Flag_Proc\":\"1\",\"LoadNumber\":\"430000222981\",\"LogisticLot\":\"GEN0000001\",\"LotGeneric\":\"T32712130\",\"Nro\":\"9\",\"Num_Transporte\":\"0002956600\",\"PalNum\":\"1\",\"Plant\":\"5040\",\"Quantity\":2.0,\"SKU\":\"252425\",\"UOM\":\"CS\",\"WorkId\":\"13515\"},{\"CT\":\"\",\"CentRecSAP\":\"8043\",\"Estado\":\"Pendiente\",\"FlagPaleta\":\"1\",\"Flag_Proc\":\"1\",\"LoadNumber\":\"430000222981\",\"LogisticLot\":\"GEN0000001\",\"LotGeneric\":\"\",\"Nro\":\"10\",\"Num_Transporte\":\"0002956600\",\"PalNum\":\"1\",\"Plant\":\"5040\",\"Quantity\":17.0,\"SKU\":\"400481\",\"UOM\":\"CS\",\"WorkId\":\"13515\"}]"
    val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory())
        .build()
    val type = Types.newParameterizedType(MutableList::class.java, Paleta::class.java)
    val adapter = moshi.adapter<MutableList<Paleta>>(type)
    val paletas: MutableList<Paleta>? = adapter.fromJson(string)
    val paletasSize = paletas?.size?:0
    for(i in 0  until paletasSize){
        println(paletas?.get(i))
    }

    val pal =paletas?.groupBy {
        it.LoadNumber; it.PalNum; it.Estado
    }

    println(pal)

}