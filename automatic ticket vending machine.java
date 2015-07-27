 * This program builds a basketball score counter with GUI for two teams.
package com.test;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class BasketballScoreCounter {
	int teamAScore = 0;
	int teamBScore = 0;
	private JFrame frmScoreCounter;
	private JTextField textFieldA;
	private JTextField textFieldB;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;

	/**
	 * Create the application.
	 */
	public BasketballScoreCounter() {
		initialize();
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BasketballScoreCounter window = new BasketballScoreCounter();
					window.frmScoreCounter.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmScoreCounter = new JFrame();
		frmScoreCounter.setTitle("Basketball Score Counter");
		frmScoreCounter.getContentPane().setFont(
				new Font("Tahoma", Font.BOLD, 30));
		frmScoreCounter.setBounds(100, 100, 450, 300);
		frmScoreCounter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmScoreCounter.getContentPane().setLayout(null);

		lblNewLabel = new JLabel("Team A");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(82, 15, 93, 28);
		frmScoreCounter.getContentPane().add(lblNewLabel);

		textFieldA = new JTextField();
		textFieldA.setEditable(false);
		textFieldA.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldA.setFont(new Font("Tahoma", Font.BOLD, 30));
		textFieldA.setText("0");
		textFieldA.setBounds(83, 58, 90, 34);
		frmScoreCounter.getContentPane().add(textFieldA);
		textFieldA.setColumns(10);

		btnNewButton_1 = new JButton("+3 Points");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teamAScore += 3;
				textFieldA.setText(Integer.toString(teamAScore));
			}
		});
		btnNewButton_1.setBounds(83, 107, 90, 23);
		frmScoreCounter.getContentPane().add(btnNewButton_1);

		btnNewButton_2 = new JButton("+2 Points");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teamAScore += 2;
				textFieldA.setText(Integer.toString(teamAScore));
			}
		});
		btnNewButton_2.setBounds(83, 145, 90, 23);
		frmScoreCounter.getContentPane().add(btnNewButton_2);

		btnNewButton_3 = new JButton("Free Throw");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teamAScore += 1;
				textFieldA.setText(Integer.toString(teamAScore));
			}
		});
		btnNewButton_3.setBounds(78, 183, 100, 23);
		frmScoreCounter.getContentPane().add(btnNewButton_3);

		lblNewLabel_1 = new JLabel("Team B");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(257, 15, 93, 28);
		frmScoreCounter.getContentPane().add(lblNewLabel_1);

		textFieldB = new JTextField();
		textFieldB.setEditable(false);
		textFieldB.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldB.setFont(new Font("Tahoma", Font.BOLD, 30));
		textFieldB.setText("0");
		textFieldB.setBounds(258, 58, 90, 34);
		frmScoreCounter.getContentPane().add(textFieldB);
		textFieldB.setColumns(10);

		btnNewButton_4 = new JButton("+3 Points");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teamBScore += 3;
				textFieldB.setText(Integer.toString(teamBScore));
			}
		});
		btnNewButton_4.setBounds(258, 107, 90, 23);
		frmScoreCounter.getContentPane().add(btnNewButton_4);

		btnNewButton_5 = new JButton("+2 Points");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teamBScore += 2;
				textFieldB.setText(Integer.toString(teamBScore));
			}
		});
		btnNewButton_5.setBounds(258, 145, 90, 23);
		frmScoreCounter.getContentPane().add(btnNewButton_5);

		btnNewButton_6 = new JButton("Free Throw");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teamBScore += 1;
				textFieldB.setText(Integer.toString(teamBScore));
			}
		});
		btnNewButton_6.setBounds(253, 183, 100, 23);
		frmScoreCounter.getContentPane().add(btnNewButton_6);

		btnNewButton_7 = new JButton("Reset");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teamAScore = 0;
				teamBScore = 0;
				textFieldA.setText(Integer.toString(teamAScore));
				textFieldB.setText(Integer.toString(teamBScore));
			}
		});
		btnNewButton_7.setBounds(171, 229, 90, 23);
		frmScoreCounter.getContentPane().add(btnNewButton_7);
	}
}
