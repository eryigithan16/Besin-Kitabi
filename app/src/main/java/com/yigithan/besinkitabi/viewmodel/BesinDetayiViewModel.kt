package com.yigithan.besinkitabi.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.yigithan.besinkitabi.model.Besin

class BesinDetayiViewModel : ViewModel() {

    val besinLiveData = MutableLiveData<Besin>()

    fun roomVerisiniAl(){

        val muz = Besin("Muz", "150", "20", "20","3","www.test.com")
        besinLiveData.value = muz

    }

}