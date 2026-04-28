package com.ifpr.androidapptemplate.baseclasses

data class Item(
    var nome: String? = null,
    var endereco: String? = null,
    var descricao: String? = null,
    val base64Image: String? = null,
    val imageUrl: String? = null
)
