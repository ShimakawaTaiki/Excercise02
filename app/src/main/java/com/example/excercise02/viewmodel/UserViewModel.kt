package com.example.excercise02.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserViewModel: ViewModel() {
    var name = MutableLiveData("島川大輝")
    var age = MutableLiveData(23)
    var address = MutableLiveData("北海道札幌市")
}