package com.example.ticeditfinal

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var ptsP1=0
    var ptsP2=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun buClick(view: View) {
        val buSelected = view as Button
        var cellID = 0
        when (buSelected.id) {
            R.id.bu1 -> cellID = 1
            R.id.bu2 -> cellID = 2
            R.id.bu3 -> cellID = 3
            R.id.bu4 -> cellID = 4
            R.id.bu5 -> cellID = 5
            R.id.bu6 -> cellID = 6
            R.id.bu7 -> cellID = 7
            R.id.bu8 -> cellID = 8
            R.id.bu9 -> cellID = 9

        }
        // to see if program was working earlier Toast.makeText(this, "id: " + cellID, Toast.LENGTH_SHORT).show()
        playGame(cellID, buSelected)
        checkWinner()
    }

    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()
    var activePlayer = 1
    var pointerP1="X"
    var pointerP2="O"

    fun playGame(cellID: Int, buSelected: Button) {
        if (activePlayer == 1) {
            buSelected.text = pointerP1
            buSelected.setBackgroundColor(Color.RED)

            player1.add(cellID)
            activePlayer = 2
        } else {
            buSelected.text = pointerP2
            buSelected.setBackgroundColor(Color.BLUE)
            player2.add(cellID)
            activePlayer = 1
        }
        buSelected.isEnabled=true


    }

    fun checkWinner() {
        var winner = 0


        //row1
        if (player1.contains(1) && player1.contains(2) && player1.contains(3)) {
            winner = 1
        }
        if (player2.contains(1) && player2.contains(2) && player2.contains(3)) {
            winner = 2
        }
        //row2
        if (player1.contains(4) && player1.contains(5) && player1.contains(6)) {
            winner = 1
        }
        if (player2.contains(4) && player2.contains(5) && player2.contains(6)) {
            winner = 2
        }
        //row3
        if (player1.contains(7) && player1.contains(8) && player1.contains(9)) {
            winner = 1
        }
        if (player2.contains(7) && player2.contains(8) && player2.contains(9)) {
            winner = 2
        }
        //col1
        if (player1.contains(1) && player1.contains(4) && player1.contains(7)) {
            winner = 1
        }
        if (player2.contains(1) && player2.contains(4) && player2.contains(7)) {
            winner = 2
        }
        //col2
        if (player1.contains(2) && player1.contains(5) && player1.contains(8)) {
            winner = 1
        }
        if (player2.contains(2) && player2.contains(5) && player2.contains(8)) {
            winner = 2
        }
        //col3
        if (player1.contains(3) && player1.contains(6) && player1.contains(9)) {
            winner = 1
        }
        if (player2.contains(3) && player2.contains(6) && player2.contains(9)) {
            winner = 2
        }
        //diag1
        if (player1.contains(1) && player1.contains(5) && player1.contains(9)) {
            winner = 1
        }
        if (player2.contains(1) && player2.contains(5) && player2.contains(9)) {
            winner = 2
        }
        //diag2
        if (player1.contains(3) && player1.contains(5) && player1.contains(7)) {
            winner = 1
        }
        if (player2.contains(3) && player2.contains(5) && player2.contains(7)) {
            winner = 2
        }//dig2 finishes here
        if(winner!=0){
            if(winner==1){

                Toast.makeText(this,"Winner is "+nameP1.text,Toast.LENGTH_LONG).show()
                ptsP1=ptsP1+1

                tvPtsP1.text=ptsP1.toString()
            }
            if(winner==2){

                Toast.makeText(this,"Winner is " +nameP2.text,Toast.LENGTH_LONG).show()
                ptsP2=ptsP2+1


                tvPtsP2.text=ptsP2.toString()
            }
        }
    }
    fun buResGame(view: View){
        bu1.text = ""
        bu1.setBackgroundColor(Color.GREEN)
        bu2.text = ""
        bu2.setBackgroundColor(Color.GREEN)
        bu3.text = ""
        bu3.setBackgroundColor(Color.GREEN)
        bu4.text = ""
        bu4.setBackgroundColor(Color.GREEN)
        bu5.text = ""
        bu5.setBackgroundColor(Color.GREEN)
        bu6.text = ""
        bu6.setBackgroundColor(Color.GREEN)
        bu7.text = ""
        bu7.setBackgroundColor(Color.GREEN)
        bu8.text = ""
        bu8.setBackgroundColor(Color.GREEN)
        bu9.text = ""
        bu9.setBackgroundColor(Color.GREEN)
        player1.removeAll(player1)
        player2.removeAll(player2)

    }
    fun buResetPts(view: View){
         tvPtsP1.text=0.toString()
        tvPtsP2.text=0.toString()
        ptsP1=0
        ptsP2=0


    }



    }