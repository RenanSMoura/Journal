package moura.silva.com.journal.activity

import moura.silva.com.journal.R

class TodoActivity: ItemActivity(){
    override val TAG = "TodoActivity"
    override fun getLayout(): Int  = R.layout.activity_todo
    override fun getActivityTitle(): Int = R.string.app_name
}
