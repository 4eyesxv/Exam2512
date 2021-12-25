package com.example.exam2512.models

import java.io.Serializable


data class ModelNews(
    var category: Categories,
    var description: String,
    var name: String,
    var imageUrl: String
) : Serializable
