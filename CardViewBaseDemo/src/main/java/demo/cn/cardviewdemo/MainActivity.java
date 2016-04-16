package demo.cn.cardviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
    // 定义一个成员变量
    CardView mCardView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //找到CardView组件
        mCardView = (CardView) findViewById(R.id.card_view);

        SeekBar seek1 = (SeekBar) findViewById(R.id.seek1);
        SeekBar seek2 = (SeekBar) findViewById(R.id.seek2);

        seek1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                // 如果是手工拖动则进入设置
                if (b) {
                    //设置卡片的阴影
                    mCardView.setCardElevation(i);//shadow
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seek2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                // 如果是手工拖动则进入设置
                if (b) {
                    mCardView.setRadius(i);//圆角大小设置
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}

