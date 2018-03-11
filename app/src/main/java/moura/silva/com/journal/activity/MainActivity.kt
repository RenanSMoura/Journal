package moura.silva.com.journal.activity

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_header.*
import moura.silva.com.journal.R
import moura.silva.com.journal.fragment.ItemFragment
import moura.silva.com.journal.fragment.ManualFragment

class MainActivity : BaseActivity() {
    override val TAG = "MainActivity"
    override fun getLayout(): Int  = R.layout.activity_main
    override fun getActivityTitle() : Int = R.string.app_name

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val fragment = ItemFragment.newInstance()
        supportFragmentManager.beginTransaction().add(R.id.fragment_container,fragment).commit()

        filter_menu.text = "H"
        filter_menu.setOnClickListener {
            val userManualFragment = ManualFragment()
            supportFragmentManager.beginTransaction().replace(R.id.fragment_container,userManualFragment).commit()
        }
    }
}
