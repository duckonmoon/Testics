package ua.com.krch.chaos.duckonmmon.zefirka.testics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import ua.com.krch.chaos.duckonmmon.zefirka.testics.constant.Constants;
import ua.com.krch.chaos.duckonmmon.zefirka.testics.entity.Test;

public class TestActivity extends AppCompatActivity {

    @BindView(R.id.smth)
    TextView textView;

    private Test test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        ButterKnife.bind(this);

        test = (Test) getIntent().getSerializableExtra(Constants.TEST);

        textView.setText(test.getName());
    }
}
