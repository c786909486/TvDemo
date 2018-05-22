package codec.axun.com.tvdemo;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends Activity implements View.OnFocusChangeListener{

    private RelativeLayout mRlFirst;
    private RelativeLayout mRlSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mRlFirst = (RelativeLayout) findViewById(R.id.rl_first);
        mRlSecond = (RelativeLayout) findViewById(R.id.rl_second);
        mRlFirst.setFocusable(true);
        mRlFirst.setOnFocusChangeListener(this);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (event.getKeyCode()){
            case KeyEvent.KEYCODE_DPAD_DOWN:
                mRlSecond.requestFocus();
                break;
        }
        return super.onKeyDown(keyCode, event);

    }

    @Override
    public void onFocusChange(View v, boolean hasFocus) {
        switch (v.getId()){
            case R.id.rl_first:
                if (hasFocus){
                    scaleBig(mRlFirst);
                }else {
                    scaleSmall(mRlFirst);
                }
                break;
            case R.id.rl_second:
                if (hasFocus){
                    scaleBig(mRlSecond);
                }else {
                    scaleSmall(mRlSecond);
                }
                break;
        }
    }

    private void scaleBig(View view){
        ObjectAnimator animator1 = ObjectAnimator.ofFloat(view,"scaleX",1f,1.1f);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(view,"scaleY",1f,1.1f);
        AnimatorSet set = new AnimatorSet();
        set.playTogether(animator1,animator2);
        set.setDuration(50);
        set.start();

    }

    private void scaleSmall(View view){
        ObjectAnimator animator1 = ObjectAnimator.ofFloat(view,"scaleX",1.1f,1f);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(view,"scaleY",1.1f,1f);
        AnimatorSet set = new AnimatorSet();
        set.playTogether(animator1,animator2);
        set.setDuration(300);
        set.start();
    }
}
