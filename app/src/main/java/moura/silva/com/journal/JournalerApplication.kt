package moura.silva.com.journal

import android.app.Application
import android.content.Context

/**
 * Created by Renan on 10/03/2018.
 */

class JournalerApplication : Application(){

    companion object {
        var context : Context? = null
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}

