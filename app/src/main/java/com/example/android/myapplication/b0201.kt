package com.example.android.myapplication

import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_b0201.*


class b0201 : Fragment() {
    private lateinit var niMP: MediaPlayer

    override fun onCreateView(inflater:
                              LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_b0201, container, false)

    }



}