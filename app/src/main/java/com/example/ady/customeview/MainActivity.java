package com.example.ady.customeview;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.ady.customeview.customeView.CustomeCircle;
import com.example.ady.customeview.customeView.CustomeRectagle;
import com.example.ady.customeview.customeView.MyLinearLayout;

public class MainActivity extends AppCompatActivity {


    private CustomeCircle customeCircle;
    private CustomeRectagle customeRectagle;
    private MyLinearLayout myLinearLayout;
    private MyLinearLayout myLinearLayout1;
    private LayoutInflater layoutInflater;
    private TextView textchild1;
    private TextView textchild2;
    private TextView textchild3;
    private TextView textchild4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        myLinearLayout1 = (MyLinearLayout) findViewById(R.id.myLinearLayout);
        layoutInflater = getLayoutInflater();

        View child1 = layoutInflater.inflate(R.layout.linear_children, null, false);
        textchild1 = child1.findViewById(R.id.textChild1);
        textchild1.setText("ady");
        myLinearLayout1.addView(child1);

        View child2 = layoutInflater.inflate(R.layout.linear_children, null, false);
        textchild2 = child2.findViewById(R.id.textChild2);
        textchild2.setText("keon");
        myLinearLayout1.addView(child2);

        View child3 = layoutInflater.inflate(R.layout.linear_children, null, false);
        textchild3 = child3.findViewById(R.id.textChild3);
        textchild3.setText("mady");
        myLinearLayout1.addView(child3);

        View child4 = layoutInflater.inflate(R.layout.linear_children, null, false);
        textchild4 = child4.findViewById(R.id.textChild4);
        textchild4.setText("kathy");
        myLinearLayout1.addView(child4);



      //  customeCircle = findViewById(R.id.mycustomeCircle);
      //  customeRectagle = findViewById(R.id.mycustomeRectangle);

       //myLinearLayout = findViewById(R.id.myLinearLayout);
        //LayoutInflater layoutInflater = getLayoutInflater();
        //View myLinearLayout = layoutInflater.inflate(R.layout.linear_children,null,false);
       // TextView textviewChild = myLinearLayout.findViewById(R.id.textChild);
        //textviewChild.setText("worked");


        //LayoutInflater inflater = getLayoutInflater();
        //View view = inflater.inflate(R.layout.activity_main, null);
        //LinearLayout ll = (LinearLayout) view
         //       .findViewById(R.id.myLinearLayout);


        //ll.addView(new MyLinearLayout(getApplicationContext()));
    }



    @RequiresApi(api = Build.VERSION_CODES.M)
    public void changeColor(View view) {
        int changedColor = getColor(R.color.colorPrimary);
        customeCircle.setFillColor(changedColor);
       // int background = getColor(android.R.color.holo_blue_dark);
       // customeCircle.setBackgroundColor(background);
    }

    public void changeRadius(View view) {
        int newradius = 35;
        customeCircle.setRadius(newradius);
    }

    public void ChangeText(View view) {
        EditText editText = findViewById(R.id.etchild1);
        String newText = editText.getText().toString();
        textchild1.setText(newText);

    }

    public void ChangeText4(View view) {

        EditText editText = findViewById(R.id.etchild4);
        String newText = editText.getText().toString();
        textchild4.setText(newText);
    }

    public void ChangeText3(View view) {
        EditText editText = findViewById(R.id.etchild3);
        String newText = editText.getText().toString();
        textchild3.setText(newText);
    }

    public void ChangeText2(View view) {
        EditText editText = findViewById(R.id.etchild2);
        String newText = editText.getText().toString();
        textchild2.setText(newText);


    }
}
