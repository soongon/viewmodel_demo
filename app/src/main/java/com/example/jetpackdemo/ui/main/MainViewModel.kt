package com.example.jetpackdemo.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val convertRate: Int = 1180

    // 사용자가 입력한 달러값, 변환된 결과 값(원화)
    private var resultWon: MutableLiveData<Int> = MutableLiveData()

    fun getResult(): MutableLiveData<Int> = resultWon

    fun setAmount(dollar: String) {
        resultWon.value = dollar.toInt() * convertRate
    }
}
