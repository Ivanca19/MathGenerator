package joMama;

import javax.swing.*;
import java.util.ArrayList;


import java.text.*;
import java.awt.print.*;
import static java.util.Date.parse;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.print.Printer;
import javax.swing.JTextArea;

public class Overseer {
    private int numQuestions;
    private int numCorrect;
    private int numIncorrect;
    private ArrayList<MathProblem> probs;
    private View map;

    public static int opt(Object[] options, String msg, String title) {
        return JOptionPane.showOptionDialog(null, msg, title, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, 0);
    }

    public static int yNC(String msg, String title) {
        return JOptionPane.showOptionDialog(null, msg, title, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, 0);
    }

    public static int yN(String msg, String title) {
        return JOptionPane.showOptionDialog(null, msg, title, JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, 0);
    }

    public Overseer(){
        map = new View();
        probs = new ArrayList<MathProblem>();
    }

    public boolean menu() throws InterruptedException {
        String[] options = {"Exit", "Test", "Practice Questions", "Print"};
        String[] questTypes = {"Division", "Multiplication", "Subtraction", "Addition"};
        String[] printOpt = {"Print New Test", "Print New Work Sheet", "Print Current Page"};
        int armoredTitan = opt(options, map.drawView(), "Ayala Math Generator");

        if(armoredTitan == 0) {
            JOptionPane.showMessageDialog(null, "Thank you. Goodbye :)");
            return false;
        }
        else if(armoredTitan == 1) {
            map.clearView();
            numCorrect = 0;
            numIncorrect = 0;
            probs.clear();
            int cnt;
            int x = yN("Would you like to take a test?", "Ayala Math Generator");
            if(x == 0) {
                x = 10;
                cnt = x;
                for (int i = 1; i <= x; i++) {
                    double y = (Math.random() * 4);
                    if (y < 1) {
                        DivisionProblem prob = new DivisionProblem(i);
                        probs.add(prob);
                    } else if (y < 2) {
                        MultiplicationProblem prob = new MultiplicationProblem(i);
                        probs.add(prob);
                    } else if (y < 3) {
                        SubtractionProblem prob = new SubtractionProblem(i);
                        probs.add(prob);
                    } else {
                        AdditionProblem prob = new AdditionProblem(i);
                        probs.add(prob);
                    }
                }
                for(int i = 0; i < cnt; i++) {
                    map.addToView(probs.get(i).question());

                    String imp = JOptionPane.showInputDialog(null, map.drawView(),
                            "Ayala Math Generator");
                    probs.get(i).setImp(Integer.parseInt(imp));
                    if(Integer.parseInt((imp)) == probs.get(i).getAnswer())
                        numCorrect++;
                    else
                        numIncorrect++;
                }

                map.clearView();
                for(int i = 0; i < cnt; i++) {
                    map.addToView(probs.get(i).answered());
                }
                map.addToView("\n" + "Number Correct: " + numCorrect);
                map.addToView("Number Incorrect: " + numIncorrect + "\n");
                map.addToView("Score: " + (((numCorrect * 1.0)/((numCorrect * 1.0) + (numIncorrect * 1.0)) * 100.0)) + "%"+ "\n");
            }

        }
        else if(armoredTitan == 2) {
            map.clearView();
            numCorrect = 0;
            numIncorrect = 0;
            probs.clear();

            int cnt;
            int x = yN("Would you like to practice?", "Ayala Math Generator");
            if (x == 0) {
                x = Integer.parseInt(JOptionPane.showInputDialog("How many Questions would you like?"));
                cnt = x;
                for (int i = 1; i <= x; i++) {
                    int y = opt(questTypes, ("Pick a question type for problem " + i), "Ayala Math Generator");
                    if (y == 0) {
                        DivisionProblem prob = new DivisionProblem(i);
                        probs.add(prob);
                    } else if (y == 1) {
                        MultiplicationProblem prob = new MultiplicationProblem(i);
                        probs.add(prob);
                    } else if (y == 2) {
                        SubtractionProblem prob = new SubtractionProblem(i);
                        probs.add(prob);
                    } else {
                        AdditionProblem prob = new AdditionProblem(i);
                        probs.add(prob);
                    }
                }
                for (int i = 0; i < cnt; i++) {
                    map.addToView(probs.get(i).question());

                    String imp = JOptionPane.showInputDialog(null, map.drawView(),
                            "Ayala Math Generator");
                    probs.get(i).setImp(Integer.parseInt(imp));
                    if (Integer.parseInt((imp)) == probs.get(i).getAnswer())
                        numCorrect++;
                    else
                        numIncorrect++;
                    map.addToView(probs.get(i).answered());
                }
                map.clearView();
                for(int i = 0; i < cnt; i++) {
                    map.addToView(probs.get(i).answered());
                }
                map.addToView("\n" + "Number Correct: " + numCorrect);
                map.addToView("Number Incorrect: " + numIncorrect + "\n");
                map.addToView("Score: " + (((numCorrect * 1.0) / ((numCorrect * 1.0) + (numIncorrect * 1.0)) * 100.0)) + "%" + "\n");

            }
        }
        else if(armoredTitan == 3) {

            int hoes = opt(printOpt, map.drawView(), "Ayala Math Generator");
            if (hoes == 0) {
                map.clearView();
                numCorrect = 0;
                numIncorrect = 0;
                probs.clear();
                int cntlol;
                int xlol = 10;
                cntlol = xlol;
                for (int i = 1; i <= xlol; i++) {
                    double y = (Math.random() * 4);
                    if (y < 1) {
                        DivisionProblem prob = new DivisionProblem(i);
                        probs.add(prob);
                    } else if (y < 2) {
                        MultiplicationProblem prob = new MultiplicationProblem(i);
                        probs.add(prob);
                    } else if (y < 3) {
                        SubtractionProblem prob = new SubtractionProblem(i);
                        probs.add(prob);
                    } else {
                        AdditionProblem prob = new AdditionProblem(i);
                        probs.add(prob);
                    }
                }
                for (int i = 0; i < cntlol; i++) {
                    map.addToView(probs.get(i).question());
                }
                map.addToView("\n" + "Number Correct: ");
                map.addToView("Number Incorrect: " + "\n");
                map.addToView("Score: ");
                try {
                    JTextArea temp = new JTextArea();
                    temp.append(map.drawView());
                    temp.print();
                    //jTextArea2.print();
                } catch (PrinterException ex) {
                    Logger.getLogger(Overseer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if (hoes == 1) {
                map.clearView();
                numCorrect = 0;
                numIncorrect = 0;
                probs.clear();
                int cntlol;
                int xlol = Integer.parseInt(JOptionPane.showInputDialog("How many Questions would you like?"));
                cntlol = xlol;
                for (int i = 1; i <= xlol; i++) {
                    double y = opt(questTypes, ("Pick a question type for problem " + i), "Ayala Math Generator");
                    if (y == 0) {
                        DivisionProblem prob = new DivisionProblem(i);
                        probs.add(prob);
                    } else if (y == 1) {
                        MultiplicationProblem prob = new MultiplicationProblem(i);
                        probs.add(prob);
                    } else if (y == 2) {
                        SubtractionProblem prob = new SubtractionProblem(i);
                        probs.add(prob);
                    } else {
                        AdditionProblem prob = new AdditionProblem(i);
                        probs.add(prob);
                    }
                }
                for (int i = 0; i < cntlol; i++) {
                    map.addToView(probs.get(i).question());
                }
                map.addToView("\n" + "Number Correct: ");
                map.addToView("Number Incorrect: " + "\n");
                map.addToView("Score: ");
                try {
                    JTextArea temp = new JTextArea();
                    temp.append(map.drawView());
                    temp.print();
                    //jTextArea2.print();
                } catch (PrinterException ex) {
                    Logger.getLogger(Overseer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else {
                try {
                    JTextArea temp = new JTextArea();
                    temp.append(map.drawView());
                    temp.print();
                    //jTextArea2.print();
                } catch (PrinterException ex) {
                    Logger.getLogger(Overseer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
        return true;
    }
}
