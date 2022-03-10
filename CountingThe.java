/*
 * Adam Dam
 * Feb. 22, 2022
 * To demonstrate the use of indexOf
 */
package unit1;
public class CountingThe {

	public static void main(String[] args) {
		String rigby = "Father McKenzie Writing the words of a sermon that no one will hear No one comes near Look at him working Darning his socks in the night when there's nobody there What does he care?"; //5 the's
		rigby = rigby.toLowerCase();
		int the = 0;
		int pos = 0;

		while (true) {
			if (rigby.indexOf("the",pos) != -1) {
				the++;
				pos = rigby.indexOf("the",pos)+1;
			} else {
				break;
			}
		}
		System.out.print("The second verse of Eleanor Rigby contains "+the+" the's");
	}
}