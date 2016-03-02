package start;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import calculator.*;

/**
 *  ласс запуска
 * 
 * @author Afanasova
 *
 */
public class start {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();// создает лист строк
		try {
			Files.lines(Paths.get("../"+"1.txt"), StandardCharsets.UTF_8).forEach(list::add);// добавл€ет
																						// строки
																						// из
																						// файла
																						// в
																						// коллекцию
		} catch (IOException e) {
			e.printStackTrace();
		}
		// удал€ет из листа элемент с индексом 0, возвращает этот элемент,
		// приводит его к типу int и сравнивает
		switch (Integer.parseInt(list.remove(0))) {
		case 1:// если 1, то создает экземпл€р класса простого калькул€тора и
				// выводит результат вычислений
			Calculator simpleCalculator = new SimpleCalculator(list);
			System.out.println(simpleCalculator.getRes());
			break;
		case 2:// если 2, то создает экземпл€р класса инженерного калькул€тора и
				// выводит результат вычислений
			Calculator engineerCalculator = new EngineerCalculator(list);
			System.out.println(engineerCalculator.getRes());
			break;
		case 3:// если 3, то создает экземпл€р класса простого калькул€тора с
				// пам€тью и выводит результат вычислений
			SimpleCalculatorWithMemory simpleCalculatorWithMemory = new SimpleCalculatorWithMemory(list);
			System.out.println(simpleCalculatorWithMemory.getRes());
			break;
		case 4:// если 4, то создает экземпл€р класса инженерного калькул€тора с
				// пам€тью и выводит результат вычислений
			EngineerCalculatorWithMemory engineerCalculatorWithMemory = new EngineerCalculatorWithMemory(list);
			System.out.println(engineerCalculatorWithMemory.getRes());
			break;
		}
	}
}
