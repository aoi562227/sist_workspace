package dat0126;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class UseMenubar extends JFrame {
    public UseMenubar() {
        super("메뉴바 연습");
        JMenuBar jMenuBar = new JMenuBar();

        JMenu jMenuBar1 = new JMenu("1번메뉴");
        JMenu jMenuBar2 = new JMenu("2번메뉴");

        JMenuItem jMenuItem = new JMenuItem("1번의 하위메뉴 아이템");
        JMenuItem jMenuItem1 = new JMenuItem("1번의 두번째 메뉴 아이템");
        JMenuItem jMenuItem1_1 = new JMenu("1번의 두번째 메뉴의 하위메뉴");

        JMenuItem subMenuItem1_1 = new JMenuItem("서브메뉴 아이템 1");
        JMenuItem subMenuItem1_2 = new JMenuItem("서브메뉴 아이템 2");

        jMenuItem1_1.add(subMenuItem1_1);
        jMenuItem1_1.add(subMenuItem1_2);

        JMenuItem jMenuItem1_2 = new JMenuItem("1번의 첫번째 메뉴 아이템");

        JMenuItem jMenuItem2 = new JMenuItem("2번의 하위메뉴 아이템");
        JMenuItem jMenuItem2_1 = new JMenuItem("2번의 두번째 하위메뉴 아이템");

        jMenuBar1.add(jMenuItem);
        jMenuBar1.add(jMenuItem1);
        jMenuBar1.add(jMenuItem1_1);
        jMenuBar1.add(jMenuItem1_2);

        jMenuBar2.add(jMenuItem2);
        jMenuBar2.add(jMenuItem2_1);

        jMenuBar.add(jMenuBar1);
        jMenuBar.add(jMenuBar2);

        setJMenuBar(jMenuBar);

        setSize(800, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new UseMenubar();
    }
}
