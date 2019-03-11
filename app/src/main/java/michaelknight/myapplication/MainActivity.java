package michaelknight.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    TextView txtText = findViewById(R.id.txtText);
    TextView txtServerText = findViewById(R.id.txtServerText);
    TextView txtServerAnswer = findViewById(R.id.txtServerAnswer);
    EditText edtxtMatNum = findViewById(R.id.edtxtMatNum);
    Button btnSend = findViewById(R.id.btnSend);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
