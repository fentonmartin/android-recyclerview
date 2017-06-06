package fen.code.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        /* initiate TextView */
        TextView textView = (TextView) findViewById(R.id.detail_text);

        /* getStringExtra from intent */
        String text = getIntent().getStringExtra("extra");

        /* setText on TextView */
        textView.setText(text);
    }
}
