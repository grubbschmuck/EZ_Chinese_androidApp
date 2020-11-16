package com.example.android.myapplication

import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_b1.*

class b01 : Fragment() {
    private lateinit var niMP: MediaPlayer
    private lateinit var haoMP: MediaPlayer

    override fun onCreateView(inflater:
                              LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_b1, container, false)

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        playBtn.setOnClickListener{
            niMP = MediaPlayer.create(context, R.raw.ni3)
            niMP.start()
        }
    }

}