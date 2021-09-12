package com.atesh19.viewbindingactivities.data.model

data class MediumModel(
    override val url: String,
    override val width: Int,
    override val height: Int
) : ThumbnailsBaseModel()
