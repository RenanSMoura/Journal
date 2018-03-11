package moura.silva.com.journal.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import moura.silva.com.journal.utils.Extra

abstract class BaseFragment : Fragment(){
    protected abstract val logTag :String
    protected abstract fun getLayout() : Int


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.v(logTag, Extra.ON_CREATE_VIEW)
        return inflater?.inflate(getLayout(),container,false)
    }

    override fun onPause() {
        super.onPause()
        Log.v(logTag,Extra.ON_PAUSE)
    }

    override fun onResume() {
        super.onResume()
        Log.v(logTag,Extra.ON_RESUME)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v(logTag,Extra.ON_DESTROY)
    }


}


