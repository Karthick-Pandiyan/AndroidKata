package com.kp.findleapyear

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        System.out.println("Print true if the given year is a Leap Year:")
        System.out.println("Is 2000 is a Leap Year:  ${LeapYear(2000).isLeapYear()}")
        System.out.println("Is 2008 is a Leap Year:  ${LeapYear(2008).isLeapYear()}")
        System.out.println("Is 2012 is a Leap Year:  ${LeapYear(2012).isLeapYear()}")
        System.out.println("Is 2016 is a Leap Year:  ${LeapYear(2016).isLeapYear()}")

        System.out.println("Is 2100 is a Leap Year:  ${LeapYear(2100).isLeapYear()}")
        System.out.println("Is 1700 is a Leap Year:  ${LeapYear(1700).isLeapYear()}")
        System.out.println("Is 1800 is a Leap Year:  ${LeapYear(1800).isLeapYear()}")
        System.out.println("Is 2017 is a Leap Year:  ${LeapYear(2017).isLeapYear()}")
        System.out.println("Is 2018 is a Leap Year:  ${LeapYear(2018).isLeapYear()}")
        System.out.println("Is 2019 is a Leap Year:  ${LeapYear(2019).isLeapYear()}")

    }
}
