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
    public int rubleToEuro(int value) {
		return value / 70;
    }
    /**
     * ������������ ����� � �������.
     * @param value �����.
     * @return �������
     */
    public int rubleToDollar(int value) {
		return value / 60;
    }
	/**
     * ������������ ���� � �����.
     * @param value ����.
     * @return �����.
     */
	public int euroToruble(int value) {   
		return value * 70;
    }
	/**
     * ������������ ������� � �����.
     * @param value �������.
     * @return �����.
     */
	public int dollarToruble(int value) { 
		return value * 70;
    }
}