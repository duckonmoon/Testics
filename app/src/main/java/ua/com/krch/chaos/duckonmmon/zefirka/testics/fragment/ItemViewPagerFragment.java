package ua.com.krch.chaos.duckonmmon.zefirka.testics.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import ua.com.krch.chaos.duckonmmon.zefirka.testics.R;
import ua.com.krch.chaos.duckonmmon.zefirka.testics.activity.FinalActivity;
import ua.com.krch.chaos.duckonmmon.zefirka.testics.application.App;
import ua.com.krch.chaos.duckonmmon.zefirka.testics.entity.Question;
import ua.com.krch.chaos.duckonmmon.zefirka.testics.entity.Test;
import ua.com.krch.chaos.duckonmmon.zefirka.testics.service.QuestionProviderService;

public class ItemViewPagerFragment extends Fragment {
    private static final String TEST = "test";
    private static final String POSITION = "position";

    @BindView(R.id.question_text)
    TextView questionTextView;
    @BindView(R.id.question_image)
    ImageView questionImageView;
    @BindView(R.id.progress)
    TextView progressTextView;
    @BindView(R.id.finish_button)
    Button finishButton;
    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;

    private Test test;
    private Integer position;

    private OnFragmentRadioButtonClickListener mListener;

    public ItemViewPagerFragment() {
    }

    public static ItemViewPagerFragment newInstance(Test test, Integer position) {
        ItemViewPagerFragment fragment = new ItemViewPagerFragment();
        Bundle args = new Bundle();
        args.putSerializable(TEST, test);
        args.putInt(POSITION, position);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            test = (Test) getArguments().getSerializable(TEST);
            position = getArguments().getInt(POSITION, -1);
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item_view_pager, container, false);
        ButterKnife.bind(this, view);

        Question question = QuestionProviderService.getQuestion(test.getQuestions().get(position), test.getRandomAnswers());

        questionTextView.setText(question.getQuestion());
        if (question.getImage() != null) {
            questionImageView.setImageResource(question.getImage());
        }
        progressTextView.setText(App.getINSTANCE().getString(R.string.mark_template,position,test.getMaxMark()));

        finishButton.setOnClickListener((v) -> mListener.OnFinishClick());
        finishButton.setVisibility(position == (test.getQuestions().size() - 1) ? View.VISIBLE : View.GONE);

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentRadioButtonClickListener) {
            mListener = (OnFragmentRadioButtonClickListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentRadioButtonClickListener {
        void OnClick(String answer);

        void OnFinishClick();
    }
}

