package com.atesh19.viewbindingactivities.data.network.response

import com.atesh19.viewbindingactivities.data.model.ItemsModel
import com.atesh19.viewbindingactivities.data.model.PageInfoModel
import java.util.*

data class GetPlayListResponse(
    val kind : String,
    val etag :String,
    val pageInfo : PageInfoModel,
    val items : List<ItemsModel>

)
