package com.example.exam2512.models

import java.io.Serializable

data class ModelCategory(
    var category: Categories,
    var name: Int,
    var news : List<ModelNews>
) : Serializable