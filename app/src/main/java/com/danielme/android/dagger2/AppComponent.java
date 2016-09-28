package com.danielme.android.dagger2;

import com.danielme.android.dagger2.repository.RetrofitModule;
import com.danielme.android.dagger2.service.ServiceModule;
import com.danielme.android.dagger2.view.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class,
                      ServiceModule.class,
                      RetrofitModule.class})
public interface AppComponent {

    void inject(MainActivity activity);

}