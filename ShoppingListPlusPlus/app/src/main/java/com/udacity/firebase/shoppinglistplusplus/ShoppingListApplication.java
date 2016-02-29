package com.udacity.firebase.shoppinglistplusplus;

import com.firebase.client.Firebase;

/**
 * Includes one-time initialization of Firebase related code
 */
public class ShoppingListApplication extends android.app.Application {

    /*
    You will also likely get an error that reads:
    "Could not find property 'UniqueFirebaseRootUrl'".
    To fix this error, you need to add a value for UniqueFirebaseUrl in your gradle.properties file.
    You should create a file and add a line that looks like this:
        UniqueFirebaseRootUrl = "https://shoppinglistplspls.firebaseio.com/"
    (Just remember to replace the URL with you unique Firebase URL!)
     */
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }

}