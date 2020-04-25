package com.rujirakongsomran.retrofit2;

import com.rujirakongsomran.retrofit2.Model.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {
    @GET("posts")
    Call<List<Post>> getPosts();
}
