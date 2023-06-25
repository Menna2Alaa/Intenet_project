package com.example.intenetproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    EditText name ;
    EditText phoneNumber ;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        phoneNumber =(EditText) findViewById(R.id.textView);
        name=(EditText) findViewById(R.id.textView1);
        button=findViewById(R.id.btn2);

        onClicks();
    }
    public void onClicks() {
        button.setOnClickListener(view -> {
            Intent intent = new Intent(ContactsContract.Intents.Insert.ACTION);
            intent.setType(ContactsContract.RawContacts.CONTENT_TYPE);
            intent.putExtra(ContactsContract.Intents.Insert.PHONE, phoneNumber.getText());
            intent.putExtra(ContactsContract.Intents.Insert.NAME, name.getText());
            startActivity(intent);

            Toast.makeText(this, "great", Toast.LENGTH_SHORT).show();
        });
    }
}