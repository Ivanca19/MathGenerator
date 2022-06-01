package joMama;

public class AdditionProblem extends MathProblem{
    public AdditionProblem(int num) {
        setQuestNum(num);
        setAnswer(getFirstNum() + getSecondNum());
    }

    public String question(){
        return getQuestNum() + ". " + getFirstNum() + " + "
                + getSecondNum() + " = _____";
    }

    public String answered(){
        return "\n" + getQuestNum() + ". " + getFirstNum() + " + " + getSecondNum() + " = " + getImp()
                + "\n Correct answer: "  + getAnswer();
    }

}
