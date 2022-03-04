package com.example.andrewsflashcardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView flashcard_question = findViewById(R.id.flashcard_question);
        TextView flashcard_answer = findViewById(R.id.flashcard_answer);

        flashcard_question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flashcard_answer.setVisibility(View.VISIBLE);
                flashcard_question.setVisibility(View.INVISIBLE);
            }
        });

        flashcard_answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flashcard_answer.setVisibility(View.INVISIBLE);
                flashcard_question.setVisibility(View.VISIBLE);
            }
        });
    }

}
