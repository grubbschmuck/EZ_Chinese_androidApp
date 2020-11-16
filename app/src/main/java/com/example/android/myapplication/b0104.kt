package com.example.android.myapplication

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_b0102.*
import kotlinx.android.synthetic.main.fragment_b0102.button1
import kotlinx.android.synthetic.main.fragment_b0102.button10
import kotlinx.android.synthetic.main.fragment_b0102.button11
import kotlinx.android.synthetic.main.fragment_b0102.button12
import kotlinx.android.synthetic.main.fragment_b0102.button13
import kotlinx.android.synthetic.main.fragment_b0102.button14
import kotlinx.android.synthetic.main.fragment_b0102.button15
import kotlinx.android.synthetic.main.fragment_b0102.button16
import kotlinx.android.synthetic.main.fragment_b0102.button17
import kotlinx.android.synthetic.main.fragment_b0102.button18
import kotlinx.android.synthetic.main.fragment_b0102.button19
import kotlinx.android.synthetic.main.fragment_b0102.button2
import kotlinx.android.synthetic.main.fragment_b0102.button20
import kotlinx.android.synthetic.main.fragment_b0102.button21
import kotlinx.android.synthetic.main.fragment_b0102.button22
import kotlinx.android.synthetic.main.fragment_b0102.button23
import kotlinx.android.synthetic.main.fragment_b0102.button3
import kotlinx.android.synthetic.main.fragment_b0102.button4
import kotlinx.android.synthetic.main.fragment_b0102.button5
import kotlinx.android.synthetic.main.fragment_b0102.button6
import kotlinx.android.synthetic.main.fragment_b0102.button7
import kotlinx.android.synthetic.main.fragment_b0102.button8
import kotlinx.android.synthetic.main.fragment_b0102.button9
import kotlinx.android.synthetic.main.fragment_b0104.*

class b0104 : Fragment() {

    private lateinit var MP: MediaPlayer

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b0104, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button1.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.ma1)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        button2.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.wo3)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        button3.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.ke4)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        button4.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.lai2)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        button5.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.mei3)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        button6.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.hao3)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        button7.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.you3)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        button8.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.an1)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        button9.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.shang4)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        button10.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.hen3)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        button11.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.peng2)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        button12.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.dong3)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        button13.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.er4)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        button14.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.bu4)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        button15.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.hua1)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        button16.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.shuo1)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        button17.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.kuai4)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        button18.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.dui4)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        button19.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.huan1)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        button20.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.huang2)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        button21.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.zhun3)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        button22.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.xia4)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        button23.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.xie4)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        button24.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.xiao3)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        button25.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.jiu3)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        button26.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.tian1)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        button27.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.liang3)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        button28.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.xin1)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        button29.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.ming2)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        button30.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.qiong2)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        button31.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.nuu3)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        button32.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.yue4)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        button33.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.yuan2)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        button34.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.jun1)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        button35.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.yi1)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
        button36.setOnClickListener{
            MP = MediaPlayer.create(context, R.raw.zi3)
            MP.start()
            Thread.sleep(1500)
            MP.release()
        }
    }

}