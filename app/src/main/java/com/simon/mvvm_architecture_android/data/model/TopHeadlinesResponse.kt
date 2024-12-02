package com.simon.mvvm_architecture_android.data.model

import com.google.gson.annotations.SerializedName


data class TopHeadlinesResponse(
    @SerializedName("status")
    val status: String = "",
    @SerializedName("totalResults")
    val totalResults: Int = 0,
    @SerializedName("articles")
    val articles: List<Article> = ArrayList(),
)
