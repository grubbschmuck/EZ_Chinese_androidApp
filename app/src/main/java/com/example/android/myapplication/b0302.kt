package com.example.android.myapplication

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_b0302.*

class b0302 : Fragment() {

    private lateinit var MP: MediaPlayer

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b0302, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        gB9.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.greeting09)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        gB10.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.greeting10)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        gB11.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.greeting11)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        gB12.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.greeting12)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        gB13.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.greeting13)
            MP.start()
            Thread.sleep(2000)
            MP.release()
        }
        gB14.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.greeting14)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        gB15.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.greeting15)
            MP.start()
            Thread.sleep(2800)
            MP.release()
        }
        gB16.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.greeting16)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }

    }

}