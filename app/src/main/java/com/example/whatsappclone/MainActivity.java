package com.example.whatsappclone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    RatingBar r1;
    TextView tv1;

    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=(TextView)findViewById(R.id.textView1);
        r1=(RatingBar)findViewById(R.id.RB1);
        b1=(Button)findViewById(R.id.btnCalls);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int no=r1.getNumStars();
                float getrating=r1.getRating();
                tv1.setText(getrating+"/"+no);
            }
        });

    }
}