package ru.gb.jseminar;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.logging.Logger;

public class Task0 {

	// Дан Deque состоящий из последовательности цифр.
	// Необходимо проверить, что последовательность цифр является палиндромом
	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1,2,3,5,3,2,1));
		Logger log = Logger.getLogger(Task0.class.getName());
		log.info(String.valueOf(new Task0().checkOn(deque)));
	}

	public boolean checkOn(Deque<Integer> deque) {
		if (deque.size() == 0)		return false;
		boolean result = true;
		while (deque.size() > 1) {
			if (!deque.pollFirst().equals(deque.pollLast())) {
				result = false;
				break;
			}
		}
		return result;
	}
}