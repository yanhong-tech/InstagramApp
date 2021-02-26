package com.example.instagramapp;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("bQHta0id8C0uczZVX9B0QEw7bU0pfNodTqDjyyBj")
                .clientKey("RyeB9XukRDvu3TQ4mzEg7kY4J9afRpUeFtY1oY7j")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
