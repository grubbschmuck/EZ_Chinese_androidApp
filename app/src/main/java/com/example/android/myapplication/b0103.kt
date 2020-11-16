package com.example.android.myapplication

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_b0102.*

class b0103 : Fragment() {

    private lateinit var ni1MP: MediaPlayer
    private lateinit var ni2MP: MediaPlayer
    private lateinit var ni3MP: MediaPlayer
    private lateinit var ni4MP: MediaPlayer

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b0103, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button1.setOnClickListener{
            ni1MP = MediaPlayer.create(context, R.raw.ni1)
            ni1MP.start()
            Thread.sleep(1500)
            ni1MP.release()
        }
        button2.setOnClickListener{
            ni2MP = MediaPlayer.create(context, R.raw.ni2)
            ni2MP.start()
            Thread.sleep(1500)
            ni2MP.release()
        }
        button3.setOnClickListener{
            ni3MP = MediaPlayer.create(context, R.raw.ni3)
            ni3MP.start()
            Thread.sleep(1500)
            ni3MP.release()
        }
        button4.setOnClickListener{
            ni4MP = MediaPlayer.create(context, R.raw.ni4)
            ni4MP.start()
            Thread.sleep(1500)
            ni4MP.release()
        }
    }

}