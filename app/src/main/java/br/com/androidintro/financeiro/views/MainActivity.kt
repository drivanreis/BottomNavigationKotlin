package br.com.androidintro.financeiro.views

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.com.androidintro.financeiro.R
import br.com.androidintro.financeiro.fragments.FinanceiroFragment
import br.com.androidintro.financeiro.fragments.LoginFragment
import br.com.androidintro.financeiro.fragments.NewsFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private val bottomNavigationView:BottomNavigationView by lazy { findViewById(R.id.main_bottom_navigation) }

    private val loginFrag = LoginFragment()
    private val newsFrag = NewsFragment()
    private val financFrag = FinanceiroFragment()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.menu_login_item -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_container_view,loginFrag)
                        .commit()
                }
                R.id.menu_news_item -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.main_container_view,newsFrag)
                            .commit()
                }
                R.id.menu_finan_item -> {

                        supportFragmentManager.beginTransaction()
                            .replace(R.id.main_container_view,financFrag)
                            .commit()
                }
            }
            true
        }

    }
}