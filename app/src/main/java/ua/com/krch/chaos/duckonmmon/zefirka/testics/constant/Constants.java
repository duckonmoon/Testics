package ua.com.krch.chaos.duckonmmon.zefirka.testics.constant;


import java.util.Arrays;
import java.util.List;

import ua.com.krch.chaos.duckonmmon.zefirka.testics.R;
import ua.com.krch.chaos.duckonmmon.zefirka.testics.entity.Test;

public interface Constants {
    String PREFERENCES = "preferences";
    String TEST = "test";

    List<Test> tests = Arrays.asList(
            new Test(R.string.python, R.drawable.python, 40, "PYTHON"),
            new Test(R.string.java, R.drawable.java, 20, "JAVA"),
            new Test(R.string.capitals, R.drawable.capitals, 20, "CAPITAL")
    );
    int res020=R.drawable.res20_0;
    int res2040=R.drawable.res40_20;
    int res4060=R.drawable.res60_40;
    int res6080=R.drawable.res80_60;
    int res80100=R.drawable.res100_80;
}
