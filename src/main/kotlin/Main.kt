import Attachment.AudioAttachments
import Attachment.LinkAttachment
import Attachment.VideoAttachments

fun main() {
    val origin = Post(
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

    val origin2 = Post(
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

    val origin3 = Post(
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

    WallService.add(origin)
    WallService.add(origin2)
    WallService.add(origin3)

    val comment = Comment(
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
    WallService.createComment(comment)

    val report = ReportComment(
        1,
        1,
        0
    )
    WallService.reportingComment(report)
    println()
}