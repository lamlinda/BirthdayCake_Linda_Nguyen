package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        CakeView cakeview = findViewById(R.id.cakeview);
        CakeController cakeC = new CakeController(cakeview);


        Button blowOut = findViewById(R.id.blowOutButton);
        blowOut.setOnClickListener(cakeC);

        Switch candles = findViewById(R.id.candleSwitch);
        candles.setOnCheckedChangeListener(cakeC);

        SeekBar numCandles = findViewById(R.id.candleSeekBar);
        numCandles.setOnSeekBarChangeListener(cakeC);

    }

    public void goodbye(View button){
        Log.i("button", "Goodbye");
    }
}
