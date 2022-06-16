package com.way.gituser.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    val id: Int,
    val username: String,
    val fullName: String,
    val avatar: String,
    val company: String,
    val follower: Int,
    val following: Int,
    val location: String,
    val repository: Int
) : Parcelable

object UserData {
    val listDataUser = arrayListOf(
        User(
            1,
            "thrau",
            "Thomas Rausch",
            "https://avatars.githubusercontent.com/u/3996682?s=96&v=4",
            "Local Stack",
            301,
            101,
            "USA",
            40
        ),
        User(
            2,
            "TooTallNate",
            "Nathan Rajlich",
            "https://avatars.githubusercontent.com/u/71256?s=96&v=4",
            "Vercel",
            4500,
            132,
            "England",
            72
        ),
        User(
            3,
            "sethvargo",
            "Seth Vargo",
            "https://avatars.githubusercontent.com/u/408570?s=96&v=4",
            "Google",
            3200,
            5,
            "Finland",
            53
        ),
        User(
            4,
            "wcandillom",
            "William Candillon",
            "https://avatars.githubusercontent.com/u/306134?v=4",
            "Zurich",
            5800,
            21,
            "UK",
            89
        ),
        User(
            5,
            "delvedor",
            "Tomas Della Vedova",
            "https://avatars.githubusercontent.com/u/4865608?v=4",
            "Elastic",
            1100,
            125,
            "USA",
            76
        ),
        User(
            6,
            "ebzhanov",
            "Zhenek",
            "https://avatars.githubusercontent.com/u/13170022?v=4",
            "Unknown",
            2300,
            8,
            "Cezch",
            33
        ),
        User(
            7,
            "rachelandrew",
            "Rachel Andrew",
            "https://avatars.githubusercontent.com/u/2764898?v=4",
            "Google",
            1300,
            0,
            "San Fransisco",
            56
        ),
        User(
            8,
            "npalm",
            "Niek Palm",
            "https://avatars.githubusercontent.com/u/11609620?v=4",
            "Philip Software",
            97,
            1,
            "Pittsburg, PA",
            91
        ),
        User(
            9,
            "bvaughn",
            "Brian Vaughn",
            "https://avatars.githubusercontent.com/u/29597?v=4",
            "Record Replay",
            8600,
            1,
            "Zurich",
            155
        ),
        User(
            10,
            "alex",
            "Alex Gaynor",
            "https://avatars.githubusercontent.com/u/772?v=4",
            "Unknown",
            7500,
            38,
            "Italy",
            118
        ),
    )
}