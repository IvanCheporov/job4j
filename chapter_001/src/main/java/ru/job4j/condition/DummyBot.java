package ru.job4j.condition;

/**
 * @author Ivan Cheporov (vanessok@mail.ru)
 * @version $1.0$
 * @since 01.10.2018
 */
public class DummyBot {
    /**
     * Отвечает на вопросы.
     * @param question Вопрос от клиента.
     * @return ответ от Бота.
     */
	 
    public String answer(String question) {
        String rsl = "Это ставит меня в тупик. Спросите другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            // заменить ... на правильный ответ rsl = "ответ по заданию".
            rsl = "Привет, Умник";                    
        } else if ("Пока, Бот.".equals(question)) { 
            // заменить ... на проверку, что этот вопрос известен боту и он знает как на него ответить.
            // заменить ... на правильный ответ rsl = "ответ по заданию".
            rsl = "До Скорой встречи";
        } else {
            rsl = "Это ставит меня в тупик. Спросите другой вопрос.";
     }
        return rsl;
    
	}
}
