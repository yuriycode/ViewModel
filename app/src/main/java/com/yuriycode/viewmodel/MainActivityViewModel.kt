package com.yuriycode.viewmodel

import android.os.CountDownTimer
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivityViewModel: ViewModel() {

    val liveData = MutableLiveData<String>()

    init {
        startTimer()
    }

    fun startTimer(){
        object :CountDownTimer(20000, 1000){
            override fun onFinish() {

            }

            override fun onTick(p0: Long) {
                liveData.value = (p0/1000).toString()
            }
        }.start()
    }
}