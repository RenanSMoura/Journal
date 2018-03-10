package moura.silva.com.journal.activity

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import moura.silva.com.journal.R
import moura.silva.com.journal.utils.Extra

class MainActivity : AppCompatActivity() {

    companion object {
        val TAG = this::class.java.name
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.v(TAG, Extra.ON_CREATE)
    }

    override fun onPostCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onPostCreate(savedInstanceState, persistentState)
        Log.v(TAG,Extra.ON_POST_CREATE)
    }

    override fun onRestart() {
        super.onRestart()
        Log.v(TAG,Extra.ON_RESTART)
    }

    override fun onPostResume() {
        super.onPostResume()
        Log.v(TAG,Extra.ON_POST_RESUME)
    }

    override fun onPause() {
        super.onPause()
        Log.v(TAG,Extra.ON_PAUSE)
    }

    override fun onStop() {
        super.onStop()
        Log.v(TAG,Extra.ON_STOP)
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.v(TAG,Extra.ON_DESTROY)
    }
}
