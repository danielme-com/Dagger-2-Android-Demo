package com.danielme.android.dagger2.service;

import com.danielme.android.dagger2.model.Artist;

import java.io.IOException;

public interface SingletonService {

   String getPath();

   Artist getArtist(String mbid) throws IOException;

}