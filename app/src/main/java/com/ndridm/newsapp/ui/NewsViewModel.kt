package com.ndridm.newsapp.ui

import androidx.lifecycle.ViewModel
import com.ndridm.newsapp.data.NewsRepository
import com.ndridm.newsapp.data.local.entity.NewsEntity

class NewsViewModel(private val newsRepository: NewsRepository) : ViewModel() {
    fun getHeadlineNews() = newsRepository.getHeadlineNews()
    fun getBookmarkedNews() = newsRepository.getBookmarkedNews()
    fun saveNews(news: NewsEntity) {
        newsRepository.setBookmarkedNews(news, true)
    }
    fun deleteNews(news: NewsEntity) {
        newsRepository.setBookmarkedNews(news, false)
    }
}