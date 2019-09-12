package matc89.exercicio2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static matc89.exercicio2.R.id.editText;

public class MainActivity extends AppCompatActivity {
    Button btnTrocar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnTrocar = (Button) findViewById(R.id.btnTrocar);
        TextView textView = (TextView) findViewById(R.id.textView);
        //EditText editText = (EditText) findViewById(R.id.editText);

        Intent intent2 = getIntent();
        if (intent2 != null ){
            Bundle params = intent2.getExtras();
            if (params != null) {
                String editText = params.getString("nome");
                if (editText.isEmpty()) {
                    textView.setText("Oi!");
                } else {
                    textView.setText("Oi, " + editText + "!");
                }
            }
        }


        /*btnTrocar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Main3Activity();
            }
        });

    }
        public void Main3Activity(){

            Intent intent = new Intent(this,OutraActivity.class);
            startActivity(intent);

        }*/
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("nome", String.valueOf(editText));
    }

    public void chamaTela(View view) {
        Intent intent = new Intent(this,OutraActivity.class);
        startActivity(intent);

    }
}


