package pl.zabrze.zs10.flagi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int licznik;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textViewPolecenie);
    }

    public void zlaOdpwiedz(View view) 
    {
        Toast.makeText(this, R.string.zla, Toast.LENGTH_SHORT).show();
    }

    public void dobraOdpowiedz(View view)
    {
        Toast.makeText(this, R.string.dobra, Toast.LENGTH_SHORT).show();
        licznik++;
        view.setVisibility(View.INVISIBLE);
        if (licznik==4)
        {
            textView.setText(R.string.podsumowanie);
        }
    }
}