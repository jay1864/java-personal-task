package calculator;

import java.util.ArrayList;

public abstract class Calculator {
    private final ArrayList<Double> results;

    Calculator(ArrayList<Double> results) {
        this.results = results;
    }

    public ArrayList<Double> getResults() {
        return results;
    }

    public void removeResult(int index) {
        this.results.remove(index);
    }

    abstract void inquiryResults();
}
