package calculator;

import java.util.List;
import memory.MemoryCell;

/**
 *  ласс инженерного калькул€тора с пам€тью
 * 
 * @author Afanasova
 *
 */
public class EngineerCalculatorWithMemory extends EngineerCalculator {
	private final MemoryCell memoryCell; // €чейка пам€ти

	/**
	 *  онструктор инженерного калькул€тора с пам€тью
	 * 
	 * @param list
	 *            список строк дл€ вычислений
	 */
	public EngineerCalculatorWithMemory(List<String> list) {
		super(list);
		memoryCell = new MemoryCell();
	}

	/**
	 * ћетод получени€ €чейки пам€ти
	 * 
	 * @return €чейка пам€ти
	 */
	public MemoryCell getMemoryCell() {
		return memoryCell;
	}
}
