package com.example.android.myapplication

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_b0401.*

class b0401 : Fragment() {

    private lateinit var MP: MediaPlayer

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b0401, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        b4b1.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.year01)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        b4b2.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.year02)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        b4b3.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.year03)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        b4b4.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.year04)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        b4b5.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.year05)
            MP.start()
            Thread.sleep(2000)
            MP.release()
        }

    }

}