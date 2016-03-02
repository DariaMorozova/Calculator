package calculator;

import java.util.List;
import memory.MemoryCell;

/**
 * ����� �������� ������������ � �������
 * 
 * @author Afanasova
 *
 */
public class SimpleCalculatorWithMemory extends SimpleCalculator {
	private final MemoryCell memoryCell; // ������ ������

	/**
	 * ����������� �������� ������������ � �������
	 * 
	 * @param list
	 *            ������ ����� ��� ����������
	 */
	public SimpleCalculatorWithMemory(List<String> list) {
		super(list);
		memoryCell = new MemoryCell();
	}

	/**
	 * ����� ��� ��������� ������ ������
	 * 
	 * @return ������ ������
	 */
	public MemoryCell getMemoryCell() {
		return memoryCell;
	}
}
