package calculator;

import java.util.List;
import memory.MemoryCell;

/**
 * ����� ����������� ������������ � �������
 * 
 * @author Afanasova
 *
 */
public class EngineerCalculatorWithMemory extends EngineerCalculator {
	private final MemoryCell memoryCell; // ������ ������

	/**
	 * ����������� ����������� ������������ � �������
	 * 
	 * @param list
	 *            ������ ����� ��� ����������
	 */
	public EngineerCalculatorWithMemory(List<String> list) {
		super(list);
		memoryCell = new MemoryCell();
	}

	/**
	 * ����� ��������� ������ ������
	 * 
	 * @return ������ ������
	 */
	public MemoryCell getMemoryCell() {
		return memoryCell;
	}
}
