package com.example.cookingrecipe.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Measures(
    @SerializedName("metric")
    val metric: Metric,
): Parcelable