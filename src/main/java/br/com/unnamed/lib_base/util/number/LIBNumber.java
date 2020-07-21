package br.com.unnamed.lib_base.util.number;

public class LIBNumber {
	/**
	 * Verifica se um determinado texto contém apenas números.
	 *
	 * @param value texto a ser verificado
	 * @return <b> true </b> se for um número ou <b> false </b> caso não seja um número
	 */
	public static boolean isNumber(String value) {
		return LIBNumberImpl.isNumber(value);
	}
	
	/**
	 * Verifica se uma determinada string é um número inteiro válido.
	 *
	 * @param value string a ser comparada
	 * @return <b> true </b> se for um número inteiro válido, ou <b> false </b> se não for um número intero válido
	 */
	public static boolean isInteger(String value) {
		return LIBNumberImpl.isInteger(value);
	}
	
	/**
	 * Verifica se um determinado valor Double é um número inteiro válido.
	 *
	 * @param value valor a ser comparado
	 * @return <b> true </b> se for um número inteiro válido, ou <b> false </b> se não for um número intero válido
	 */
	public static boolean isInteger(Double value) {
		return LIBNumberImpl.isInteger(value);
	}
	
	/**
	 * Converte um determinado texto em um número inteiro.
	 *
	 * @param value texto a ser convertido para número
	 * @return número convertido ou zero caso o texto não seja um número válido
	 */
	public static int toInt(String value) {
		return LIBNumberImpl.toInt(value);
	}
	
	/**
	 * Converte um determinado texto em um número real.
	 *
	 * @param value texto a ser convertido para número
	 * @return número convertido ou zero caso o texto não seja um número válido
	 */
	public static double toDouble(String value) {
		return LIBNumberImpl.toDouble(value);
	}
	
	/**
	 * Verifica se um determinado número inteiro é ímpar
	 * 
	 * @param value número a ser verificado
	 * @return <b> true </b> se for um número ímpar, ou <b> false </b> se não for um número ímpar
	 */
	public static boolean isNumeroImpar(Integer value) {
		return LIBNumberImpl.isNumeroImpar(value);
	}
	
	/**
	 * Verifica se um determinado número é ímpar
	 * 
	 * @param value número a ser verificado
	 * @return <b> true </b> se for um número ímpar, ou <b> false </b> se não for um número ímpar
	 */
	public static boolean isNumeroImpar(Double value) {
		return LIBNumberImpl.isNumeroImpar(value);
	}
}
