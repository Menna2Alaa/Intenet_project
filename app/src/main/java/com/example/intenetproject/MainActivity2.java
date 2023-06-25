package com.example.intenetproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        EditText Name ;
        EditText phoneNumber ;


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        phoneNumber =(EditText) findViewById(R.id.textView);
        Name=(EditText) findViewById(R.id.textView1);


        Intent intent = new Intent(ContactsContract.Intents.Insert.ACTION);
        intent.setType(ContactsContract.RawContacts.CONTENT_TYPE);
        intent.putExtra(ContactsContract.Intents.Insert.PHONE, phoneNumber.getText());
        intent.putExtra(ContactsContract.Intents.Insert.NAME, Name.getText());
        startActivity(intent);

        Toast.makeText(this, "great", Toast.LENGTH_SHORT).show();
    }
}