package ua.com.krch.chaos.duckonmmon.zefirka.testics.constant;


import java.util.Arrays;
import java.util.List;

import ua.com.krch.chaos.duckonmmon.zefirka.testics.R;
import ua.com.krch.chaos.duckonmmon.zefirka.testics.entity.ConstantQuestion;
import ua.com.krch.chaos.duckonmmon.zefirka.testics.entity.Test;

public interface Constants {
    String PREFERENCES = "preferences";
    String TEST = "test";

    List<Test> tests = Arrays.asList(
            new Test(R.string.python, R.drawable.python, 10, "PYTHON",
                    Arrays.asList(
                            new ConstantQuestion(null,R.string.python_question1,R.string.python_correct1,R.array.python_answers1),
                            new ConstantQuestion(null,R.string.python_question2,R.string.python_correct2,R.array.python_answers2),
                            new ConstantQuestion(null,R.string.python_question3,R.string.python_correct3,R.array.python_answers3),
                            new ConstantQuestion(null,R.string.python_question4,R.string.python_correct4,R.array.python_answers4),
                            new ConstantQuestion(null,R.string.python_question5,R.string.python_correct5,R.array.python_answers5),
                            new ConstantQuestion(null,R.string.python_question6,R.string.python_correct6,R.array.python_answers6),
                            new ConstantQuestion(null,R.string.python_question7,R.string.python_correct7,R.array.python_answers7),
                            new ConstantQuestion(null,R.string.python_question8,R.string.python_correct8,R.array.python_answers8),
                            new ConstantQuestion(null,R.string.python_question9,R.string.python_correct9,R.array.python_answers9),
                            new ConstantQuestion(null,R.string.python_question10,R.string.python_correct10,R.array.python_answers10)
                    ),null),
            new Test(R.string.java, R.drawable.java, 20, "JAVA",null,null),
            new Test(R.string.capitals, R.drawable.capitals, 20, "CAPITAL",null,null),
            new Test(R.string.monuments, R.drawable.monuments, 10, "MONUMENTS",
                    Arrays.asList(
                            new ConstantQuestion(R.drawable.branderburg,R.string.monuments_question1,R.string.monuments_correct1,R.array.monuments_answers1),
                            new ConstantQuestion(R.drawable.cicago,R.string.monuments_question2,R.string.monuments_correct2,R.array.monuments_answers2),
                            new ConstantQuestion(R.drawable.coloseum,R.string.monuments_question3,R.string.monuments_correct3,R.array.monuments_answers3),
                            new ConstantQuestion(R.drawable.eiffel_tower,R.string.monuments_question4,R.string.monuments_correct4,R.array.monuments_answers4),
                            new ConstantQuestion(R.drawable.liberti,R.string.monuments_question5,R.string.monuments_correct5,R.array.monuments_answers5),
                            new ConstantQuestion(R.drawable.lviv_opera,R.string.monuments_question6,R.string.monuments_correct6,R.array.monuments_answers6),
                            new ConstantQuestion(R.drawable.piramidu,R.string.monuments_question7,R.string.monuments_correct7,R.array.monuments_answers7),
                            new ConstantQuestion(R.drawable.tadj_mahal,R.string.monuments_question8,R.string.monuments_correct8,R.array.monuments_answers8),
                            new ConstantQuestion(R.drawable.vachington,R.string.monuments_question9,R.string.monuments_correct9,R.array.monuments_answers9),
                            new ConstantQuestion(R.drawable.venice,R.string.monuments_question10,R.string.monuments_correct10,R.array.monuments_answers10)

                    )
                    ,null)
    );
    int res020=R.drawable.res20_0;
    int res2040=R.drawable.res40_20;
    int res4060=R.drawable.res60_40;
    int res6080=R.drawable.res80_60;
    int res80100=R.drawable.res100_80;
}
