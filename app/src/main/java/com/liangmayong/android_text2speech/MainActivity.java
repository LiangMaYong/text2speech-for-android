package com.liangmayong.android_text2speech;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.liangmayong.text2speech.Text2Speech;

/**
 * MainActivity
 */
public class MainActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.editText);
    }

    //speech
    public void Speech(View view) {
        Text2Speech.speech(this, editText.getText().toString(), false);
    }
}
