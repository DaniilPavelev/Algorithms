package main.Algorithms.AlgorithmsUtils;

import java.util.Date;


/**Секундомер может измерять время только до часов, несколько дней измерить нельзя, хотя мне это и не нужно*/
public class StopWatch {
    private long timeStart;

    public StopWatch() {
        Date start = new Date();
        timeStart = getSecond(start);
    }
    public long checkTime(){
        return getSecond(new Date()) - timeStart;
    }

    private static long getSecond(Date date){
        return date.getMinutes()*60+date.getSeconds()+date.getHours()*60*60;
    }

}
