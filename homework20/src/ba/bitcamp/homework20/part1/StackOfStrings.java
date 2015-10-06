package ba.bitcamp.homework20.part1;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Simulates Stack using String array.
 * 
 * @author boris.tomic
 *
 */
public class StackOfStrings {

	private String[] strings;

	/**
	 * Constructor of StackOfStrings class
	 */
	public StackOfStrings() {
		strings = new String[0];
	}

	/**
	 * Checks if arrays is empty. Retruns <code>boolean</code> type value,
	 * <code>true</code> if it is empty, <code>false</code> if not
	 * 
	 * @return - <code>boolean</code> type value, <code>true</code> if empty,
	 *         <code>false</code> if not
	 */
	public boolean empty() {
		return strings.length == 0;
	}

	/**
	 * Adds a <code>String</code> type value at last position in array.
	 * 
	 * @param value
	 *            - <code>String</code> type value to be added
	 * @return <code>String</code> type value that is being added
	 */
	public String push(String value) {
		strings = Arrays.copyOf(strings, strings.length + 1);
		strings[strings.length - 1] = value;
		return value;
	}

	/**
	 * Removes last element from an array of <code>Strings</code>
	 * 
	 * @return <code>String</code> type value of element being removed
	 */
	public String pop() throws EmptyStackException {
		if (strings.length > 0) {
			String temp = strings[strings.length - 1];
			strings = Arrays.copyOf(strings, strings.length - 1);
			return temp;
		} else {
			throw new EmptyStackException();
		}
	}

	/**
	 * Looks at last element in array.
	 * 
	 * @return <code>String</code> type value of last element in array
	 */
	public String peek() {
		return strings[strings.length - 1];
	}

	/**
	 * Checks if inputed string exist in an array of strings.
	 * 
	 * @param s
	 *            - <code>String</code> type value
	 * @return <code>int</code> type position in array, -1 if element doesn't
	 *         exits
	 */
	public int search(String s) {
		for (int i = 0; i < strings.length; i++) {
			if (s.equals(strings[i])) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public String toString() {
		return Arrays.toString(strings);
	}

}