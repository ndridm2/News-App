package com.ndridm.newsapp.di

import android.content.Context
import com.ndridm.newsapp.data.NewsRepository
import com.ndridm.newsapp.data.local.room.NewsDatabase
import com.ndridm.newsapp.data.remote.retrofit.ApiConfig
import com.ndridm.newsapp.utils.AppExecutors

object Injection {
    fun provideRepository(context: Context): NewsRepository {
        val apiService = ApiConfig.getApiService()
        val database = NewsDatabase.getInstance(context)
        val dao = database.newsDao()
        val appExecutors = AppExecutors()
        return NewsRepository.getInstance(apiService, dao, appExecutors)
    }
}