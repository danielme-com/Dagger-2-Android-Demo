package com.danielme.android.dagger2.repository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class RetrofitModule {

  private static final String URL = "http://musicbrainz.org/ws/2/";

  @Provides
  @Singleton
  ArtistRepository providesArtistRepository() {
    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl(URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build();
    return retrofit.create(ArtistRepository.class);
  }

}