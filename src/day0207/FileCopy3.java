package day0207;

import java.awt.FileDialog;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
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

public class FileCopy3 extends JFrame implements ActionListener {
	private JLabel jLabelOutput;

	public FileCopy3() {
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

	public void fileCopy() throws IOException {
		FileDialog fileDialogOpen = new FileDialog(this, "복사할 파일 선택", FileDialog.LOAD);
		fileDialogOpen.setVisible(true);

		if (fileDialogOpen.getDirectory() == null) {
			return;
		}

		File fileOrigin = new File(fileDialogOpen.getDirectory() + fileDialogOpen.getFile());
		if (!fileOrigin.exists()) {
			JOptionPane.showMessageDialog(this, "파일이 존재하지 않습니다");
			return;
		}
//		System.out.println(fileOrigin);

		StringBuilder tempFileName = new StringBuilder(fileOrigin.getAbsolutePath());
		tempFileName.insert(tempFileName.lastIndexOf("."), "_bak");

		File fileCopy = new File(tempFileName.toString());
		
		BufferedReader bufferedReader = null;
		BufferedWriter bufferedWriter = null;
		try {
			bufferedReader = new BufferedReader(new FileReader(fileOrigin));
			bufferedWriter = new BufferedWriter(new FileWriter(fileCopy));
			
			String temp = "";
			while ((temp = bufferedReader.readLine()) != null) {
				bufferedWriter.write(temp);
			}
			bufferedWriter.flush();
			jLabelOutput.setText(fileCopy.getName() + "파일명으로 복사가 되었습니다");

		} finally {
			if (bufferedReader != null) {
				bufferedReader.close();
			}
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}

	}

	public static void main(String[] args) {
		FileCopy3 fileCopy = new FileCopy3();

		try {
			fileCopy.fileCopy();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}// main

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		try {
			fileCopy();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
}
