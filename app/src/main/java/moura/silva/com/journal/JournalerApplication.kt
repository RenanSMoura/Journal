package moura.silva.com.journal

import android.app.Application
import android.content.Context
import android.util.Log
import moura.silva.com.journal.utils.Extra

/**
 * Created by Renan on 10/03/2018.
 */

class JournalerApplication : Application(){

    companion object {
        var context : Context? = null
        val TAG = this::class.java.name
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
        Log.v(TAG,Extra.ON_CREATE)
    }

    override fun onLowMemory() {
        super.onLowMemory()
        Log.w(TAG,Extra.ON_LOW_MEMORY)
    }

    override fun onTrimMemory(level: Int) {
        super.onTrimMemory(level)
        Log.d(TAG, Extra.ON_TRIM_MEMORY + "$level")
    }
}

