package com.example.mybank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.mybank.fragments.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        supportActionBar?.hide()

      val homeFragment = HomeFragment()
      val transferFragment = TransferFragment()
      val paymentFragment = PaymentFragment()
      val savingFragment = SavingFragment()
      val menuFragment = MenuFragment()

    makeCurrentFragment(homeFragment)

        bottom_nav.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home ->makeCurrentFragment(homeFragment)
                R.id.menu ->makeCurrentFragment(menuFragment)
                R.id.payment ->makeCurrentFragment(paymentFragment)
                R.id.saving ->makeCurrentFragment(savingFragment)
                R.id.transfer ->makeCurrentFragment(transferFragment)
            }
            true
        }
    }
    private fun makeCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_wrapper, fragment)
            commit()
        }
}