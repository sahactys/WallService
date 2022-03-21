

fun main(){

   WallService.add(
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
    )
     println(WallService.add(
          1,
          2,
          3,
          20221205,
          "asdff",
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
     ))




}