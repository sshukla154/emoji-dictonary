package com.learn.kotlin.emojidictonary

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_view_item_row.view.*

class EmojiAdapter(val emojiList: ArrayList<String>) : RecyclerView.Adapter<EmojiAdapter.TextHolder>() {

    class TextHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {
            
        var view : View = v;
        var emoji : String = "";

        init {
            v.setOnClickListener(this)
        }

        fun bindEmoji(emoji: String) {
            this.emoji = emoji
            view.emojiTextView.text = emoji
        }

        override fun onClick(v: View?) {
            /* Calling One Activity From Another.
            Eg: Calling EmojiDetailActivity is called  from MainActivity*/

            val detailIntent = Intent(view.context, EmojiDetailActivity::class.java)
            detailIntent.putExtra("emoji", emoji)
            ContextCompat.startActivity(view.context, detailIntent, null)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextHolder {
        return TextHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item_row, parent, false))
    }

    override fun getItemCount(): Int {
        return emojiList.count()
    }

    override fun onBindViewHolder(holder: EmojiAdapter.TextHolder, position: Int) {
        var inputEmoji = emojiList[position]
        holder.bindEmoji(inputEmoji)
        //holder.bindEmoji("👍")
    }
}