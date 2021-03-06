package joMama;

// This is a child class of MathProblem that focuses on Division Problems.
public class DivisionProblem extends MathProblem{
    private double FirstNum;
    private double SecondNum;
    private double answer;

    // Because the two numbers used for the math problem are randomly generated, I had to make the method find which number was larger than the
    // other in order to ensure that our answers are not less than 1 and do not equal to undefined.
    public DivisionProblem(int num) {
        setQuestNum(num);
        FirstNum = getFirstNum() * 1.00;
        SecondNum = getSecondNum() * 1.00;

        if((FirstNum > SecondNum) || ((SecondNum != 0) && (FirstNum == 0))) {
            answer = FirstNum/SecondNum;
            if((answer%1) >= 0.5)
                setAnswer((int) (answer + 1));
            else
                setAnswer((int)answer);
        }
        else if((SecondNum > FirstNum) || ((FirstNum != 0) && (SecondNum == 0))) {
            answer = SecondNum/FirstNum;
            if((answer%1) >= 0.5)
                setAnswer((int) (answer + 1));
            else
                setAnswer((int)answer);
        }
        else if(FirstNum == SecondNum){
            setAnswer(1);
        }
        else {
            setFirstNum(1);
            setSecondNum(1);
            setAnswer(1);
        }
    }

    public String question(){
        if(FirstNum > SecondNum) {
            return getQuestNum() + ". " + getFirstNum() + " / "
                    + getSecondNum() + " = _____";
        }
        return getQuestNum() + ". " + getSecondNum() + " / "
                + getFirstNum() + " = _____";
    }

    public String answered(){
        if(FirstNum > SecondNum) {
            return "\n" + getQuestNum() + ". " + getFirstNum() + " / " + getSecondNum() + " = " + getImp()
                    + "\n Correct answer: "  + getAnswer();
        }
        return "\n" + getQuestNum() + ". " + getSecondNum() + " / " + getFirstNum() + " = " + getImp()
                + "\n Correct answer: "  + getAnswer();
    }

}
