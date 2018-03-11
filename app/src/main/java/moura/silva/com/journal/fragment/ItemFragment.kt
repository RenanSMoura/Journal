package moura.silva.com.journal.fragment

import moura.silva.com.journal.R

/**
 * Created by Renan on 11/03/2018.
 */
class  ItemFragment : BaseFragment(){
    override val logTag = "Items Fragment"
    override fun getLayout() = R.layout.fragment_items

    companion object {
        fun newInstance(): ItemFragment{
            return ItemFragment()
        }
    }
}
