package com.example.androidstarterproject.util

import java.text.DateFormat
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*


object DateUtil {
    fun Date.dateToString(outputDateFormat: String = "dd/MM/yyyy"): String {
        val simpleDateFormat = SimpleDateFormat(outputDateFormat, Locale.ENGLISH)
        return simpleDateFormat.format(this)
    }

    fun Date.getMonth(outputDateFormat: String = "dd MMM yyyy"): String {
        val simpleDateFormat = SimpleDateFormat(outputDateFormat, Locale.ENGLISH)
        return simpleDateFormat.format(this)
    }

    fun String.date(
        inputDateFormat: String = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'",
        outputDateFormat: String = "dd.MM.yyy"
    ): String {
        val inputFormatter = SimpleDateFormat(inputDateFormat, Locale.ENGLISH)
        val outputFormatter = SimpleDateFormat(outputDateFormat, Locale.ENGLISH)
        var date: Date? = null
        try {
            date = inputFormatter.parse(this)
        } catch (e: ParseException) {
            e.printStackTrace()
        }
        return outputFormatter.format(date)
    }


    val todayDate: String
        get() {
            val dateFormat: DateFormat = SimpleDateFormat("dd-MM-yyyy")
            val date = Date()
            return dateFormat.format(date)
        }

    fun Date.parseTime(): String {
        val daysArray =
            arrayOf("saturday", "sunday", "monday", "tuesday", "wednesday", "thursday", "friday")
        var day = ""
        val startCal = Calendar.getInstance()
        startCal.time = this
        val now = Calendar.getInstance()
        val sdf2 = SimpleDateFormat("hh:mm aa")
        val time = sdf2.format(this)
        if (startCal[Calendar.DATE] == now[Calendar.DATE]) return "Today $time"
        val dow = startCal[Calendar.DAY_OF_WEEK] - 1
        day = daysArray[dow]
        return day + time
    }
}
