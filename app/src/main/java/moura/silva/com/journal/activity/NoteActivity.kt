package moura.silva.com.journal.activity

import moura.silva.com.journal.R

class NoteActivity : ItemActivity(){
    override fun getActivityTitle(): Int = R.string.app_name

    override val TAG = "NoteActivity"

    override fun getLayout(): Int = R.layout.activity_note
}