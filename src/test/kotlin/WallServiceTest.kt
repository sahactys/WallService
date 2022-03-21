import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {
    val origin1 = Post(
        id = 0,
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
        postponedId = 1
    )

    val origin = Post(
        id = 1,
        1,
        6,
        7,
        20201205,
        "qwe",
        1,
        2,
        false,
        Post.Comments(2),
        "bnm",
        Post.Likes(2),
        Post.Reposts(2),
        Post.Views(4),
        PostType.Post,
        5,
        postponedId = 1
    )
    @Test
    fun add() {
        val result=WallService.add(origin1)
        assertNotEquals(0,result.id)
    }

    @Test
    fun updateTrue() {
        WallService.add(origin1)
        val result = WallService.update(origin)
        assertTrue(result)
    }
    @Test
    fun updateFalse() {
        WallService.add(origin1)
        val result = WallService.update(origin1)
        assertFalse(result)
    }
}