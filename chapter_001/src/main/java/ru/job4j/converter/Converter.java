package ru.job4j.converter;

/**
 * ��������� ������ � ������������ ���������� value.
 */
public class Converter {

    /**
     * ������������ ����� � ����.
     * @param value �����.
     * @return ����.
     */
    public int rubleToEuro(int value, int course) {
        int value = 70;
		int course = 70;
		int euro = value / course;
		return euro;
    }
    /**
     * ������������ ����� � �������.
     * @param value �����.
     * @return �������
     */
    public int rubleToDollar(int value, int course) {
        int value = 60;
		int course = 60;
		dollar = value / course;
		return dollar;
    }
	/**
     * ������������ ���� � �����.
     * @param value ����.
     * @return �����.
     */
	public int euroToruble(int value, int course) {
        int value = 3;
		int course = 70;
		int euroTorub = value * course;
		return euroTorub;
    }
	/**
     * ������������ ������� � �����.
     * @param value �������.
     * @return �����.
     */
	public int dollarToruble(int value, int course) {
        int value = 3;
		int course = 60;
		int dollarTorub = value * course;
		return dollarTorub;
    }
}