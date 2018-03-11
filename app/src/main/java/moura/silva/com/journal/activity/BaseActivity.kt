package moura.silva.com.journal.activity

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v4.app.FragmentActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_header.*
import moura.silva.com.journal.utils.Extra

abstract class BaseActivity : FragmentActivity(){

    protected abstract val TAG : String

    protected abstract fun getLayout() : Int

    protected abstract fun getActivityTitle() : Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayout())
        activity_title.setText(getActivityTitle())
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

    override fun onResume() {
        super.onResume()
        Log.v(TAG,Extra.ON_RESUME)
    }

    override fun onStart() {
        super.onStart()
        Log.v(TAG,Extra.ON_START)
    }


}