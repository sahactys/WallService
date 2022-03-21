object WallService {
    private var posts = emptyArray<Post>()

    fun add(
        ownerId: Int,
        fromId: Int,
        createdBy: Int,
        date: Int,
        text: String,
        replyOwnerId: Int,
        replyPostId: Int,
        friendsOnly: Boolean = false,
        comments: Post.Comments,
        copyright: String,
        likes: Post.Likes,
        reposts: Post.Reposts,
        views: Post.Views,
        postType: PostType,
        signerId: Int,
        canPin: Boolean = false,
        canDelete: Boolean = false,
        canEdit: Boolean = false,
        isPinned: Boolean = false,
        markedAsAds: Boolean = false,
        isFavorite: Boolean = false,
        postponedId: Int
    ): Post {

        posts += Post(
            id = generationId(),
            ownerId,
            fromId,
            createdBy,
            date,
            text,
            replyOwnerId,
            replyPostId,
            friendsOnly = false,
            comments,
            copyright,
            likes,
            reposts,
            views,
            postType,
            signerId,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            postponedId
        )
        return posts.last()
    }

//    fun update(post: Post): Boolean {
//        TODO()
//    }

    private var memoryIdPost: Int = 0

    private fun generationId(): Int {
        memoryIdPost += 1
        return memoryIdPost - 1
    }
}