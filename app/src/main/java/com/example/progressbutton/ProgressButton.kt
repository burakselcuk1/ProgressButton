package com.example.progressbutton

import android.content.Context
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ProgressBar
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import java.security.AccessControlContext

class ProgressButton(context: Context, view: View) {

    var layout = view.findViewById<ConstraintLayout>(R.id.constraintLayout)
    var text = view.findViewById<TextView>(R.id.textView)
    var progressButton = view.findViewById<ProgressBar>(R.id.progressBar)
    var cardView = view.findViewById<CardView>(R.id.cardView)
    var fade_in:Animation = AnimationUtils.loadAnimation(context,R.anim.fade_in)

    fun ActiveButton(){
        progressButton.animation = fade_in
        text.animation = fade_in
        progressButton.visibility = View.VISIBLE
        text.text ="Please Wait..."
    }

    fun finishButton(){
        progressButton.visibility = View.GONE
        text.text ="Done"
        layout.setBackgroundColor(cardView.resources.getColor(R.color.teal_700))
    }

}