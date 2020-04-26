package com.rujirakongsomran.retrofit2;

import com.rujirakongsomran.retrofit2.Model.Comment;
import com.rujirakongsomran.retrofit2.Model.Post;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface JsonPlaceHolderApi {
    @GET("posts")
    Call<List<Post>> getPosts(
            @Query("userId") Integer userId,
            @Query("userId") Integer userId2,
            @Query("_sort") String sort,
            @Query("_order") String order
    );

    @GET("posts/{postId}/comments")
    Call<List<Comment>> getComments(@Path("postId") int postId);
}
