package memory;

/**
 * ��������� ������
 * 
 * @author Afanasova
 *
 */
public interface Memory {

	/**
	 * ����� ������� ������
	 */
	public void clean();

	/**
	 * ����� ������ �������� ������
	 * 
	 * @param res
	 *            �������� ������
	 */
	public void record(double res);

	/**
	 * ����� ���������� �������� ������ �� ������� ��������
	 * 
	 * @param res
	 *            ������� ��������
	 */
	public void increase(double res);

	/**
	 * ����� ���������� �������� ������ �� ������� ��������
	 * 
	 * @param res
	 *            ������� ��������
	 */
	public void reduce(double res);

}
