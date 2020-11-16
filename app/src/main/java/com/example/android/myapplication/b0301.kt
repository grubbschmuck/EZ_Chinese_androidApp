package com.example.android.myapplication

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_b0301.*

class b0301 : Fragment() {

    private lateinit var MP: MediaPlayer

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b0301, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        gB1.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.greeting01)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        gB2.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.greeting02)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        gB3.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.greeting03)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        gB4.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.greeting04)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        gB5.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.greeting05)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        gB6.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.greeting06)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        gB7.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.greeting07)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        gB8.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.greeting08)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }

    }

}