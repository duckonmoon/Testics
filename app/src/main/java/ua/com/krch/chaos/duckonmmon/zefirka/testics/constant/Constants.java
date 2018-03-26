package ua.com.krch.chaos.duckonmmon.zefirka.testics.constant;


import java.util.Arrays;
import java.util.List;

import ua.com.krch.chaos.duckonmmon.zefirka.testics.R;
import ua.com.krch.chaos.duckonmmon.zefirka.testics.entity.Test;

public interface Constants {
    String PREFERENCES = "preferences";
    String TEST = "test";

    List<Test> tests = Arrays.asList(
            new Test(R.string.python, R.drawable.python, 10, "PYTHON"),
            new Test(R.string.java, R.drawable.java, 20, "JAVA")
    );
}
