package day0123;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument;

public class Homework2 {

    private List<WorkVO> workList;

    public static void main(String[] args) {
        new Homework2().inputMenu();
    }

    private void inputMenu() {
        workList = new ArrayList<>();
        while (true) {
            String inputValue = JOptionPane.showInputDialog(
                    "이름, 자바점수, 오라클점수 입력\n\"출력\"을 입력하면 출력됩니다.\n"
                    + "종료하려면 Y/y를 입력해주세요:");

            if (inputValue.equalsIgnoreCase("Y")) {
                exitProgram();
                break;
            } else if (inputValue.equals("출력")) {
                printData();
            } else {
                inputData(inputValue);
            }
        }
    }

    private void inputData(String inputValue) {
        List<String> values = Arrays.asList(inputValue.split(","));
        if (values.size() == 3) {
            String name = values.get(0).trim();
            int javaScore = Integer.parseInt(values.get(1).trim());
            int oracleScore = Integer.parseInt(values.get(2).trim());

            WorkVO workVO = new WorkVO(name, javaScore, oracleScore);
            workList.add(workVO);
        }
    }

    private void printData() {
        Iterator<WorkVO> iterator = workList.iterator();

        if (!workList.isEmpty()) {
            System.out.println("번호\t이름\t자바\t오라클\t총점");
            while (iterator.hasNext()) {
                WorkVO workVO = iterator.next();
                System.out.print((workList.indexOf(workVO) + 1) + "\t");
                System.out.print(workVO.getName() + "\t");
                System.out.print(workVO.getJavaScore() + "\t");
                System.out.print(workVO.getOracleScore() + "\t");
                System.out.println(workVO.getTotal());
            }
        }
    }

    private void exitProgram() {
        System.exit(0);
    }
}
