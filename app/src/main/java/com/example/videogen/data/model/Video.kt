package com.example.videogen.data.model

import com.google.gson.annotations.SerializedName

data class Video(

    @SerializedName("name") var name: String? = null,
    @SerializedName("slides") var slides: ArrayList<Slides> = arrayListOf(),
    @SerializedName("tags") var tags: ArrayList<String> = arrayListOf()

)

data class Animation(

    @SerializedName("type") var type: String? = null,
    @SerializedName("exitType") var exitType: String? = null

)

data class Objects(

    @SerializedName("type") var type: String? = null,
    @SerializedName("left") var left: Double? = null,
    @SerializedName("top") var top: Int? = null,
    @SerializedName("fill") var fill: String? = null,
    @SerializedName("scaleX") var scaleX: Double? = null,
    @SerializedName("scaleY") var scaleY: Double? = null,
    @SerializedName("width") var width: Int? = null,
    @SerializedName("height") var height: Int? = null,
    @SerializedName("src") var src: String? = null,
    @SerializedName("avatarType") var avatarType: String? = null,
    @SerializedName("animation") var animation: Animation? = Animation()

)

data class Canvas(

    @SerializedName("objects") var objects: ArrayList<Objects> = arrayListOf(),
    @SerializedName("background") var background: String? = null,
    @SerializedName("version") var version: String? = null

)

data class Avatar(

    @SerializedName("code") var code: String? = null,
    @SerializedName("gender") var gender: String? = null,
    @SerializedName("canvas") var canvas: String? = null

)

data class Slides(

    @SerializedName("id") var id: Int? = null,
    @SerializedName("canvas") var canvas: Canvas? = Canvas(),
    @SerializedName("avatar") var avatar: Avatar? = Avatar(),
    @SerializedName("animation") var animation: String? = null,
    @SerializedName("language") var language: String? = null,
    @SerializedName("speech") var speech: String? = null,
    @SerializedName("voice") var voice: String? = null,
    @SerializedName("voiceType") var voiceType: String? = null,
    @SerializedName("voiceProvider") var voiceProvider: String? = null

)