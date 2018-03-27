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
                    ),
                    null)
    );
}
