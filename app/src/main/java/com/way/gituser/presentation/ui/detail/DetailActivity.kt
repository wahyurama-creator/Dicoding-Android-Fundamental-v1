package com.way.gituser.presentation.ui.detail

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.google.android.material.snackbar.Snackbar
import com.way.gituser.R
import com.way.gituser.data.User
import com.way.gituser.databinding.ActivityDetailBinding
import com.way.gituser.presentation.ui.home.HomeActivity.Companion.SELECTED_ITEM

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val user = intent.extras?.getParcelable<User>(SELECTED_ITEM)
        if (user != null) {
            setUser(user)
        } else {
            Snackbar.make(binding.view, "User not found", Snackbar.LENGTH_SHORT).show()
        }

        binding.ivBack.setOnClickListener { onBackPressed() }
        binding.ivShare.setOnClickListener {
            shareIntent(getString(R.string.share_text, user?.username ?: "Unknown User"))
        }
    }

    private fun setUser(user: User) {
        binding.apply {
            tvUsernameDetail.text = user.username
            tvFullName.text = user.fullName
            tvCompany.text = user.company
            tvLocation.text = user.location
            tvFollower.text = user.follower.toString()
            tvFollowing.text = user.following.toString()
            tvRepository.text = user.repository.toString()
            Glide.with(ivUserDetail)
                .load(
                    user.avatar
                )
                .circleCrop()
                .into(ivUserDetail)
        }
    }

    private fun shareIntent(text: String) {
        val intent = Intent()
        intent.action = Intent.ACTION_SEND
        intent.type = "text/plain"
        intent.putExtra(Intent.EXTRA_TEXT, text)
        startActivity(Intent.createChooser(intent, "Share with:"))
    }
}