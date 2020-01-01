package com.kp.findleapyear

import org.junit.Assert
import org.junit.Test

class LeapYearTest {


    @Test
    fun `Should find the given year is not leap year, Year = 2019`(){
        Assert.assertFalse(isLeapYear(2019))
    }

    @Test
    fun `Should find the given year is leap year, Year = 2008`(){
        Assert.assertTrue(isLeapYear(2008))
    }

    @Test
    fun `Should find the given year is leap year, Year = 2016`(){
        Assert.assertTrue(isLeapYear(2016))
    }

    @Test
    fun `Should find the given year is leap year, Year = 1900`(){
        Assert.assertFalse(isLeapYear(1900))
    }

    private fun isLeapYear(year: Int): Boolean {
        return year % 4 == 0 && year % 100 != 0
    }
}