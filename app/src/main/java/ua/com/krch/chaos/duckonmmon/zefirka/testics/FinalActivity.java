package ua.com.krch.chaos.duckonmmon.zefirka.testics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;
import ua.com.krch.chaos.duckonmmon.zefirka.testics.constant.Constants;
import ua.com.krch.chaos.duckonmmon.zefirka.testics.entity.Test;

public class FinalActivity extends AppCompatActivity {


    @BindView(R.id.result)
    TextView textView;
    @BindView(R.id.finalImage)
    ImageView imageView;

    private Test test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        ButterKnife.bind(this);

        test = (Test) getIntent().getExtras().get(Constants.TEST);
        final Random random = new Random();
        int result=random.nextInt(test.getMaxMark());
        textView.setText(""+result);
        double resultImage=(double)result/(double)test.getMaxMark()*100;
        if(resultImage<21)
        {
            imageView.setImageResource(Constants.res020);
            textView.setText(""+resultImage);
        }
        else if(resultImage<41)
        {
            imageView.setImageResource(Constants.res2040);
        }else if(resultImage<61)
        {
            imageView.setImageResource(Constants.res4060);
        }else if(resultImage<81)
        {
            imageView.setImageResource(Constants.res6080);
        }else
        {
            imageView.setImageResource(Constants.res80100);
        }
    }

}