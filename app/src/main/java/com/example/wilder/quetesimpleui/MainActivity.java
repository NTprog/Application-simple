package com.example.wilder.quetesimpleui;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button   mButton;
    EditText mEdit;
    EditText mEdit2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = (Button) findViewById(R.id.button);
        mEdit   = (EditText) findViewById(R.id.editText);
        mEdit2   = (EditText) findViewById(R.id.editText2);


        mButton.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {

                        String afficher = mEdit.getText().toString();
                        String afficher2 = mEdit2.getText().toString();
                        if(afficher.isEmpty() || afficher2.isEmpty()){
                            Toast.makeText(MainActivity.this, "Veuillez remplire tous les champs", Toast.LENGTH_SHORT).show();
                        }else{

                            Toast.makeText(MainActivity.this, "Bienvenu" + " " + afficher + " " + afficher2, Toast.LENGTH_SHORT).show();
                        }

                    }
                });

        CheckBox mCheck = findViewById(R.id.checkBox);
        mCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean ischecked) {
                if(ischecked){

                    mEdit.setEnabled(true);
                    mEdit2.setEnabled(true);
                    mButton.setEnabled(true);
                }else{
                    mEdit.setEnabled(false);
                    mEdit2.setEnabled(false);
                    mButton.setEnabled(false);
                }
            }
        });

    }


}
