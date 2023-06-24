package com.example.intenetproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        EditText Name ;
        EditText phoneNumber ;
        Button button ;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        phoneNumber =(EditText) findViewById(R.id.textView);
        Name=(EditText) findViewById(R.id.textView1);
        button=findViewById(R.id.add_contact_button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ContactsContract.Intents.Insert.ACTION);
                intent.setType(ContactsContract.RawContacts.CONTENT_TYPE);
                intent.putExtra(ContactsContract.Intents.Insert.PHONE, phoneNumber.getText());
                intent.putExtra(ContactsContract.Intents.Insert.NAME, Name.getText());
                startActivity(intent);
            }
        });
    }
}