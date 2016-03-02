package start;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import calculator.*;

/**
 * ����� �������
 * 
 * @author Afanasova
 *
 */
public class start {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();// ������� ���� �����
		try {
			Files.lines(Paths.get("../"+"1.txt"), StandardCharsets.UTF_8).forEach(list::add);// ���������
																						// ������
																						// ��
																						// �����
																						// �
																						// ���������
		} catch (IOException e) {
			e.printStackTrace();
		}
		// ������� �� ����� ������� � �������� 0, ���������� ���� �������,
		// �������� ��� � ���� int � ����������
		switch (Integer.parseInt(list.remove(0))) {
		case 1:// ���� 1, �� ������� ��������� ������ �������� ������������ �
				// ������� ��������� ����������
			Calculator simpleCalculator = new SimpleCalculator(list);
			System.out.println(simpleCalculator.getRes());
			break;
		case 2:// ���� 2, �� ������� ��������� ������ ����������� ������������ �
				// ������� ��������� ����������
			Calculator engineerCalculator = new EngineerCalculator(list);
			System.out.println(engineerCalculator.getRes());
			break;
		case 3:// ���� 3, �� ������� ��������� ������ �������� ������������ �
				// ������� � ������� ��������� ����������
			SimpleCalculatorWithMemory simpleCalculatorWithMemory = new SimpleCalculatorWithMemory(list);
			System.out.println(simpleCalculatorWithMemory.getRes());
			break;
		case 4:// ���� 4, �� ������� ��������� ������ ����������� ������������ �
				// ������� � ������� ��������� ����������
			EngineerCalculatorWithMemory engineerCalculatorWithMemory = new EngineerCalculatorWithMemory(list);
			System.out.println(engineerCalculatorWithMemory.getRes());
			break;
		}
	}
}
