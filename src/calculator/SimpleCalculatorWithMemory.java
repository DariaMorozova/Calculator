package calculator;

import java.util.List;
import memory.MemoryCell;

/**
 *  ласс простого калькул€тора с пам€тью
 * 
 * @author Afanasova
 *
 */
public class SimpleCalculatorWithMemory extends SimpleCalculator {
	private final MemoryCell memoryCell; // €чейка пам€ти

	/**
	 *  онструктор простого калькул€тора с пам€тью
	 * 
	 * @param list
	 *            список строк дл€ вычислений
	 */
	public SimpleCalculatorWithMemory(List<String> list) {
		super(list);
		memoryCell = new MemoryCell();
	}

	/**
	 * ћетод дл€ получени€ €чейки пам€ти
	 * 
	 * @return €чейка пам€ти
	 */
	public MemoryCell getMemoryCell() {
		return memoryCell;
	}
}
