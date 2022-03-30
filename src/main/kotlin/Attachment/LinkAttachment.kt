package Attachment

class LinkAttachment(link:Link) : Attachments() {
    override val type: String = "Link"

    data class Link(
        val url: String,
        val title: String,
        val caption: String?,
        val description:String
        )

}