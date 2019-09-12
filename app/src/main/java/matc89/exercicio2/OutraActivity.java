package matc89.exercicio2;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
public class OutraActivity extends AppCompatActivity {
    Button btnConfirmar;
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        Button btnTrocar = (Button) findViewById(R.id.btnTrocar);

        Button btnConfirmar = (Button) findViewById(R.id.btnConfirmar);
        Button btnCancelar = (Button) findViewById(R.id.btnCancelar);


    }

    public void chamaTela1(View view) {

        EditText editText = (EditText) findViewById(R.id.editText);
        Intent intent2 = new Intent(this, MainActivity.class);
        Bundle params = new Bundle();
        params.putString("nome", editText.getText().toString());
        intent2.putExtras(params);

        startActivity(intent2);

    }

    public void cancela(View view) {
        Intent intent3 = new Intent(this, MainActivity.class);
        startActivity(intent3);
    }
}
