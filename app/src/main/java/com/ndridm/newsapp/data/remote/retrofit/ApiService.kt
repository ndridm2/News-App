package com.ndridm.newsapp.data.remote.retrofit

import com.ndridm.newsapp.data.remote.response.NewsResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("top-headlines?country=us&category=science")
    fun getNews(@Query("apiKey") apiKey: String): Call<NewsResponse>
}