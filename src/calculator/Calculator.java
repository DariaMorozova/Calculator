package calculator;

import java.util.List;

/**
 * Абстрактный класс калькуляторов
 * 
 * @author Afanasova
 *
 */
public abstract class Calculator {
	private double res;// переменная, в которую сохраняется результат

	/**
	 * Конструктор абстрактного класса калькуляторов
	 * 
	 * @param list
	 *            список строк для вычислений
	 */
	public Calculator(List<String> list) {
		res = calculate(opn(list));
	}

	/**
	 * Метод приведения к обратной польской нотации
	 * 
	 * @param list
	 *            список строк, который нужно привести к опн
	 * @return список строк в опн
	 */
	protected abstract List<String> opn(List<String> list);

	/**
	 * Считает выражение, записанное в обратной польской нотации
	 * 
	 * @param out
	 *            лист в обратной польской нотации
	 * @return число
	 */
	protected abstract double calculate(List<String> out);

	/**
	 * Метод проверяет, является ли элемент оператором
	 * 
	 * @param el
	 *            элемент
	 * @return true или false
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
	 * Метод получения результата
	 * 
	 * @return результат
	 */
	public double getRes() {
		return res;
	}
}
