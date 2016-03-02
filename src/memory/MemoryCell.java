package memory;

/**
 * Класс ячейки памяти
 * 
 * @author Afanasova
 *
 */
public class MemoryCell implements Memory {
	private double cell;// значение ячейки памяти

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
	 * Метод получения значения ячейки памяти
	 * 
	 * @return значение ячейки памяти
	 */
	public double getCell() {
		return cell;
	}
}
