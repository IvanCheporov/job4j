package ru.job4j.loop;

public class Board {

	/**Метод String paint позволяет рисовать шахматную доску в псевдографике.
	 * @author Ivan Cheporov (vanessok@mail.ru).
     * @since 08.10.2018.
	 * @param height, width.
	 * @return screen.toString().
	 */

    public String paint(int width, int height) {
		
        StringBuilder screen = new StringBuilder();
        
		String ln = System.lineSeparator();
        
		for (int i = 1; i <= height; i++) {
            
			for (int j = 1; j <= width; j++) {
                
				if ((i + j) % 2 == 0) {
                    screen.append("x");
                
				} else {
                    screen.append(" ");
                }
            }
			
            screen.append(ln);
        }
        return screen.toString();
    }
}