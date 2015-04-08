package id.creatorb.customtoggle;

import android.app.Activity;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ToggleButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class MainActivity extends Activity{

	ToggleButton togglebe;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		togglebe = (ToggleButton)findViewById(R.id.toggleButton1);
		/*		togglebe.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			 
            @Override
            public void onCheckedChanged(CompoundButton arg0, boolean isChecked) {
                text.setText("Status: " + isChecked);
            }
        });*/
		//ini buat ngatur ukuran gambar nya @drawable
		StateListDrawable star = (StateListDrawable) togglebe.getBackground();
	    star.setLevel(5000);
	}
}
