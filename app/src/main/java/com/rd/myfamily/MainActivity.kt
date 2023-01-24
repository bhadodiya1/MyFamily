package com.rd.myfamily

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.rd.myfamily.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        openFragment(HomeFragment())

        binding.bottomnavigation.setOnItemSelectedListener{

           when(it.itemId){
               R.id.home_bottom->openFragment(HomeFragment())
               R.id.dashboard_bottom->openFragment(DashbordFragment())
               R.id.gaurd_bottom->openFragment(GaurdFragment())
               R.id.user_bottom->openFragment(UserFragment())


           }


            true
        }

    }

    private fun openFragment(fragment: Fragment) {

        supportFragmentManager.beginTransaction()
            .replace(R.id.container1, fragment).commit()



    }
}