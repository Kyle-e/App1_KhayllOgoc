package com.example.assessment2app1

import android.app.Dialog
import android.graphics.Color
import android.graphics.Typeface
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //spinner arrays
    private val dropdown1 = arrayOf("Bold", "Italic")
    private val dropdown2 = arrayOf("10", "15", "20")
    private val dropdown3 = arrayOf("Left", "Center", "Right")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn)

        btn.setOnClickListener{
            val dialogBinding = layoutInflater.inflate(R.layout.dialog, null)

            val myDialog = Dialog(this)
            myDialog.setContentView(dialogBinding)
            myDialog.setCancelable(true)
            myDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            myDialog.show()

            val yes = dialogBinding.findViewById<Button>(R.id.alertOK)
            yes.setOnClickListener {
                myDialog.dismiss()
            }
        }



        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, dropdown1)
        val adapter2 = ArrayAdapter(this, android.R.layout.simple_spinner_item, dropdown2)
        val adapter3 = ArrayAdapter(this, android.R.layout.simple_spinner_item, dropdown3)

        val button = findViewById(R.id.button) as Button

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item)
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_item)
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_item)

        spinner.adapter=adapter
        spinner.onItemSelectedListener=object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                if(spinner.selectedItemPosition==0)
                {
                    loremIpsum.setText(" " + spinner.selectedItem)
                }
                if(spinner.selectedItemPosition==1)
                {
                    loremIpsum.setText(" " + spinner.selectedItem)
                }
            }
        }

        spinner2.adapter=adapter2
        spinner2.onItemSelectedListener=object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                if(spinner.selectedItemPosition==0)
                {
                    loremIpsum.setText(" " + spinner.selectedItem)
                }
                if(spinner.selectedItemPosition==1)
                {
                    loremIpsum.setText(" " + spinner.selectedItem)
                }
                if(spinner.selectedItemPosition==2)
                {
                    loremIpsum.setText(" " + spinner.selectedItem)
                }
            }
        }

        spinner3.adapter=adapter3
        spinner3.onItemSelectedListener=object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                if(spinner.selectedItemPosition==0)
                {
                    loremIpsum.setText(" " + spinner.selectedItem)
                }
                if(spinner.selectedItemPosition==1)
                {
                    loremIpsum.setText(" " + spinner.selectedItem)
                }
                if(spinner.selectedItemPosition==2)
                {
                    loremIpsum.setText(" " + spinner.selectedItem)
                }
            }
        }

        button.setOnClickListener {

            if(spinner.selectedItemPosition==0 && spinner2.selectedItemPosition==0 && spinner3.selectedItemPosition==0) {
                loremIpsum.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.")
                loremIpsum.setTypeface(Typeface.DEFAULT_BOLD)
                loremIpsum.textSize=10F
                loremIpsum.textAlignment=View.TEXT_ALIGNMENT_TEXT_START
            }
            if(spinner.selectedItemPosition==0 && spinner2.selectedItemPosition==0 && spinner3.selectedItemPosition==1) {
                loremIpsum.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.")
                loremIpsum.setTypeface(Typeface.DEFAULT_BOLD)
                loremIpsum.textSize=10F
                loremIpsum.textAlignment=View.TEXT_ALIGNMENT_CENTER
            }
            if(spinner.selectedItemPosition==0 && spinner2.selectedItemPosition==0 && spinner3.selectedItemPosition==2) {
                loremIpsum.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.")
                loremIpsum.setTypeface(Typeface.DEFAULT_BOLD)
                loremIpsum.textSize=10F
                loremIpsum.textAlignment=View.TEXT_ALIGNMENT_TEXT_END
            }

            if(spinner.selectedItemPosition==0 && spinner2.selectedItemPosition==1 && spinner3.selectedItemPosition==0) {
                loremIpsum.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.")
                loremIpsum.setTypeface(Typeface.DEFAULT_BOLD)
                loremIpsum.textSize=15F
                loremIpsum.textAlignment=View.TEXT_ALIGNMENT_TEXT_START
            }
            if(spinner.selectedItemPosition==0 && spinner2.selectedItemPosition==1 && spinner3.selectedItemPosition==1) {
                loremIpsum.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.")
                loremIpsum.setTypeface(Typeface.DEFAULT_BOLD)
                loremIpsum.textSize=15F
                loremIpsum.textAlignment=View.TEXT_ALIGNMENT_CENTER
            }
            if(spinner.selectedItemPosition==0 && spinner2.selectedItemPosition==1 && spinner3.selectedItemPosition==2) {
                loremIpsum.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.")
                loremIpsum.setTypeface(Typeface.DEFAULT_BOLD)
                loremIpsum.textSize=15F
                loremIpsum.textAlignment=View.TEXT_ALIGNMENT_TEXT_END
            }

            if(spinner.selectedItemPosition==0 && spinner2.selectedItemPosition==2 && spinner3.selectedItemPosition==0) {
                loremIpsum.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.")
                loremIpsum.setTypeface(Typeface.DEFAULT_BOLD)
                loremIpsum.textSize=20F
                loremIpsum.textAlignment=View.TEXT_ALIGNMENT_TEXT_START
            }
            if(spinner.selectedItemPosition==0 && spinner2.selectedItemPosition==2 && spinner3.selectedItemPosition==1) {
                loremIpsum.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.")
                loremIpsum.setTypeface(Typeface.DEFAULT_BOLD)
                loremIpsum.textSize=20F
                loremIpsum.textAlignment=View.TEXT_ALIGNMENT_CENTER
            }
            if(spinner.selectedItemPosition==0 && spinner2.selectedItemPosition==2 && spinner3.selectedItemPosition==2) {
                loremIpsum.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.")
                loremIpsum.setTypeface(Typeface.DEFAULT_BOLD)
                loremIpsum.textSize=20F
                loremIpsum.textAlignment=View.TEXT_ALIGNMENT_TEXT_END
            }


            if(spinner.selectedItemPosition==1 && spinner2.selectedItemPosition==0 && spinner3.selectedItemPosition==0) {
                loremIpsum.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.")
                loremIpsum.setTypeface(null, Typeface.ITALIC)
                loremIpsum.textSize=10F
                loremIpsum.textAlignment=View.TEXT_ALIGNMENT_TEXT_START
            }
            if(spinner.selectedItemPosition==1 && spinner2.selectedItemPosition==0 && spinner3.selectedItemPosition==1) {
                loremIpsum.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.")
                loremIpsum.setTypeface(null, Typeface.ITALIC)
                loremIpsum.textSize=10F
                loremIpsum.textAlignment=View.TEXT_ALIGNMENT_CENTER
            }
            if(spinner.selectedItemPosition==1 && spinner2.selectedItemPosition==0 && spinner3.selectedItemPosition==2) {
                loremIpsum.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.")
                loremIpsum.setTypeface(null, Typeface.ITALIC)
                loremIpsum.textSize=10F
                loremIpsum.textAlignment=View.TEXT_ALIGNMENT_TEXT_END
            }

            if(spinner.selectedItemPosition==1 && spinner2.selectedItemPosition==1 && spinner3.selectedItemPosition==0) {
                loremIpsum.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.")
                loremIpsum.setTypeface(null, Typeface.ITALIC)
                loremIpsum.textSize=15F
                loremIpsum.textAlignment=View.TEXT_ALIGNMENT_TEXT_START
            }
            if(spinner.selectedItemPosition==1 && spinner2.selectedItemPosition==1 && spinner3.selectedItemPosition==1) {
                loremIpsum.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.")
                loremIpsum.setTypeface(null, Typeface.ITALIC)
                loremIpsum.textSize=15F
                loremIpsum.textAlignment=View.TEXT_ALIGNMENT_CENTER
            }
            if(spinner.selectedItemPosition==1 && spinner2.selectedItemPosition==1 && spinner3.selectedItemPosition==2) {
                loremIpsum.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.")
                loremIpsum.setTypeface(null, Typeface.ITALIC)
                loremIpsum.textSize=15F
                loremIpsum.textAlignment=View.TEXT_ALIGNMENT_TEXT_END
            }

            if(spinner.selectedItemPosition==1 && spinner2.selectedItemPosition==2 && spinner3.selectedItemPosition==0) {
                loremIpsum.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.")
                loremIpsum.setTypeface(null, Typeface.ITALIC)
                loremIpsum.textSize=20F
                loremIpsum.textAlignment=View.TEXT_ALIGNMENT_TEXT_START
            }
            if(spinner.selectedItemPosition==1 && spinner2.selectedItemPosition==2 && spinner3.selectedItemPosition==1) {
                loremIpsum.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.")
                loremIpsum.setTypeface(null, Typeface.ITALIC)
                loremIpsum.textSize=20F
                loremIpsum.textAlignment=View.TEXT_ALIGNMENT_CENTER
            }
            if(spinner.selectedItemPosition==1 && spinner2.selectedItemPosition==2 && spinner3.selectedItemPosition==2) {
                loremIpsum.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.")
                loremIpsum.setTypeface(null, Typeface.ITALIC)
                loremIpsum.textSize=20F
                loremIpsum.textAlignment=View.TEXT_ALIGNMENT_TEXT_END
            }
        }

    }
}