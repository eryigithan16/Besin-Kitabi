package com.yigithan.besinkitabi.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.yigithan.besinkitabi.model.Besin

class BesinListesiViewModel : ViewModel() {
    val besinler = MutableLiveData<List<Besin>>()
    val besinHataMesaji = MutableLiveData<Boolean>()
    val besinYukleniyor = MutableLiveData<Boolean>()

    fun refreshData(){

        val muz = Besin("Muz", "150", "20", "20","3","www.test.com")
        val cilek = Besin("Çilek", "130", "10", "10","1","www.test.com")
        val elma = Besin("Elma", "110", "30", "30","2","www.test.com")

        val besinListesi = arrayListOf<Besin>(muz,cilek,elma)

        besinler.value = besinListesi
        besinHataMesaji.value = false
        besinYukleniyor.value = false

    }

}