import Attachment.AudioAttachments
import Attachment.LinkAttachment
import Attachment.VideoAttachments
import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {


    @Test
    fun add() {
        WallService.clearArr()
        val result = WallService.add(
            Post(
                id = 9,
                1,
                2,
                3,
                20221205,
                "asd",
                1,
                2,
                false,
                Post.Comments(2),
                "asd",
                Post.Likes(2),
                Post.Reposts(2),
                Post.Views(4),
                PostType.Post,
                5,
                postponedId = 1,
                postSource = Post.PostSource(Type.Vk, Platform.Android, "www"),
                geo = Post.Geo("qwe", "eqwe", null),
                copyHistory = null,
                attachments = arrayOf(
                    AudioAttachments(
                        AudioAttachments.Audio(
                            1, 1, "Scorpions", "Wind of change", 1, "www", 30032022
                        )
                    )
                )
            )
        )
        assertNotEquals(0, result.id)
    }

    @Test
    fun updateTrue() {
        WallService.clearArr()
        WallService.add(
            Post(
                id = 9,
                1,
                2,
                3,
                20221205,
                "zxc",
                1,
                2,
                false,
                Post.Comments(2),
                "asd",
                Post.Likes(2),
                Post.Reposts(2),
                Post.Views(4),
                PostType.Post,
                5,
                postponedId = 1,
                postSource = Post.PostSource(Type.Vk, Platform.Android, "www"),
                geo = Post.Geo("qwe", "eqwe", null),
                copyHistory = null,
                attachments = arrayOf(
                    VideoAttachments(
                        VideoAttachments.Video(
                            1, 2, "Tik Tok2020", 1, "www", 2032020, 20, 5, "Www"
                        )
                    ), LinkAttachment(LinkAttachment.Link("www", "link", null, "описание"))
                )
            )
        )
        WallService.add(
            Post(
                id = 9,
                1,
                2,
                3,
                20221205,
                "zxc",
                1,
                2,
                false,
                Post.Comments(2),
                "asd",
                Post.Likes(2),
                Post.Reposts(2),
                Post.Views(4),
                PostType.Post,
                5,
                postponedId = 1,
                postSource = Post.PostSource(Type.Vk, Platform.Android, "www"),
                geo = Post.Geo("qwe", "eqwe", null),
                copyHistory = null,
                attachments = arrayOf(
                    AudioAttachments(
                        AudioAttachments.Audio(
                            1, 1, "Scorpions", "Wind of change", 1, "www", 30032022
                        )
                    )
                )
            )
        )
        val result = WallService.update(
            Post(
                id = 1,
                1,
                2,
                3,
                20221205,
                "zxc",
                1,
                2,
                false,
                Post.Comments(2),
                "asd",
                Post.Likes(2),
                Post.Reposts(2),
                Post.Views(4),
                PostType.Post,
                5,
                postponedId = 1,
                postSource = Post.PostSource(Type.Vk, Platform.Android, "www"),
                geo = Post.Geo("qwe", "eqwe", null),
                copyHistory = null,
                attachments = arrayOf(
                    VideoAttachments(
                        VideoAttachments.Video(
                            1, 2, "Tik Tok2020", 1, "www", 2032020, 20, 5, "Www"
                        )
                    ), LinkAttachment(LinkAttachment.Link("www", "link", null, "описание"))
                )
            )
        )
        assertTrue(result)
    }

    @Test
    fun updateFalse() {
        WallService.clearArr()
        WallService.add(
            Post(
                id = 9,
                1,
                2,
                3,
                20221205,
                "zxc",
                1,
                2,
                false,
                Post.Comments(2),
                "asd",
                Post.Likes(2),
                Post.Reposts(2),
                Post.Views(4),
                PostType.Post,
                5,
                postponedId = 1,
                postSource = Post.PostSource(Type.Vk, Platform.Android, "www"),
                geo = Post.Geo("qwe", "eqwe", null),
                copyHistory = null,
                attachments = arrayOf(
                    AudioAttachments(
                        AudioAttachments.Audio(
                            1, 1, "Scorpions", "Wind of change", 1, "www", 30032022
                        )
                    )
                )
            )
        )
        val result = WallService.update(
            Post(
                id = 9,
                1,
                2,
                3,
                20221205,
                "zxc",
                1,
                2,
                false,
                Post.Comments(2),
                "asd",
                Post.Likes(2),
                Post.Reposts(2),
                Post.Views(4),
                PostType.Post,
                5,
                postponedId = 1,
                postSource = Post.PostSource(Type.Vk, Platform.Android, "www"),
                geo = Post.Geo("qwe", "eqwe", null),
                copyHistory = null,
                attachments = arrayOf(
                    VideoAttachments(
                        VideoAttachments.Video(
                            1, 2, "Tik Tok2020", 1, "www", 2032020, 20, 5, "Www"
                        )
                    ), LinkAttachment(LinkAttachment.Link("www", "link", null, "описание"))
                )
            )
        )
        assertFalse(result)
    }

    @Test
    fun createCommentTrue() {
        WallService.clearArr()
        WallService.add(
            Post(
                id = 9,
                1,
                2,
                3,
                20221205,
                "zxc",
                1,
                2,
                false,
                Post.Comments(2),
                "asd",
                Post.Likes(2),
                Post.Reposts(2),
                Post.Views(4),
                PostType.Post,
                5,
                postponedId = 1,
                postSource = Post.PostSource(Type.Vk, Platform.Android, "www"),
                geo = Post.Geo("qwe", "eqwe", null),
                copyHistory = null,
                attachments = arrayOf(
                    VideoAttachments(
                        VideoAttachments.Video(
                            1, 2, "Tik Tok2020", 1, "www", 2032020, 20, 5, "Www"
                        )
                    ), LinkAttachment(LinkAttachment.Link("www", "link", null, "описание"))
                )
            )
        )
        WallService.add(
            Post(
                id = 9,
                1,
                2,
                3,
                20221205,
                "zxc",
                1,
                2,
                false,
                Post.Comments(2),
                "asd",
                Post.Likes(2),
                Post.Reposts(2),
                Post.Views(4),
                PostType.Post,
                5,
                postponedId = 1,
                postSource = Post.PostSource(Type.Vk, Platform.Android, "www"),
                geo = Post.Geo("qwe", "eqwe", null),
                copyHistory = null,
                attachments = arrayOf(
                    AudioAttachments(
                        AudioAttachments.Audio(
                            1, 1, "Scorpions", "Wind of change", 1, "www", 30032022
                        )
                    )
                )
            )
        )
        val result = WallService.createComment(
            Comment(
                1,
                2,
                0,
                "qwe",
                1,
                attachments = arrayOf(
                    VideoAttachments(
                        VideoAttachments.Video(
                            1, 2, "Tik Tok2020", 1, "www", 2032020, 20, 5, "Www"
                        )
                    ), LinkAttachment(LinkAttachment.Link("www", "link", null, "описание"))
                ),
                99,
                99
            )
        )

        assertTrue(result)
    }

    @Test (expected = PostNotFoundException::class)
    fun createCommentException() {
        WallService.clearArr()
        WallService.add(
            Post(
                id = 9,
                1,
                2,
                3,
                20221205,
                "zxc",
                1,
                2,
                false,
                Post.Comments(2),
                "asd",
                Post.Likes(2),
                Post.Reposts(2),
                Post.Views(4),
                PostType.Post,
                5,
                postponedId = 1,
                postSource = Post.PostSource(Type.Vk, Platform.Android, "www"),
                geo = Post.Geo("qwe", "eqwe", null),
                copyHistory = null,
                attachments = arrayOf(
                    VideoAttachments(
                        VideoAttachments.Video(
                            1, 2, "Tik Tok2020", 1, "www", 2032020, 20, 5, "Www"
                        )
                    ), LinkAttachment(LinkAttachment.Link("www", "link", null, "описание"))
                )
            )
        )
        WallService.add(
            Post(
                id = 9,
                1,
                2,
                3,
                20221205,
                "zxc",
                1,
                2,
                false,
                Post.Comments(2),
                "asd",
                Post.Likes(2),
                Post.Reposts(2),
                Post.Views(4),
                PostType.Post,
                5,
                postponedId = 1,
                postSource = Post.PostSource(Type.Vk, Platform.Android, "www"),
                geo = Post.Geo("qwe", "eqwe", null),
                copyHistory = null,
                attachments = arrayOf(
                    AudioAttachments(
                        AudioAttachments.Audio(
                            1, 1, "Scorpions", "Wind of change", 1, "www", 30032022
                        )
                    )
                )
            )
        )
        val result = WallService.createComment(
            Comment(
                1,
                99,
                0,
                "qwe",
                1,
                attachments = arrayOf(
                    VideoAttachments(
                        VideoAttachments.Video(
                            1, 2, "Tik Tok2020", 1, "www", 2032020, 20, 5, "Www"
                        )
                    ), LinkAttachment(LinkAttachment.Link("www", "link", null, "описание"))
                ),
                99,
                99
            )
        )
    }

    @Test (expected = CommentNotFoundException::class)
    fun reportingCommentIdException() {
        WallService.clearArr()
        WallService.add(
            Post(
                id = 9,
                1,
                2,
                3,
                20221205,
                "zxc",
                1,
                2,
                false,
                Post.Comments(2),
                "asd",
                Post.Likes(2),
                Post.Reposts(2),
                Post.Views(4),
                PostType.Post,
                5,
                postponedId = 1,
                postSource = Post.PostSource(Type.Vk, Platform.Android, "www"),
                geo = Post.Geo("qwe", "eqwe", null),
                copyHistory = null,
                attachments = arrayOf(
                    VideoAttachments(
                        VideoAttachments.Video(
                            1, 2, "Tik Tok2020", 1, "www", 2032020, 20, 5, "Www"
                        )
                    ), LinkAttachment(LinkAttachment.Link("www", "link", null, "описание"))
                )
            )
        )
        WallService.add(
            Post(
                id = 9,
                1,
                2,
                3,
                20221205,
                "zxc",
                1,
                2,
                false,
                Post.Comments(2),
                "asd",
                Post.Likes(2),
                Post.Reposts(2),
                Post.Views(4),
                PostType.Post,
                5,
                postponedId = 1,
                postSource = Post.PostSource(Type.Vk, Platform.Android, "www"),
                geo = Post.Geo("qwe", "eqwe", null),
                copyHistory = null,
                attachments = arrayOf(
                    AudioAttachments(
                        AudioAttachments.Audio(
                            1, 1, "Scorpions", "Wind of change", 1, "www", 30032022
                        )
                    )
                )
            )
        )
        WallService.createComment(
            Comment(
                1,
                1,
                0,
                "qwe",
                1,
                attachments = arrayOf(
                    VideoAttachments(
                        VideoAttachments.Video(
                            1, 2, "Tik Tok2020", 1, "www", 2032020, 20, 5, "Www"
                        )
                    ), LinkAttachment(LinkAttachment.Link("www", "link", null, "описание"))
                ),
                99,
                99
            )
        )
        val result = WallService.reportingComment(ReportComment(
            1,
            99,
            0
        ))

    }

    @Test (expected = ReasonNotFoundException::class)
    fun reportingReasonIdException() {
        WallService.clearArr()
        WallService.add(
            Post(
                id = 9,
                1,
                2,
                3,
                20221205,
                "zxc",
                1,
                2,
                false,
                Post.Comments(2),
                "asd",
                Post.Likes(2),
                Post.Reposts(2),
                Post.Views(4),
                PostType.Post,
                5,
                postponedId = 1,
                postSource = Post.PostSource(Type.Vk, Platform.Android, "www"),
                geo = Post.Geo("qwe", "eqwe", null),
                copyHistory = null,
                attachments = arrayOf(
                    VideoAttachments(
                        VideoAttachments.Video(
                            1, 2, "Tik Tok2020", 1, "www", 2032020, 20, 5, "Www"
                        )
                    ), LinkAttachment(LinkAttachment.Link("www", "link", null, "описание"))
                )
            )
        )
        WallService.add(
            Post(
                id = 9,
                1,
                2,
                3,
                20221205,
                "zxc",
                1,
                2,
                false,
                Post.Comments(2),
                "asd",
                Post.Likes(2),
                Post.Reposts(2),
                Post.Views(4),
                PostType.Post,
                5,
                postponedId = 1,
                postSource = Post.PostSource(Type.Vk, Platform.Android, "www"),
                geo = Post.Geo("qwe", "eqwe", null),
                copyHistory = null,
                attachments = arrayOf(
                    AudioAttachments(
                        AudioAttachments.Audio(
                            1, 1, "Scorpions", "Wind of change", 1, "www", 30032022
                        )
                    )
                )
            )
        )
        WallService.createComment(
            Comment(
                1,
                1,
                0,
                "qwe",
                1,
                attachments = arrayOf(
                    VideoAttachments(
                        VideoAttachments.Video(
                            1, 2, "Tik Tok2020", 1, "www", 2032020, 20, 5, "Www"
                        )
                    ), LinkAttachment(LinkAttachment.Link("www", "link", null, "описание"))
                ),
                99,
                99
            )
        )
        val result = WallService.reportingComment(ReportComment(
            1,
            1,
            99
        ))

    }

    @Test
    fun reportingCommentTrue() {
        WallService.clearArr()
        WallService.add(
            Post(
                id = 9,
                1,
                2,
                3,
                20221205,
                "zxc",
                1,
                2,
                false,
                Post.Comments(2),
                "asd",
                Post.Likes(2),
                Post.Reposts(2),
                Post.Views(4),
                PostType.Post,
                5,
                postponedId = 1,
                postSource = Post.PostSource(Type.Vk, Platform.Android, "www"),
                geo = Post.Geo("qwe", "eqwe", null),
                copyHistory = null,
                attachments = arrayOf(
                    VideoAttachments(
                        VideoAttachments.Video(
                            1, 2, "Tik Tok2020", 1, "www", 2032020, 20, 5, "Www"
                        )
                    ), LinkAttachment(LinkAttachment.Link("www", "link", null, "описание"))
                )
            )
        )
        WallService.add(
            Post(
                id = 9,
                1,
                2,
                3,
                20221205,
                "zxc",
                1,
                2,
                false,
                Post.Comments(2),
                "asd",
                Post.Likes(2),
                Post.Reposts(2),
                Post.Views(4),
                PostType.Post,
                5,
                postponedId = 1,
                postSource = Post.PostSource(Type.Vk, Platform.Android, "www"),
                geo = Post.Geo("qwe", "eqwe", null),
                copyHistory = null,
                attachments = arrayOf(
                    AudioAttachments(
                        AudioAttachments.Audio(
                            1, 1, "Scorpions", "Wind of change", 1, "www", 30032022
                        )
                    )
                )
            )
        )
        WallService.createComment(
            Comment(
                1,
                1,
                0,
                "qwe",
                1,
                attachments = arrayOf(
                    VideoAttachments(
                        VideoAttachments.Video(
                            1, 2, "Tik Tok2020", 1, "www", 2032020, 20, 5, "Www"
                        )
                    ), LinkAttachment(LinkAttachment.Link("www", "link", null, "описание"))
                ),
                99,
                99
            )
        )
        val result = WallService.reportingComment(ReportComment(
            1,
            1,
            1
        ))

        assertTrue(result)

    }



}