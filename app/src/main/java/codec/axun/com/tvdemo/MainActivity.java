package codec.axun.com.tvdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import codec.axun.com.tvdemo.widget.MetroViewBorderImpl;

public class MainActivity extends Activity{

    private RelativeLayout mRlFirst;
    private RelativeLayout mRlSecond;
    private ConstraintLayout mClParent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        initView();

        FrameLayout roundedFrameLayout = new FrameLayout(this);
        roundedFrameLayout.setClipChildren(false);

        final MetroViewBorderImpl metroViewBorderImpl = new MetroViewBorderImpl(roundedFrameLayout);
        metroViewBorderImpl.setBackgroundResource(R.drawable.border_color);

        ViewGroup list = (ViewGroup) findViewById(R.id.list);
        metroViewBorderImpl.attachTo(list);
    }

//    private void initView() {
//
//        mClParent = (ConstraintLayout) findViewById(R.id.cl_parent);
//        for (int i=0;i<mClParent.getChildCount();i++){
//            mClParent.getChildAt(i).setFocusable(true);
//            mClParent.getChildAt(0).requestFocus();
//            mClParent.getChildAt(i).setOnFocusChangeListener(this);
//        }
//
//    }
//
//    @Override
//    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        switch (event.getKeyCode()) {
//            case KeyEvent.KEYCODE_DPAD_DOWN:
//                mClParent.getChildAt(0).setNextFocusDownId(R.id.rl_second);
////                mRlSecond.requestFocus();
//                break;
//            case KeyEvent.KEYCODE_DPAD_UP:
//                mClParent.getChildAt(1).setNextFocusUpId(R.id.rl_first);
//                break;
//        }
//        return super.onKeyDown(keyCode, event);
//
//    }
//
//    @Override
//    public void onFocusChange(View v, boolean hasFocus) {
//
//        for (int i=0;i<mClParent.getChildCount();i++){
//            scaleSmall(mClParent.getChildAt(i));
//        }
//        if (hasFocus){
//            scaleBig(v);
//       }
//    }
//
//    private void scaleBig(View view) {
//        ObjectAnimator animator1 = ObjectAnimator.ofFloat(view, "scaleX", 1f, 1.1f);
//        ObjectAnimator animator2 = ObjectAnimator.ofFloat(view, "scaleY", 1f, 1.1f);
//        AnimatorSet set = new AnimatorSet();
//        set.playTogether(animator1, animator2);
//        set.setDuration(0);
//        if (!set.isRunning()) {
//            set.start();
//        }
//
//    }
//
//    private void scaleSmall(View view) {
//        ObjectAnimator animator1 = ObjectAnimator.ofFloat(view, "scaleX", 1.1f, 1f);
//        ObjectAnimator animator2 = ObjectAnimator.ofFloat(view, "scaleY", 1.1f, 1f);
//        AnimatorSet set = new AnimatorSet();
//        set.playTogether(animator1, animator2);
//        set.setDuration(0);
//        if (!set.isRunning()) {
//            set.start();
//        }
//    }
}
