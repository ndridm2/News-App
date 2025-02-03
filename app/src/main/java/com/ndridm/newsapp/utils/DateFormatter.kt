package com.ndridm.newsapp.utils

import java.text.DateFormat
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.Locale
import java.util.TimeZone

object DateFormatter {
    fun formatDate(currentDate: String): String? {
        val currentFormat = "yyyy-MM-dd'T'hh:mm:ss'Z'"
        val targetFormat = "dd MM yyyy | HH:mm"
        val timezone = "GMT"
        val currentDF : DateFormat = SimpleDateFormat(currentFormat, Locale.getDefault())
        currentDF.timeZone = TimeZone.getTimeZone(timezone)
        val targetDf: DateFormat = SimpleDateFormat(targetFormat, Locale.getDefault())
        var targetDate: String? = null
        try {
            val date = currentDF.parse(currentDate)
            if (date != null) {
                targetDate = targetDf.format(date)
            }
        } catch (ex: ParseException) {
            ex.printStackTrace()
        }
        return targetDate
    }
}