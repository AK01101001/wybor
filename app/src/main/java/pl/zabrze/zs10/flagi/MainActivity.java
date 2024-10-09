package pl.zabrze.zs10.flagi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textViewPolecenie);
    }

    public void zlaOdpwiedz(View view) 
    {
        textView.setText(R.string.zla);
    }

    public void dobraOdpowiedz(View view)
    {
        textView.setText(R.string.dobra);
    }
}