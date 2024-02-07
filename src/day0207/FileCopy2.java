package day0207;

import java.awt.FileDialog;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class FileCopy2 extends JFrame implements ActionListener{
	private JLabel jLabelOutput;

	public FileCopy2() {
		// TODO Auto-generated constructor stub
		super("NIO를 사용한 파일 복사");
		
		JButton jButtonCopy = new JButton("복사할 파일 선택");
		jLabelOutput = new JLabel("복사할 파일을 선택해주세요");
		JPanel jPanelCenter = new JPanel();
		jPanelCenter.add(jButtonCopy);
		
		jLabelOutput.setBorder(new TitledBorder("출력"));
		
		add("Center", jPanelCenter);
		add("South", jLabelOutput);
		
		jButtonCopy.addActionListener(this);
		
		setBounds(100, 100, 300, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void fileCopy(){
		FileDialog fileDialogOpen = new FileDialog(this, "복사할 파일 선택", FileDialog.LOAD);
		fileDialogOpen.setVisible(true);
		
		if (fileDialogOpen.getDirectory() == null) {
			return;
		}
		
		File fileOrigin = new File(fileDialogOpen.getDirectory()+fileDialogOpen.getFile());
		if (!fileOrigin.exists()) {
			JOptionPane.showMessageDialog(this, "파일이 존재하지 않습니다");
			return;
		}
//		System.out.println(fileOrigin);
		
		StringBuilder tempFileName = new StringBuilder(fileOrigin.getAbsolutePath());
		tempFileName.insert(tempFileName.lastIndexOf("."), "_bak");
		
		File fileCopy = new File(tempFileName.toString());
		
		Path originPath = Path.of(fileOrigin.getAbsolutePath());
		Path copyPath = Path.of(fileCopy.getAbsolutePath());
		
		try {
			Files.copy(originPath, copyPath, StandardCopyOption.REPLACE_EXISTING);
			jLabelOutput.setText(fileCopy.getName()+"파일명으로 복사가 되었습니다");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(this, "파일 복사도중 문제 발생");
			e.printStackTrace();
		}
		

		}
	

	
	public static void main(String[] args) {
		FileCopy2 fileCopy = new FileCopy2();

			fileCopy.fileCopy();

	}//main

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		fileCopy();

	}
}
