package com.example.android.myapplication

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_b0402.*

class b0402 : Fragment() {

    private lateinit var MP: MediaPlayer

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b0402, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        b4c1.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.month01)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        b4c2.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.month02)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        b4c3.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.month03)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        b4c4.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.month04)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        b4c5.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.month05)
            MP.start()
            Thread.sleep(2000)
            MP.release()
        }

    }

}