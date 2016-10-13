package org.hunter1041.javaday.designpatterns.strategy.classic;

/**
 * @author Alexander Pashinskiy
 * @since 5/12/2015
 * @version 1.0
 */
public class SalaryCalculator implements IncomeCalculator {
    @Override
    public int calculate(Position position) {
        return position.getRate() * 2 + 13;
    }
}
