package day0124;

import java.io.IOException;
import java.util.*;

import javax.swing.JOptionPane;

public class Homework {
    private Map<Integer, WorkVO> workMap;
    boolean printflag = false;

    public static void main(String[] args) {
        new Homework().mainMenu();
    }

    private void mainMenu() {
        workMap = new HashMap<>();

        do{
            String inputValue = JOptionPane.showInputDialog(
                    "메뉴\n1.입력 2.검색 3.종료");
            if (inputValue.equals("1")) {
                inputMenu();
            } else if (inputValue.equals("2")) {
                printData();
            } else if (inputValue.equals("3")) {
                break;
            }
        }while (true) ;
    }

    private void inputMenu() {
    	boolean flag = true;
        do{
            String inputValue = JOptionPane.showInputDialog(
                    "학생의 정보를 아래와 같이 입력해주세요.\n예) 학생번호,이름,자바점수,오라클점수\n메뉴\n2.검색 3.종료");
            if (inputValue.equals("2")) {
                printData();
                printflag = true;
            }else if (inputValue.equals("3")) {
				break;
			} 
            else {
                flag = inputData(inputValue);
            }
        }while (flag);
    }

    private boolean inputData(String inputValue) {
        List<String> values = Arrays.asList(inputValue.split(","));
//        Set<WorkVO> values = new HashSet<>();
        if (values.size() == 4) {
            int number = Integer.parseInt(values.get(0).trim());
            if (!workMap.containsKey(number)) {
                String name = values.get(1).trim();
                int javaScore = Integer.parseInt(values.get(2).trim());
                int oracleScore = Integer.parseInt(values.get(3).trim());

                WorkVO workVO = new WorkVO(number, name, javaScore, oracleScore);
                workMap.put(number, workVO);
                
            }else {
            	JOptionPane.showMessageDialog(null, "이미 존재하는 번호입니다");
            	return false;
            }
        }
		return true;
    }

    private void printData() {
    	if (printflag == true) {
    		for (int i = 0; i < 20; ++i) System.out.println();//cls
    		printflag = false;
		}
        if (!workMap.isEmpty()) {
            System.out.println("번호\t이름\t자바\t오라클\t총점\t평균");
            for (WorkVO workVO : workMap.values()) {
                System.out.print(workVO.getNumber() + "\t");
                System.out.print(workVO.getName() + "\t");
                System.out.print(workVO.getJavaScore() + "\t");
                System.out.print(workVO.getOracleScore() + "\t");
                System.out.print(workVO.getTotal() + "\t");
                System.out.println((double)workVO.getTotal()/2 + "\t");
            }
        }
    }
}
