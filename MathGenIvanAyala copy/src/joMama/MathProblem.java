package joMama;

public class MathProblem {
    private int firstNum;
    private int secondNum;
    private int answer;
    private int imp;
    private int questNum;


    public int getQuestNum() {
        return questNum;
    }

    public void setQuestNum(int questNum) {
        this.questNum = questNum;
    }

    public int getImp() {
        return imp;
    }

    public void setImp(int imp) {
        this.imp = imp;
    }

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public int getFirstNum() {
        return firstNum;
    }

    public int getSecondNum() {
        return secondNum;
    }

    public int getAnswer() {
        return answer;
    }

    public MathProblem() {
        firstNum = (int) (Math.random() * 1001);
        secondNum = (int) (Math.random() * (1001 - firstNum));
    }

    public boolean correct() {
        if(imp == answer)
            return true;
        return false;
    }
    public String question() {
        return "";
    }
    public String answered() {
        return "";
    }
}
