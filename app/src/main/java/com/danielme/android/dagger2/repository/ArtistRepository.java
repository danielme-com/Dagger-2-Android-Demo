package com.danielme.android.dagger2.repository;

import com.danielme.android.dagger2.model.Artist;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ArtistRepository {

  @GET("artist/{mbid}?fmt=json")
  Call<Artist> getArtist(@Path("mbid") String mbid);

}