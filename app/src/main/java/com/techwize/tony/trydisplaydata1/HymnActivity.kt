package com.techwize.tony.trydisplaydata1

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_hymn.*

class HymnActivity : AppCompatActivity() {
//    private val TAG = "......GBENGA........"
    private val TAG = LoginActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hymn)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_hymn, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        if (item.itemId == R.id.action_login){
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
            Log.d(TAG, "Menu item action_login was selected")
        }
        if (item.itemId == R.id.action_settings){
            val intent = Intent(this,LoginActivity::class.java)
//            startActivity(intent)
            Log.d(TAG, "Menu item action_settings was selected")
        }
        return when (item.itemId) {
            R.id.action_settings -> true
            R.id.action_login -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

}
