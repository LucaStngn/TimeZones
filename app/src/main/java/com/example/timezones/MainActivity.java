/**
 * Copyright 2019 Luca Steingen
 */

package com.example.timezones;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    private TextView txtCity1, txtCity2, txtCity3, txtCity4, txtCity5;                  // Declare the TextView variables.
    private ImageView imgIcon1, imgIcon2, imgIcon3, imgIcon4, imgIcon5;                 // Declare the ImageView variables.
    private TextClock txtClk1, txtClk2, txtClk3, txtClk4, txtClk5;                      // Declare the TextClock variables.
    private Button btn12, btn24;                                                        // Declare the Button variables.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);                                             // Standard code to initialize the Main View.
        setContentView(R.layout.activity_main);                                         // Standard code to initialize the Main View.

        ConstraintLayout clk1 = findViewById(R.id.clock1);                              // Create the 1. Clock Object called "clk1".
        ConstraintLayout clk2 = findViewById(R.id.clock2);                              // Create the 2. Clock Object called "clk2".
        ConstraintLayout clk3 = findViewById(R.id.clock3);                              // Create the 3. Clock Object called "clk3".
        ConstraintLayout clk4 = findViewById(R.id.clock4);                              // Create the 3. Clock Object called "clk4".
        ConstraintLayout clk5 = findViewById(R.id.clock5);                              // Create the 5. Clock Object called "clk5".

        txtCity1 = clk1.findViewById(R.id.txtCity);                                     // Link UI-Element (via it's ID "txtCity") in clk1 to the Java variable "txtCity1".
        txtCity2 = clk2.findViewById(R.id.txtCity);                                     // Link UI-Element (via it's ID "txtCity") in clk2 to the Java variable "txtCity2".
        txtCity3 = clk3.findViewById(R.id.txtCity);                                     // Link UI-Element (via it's ID "txtCity") in clk3 to the Java variable "txtCity3".
        txtCity4 = clk4.findViewById(R.id.txtCity);                                     // Link UI-Element (via it's ID "txtCity") in clk4 to the Java variable "txtCity4".
        txtCity5 = clk5.findViewById(R.id.txtCity);                                     // Link UI-Element (via it's ID "txtCity") in clk5 to the Java variable "txtCity5".
        imgIcon1 = clk1.findViewById(R.id.imgIcon);                                     // Link UI-Element (via it's ID "imgIcon") in clk1 to the Java variable "imgIcon1".
        imgIcon2 = clk2.findViewById(R.id.imgIcon);                                     // Link UI-Element (via it's ID "imgIcon") in clk2 to the Java variable "imgIcon2".
        imgIcon3 = clk3.findViewById(R.id.imgIcon);                                     // Link UI-Element (via it's ID "imgIcon") in clk3 to the Java variable "imgIcon3".
        imgIcon4 = clk4.findViewById(R.id.imgIcon);                                     // Link UI-Element (via it's ID "imgIcon") in clk4 to the Java variable "imgIcon4".
        imgIcon5 = clk5.findViewById(R.id.imgIcon);                                     // Link UI-Element (via it's ID "imgIcon") in clk5 to the Java variable "imgIcon5".
        txtClk1 = clk1.findViewById(R.id.txtClock);                                     // Link UI-Element (via it's ID "txtClock") in clk1 to the Java variable "txtClk1".
        txtClk2 = clk2.findViewById(R.id.txtClock);                                     // Link UI-Element (via it's ID "txtClock") in clk2 to the Java variable "txtClk2".
        txtClk3 = clk3.findViewById(R.id.txtClock);                                     // Link UI-Element (via it's ID "txtClock") in clk3 to the Java variable "txtClk3".
        txtClk4 = clk4.findViewById(R.id.txtClock);                                     // Link UI-Element (via it's ID "txtClock") in clk4 to the Java variable "txtClk4".
        txtClk5 = clk5.findViewById(R.id.txtClock);                                     // Link UI-Element (via it's ID "txtClock") in clk5 to the Java variable "txtClk5".
        btn12 = findViewById(R.id.btn12);                                               // Link UI-Element (via it's ID "btn12") to the Java variable "btn12".
        btn24 = findViewById(R.id.btn24);                                               // Link UI-Element (via it's ID "btn24") to the Java variable "btn24".

        txtCity1.setText(R.string.FRA);                                                 // Reference the string 'FRA' from string.xml to the Java variable "txtCity1".
        txtCity2.setText(R.string.NYC);                                                 // Reference the string 'NYC' from string.xml to the Java variable "txtCity2".
        txtCity3.setText(R.string.LAX);                                                 // Reference the string 'FRA' from string.xml to the Java variable "txtCity3".
        txtCity4.setText(R.string.HAW);                                                 // Reference the string 'FRA' from string.xml to the Java variable "txtCity4".
        txtCity5.setText(R.string.SYD);                                                 // Reference the string 'FRA' from string.xml to the Java variable "txtCity5".
        imgIcon1.setImageResource(R.drawable.frankfurt);                                // Reference the image 'frankfurt.png' from the res folder to the Java variable "imgIcon1".
        imgIcon2.setImageResource(R.drawable.newyork);                                  // Reference the image 'newyork.png' from the res folder to the Java variable "imgIcon2".
        imgIcon3.setImageResource(R.drawable.losangeles);                               // Reference the image 'losangeles.png' from the res folder to the Java variable "imgIcon3".
        imgIcon4.setImageResource(R.drawable.hawaii);                                   // Reference the image 'hawaii.png' from the res folder to the Java variable "imgIcon4".
        imgIcon5.setImageResource(R.drawable.sydney);                                   // Reference the image 'sydney.png' from the res folder to the Java variable "imgIcon5".
        txtClk1.setTimeZone("GMT+02:00");                                               // Set the "txtClk1"'s timezone to Frankfurt time.
        txtClk2.setTimeZone("GMT-04:00");                                               // Set the "txtClk2"'s timezone to New York time.
        txtClk3.setTimeZone("GMT-07:00");                                               // Set the "txtClk3"'s timezone to Los Angeles time.
        txtClk4.setTimeZone("GMT-10:00");                                               // Set the "txtClk4"'s timezone to Hawaii time.
        txtClk5.setTimeZone("GMT+10:00");                                               // Set the "txtClk5"'s timezone to Sydney time.

        btn12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                ToggleFormat("hh:mm:ss a");                                          // Set time format to 12h.
            }
        });

        btn24.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                // Set Format to 24h
                ToggleFormat("HH:mm:ss");                                            // Set time format to 24h.
            }
        });
    }

    public void ToggleFormat(String f) {
        /**
         * @param f of the type String expects a DateFormat.
         * This method changes how the system time is displayed for all the TextClock objects.
         * For convenience, it just changes to format of 12h and 24h format,
         * so it doesn't matter which setting the user has currently activated.
         */
        txtClk1.setFormat12Hour(f);
        txtClk2.setFormat12Hour(f);
        txtClk3.setFormat12Hour(f);
        txtClk4.setFormat12Hour(f);
        txtClk5.setFormat12Hour(f);
        txtClk1.setFormat24Hour(f);
        txtClk2.setFormat24Hour(f);
        txtClk3.setFormat24Hour(f);
        txtClk4.setFormat24Hour(f);
        txtClk5.setFormat24Hour(f);
    }
}