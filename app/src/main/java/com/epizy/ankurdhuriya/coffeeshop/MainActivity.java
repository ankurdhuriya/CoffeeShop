package com.epizy.ankurdhuriya.coffeeshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    EditText txtCustomerName, txtQuantity;
    Button submit;
    RadioButton capacity250, capacity500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtCustomerName = (EditText)findViewById(R.id.edit_text_1);
        txtQuantity = (EditText)findViewById(R.id.edit_text_2);
        capacity250 = (RadioButton)findViewById(R.id.radio1);
        capacity500 = (RadioButton)findViewById(R.id.radio2);

        submit = (Button)findViewById(R.id.submit_btn);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = String.valueOf(txtCustomerName.getText());
                int quantity = Integer.parseInt( txtQuantity.getText().toString());
                int totalPrice = 0;

                if (capacity250.isChecked())
                {
                    totalPrice = 10 * quantity;
                }
                else
                {
                    totalPrice = 15 * quantity;
                }

                String message = "Name : " + name + "\n" + "Quantity : " + quantity + "\n" + "Total Cost: " + totalPrice + "\n";

                Intent obj = new Intent(getApplicationContext(), Result.class);
                obj.putExtra("com.epizy.ankurdhuriya.coffeeshop.SOMETHING", message);
                startActivity(obj);

            }
        });

    }

}
