package com.jslee.koin_testing

import android.util.Log

class Controller(val repository: Repository) {

    fun printSampleData() {
        Log.d("Print sample data", repository.firstData)
    }

}