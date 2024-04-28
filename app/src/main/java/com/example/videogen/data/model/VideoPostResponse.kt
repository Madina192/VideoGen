package com.example.videogen.data.model

import com.google.gson.annotations.SerializedName

data class VideoPostResponse (

    @SerializedName("name"                ) var name                : String?           = null,
    @SerializedName("slides"              ) var slides              : ArrayList<Slides> = arrayListOf(),
    @SerializedName("tags"                ) var tags                : ArrayList<String> = arrayListOf(),
    @SerializedName("deleted"             ) var deleted             : Boolean?          = null,
    @SerializedName("status"              ) var status              : String?           = null,
    @SerializedName("verified"            ) var verified            : Boolean?          = null,
    @SerializedName("public"              ) var public              : Boolean?          = null,
    @SerializedName("parentFolderDeleted" ) var parentFolderDeleted : Boolean?          = null,
    @SerializedName("version"             ) var version             : Int?              = null,
    @SerializedName("userId"              ) var userId              : String?           = null,
    @SerializedName("accountId"           ) var accountId           : String?           = null,
    @SerializedName("_id"                 ) var Id                  : String?           = null,
    @SerializedName("comments"            ) var comments            : ArrayList<String> = arrayListOf(),
    @SerializedName("createdAt"           ) var createdAt           : String?           = null,
    @SerializedName("updatedAt"           ) var updatedAt           : String?           = null,
    @SerializedName("__v"                 ) var _v                  : Int?              = null

)