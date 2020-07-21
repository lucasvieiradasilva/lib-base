package br.com.unnamed.lib_base.util.number;

public class LIBNumber {
	/**
	 * Verifica se um determinado texto cont�m apenas n�meros.
	 *
	 * @param value texto a ser verificado
	 * @return <b> true </b> se for um n�mero ou <b> false </b> caso n�o seja um n�mero
	 */
	public static boolean isNumber(String value) {
		return LIBNumberImpl.isNumber(value);
	}
	
	/**
	 * Verifica se uma determinada string � um n�mero inteiro v�lido.
	 *
	 * @param value string a ser comparada
	 * @return <b> true </b> se for um n�mero inteiro v�lido, ou <b> false </b> se n�o for um n�mero intero v�lido
	 */
	public static boolean isInteger(String value) {
		return LIBNumberImpl.isInteger(value);
	}
	
	/**
	 * Verifica se um determinado valor Double � um n�mero inteiro v�lido.
	 *
	 * @param value valor a ser comparado
	 * @return <b> true </b> se for um n�mero inteiro v�lido, ou <b> false </b> se n�o for um n�mero intero v�lido
	 */
	public static boolean isInteger(Double value) {
		return LIBNumberImpl.isInteger(value);
	}
	
	/**
	 * Converte um determinado texto em um n�mero inteiro.
	 *
	 * @param value texto a ser convertido para n�mero
	 * @return n�mero convertido ou zero caso o texto n�o seja um n�mero v�lido
	 */
	public static int toInt(String value) {
		return LIBNumberImpl.toInt(value);
	}
	
	/**
	 * Converte um determinado texto em um n�mero real.
	 *
	 * @param value texto a ser convertido para n�mero
	 * @return n�mero convertido ou zero caso o texto n�o seja um n�mero v�lido
	 */
	public static double toDouble(String value) {
		return LIBNumberImpl.toDouble(value);
	}
	
	/**
	 * Verifica se um determinado n�mero inteiro � �mpar
	 * 
	 * @param value n�mero a ser verificado
	 * @return <b> true </b> se for um n�mero �mpar, ou <b> false </b> se n�o for um n�mero �mpar
	 */
	public static boolean isNumeroImpar(Integer value) {
		return LIBNumberImpl.isNumeroImpar(value);
	}
	
	/**
	 * Verifica se um determinado n�mero � �mpar
	 * 
	 * @param value n�mero a ser verificado
	 * @return <b> true </b> se for um n�mero �mpar, ou <b> false </b> se n�o for um n�mero �mpar
	 */
	public static boolean isNumeroImpar(Double value) {
		return LIBNumberImpl.isNumeroImpar(value);
	}
}
