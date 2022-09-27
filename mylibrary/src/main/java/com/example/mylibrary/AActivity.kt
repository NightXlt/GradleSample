package com.example.mylibrary

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * @Author: Night
 * @Date: 2022.09.26
 * @Email: nightfeng26@gmail.com
 **/
class AActivity : AppCompatActivity() {
    val bean = Bean()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println(bean.address)
        bean
    }
}