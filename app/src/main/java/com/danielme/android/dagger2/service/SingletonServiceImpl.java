package com.danielme.android.dagger2.service;

import android.content.Context;

import com.danielme.android.dagger2.model.Artist;
import com.danielme.android.dagger2.repository.ArtistRepository;

import java.io.IOException;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class SingletonServiceImpl implements SingletonService {

  private final ArtistRepository artistRepository;
  private final Context context;

  @Inject
  public SingletonServiceImpl(ArtistRepository artistRepository, Context context) {
    this.artistRepository = artistRepository;
    this.context = context;
  }

  @Override
  public String getPath() {
    return context.getApplicationContext().getCacheDir().getAbsolutePath();
  }

  @Override
  public Artist getArtist(String mbid) throws IOException {
    return artistRepository.getArtist(mbid).execute().body();
  }

}