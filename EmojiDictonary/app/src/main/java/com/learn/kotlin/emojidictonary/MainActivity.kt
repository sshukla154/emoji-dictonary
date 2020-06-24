package com.learn.kotlin.emojidictonary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    
    // For Linear View
    /*private lateinit var layout_Manager : LinearLayoutManager
    private lateinit var emojiAdapter : EmojiAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layout_Manager = LinearLayoutManager(this)
        recyclerView.layoutManager = layout_Manager

        var emojiArrayList = arrayListOf<String>("👍","😊","😂","🤷‍♂️","✌","👌","🌹","🎶","👀","🐱‍","👓","🐱","‍👤")
        emojiAdapter = EmojiAdapter(emojiArrayList)
        recyclerView.adapter = emojiAdapter
    }*/

    //For Grid View
    private lateinit var layout_Manager : GridLayoutManager
    private lateinit var emojiAdapter : EmojiAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layout_Manager = GridLayoutManager(this, 3)
        recyclerView.layoutManager = layout_Manager

        var emojiArrayList = arrayListOf<String>("👍","😊","😂","🤷‍♂️","✌","👌","🌹","🎶","👀","🐱‍","👓","🐱","‍👤")
        emojiAdapter = EmojiAdapter(emojiArrayList)
        recyclerView.adapter = emojiAdapter
    }
}