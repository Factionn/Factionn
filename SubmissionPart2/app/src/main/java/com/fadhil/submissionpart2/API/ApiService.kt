package com.fadhil.submissionpart2.API

import com.fadhil.submissionpart2.dll.DetailResponse
import com.fadhil.submissionpart2.User.User
import com.fadhil.submissionpart2.User.UserResponse
import retrofit2.Call
import retrofit2.http.Headers
import retrofit2.http.Query
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
@GET("search/users")
@Headers("Authorization: token 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")
 fun getUser(
    @Query("q")query: String
 ):
        Call<UserResponse>


    @GET("users/{username}")
    @Headers("Authorization: token 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")
     fun getUserDetails(
        @Path("username") username: String
    ): Call <DetailResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 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")
     fun getUserfollowers(
        @Path("username") username: String
    ): Call <ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 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")
     fun getUserfollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>

}