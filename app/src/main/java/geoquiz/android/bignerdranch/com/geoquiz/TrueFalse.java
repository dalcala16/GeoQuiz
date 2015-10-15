package geoquiz.android.bignerdranch.com.geoquiz;

/**
 * Created by student on 9/18/2015.
 */
public class TrueFalse {
    private int mQuestion;          // holds the question to be displayed

    private boolean mTrueQuestion;  // determines if the question is a true question or false

    // constructor
    public TrueFalse(int question, boolean trueQuestion) {
        mQuestion = question;
        mTrueQuestion = trueQuestion;
    }

    public int getQuestion() {
        return mQuestion;
    }   // returns the question to be displayed

    public void setQuestion(int question) {
        mQuestion = question;
    }   // sets the question

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    public void setTrueQuestion(boolean trueQuestion) {
        mTrueQuestion = trueQuestion;
    }
}
