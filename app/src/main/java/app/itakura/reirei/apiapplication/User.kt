package app.itakura.reirei.apiapplication

import com.google.gson.annotations.SerializedName

data class User (val name:String,
                 @SerializedName("login")val userId:String,
                 @SerializedName ("avatar_url")val avatarUrl:String,
                 val following:Int,
                 val followers:Int
)