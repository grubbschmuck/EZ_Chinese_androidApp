package com.example.android.myapplication

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_b0102.*
import kotlinx.android.synthetic.main.fragment_b1.*

class b0102 : Fragment() {
    private lateinit var bMP: MediaPlayer
    private lateinit var pMP: MediaPlayer
    private lateinit var mMP: MediaPlayer
    private lateinit var fMP: MediaPlayer
    private lateinit var dMP: MediaPlayer
    private lateinit var tMP: MediaPlayer
    private lateinit var nMP: MediaPlayer
    private lateinit var lMP: MediaPlayer
    private lateinit var gMP: MediaPlayer
    private lateinit var kMP: MediaPlayer
    private lateinit var hMP: MediaPlayer
    private lateinit var jMP: MediaPlayer
    private lateinit var qMP: MediaPlayer
    private lateinit var xMP: MediaPlayer
    private lateinit var zhMP: MediaPlayer
    private lateinit var chMP: MediaPlayer
    private lateinit var shMP: MediaPlayer
    private lateinit var rMP: MediaPlayer
    private lateinit var zMP: MediaPlayer
    private lateinit var cMP: MediaPlayer
    private lateinit var sMP: MediaPlayer
    private lateinit var wMP: MediaPlayer
    private lateinit var yMP: MediaPlayer

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_b0102, container, false)
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button1.setOnClickListener{
            bMP = MediaPlayer.create(context, R.raw.ba1)
            bMP.start()
            Thread.sleep(1500)
            bMP.release()
        }
        button2.setOnClickListener{
            pMP = MediaPlayer.create(context, R.raw.pa1)
            pMP.start()
            Thread.sleep(1500)
            pMP.release()
        }
        button3.setOnClickListener{
            mMP = MediaPlayer.create(context, R.raw.ma1)
            mMP.start()
            Thread.sleep(1500)
            mMP.release()
        }
        button4.setOnClickListener{
            fMP = MediaPlayer.create(context, R.raw.fa1)
            fMP.start()
            Thread.sleep(1500)
            fMP.release()
        }

        button5.setOnClickListener{
            dMP = MediaPlayer.create(context, R.raw.da1)
            dMP.start()
            Thread.sleep(1500)
            dMP.release()
        }
        button6.setOnClickListener{
            tMP = MediaPlayer.create(context, R.raw.ta1)
            tMP.start()
            Thread.sleep(1500)
            tMP.release()
        }
        button7.setOnClickListener{
            nMP = MediaPlayer.create(context, R.raw.na1)
            nMP.start()
            Thread.sleep(1500)
            nMP.release()
        }
        button8.setOnClickListener{
            lMP = MediaPlayer.create(context, R.raw.la1)
            lMP.start()
            Thread.sleep(1500)
            lMP.release()
        }

        button9.setOnClickListener{
            gMP = MediaPlayer.create(context, R.raw.ga1)
            gMP.start()
            Thread.sleep(1500)
            gMP.release()
        }
        button10.setOnClickListener{
            kMP = MediaPlayer.create(context, R.raw.ka1)
            kMP.start()
            Thread.sleep(1500)
            kMP.release()
        }
        button11.setOnClickListener{
            hMP = MediaPlayer.create(context, R.raw.ha1)
            hMP.start()
            Thread.sleep(1500)
            hMP.release()
        }
        button12.setOnClickListener{
            jMP = MediaPlayer.create(context, R.raw.ji1)
            jMP.start()
            Thread.sleep(1500)
            jMP.release()
        }

        button13.setOnClickListener{
            qMP = MediaPlayer.create(context, R.raw.qi1)
            qMP.start()
            Thread.sleep(1500)
            qMP.release()
        }
        button14.setOnClickListener{
            xMP = MediaPlayer.create(context, R.raw.xi1)
            xMP.start()
            Thread.sleep(1500)
            xMP.release()
        }
        button15.setOnClickListener{
            zhMP = MediaPlayer.create(context, R.raw.zha1)
            zhMP.start()
            Thread.sleep(1500)
            zhMP.release()
        }
        button16.setOnClickListener{
            chMP = MediaPlayer.create(context, R.raw.cha1)
            chMP.start()
            Thread.sleep(1500)
            chMP.release()
        }


        button17.setOnClickListener{
            shMP = MediaPlayer.create(context, R.raw.sha1)
            shMP.start()
            Thread.sleep(1500)
            shMP.release()
        }
        button18.setOnClickListener{
            rMP = MediaPlayer.create(context, R.raw.ri1)
            rMP.start()
            Thread.sleep(1500)
            rMP.release()
        }
        button19.setOnClickListener{
            zMP = MediaPlayer.create(context, R.raw.zi1)
            zMP.start()
            Thread.sleep(1500)
            zMP.release()
        }
        button20.setOnClickListener{
            cMP = MediaPlayer.create(context, R.raw.ca1)
            cMP.start()
            Thread.sleep(1500)
            cMP.release()
        }

        button21.setOnClickListener{
            sMP = MediaPlayer.create(context, R.raw.si1)
            sMP.start()
            Thread.sleep(1500)
            sMP.release()
        }
        button22.setOnClickListener{
            wMP = MediaPlayer.create(context, R.raw.wa1)
            wMP.start()
            Thread.sleep(1500)
            wMP.release()
        }
        button23.setOnClickListener{
            yMP = MediaPlayer.create(context, R.raw.ya1)
            yMP.start()
            Thread.sleep(1500)
            yMP.release()
        }
    }

}