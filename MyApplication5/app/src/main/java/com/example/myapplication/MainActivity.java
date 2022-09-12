package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Student> myList = new ArrayList<>();
    int currentstud = 0;
    Context c;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c = this;

        TextView studentName = findViewById(R.id.textViewname);
        TextView studentage = findViewById(R.id.textViewage);
        ImageView studentPhoto = findViewById(R.id.imageView);
        Button changeStudentBtn = findViewById(R.id.button );

        Student firstStudent = new Student("Wajed", 22, R.drawable.img_1);
        Student secStudent = new Student("Ahmed", 21, R.drawable.img_2);

        myList.add(firstStudent);
        myList.add(secStudent);



        studentName.setText(firstStudent.getStudentName());
        studentage.setText(firstStudent.getStudentage() + "");
        studentPhoto.setImageResource(firstStudent.getStudentPhoto());

        changeStudentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentstud++;
                if(currentstud == myList.size()){
                    Toast.makeText(c, "End of student list", Toast.LENGTH_SHORT).show();
                    currentstud = 0;
                }
                studentName.setText(firstStudent.getStudentName());
                studentage.setText(firstStudent.getStudentage() + "");
                studentPhoto.setImageResource(firstStudent.getStudentPhoto());
            }
        });













    }
}