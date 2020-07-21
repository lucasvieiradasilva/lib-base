package br.com.unnamed.lib_base.util.string;

public class LIBString {
	/**
	 * Remove espa�os � direita e � esquerda de uma determinada string.
	 *
	 * @param value string a ser formatada
	 * @return string formatada ou vazio caso a string tenha um valor nulo
	 */
	public static String trim(String value) {
		return LIBStringImpl.trim(value);
	}
	
	/**
	 * Remove espa�os � esquerda de uma determinada string
	 *
	 * @param value string a ser formatada
	 * @return string formatada ou vazio caso a string tenha um valor nulo
	 */
	public static String letfTrim(String value) {
		return LIBStringImpl.letfTrim(value);
	}

	/**
	 * Remove espa�os � direita de uma determinada string
	 *
	 * @param value string a ser formatada
	 * @return string formatada ou vazio caso a string tenha um valor nulo
	 */
	public static String rightTrim(String value) {
		return LIBStringImpl.rightTrim(value);
	}
	
	/**
	 * Compara duas strings nas seguintes condi��es:
	 * <ol>
	 * 	<li>Ser�o desconsiderados espa�os � direita e � esquerda</li>
	 * 	<li>Valores nulos ser�o considerados como texto vazio</li>
	 * </ol>
	 *
	 * @param value1 string a ser comparada
	 * @param value2 string para compara��o
	 *
	 * @return <b> true </b> se valores iguais ou <b> false </b> se valores diferentes
	 */
	public static boolean equals(String value1, String value2) {
		return LIBStringImpl.equals(value1, value2);
	}
	
	/**
	 * Verifica se uma determinada string est� vazia, onde uma string com valor {@code null} </br>
	 * ou uma string que cont�m apenas espa�os ser� considerada vazia.
	 *
	 * @param value string a ser verificada
	 * @return <b> true </b> se a string estiver vazia ou <b> false </b> caso contenha algum valor
	 */
	public static boolean isEmpty(String value) {
		return LIBStringImpl.isEmpty(value);
	}
}
