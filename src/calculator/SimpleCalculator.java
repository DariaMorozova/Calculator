package calculator;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * Класс простого калькулятора
 * 
 * @author Afanasova
 *
 */
public class SimpleCalculator extends Calculator {

	/**
	 * Конструктор простого калькулятора
	 * 
	 * @param list
	 *            список строк для вычислений
	 */
	public SimpleCalculator(List<String> list) {
		super(list);
	}

	/**
	 * @see calculator.Calculator#opn(java.util.List)
	 */
	@Override
	protected List<String> opn(List<String> list) {
		List<String> stack = new ArrayList<String>(), out = new ArrayList<String>();
		for (String listElement : list) {// пробегается по элементам листа
			if (isOp(listElement)) {// если элемент оператор
				while (stack.size() > 0) {// пока длина стека >0
					out.add(stack.remove(0));
				}
				stack.add(listElement);
			} else {// иначе число
				out.add(listElement);// добавляет в выходной лист
			}
		}
		// Если в стеке остались операторы, добавляет их во входную строку
		while (stack.size() > 0) {
			out.add(stack.remove(0));
		}
		return out;
	}

	/**
	 * Считает выражение, записанное в обратной польской нотации
	 * 
	 * @param out
	 *            лист в обратной польской нотации
	 * @return число типа double
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
			} else {
				a = Double.parseDouble(listElement);// присваивает a элемент,
													// приведенный к типу double
				stack.push(a);// вставляет элемент впереди стека
			}
		}
		return stack.pop();
	}
}
