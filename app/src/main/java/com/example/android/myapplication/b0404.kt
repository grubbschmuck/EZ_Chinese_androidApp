package com.example.android.myapplication

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_b0404.*

class b0404 : Fragment() {

    private lateinit var MP: MediaPlayer

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b0404, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        b4e1.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.time01)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        b4e2.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.time02)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        b4e3.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.time03)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        b4e4.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.time04)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        b4e5.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.time05)
            MP.start()
            Thread.sleep(2000)
            MP.release()
        }
        b4e6.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.time06)
            MP.start()
            Thread.sleep(3500)
            MP.release()
        }

    }

}