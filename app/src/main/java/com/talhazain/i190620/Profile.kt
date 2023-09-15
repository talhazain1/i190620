package com.talhazain.i190620

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

data class RentedItem(
    val itemName: String,
    val itemImageResId: Int
)

data class YourItem(
    val itemName: String,
    val itemImageResId: Int
)
val rentedItems = listOf(
    RentedItem("Item 1", R.drawable.baseline_emoji_people_24),
    RentedItem("Item 2", R.drawable.baseline_emoji_people_24),
    // Add more rented items as needed
)

val yourItems = listOf(
    YourItem("Your Item 1", R.drawable.baseline_emoji_people_24),
    YourItem("Your Item 2", R.drawable.baseline_emoji_people_24),
    // Add more of your items as needed
)

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val rentedItems = listOf(
            RentedItem("Item 1", R.drawable.baseline_emoji_people_24),
            RentedItem("Item 2", R.drawable.baseline_emoji_people_24),
            // Add more rented items as needed
        )

        val yourItems = listOf(
            YourItem("Your Item 1", R.drawable.baseline_emoji_people_24),
            YourItem("Your Item 2", R.drawable.baseline_emoji_people_24),
            // Add more of your items as needed
        )

        val rentedItemsRecyclerView = findViewById<RecyclerView>(R.id.rentedItemsRecyclerView)
        val yourItemsRecyclerView = findViewById<RecyclerView>(R.id.yourItemsRecyclerView)

        val rentedItemsAdapter = RentedItemsAdapter(rentedItems)
        val yourItemsAdapter = YourItemsAdapter(yourItems)

        rentedItemsRecyclerView.layoutManager = LinearLayoutManager(this)
        yourItemsRecyclerView.layoutManager = LinearLayoutManager(this)

        rentedItemsRecyclerView.adapter = rentedItemsAdapter
        yourItemsRecyclerView.adapter = yourItemsAdapter

        val profilePhotoImageView = findViewById<ImageView>(R.id.profilePhoto)

        // Load and display the user's profile photo using an image loading library
        Glide.with(this)
            .load("profile_photo_url_here")
            .placeholder(R.drawable.icon)
            .into(profilePhotoImageView)
    }

    private fun YourItemsAdapter(yourItems: List<YourItem>): RecyclerView.Adapter<RecyclerView.ViewHolder>? {
        return TODO("Provide the return value")
    }

    private fun RentedItemsAdapter(rentedItems: List<RentedItem>): RecyclerView.Adapter<RecyclerView.ViewHolder>? {

        return TODO("Provide the return value")
    }
}

private fun Any.into(profilePhotoImageView: ImageView?) {
    TODO("Not yet implemented")
}

private fun Any.placeholder(defaultProfilePhoto: Any): Any {
    TODO("Not yet implemented")
}

private fun Any.load(s: String): Any {
    TODO("Not yet implemented")
}

class Glide {
    companion object {
        fun with(profileActivity: ProfileActivity): Any {
            return TODO("Provide the return value")
        }
    }

}
