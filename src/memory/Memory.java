package memory;

/**
 * Итрерфейс памяти
 * 
 * @author Afanasova
 *
 */
public interface Memory {

	/**
	 * Метод очистки памяти
	 */
	public void clean();

	/**
	 * Метод записи значения памяти
	 * 
	 * @param res
	 *            значение памяти
	 */
	public void record(double res);

	/**
	 * Метод увеличения значения памяти на текущее значение
	 * 
	 * @param res
	 *            текущее значение
	 */
	public void increase(double res);

	/**
	 * Метод уменьшения значения памяти на текущее значение
	 * 
	 * @param res
	 *            текущее значение
	 */
	public void reduce(double res);

}
