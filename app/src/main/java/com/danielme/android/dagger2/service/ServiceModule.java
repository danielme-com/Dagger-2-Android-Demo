package com.danielme.android.dagger2.service;

import android.content.Context;

import com.danielme.android.dagger2.repository.ArtistRepository;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class ServiceModule {

  //note: SingletonServiceImpl constructor must be annotated with @Inject
  @Binds
  public abstract SingletonService providesSingletonService(SingletonServiceImpl singletonService);

  /*@Provides
  @Singleton
  SingletonService providesSingletonServiceImpl(ArtistRepository artistRepository,
                                                Context context) {
    return new SingletonServiceImpl(artistRepository, context);
  }*/

}