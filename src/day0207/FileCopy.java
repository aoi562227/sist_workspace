package day0207;

import java.awt.FileDialog;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class FileCopy extends JFrame implements ActionListener{
	private JLabel jLabelOutput;

	public FileCopy() {
		// TODO Auto-generated constructor stub
		super("파일 복사");
		
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
	
	public void fileCopy() throws IOException {
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
		
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;
		
		try {
			fileInputStream = new FileInputStream(fileOrigin);
			fileOutputStream = new FileOutputStream(fileCopy);
			
//			HDD의 특성을 무시한 코드
//			int data = 0;
//			while((data = fileInputStream.read()) != -1) {
//				fileOutputStream.write(data);
//			}
//			fileOutputStream.flush();
			
			byte[] data = new byte[512];
			int dataSize = 0;
			while ((dataSize=fileInputStream.read(data)) != -1) {
				fileOutputStream.write(data, 0, dataSize);
			}
			
			fileOutputStream.flush();
			jLabelOutput.setText(fileCopy.getName()+"파일명으로 복사가 되었습니다");
		} finally {
			// TODO: handle finally clause
			if (fileInputStream != null) {
				fileInputStream.close();
			}
			if (fileOutputStream != null) {
				fileOutputStream.close();
			}
		}
	}
	
	public static void main(String[] args) {
		FileCopy fileCopy = new FileCopy();
		
		try {
			fileCopy.fileCopy();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//main

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
			fileCopy();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(this, "파일 복사 중 문제 발생");
			e1.printStackTrace();
		}
	}
}
