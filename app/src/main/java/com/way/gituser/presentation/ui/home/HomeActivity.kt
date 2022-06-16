package com.way.gituser.presentation.ui.home

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.way.gituser.data.UserData
import com.way.gituser.databinding.ActivityHomeBinding
import com.way.gituser.presentation.ui.detail.DetailActivity

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    private lateinit var homeAdapter: HomeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRv()
        homeAdapter.setOnItemClickListener {
            val intent = Intent(this@HomeActivity, DetailActivity::class.java)
            intent.putExtra(SELECTED_ITEM, it)
            startActivity(intent)
        }
    }

    private fun initRv() {
        homeAdapter = HomeAdapter()
        binding.rvHome.apply {
            adapter = homeAdapter
            layoutManager = LinearLayoutManager(context)
            homeAdapter.diffUtils.submitList(UserData.listDataUser)
        }
    }

    companion object {
        const val SELECTED_ITEM = "selected_item_user"
    }

}