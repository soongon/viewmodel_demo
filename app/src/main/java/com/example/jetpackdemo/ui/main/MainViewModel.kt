package com.example.jetpackdemo.ui.main

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val convertRate: Int = 1180

    // 사용자가 입력한 달러값, 변환된 결과 값(원화)
    private var dollarFromUser: String = ""
    private var resultWon: Int = 0

    fun getResult(): Int = resultWon

    fun setAmount(dollar: String) {
        dollarFromUser = dollar

        resultWon = dollarFromUser.toInt() * convertRate
    }
}