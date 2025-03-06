package ir.hajkarami.viewpager


import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class MyViewPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {

    private val fragmentList: MutableList<Fragment> = mutableListOf()

    override fun getItemCount(): Int = fragmentList.size

    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }

    fun addFragment(fragment: Fragment) {
        fragmentList.add(fragment)
    }
}