package com.example.mohsiul.custom_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   EditText_1 editText1,editText2;
   Button mergeButton;
   TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mergeButton=findViewById(R.id.MergeButton);
        editText1=findViewById(R.id.custom_edit_Text1);
        editText2=findViewById(R.id.custom_edit_Text2);
        textView1=findViewById(R.id.text1);

        mergeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                textView1.setText("Full Name:"+editText1.getText()+" "+editText2.getText());

            }
        });

    }
}
