 package com.atesh19.viewbindingactivities.Mock

import com.atesh19.viewbindingactivities.data.model.RVModel
import java.util.*

 object Mock {

    fun getMockData(): ArrayList<RVModel> {
        val mockList = arrayListOf<RVModel>()
        for (i in 1..20){
            mockList.add(RVModel(
                "https://i.pinimg.com/originals/8c/07/3a/8c073afa7d9eca3c695aa5a2203bf49a.png",
                "Sylvester pic =  $i"
            ))

        }
        return mockList;
    }


}