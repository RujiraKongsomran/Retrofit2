package com.rujirakongsomran.retrofit2;

import com.rujirakongsomran.retrofit2.Model.Comment;
import com.rujirakongsomran.retrofit2.Model.Post;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface JsonPlaceHolderApi {
    @GET("posts")
    Call<List<Post>> getPosts();

    @GET("posts/{postId}/comments")
    Call<List<Comment>> getComments(@Path("postId") int postId);
}
