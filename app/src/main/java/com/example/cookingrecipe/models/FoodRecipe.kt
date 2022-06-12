package com.example.cookingrecipe.models

import com.google.gson.annotations.SerializedName

// Generated by Json to kotlin class plugin
// TODO: Rename results -> recipes ??
data class FoodRecipe(
    @SerializedName("number")
    val number: Int,
    @SerializedName("offset")
    val offset: Int,
    @SerializedName("results")
    val results: List<Result>,
    @SerializedName("totalResults")
    val totalResults: Int
)