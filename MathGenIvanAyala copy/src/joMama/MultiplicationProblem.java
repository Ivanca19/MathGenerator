package joMama;

public class MultiplicationProblem extends MathProblem{
    private double FirstNum;
    private double SecondNum;

    public MultiplicationProblem(int num) {
        setQuestNum(num);
        FirstNum = Math.random() * 32;
        setFirstNum((int)FirstNum);
        SecondNum = Math.random() * 31;
        setSecondNum((int) SecondNum);
        setAnswer(getFirstNum() * getSecondNum());
    }

    public String question(){
        return getQuestNum() + ". " + getFirstNum() + " * "
                + getSecondNum() + " = _____";

    }

    public String answered(){
        return "\n" + getQuestNum() + ". " + getFirstNum() + " * " + getSecondNum() + " = " + getImp()
                + "\n Correct answer: "  + getAnswer();
    }

}
