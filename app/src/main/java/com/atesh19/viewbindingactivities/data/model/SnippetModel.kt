package com.atesh19.viewbindingactivities.data.model

data class SnippetModel(
    val publishedAt :String,
    val channelId: String,
    val title : String,
    val description :String ,
    val thumbnails : ThumbnailsModel,
    val channelTitle : String,
    val localized : LocalizedModel

)
