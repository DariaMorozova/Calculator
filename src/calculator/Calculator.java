package calculator;

import java.util.List;

/**
 * ����������� ����� �������������
 * 
 * @author Afanasova
 *
 */
public abstract class Calculator {
	private double res;// ����������, � ������� ����������� ���������

	/**
	 * ����������� ������������ ������ �������������
	 * 
	 * @param list
	 *            ������ ����� ��� ����������
	 */
	public Calculator(List<String> list) {
		res = calculate(opn(list));
	}

	/**
	 * ����� ���������� � �������� �������� �������
	 * 
	 * @param list
	 *            ������ �����, ������� ����� �������� � ���
	 * @return ������ ����� � ���
	 */
	protected abstract List<String> opn(List<String> list);

	/**
	 * ������� ���������, ���������� � �������� �������� �������
	 * 
	 * @param out
	 *            ���� � �������� �������� �������
	 * @return �����
	 */
	protected abstract double calculate(List<String> out);

	/**
	 * ����� ���������, �������� �� ������� ����������
	 * 
	 * @param el
	 *            �������
	 * @return true ��� false
	 */
	protected boolean isOp(String el) {
		switch (el) {
		case "-":
		case "+":
		case "*":
		case "/":
			return true;
		}
		return false;
	}

	/**
	 * ����� ��������� ����������
	 * 
	 * @return ���������
	 */
	public double getRes() {
		return res;
	}
}
