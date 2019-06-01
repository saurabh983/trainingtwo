package woogly.parking.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView ayush;
    TextView ayushd;
    TextView ayushdubey;
    EditText addnumber;
    EditText addnumber2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ayush = findViewById(R.id.editext_number1);
        ayushd = findViewById(R.id.editext_number2);
        ayushdubey = findViewById(R.id.ayushdubey);
        addnumber = findViewById(R.id.addnumber);
        addnumber2=findViewById(R.id.addnumber2);

        ayush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"hell new programmer",Toast.LENGTH_SHORT).show();
                ayush.setText("hello k");
            }
        });

       ayushd.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(MainActivity.this, "hello new programmer hi", Toast.LENGTH_LONG).show();
               ayushd.setText(addnumber.getText().toString());
           }
       });
       ayushdubey.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
//               Toast.makeText(MainActivity.this, "hello there "+addnumber.getText().toString(), Toast.LENGTH_SHORT).show();
              Toast.makeText(MainActivity.this, "hello ayush" +addnumber2.getText().toString(), Toast.LENGTH_LONG).show();
           }
       });
    }

}
