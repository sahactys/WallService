import Attachment.Attachments

data class Comment(
    val ownerId: Int,
    val postId: Int,
    val fromGroup: Int = 0,
    val message: String,
    val replayToComments :Int,
    val attachments: Array<Attachments>?,
    val stikerId:Int,
    val guid : Int
)