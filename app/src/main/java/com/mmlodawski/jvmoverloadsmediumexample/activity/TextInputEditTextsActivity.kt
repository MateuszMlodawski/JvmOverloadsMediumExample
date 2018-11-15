package com.mmlodawski.jvmoverloadsmediumexample.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import com.mmlodawski.jvmoverloadsmediumexample.R

class TextInputEditTextsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_input_edit_texts)
        setUpToolbar()
    }

    private fun setUpToolbar() {
        supportActionBar?.title = getString(R.string.text_input_edit_texts_title)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return if (item?.itemId == android.R.id.home) {
            finish()
            true
        } else {
            super.onOptionsItemSelected(item)
        }
    }
}