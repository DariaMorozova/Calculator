package calculator;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * ����� ����������� ������������
 * 
 * @author Afanasova
 * 
 */
public class EngineerCalculator extends Calculator {

	/**
	 * ����������� ����������� ������������
	 * 
	 * @param list
	 *            ������ ����� ��� ����������
	 */
	public EngineerCalculator(List<String> list) {
		super(list);
	}

	/**
	 * @see calculator.Calculator#opn(java.util.List)
	 */
	@Override
	protected List<String> opn(List<String> list) {
		List<String> stack = new ArrayList<String>(), out = new ArrayList<String>();
		for (String listElement : list) {// ����������� �� ��������� �����
			if (isOp(listElement) || isF(listElement)) {// ���� ������� ��������
														// ��� �������
				while (stack.size() > 0) {// ���� ����� ����� >0
					out.add(stack.remove(0));
				}
				stack.add(listElement);
			} else {// ����� �����
				out.add(listElement);// ��������� ������� � �������� ����
			}
		}
		// ���� � ����� �������� ���������, ��������� �� � ������� ������
		while (stack.size() > 0) {
			out.add(stack.remove(0));
		}
		return out;
	}

	/**
	 * ����� ���������, �������� �� ������� ��������
	 * 
	 * @param el
	 *            �������
	 * @return true ��� false
	 */
	protected boolean isF(String el) {
		switch (el) {
		case "sin":
		case "exp":
		case "sqrt":
			return true;
		}
		return false;
	}

	/**
	 * @see calculator.Calculator#calculate(java.util.List)
	 */
	@Override
	protected double calculate(List<String> out) {
		double a = 0, b = 0;
		Deque<Double> stack = new ArrayDeque<Double>();
		for (String listElement : out) {
			if (isOp(listElement)) {// ���� ��� ��������
				b = stack.pop();// ������� � ���������� ������ ������� �����
				a = stack.pop();// ������� � ���������� ������ ������� �����
				switch (listElement) {// �������, � ����������� �� ���������
				case "+":
					a += b;
					break;
				case "-":
					a -= b;
					break;
				case "/":
					a /= b;
					break;
				case "*":
					a *= b;
					break;
				}
				stack.push(a);// ��������� ������� ������� �����
			} else if (isF(listElement)) {// ���� ��� �������
				a = stack.pop();// ������� � ���������� ������ ������� �����
				switch (listElement) {// �������, � ����������� �� �������
				case "sin":
					a = Math.sin(a);
					break;
				case "exp":
					a = Math.exp(a);
					break;
				case "sqrt":
					a = Math.sqrt(a);
					break;
				}
				stack.push(a);// ��������� ������� ������� �����
			} else {
				a = Double.parseDouble(listElement);// ����������� a �������,
													// ����������� � ���� double
				stack.push(a);// ��������� ������� ������� �����
			}
		}
		return stack.pop();
	}
}
