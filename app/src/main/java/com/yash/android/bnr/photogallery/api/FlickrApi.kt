package com.yash.android.bnr.photogallery.api

import retrofit2.http.GET

private const val API_KEY = "053dc664118f81e44f36d2ea8fafaccb"
interface FlickrApi {
    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=$API_KEY" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
    suspend fun fetchPhotos(): FlickrResponse
}