package memory;

/**
 * ����� ������ ������
 * 
 * @author Afanasova
 *
 */
public class MemoryCell implements Memory {
	private double cell;// �������� ������ ������

	public MemoryCell() {

	}

	/**
	 * @see memory.Memory#clean()
	 */
	@Override
	public void clean() {
		cell = 0;

	}

	/**
	 * @see memory.Memory#record(double)
	 */
	@Override
	public void record(double res) {
		cell = res;

	}

	/**
	 * @see memory.Memory#increase(double)
	 */
	@Override
	public void increase(double res) {
		cell += res;

	}

	/**
	 * @see memory.Memory#reduce(double)
	 */
	@Override
	public void reduce(double res) {
		cell -= res;

	}

	/**
	 * ����� ��������� �������� ������ ������
	 * 
	 * @return �������� ������ ������
	 */
	public double getCell() {
		return cell;
	}
}
