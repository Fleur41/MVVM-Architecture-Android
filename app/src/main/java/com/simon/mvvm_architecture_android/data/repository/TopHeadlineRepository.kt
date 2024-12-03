package com.simon.mvvm_architecture_android.data.repository

import com.simon.mvvm_architecture_android.data.api.NetworkService
import com.simon.mvvm_architecture_android.data.model.Article
import com.simon.mvvm_architecture_android.utils.AppConstant.country
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class TopHeadlineRepository @Inject constructor(private val networkService: NetworkService){
    fun getTopHeadlines(country: String): Flow<List<Article>>{
        return flow {
            val response = networkService.getTopHeadlines(country)
            emit(response)
        }.map {
            it.articles
        }

    }
}