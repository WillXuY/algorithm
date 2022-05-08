package org.willxu.algorithm.service.doublepoint;

public interface AverageSalaryExcludingTheMinimumAndMaximumSalary {
    /**
     * You are given an array of unique integers salary where salary[i]
     * is the salary of the ith employee.
     *
     * Return the average salary of employees excluding the minimum and
     * maximum salary. Answers within 10-5 of the actual answer will be
     * accepted.
     *
     * @param salary 3 <= salary.length <= 100
     *               1000 <= salary[i] <= 106
     *               All the integers of salary are unique.
     */
    double average(int[] salary);
}