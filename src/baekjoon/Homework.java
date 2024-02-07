package baekjoon;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Calendar;

public class Homework extends JFrame {
    private final int year = 2024;
    private final int month = 2;

    public Homework() {
        super("Homework");
        Calendar date = Calendar.getInstance();
        Calendar lastDate = Calendar.getInstance();
        lastDate.set(year, month - 2, 1);
        date.set(year, month - 1, 1);

        JPanel datePane = new JPanel(new GridLayout(0, 7));
        addPreviousMonthDays(datePane, lastDate, date);
        addCurrentMonthDays(datePane, date);
        addNextMonthDays(datePane, date);

        add(datePane);
        datePane.setBackground(Color.BLACK);
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void addPreviousMonthDays(JPanel datePane, Calendar lastDate, Calendar currentDate) {
        int previousMonthDays = lastDate.getActualMaximum(Calendar.DAY_OF_MONTH) - currentDate.get(Calendar.DAY_OF_WEEK) + 2;
        for (int i = previousMonthDays; i <= lastDate.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {
            addButtonToPanel(datePane, i, Color.GRAY);
        }
    }

    private void addCurrentMonthDays(JPanel datePane, Calendar currentDate) {
        for (int i = 1; i <= currentDate.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {
            addButtonToPanel(datePane, i, Color.BLACK);
        }
    }

    private void addNextMonthDays(JPanel datePane, Calendar currentDate) {
        currentDate.set(Calendar.DAY_OF_MONTH, currentDate.getActualMaximum(Calendar.DAY_OF_MONTH));
        for (int i = 1; i <= 7 - currentDate.get(Calendar.DAY_OF_WEEK); i++) {
            addButtonToPanel(datePane, i, Color.GRAY);
        }
    }

    private void addButtonToPanel(JPanel datePane, int day, Color bgColor) {
        JButton jButton = new JButton(String.valueOf(day));
        jButton.setBackground(bgColor);
        jButton.setForeground(Color.WHITE);
        datePane.add(jButton);
    }

    public static void main(String[] args) {
        new Homework();
    }
}

