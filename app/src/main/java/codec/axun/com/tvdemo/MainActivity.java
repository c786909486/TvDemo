package codec.axun.com.tvdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import org.evilbinary.tv.widget.BorderView;

public class MainActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BorderView border=new BorderView(this);
        border.setBackgroundResource(R.drawable.border_color);

        RelativeLayout main= (RelativeLayout) findViewById(R.id.list);
        border.attachTo(main);
        for (int i =0;i<main.getChildCount();i++){

            main.getChildAt(i).setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        v.requestFocus();
        Intent intent = new Intent(MainActivity.this, RecyclerActivity.class);
        startActivity(intent);
    }


}
