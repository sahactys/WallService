@file:Suppress("NAME_SHADOWING")

class PostNotFoundException(message: String): RuntimeException(message)
class ReasonNotFoundException(message: String): RuntimeException(message)
class CommentNotFoundException(message: String): RuntimeException(message)

object WallService {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()
    private var reports = emptyArray<ReportComment>()

    fun add(post: Post): Post {

        val post = post.copy(id = generationIdPost())
        posts += post
        return posts.last()
    }

    fun createComment(comment: Comment) : Boolean {
        val comment = comment.copy(guid = generationIdComment())
        val postId = comment.component2()
        for ((index, post) in posts.withIndex()) {
            if (post.id == postId) {
                comments +=comment

                return true
            }
        }
        if (comments.isEmpty()) throw  PostNotFoundException ("no post with id $postId")
        return false
    }

    fun reportingComment(report:ReportComment):Boolean{
        val commentIdReporting = report.component2()
        for((infix , comment) in comments.withIndex()){
            if (comment.guid == commentIdReporting) {
                if (report.reason in 0..8) {
                    reports += report
                    return true
                }
                else throw ReasonNotFoundException ("no reason with id ${report.reason}")
            }
        }
        if (reports.isEmpty()) throw CommentNotFoundException("no comment with id $commentIdReporting")
        return false
    }

    fun update(post: Post): Boolean {
        val postId = post.component1()
        val post1 = post
        for ((index, post) in posts.withIndex()) {
            if (post.id == postId) {
                posts[index] = post.copy(
                    fromId = post1.fromId,
                    createdBy = post1.createdBy,
                    text = post1.text,
                    replyOwnerId = post1.replyOwnerId,
                    replyPostId = post1.replyPostId,
                    friendsOnly = post1.friendsOnly,
                    comments = post1.comments,
                    copyright = post1.copyright,
                    likes = post1.likes,
                    reposts = post1.reposts,
                    views = post1.views,
                    postType = post1.postType,
                    signerId = post1.signerId,
                    canPin = post1.canPin,
                    canDelete = post1.canDelete,
                    canEdit = post1.canEdit,
                    isPinned = post1.isPinned,
                    markedAsAds = post1.markedAsAds,
                    isFavorite = post1.isFavorite,
                    postponedId = post1.postponedId,
                    postSource = post1.postSource,
                    geo = post1.geo,
                    copyHistory = post1.copyHistory,
                    attachments = post1.attachments
                )
                return true
            }
        }
        return false

    }

    private var memoryIdPost: Int = 1
    private var memoryIdComment: Int = 1

    private fun generationIdPost(): Int {
        memoryIdPost += 1
        return memoryIdPost - 1
    }

    private fun generationIdComment(): Int {
        memoryIdComment += 1
        return memoryIdComment - 1
    }




    fun clearArr() {
        reports = emptyArray()
        comments = emptyArray()
        memoryIdComment = 1
        posts = emptyArray()
        memoryIdPost = 1
    }
}