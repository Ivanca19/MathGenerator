package joMama;


// This is a child class of MathProblem that focuses on Subtraction Problems.
public class SubtractionProblem extends MathProblem{
    
    // This method needs to check to find which of the randomly generated numbers to be used for the problem is larger than the other to ensure 
    // the answer is not a negative number.
    public SubtractionProblem(int x) {
        setQuestNum(x);
        if(getFirstNum() > getSecondNum())
            setAnswer(getFirstNum() - getSecondNum());
        else if(getSecondNum() > getFirstNum())
            setAnswer(getSecondNum() - getFirstNum());
        else
            setAnswer(0);
    }

    public String question(){
        if(getFirstNum() > getSecondNum()) {
            return getQuestNum() + ". " + getFirstNum() + " - "
                    + getSecondNum() + " = _____";
        }
        return getQuestNum() + ". " + getSecondNum() + " - "
                + getFirstNum() + " = _____";
    }

    public String answered(){
        if(getFirstNum() > getSecondNum()) {
            return "\n" + getQuestNum() + ". " + getFirstNum() + " - " + getSecondNum() + " = " + getImp()
                    + "\n Correct answer: "  + getAnswer();
        }
        return "\n" + getQuestNum() + ". " + getSecondNum() + " - " + getFirstNum() + " = " + getImp()
                + "\n Correct answer: "  + getAnswer();
    }
}
