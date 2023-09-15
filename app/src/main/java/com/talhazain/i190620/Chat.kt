package com.talhazain.i190620

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


data class ChatItem(
    val username: String,
    val lastMessage: String,
    val profileIconResId: Int
)
val chatItems = listOf(
    ChatItem("John Doe", "2 new messages", R.drawable.baseline_emoji_people_24),
    ChatItem("Jane Smith", "2 new messages", R.drawable.baseline_emoji_people_24),
    ChatItem("Alice Johnson", "2 new messages", R.drawable.baseline_emoji_people_24),
    ChatItem("Bob Wilson", "2 new messages", R.drawable.baseline_emoji_people_24)
)


class Chat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)
    }
}
class ChatAdapter(private val context: Context, private val chatItems: List<Chat>) : BaseAdapter() {
    @override
    override fun getCount(): Int = chatItems.size
    @override
    override fun getItem(position: Int): Any = chatItems[position]
    @override
    override fun getItemId(position: Int): Long = position.toLong()

    @override
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val item = getItem(position) as ChatItem
        val inflater = LayoutInflater.from(context)
        val itemView = convertView ?: inflater.inflate(R.layout.item_chat, parent, false)

        val profileIconImageView = itemView.findViewById<ImageView>(R.id.profileIcon)
        val usernameTextView = itemView.findViewById<TextView>(R.id.username)
        val lastMessageTextView = itemView.findViewById<TextView>(R.id.lastMessage)

        profileIconImageView.setImageResource(item.profileIconResId)
        item.username.also { usernameTextView.text = it }
        item.lastMessage.also { lastMessageTextView.text = it }

        return itemView
    }
}
val chatListView = findViewById<ListView>(R.id.chatListView)
val chatAdapter = ChatAdapter(this, chat)



