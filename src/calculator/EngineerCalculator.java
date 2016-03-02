package calculator;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * Класс инженерного калькулятора
 * 
 * @author Afanasova
 * 
 */
public class EngineerCalculator extends Calculator {

	/**
	 * Конструктор инженерного калькулятора
	 * 
	 * @param list
	 *            список строк для вычислений
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
		for (String listElement : list) {// пробегается по элементам листа
			if (isOp(listElement) || isF(listElement)) {// если элемент оператор
														// или функция
				while (stack.size() > 0) {// пока длина стека >0
					out.add(stack.remove(0));
				}
				stack.add(listElement);
			} else {// иначе число
				out.add(listElement);// добавляет элемент в выходной лист
			}
		}
		// Если в стеке остались операторы, добавляет их в входную строку
		while (stack.size() > 0) {
			out.add(stack.remove(0));
		}
		return out;
	}

	/**
	 * Метод проверяет, является ли элемент функцией
	 * 
	 * @param el
	 *            элемент
	 * @return true или false
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
			if (isOp(listElement)) {// если это операция
				b = stack.pop();// удаляет и возвращает первый элемент стека
				a = stack.pop();// удаляет и возвращает первый элемент стека
				switch (listElement) {// считает, в зависимости от оператора
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
				stack.push(a);// вставляет элемент впереди стека
			} else if (isF(listElement)) {// если это функция
				a = stack.pop();// удаляет и возвращает первый элемент стека
				switch (listElement) {// считает, в зависимости от функции
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
				stack.push(a);// вставляет элемент впереди стека
			} else {
				a = Double.parseDouble(listElement);// присваивает a элемент,
													// приведенный к типу double
				stack.push(a);// вставляет элемент впереди стека
			}
		}
		return stack.pop();
	}
}
