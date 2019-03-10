package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStory;
    Button mButtonTop;
    Button mButtonBot;
    Button mButtonReset;
    int mStoryIndex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStory = (TextView) findViewById(R.id.storyTextView);
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBot = (Button) findViewById(R.id.buttonBottom);
        mButtonReset = (Button) findViewById(R.id.buttonReset);
        mButtonReset.setVisibility(View.GONE);
        mStoryIndex = 1;


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mStoryIndex == 1 ) {

                    mStory.setText(R.string.T3_Story);
                    mButtonTop.setText(R.string.T3_Ans1);
                    mButtonBot.setText(R.string.T3_Ans2);
                    mStoryIndex = mStoryIndex + 1;

                } else if (mStoryIndex == 3 ){

                    mStory.setText(R.string.T3_Story);
                    mButtonTop.setText(R.string.T3_Ans1);
                    mButtonBot.setText(R.string.T3_Ans2);
                    mStoryIndex = mStoryIndex + 5;

                } else {

                    mStory.setText(R.string.T6_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBot.setVisibility(View.GONE);
                    mButtonReset.setVisibility(View.VISIBLE);

                }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mStoryIndex == 1 ) {

                    mStory.setText(R.string.T2_Story);
                    mButtonTop.setText(R.string.T2_Ans1);
                    mButtonBot.setText(R.string.T2_Ans2);
                    mStoryIndex = mStoryIndex + 2;

                } else if (mStoryIndex == 3 ){
                    mStory.setText(R.string.T4_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBot.setVisibility(View.GONE);
                    mButtonReset.setVisibility(View.VISIBLE);

                } else {

                    mStory.setText(R.string.T5_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBot.setVisibility(View.GONE);
                    mButtonReset.setVisibility(View.VISIBLE);

                }
            }
        });

        mButtonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mStoryIndex = 1;
                mButtonReset.setVisibility(View.GONE);
                mButtonTop.setVisibility(View.VISIBLE);
                mButtonBot.setVisibility(View.VISIBLE);
                mStory.setText(R.string.T1_Story);
                mButtonTop.setText(R.string.T1_Ans1);
                mButtonBot.setText(R.string.T1_Ans2);

            }
        });

    }
}
