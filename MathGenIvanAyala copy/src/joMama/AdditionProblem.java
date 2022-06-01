package joMama;

// This is a child class of MathProblem that focuses on Addition Problems.
public class AdditionProblem extends MathProblem{
    public AdditionProblem(int num) {
        setQuestNum(num);
        setAnswer(getFirstNum() + getSecondNum());
    }

    // This method returns the question as a String.
    public String question(){
        return getQuestNum() + ". " + getFirstNum() + " + "
                + getSecondNum() + " = _____";
    }

    // This method returns the answered question, regardless if it is correct or incorrect as a String. Along with the correct answer.
    public String answered(){
        return "\n" + getQuestNum() + ". " + getFirstNum() + " + " + getSecondNum() + " = " + getImp()
                + "\n Correct answer: "  + getAnswer();
    }

}
