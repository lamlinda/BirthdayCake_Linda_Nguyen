package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener{

    private CakeView cakeV;
    private CakeModel cakeM;

    public CakeController(CakeView cake){
        cakeV = cake;
        cakeM = cakeV.getCakeModel();
    }

    @Override
    public void onClick(View v) {
        Log.d("click", "Click received");

        if(v.getId() == R.id.blowOutButton){
            cakeM.isLit = false;
            cakeV.invalidate();

        }
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(isChecked == true){
            cakeM.hasCandles = true;
        }
        else{
            cakeM.hasCandles = false;}
        cakeV.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
       cakeM.numCandles = progress;
       cakeV.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
