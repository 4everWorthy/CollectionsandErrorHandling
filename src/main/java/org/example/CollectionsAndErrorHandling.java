package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsAndErrorHandling {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        try {
            // Adding integers to the list (with duplicates)
            numbers.add(1);
            numbers.add(2);
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);
            numbers.add(4);
            numbers.add(5);

            // Removing duplicates using Set
            Set<Integer> uniqueNumbersSet = new HashSet<>(numbers);
            List<Integer> uniqueNumbersList = new ArrayList<>(uniqueNumbersSet);

            // Calculating the sum and average
            int sum = 0;
            for (int number : uniqueNumbersList) {
                sum += number;
            }

            double average;
            if (!uniqueNumbersList.isEmpty()) {
                average = (double) sum / uniqueNumbersList.size();
            } else {
                throw new ArithmeticException("Cannot divide by zero.");
            }

            // Printing the results
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
            System.out.println("List without duplicates: " + uniqueNumbersList);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal argument: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Operation completed.");
        }
    }
}
