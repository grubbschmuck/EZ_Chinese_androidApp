package com.example.android.myapplication

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_b0403.*

class b0403 : Fragment() {

    private lateinit var MP: MediaPlayer

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b0403, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        b4d1.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.day01)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        b4d2.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.day02)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        b4d3.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.day03)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        b4d4.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.day04)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        b4d5.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.day05)
            MP.start()
            Thread.sleep(2000)
            MP.release()
        }
        b4d6.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.day06)
            MP.start()
            Thread.sleep(3500)
            MP.release()
        }

    }

}