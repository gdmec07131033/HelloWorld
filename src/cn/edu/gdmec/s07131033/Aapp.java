package cn.edu.gdmec.s07131033;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Aapp extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aapp);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.aapp, menu);
        return true;
    }
    
}
