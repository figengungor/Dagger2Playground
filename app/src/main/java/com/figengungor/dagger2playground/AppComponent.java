package com.figengungor.dagger2playground;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by figengungor on 5/30/2017.
 */

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(WelcomeActivity activity);
}
