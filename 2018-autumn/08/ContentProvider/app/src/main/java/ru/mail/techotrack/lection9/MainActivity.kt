package ru.mail.techotrack.lection9

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentTransaction
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : FragmentActivity() {

    private var _listFragment: ListFragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scrolling)
        _listFragment = ListFragment()
    }

    override fun onStart() {
        super.onStart()
        super.onStart()
        val frag = supportFragmentManager.findFragmentById(R.id.main_fragment)
        if (frag == null) {
            val ft = supportFragmentManager.beginTransaction()
            ft.add(R.id.main_fragment, _listFragment!!)
            ft.commit()
        }
    }

    companion object {
        private val TAG = "ScrollingActivity"
    }
}
