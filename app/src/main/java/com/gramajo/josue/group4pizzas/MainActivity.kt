package com.gramajo.josue.group4pizzas

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.StaggeredGridLayoutManager
import android.view.Menu
import android.view.MenuItem
import android.widget.ListAdapter
import com.felipecsl.asymmetricgridview.library.Utils
import com.felipecsl.asymmetricgridview.library.model.AsymmetricItem
import com.felipecsl.asymmetricgridview.library.widget.AsymmetricGridView
import com.gramajo.josue.group4pizzas.Activities.ScrollActivity
import com.gramajo.josue.group4pizzas.Adapters.ProductAdapter
import com.gramajo.josue.group4pizzas.Objects.Product
import com.gramajo.josue.group4pizzas.Utils.SpacesItemDecoration
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.content_main.*
import org.jetbrains.anko.find
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    var list = ArrayList<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)

        //button.setOnClickListener { startActivity<ScrollActivity>() }

        list.add(Product(1, "Pepperoni", getString(R.string.description), 78.toFloat()))
        list.add(Product(2, "Hawaiana", getString(R.string.description), 45.toFloat()))
        list.add(Product(3, "Jamon", getString(R.string.description), 56.toFloat()))
        list.add(Product(4, "5 Carnes", getString(R.string.description), 98.toFloat()))
        list.add(Product(5, "Deluxe", getString(R.string.description), 99.toFloat()))
        list.add(Product(6, "Tocino", getString(R.string.description), 110.toFloat()))
        list.add(Product(7, "Churrasco", getString(R.string.description), 114.toFloat()))
        list.add(Product(8, "Pizza 4", getString(R.string.description), 130.toFloat()))
        list.add(Product(9, "Lasagna", getString(R.string.description), 98.toFloat()))

        recyclerView.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.addItemDecoration(SpacesItemDecoration(16))
        recyclerView.adapter = ProductAdapter(list, {
            val intent = Intent(this, ScrollActivity::class.java)
            intent.putExtra("selectedProduct", it)
            startActivity(intent)
        })
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_camera -> {

            }
            R.id.nav_gallery -> {

            }
            R.id.nav_slideshow -> {

            }
            R.id.nav_manage -> {

            }
            R.id.nav_share -> {

            }
            R.id.nav_send -> {

            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}
