package com.company.answerCell;

public class AnswerCell {
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep){
        if (isAsleep)
            return false;
        if (!isMorning || isMom)
            return true;
        else return false;
    }
}
