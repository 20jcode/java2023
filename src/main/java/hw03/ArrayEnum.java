package hw03;

import java.util.*;

enum Command {
	ADD,
	LIST,
	SUM,
	INVALID,
	QUIT

};
public class ArrayEnum {
	public static void main(String[] args) {

		int[] values = new int[100];
		int index = 0;

		final Scanner scanner = new Scanner(System.in);
		while ( true ) {
			final Command command = getCommand(scanner); // Command is enum
			if ( command == Command.QUIT ) {
				System.out.println("Bye!");
				break;
			}
			switch ( command ) {
				case ADD:
					final int newValue = getValue(scanner);
					values[index] = newValue;
					index++;
					break;
				case LIST:
					printList(values, index);
					break;
				case SUM:
					System.out.println(getSum(values, index));
					break;
				case INVALID:
					System.out.println("Invalid Command");
				default: break;
			}
		}
		scanner.close();
	}

	private static Command getCommand(final Scanner scanner){
		try {
			return Command.valueOf(scanner.next().toUpperCase());
		} catch (IllegalArgumentException e){
			return Command.INVALID;
		}
	}

	private static int getValue(final Scanner scanner){
		return scanner.nextInt();
	}

	private static void printList(final int[] values,final int index){
		StringBuilder sb = new StringBuilder();
		for(int i=0; i < index; i++){
			sb.append(values[i]).append(" ");
			}
		System.out.println(sb);
	}

	private static int getSum(final int[] values,final int index){
		int sum = 0;
		for(int i = 0; i < index; i++){
			sum += values[i];
		}
		return sum;
	}
}