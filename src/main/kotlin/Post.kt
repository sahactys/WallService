import Attachment.Attachments
import java.security.CodeSource

enum class PostType {
    Post, Copy, Reply, Postpone, Suggest
}

enum class Type{
    Vk, Widget, Api, Rss, Sms
}

enum class Platform{
    Android,Iphone, Wphone
}

data class Post(
    val id: Int ,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean = false,
    val comments: Comments,
    val copyright: String,
    val likes: Likes,
    val reposts: Reposts,
    val views: Views,
    val postType: PostType,
    val signerId: Int,
    val canPin: Boolean = false,
    val canDelete: Boolean = false,
    val canEdit: Boolean = false,
    val isPinned: Boolean = false,
    val markedAsAds: Boolean = false,
    val isFavorite: Boolean = false,
    val postponedId: Int,
    val postSource: PostSource,
    val geo : Geo,
    val copyHistory : Array<Post>?,
    val attachments: Array<Attachments>?
) {
    data class Comments(
        val count: Int,
        val canPost: Boolean = true,
        val groupsCanPost: Boolean = true,
        val canClose: Boolean = true,
        val canOpen: Boolean = true
    )

    data class Likes(
        val count: Int,
        val userLikes: Boolean = false,
        val canLike: Boolean = true,
        val canPublish: Boolean = true
    )

    data class Reposts(
        val count: Int,
        val userReposted: Boolean = false
    )

    data class Views(
        val count: Int
    )

    data class PostSource(
        val type: Type,
        val platform: Platform,
        val url : String
    )

    data class Geo(
        val type: String,
        val coordinates:String,
        val place : Place?
    ) {
        data class Place(
            val id : Int,
            val title : String,
            val latitude : Int,
            val longitude : Int,
            val created : Int,
            val icon : String,
            val checkins : Int,
            val updated :Int,
            val type: Int,
            val country : Int,
            val city : Int,
            val address :String
        )
    }







}


