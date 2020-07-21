package br.com.unnamed.lib_base.util.string;

public class LIBString {
	/**
	 * Remove espaços à direita e à esquerda de uma determinada string.
	 *
	 * @param value string a ser formatada
	 * @return string formatada ou vazio caso a string tenha um valor nulo
	 */
	public static String trim(String value) {
		return LIBStringImpl.trim(value);
	}
	
	/**
	 * Remove espaços à esquerda de uma determinada string
	 *
	 * @param value string a ser formatada
	 * @return string formatada ou vazio caso a string tenha um valor nulo
	 */
	public static String letfTrim(String value) {
		return LIBStringImpl.letfTrim(value);
	}

	/**
	 * Remove espaços à direita de uma determinada string
	 *
	 * @param value string a ser formatada
	 * @return string formatada ou vazio caso a string tenha um valor nulo
	 */
	public static String rightTrim(String value) {
		return LIBStringImpl.rightTrim(value);
	}
	
	/**
	 * Compara duas strings nas seguintes condições:
	 * <ol>
	 * 	<li>Serão desconsiderados espaços à direita e à esquerda</li>
	 * 	<li>Valores nulos serão considerados como texto vazio</li>
	 * </ol>
	 *
	 * @param value1 string a ser comparada
	 * @param value2 string para comparação
	 *
	 * @return <b> true </b> se valores iguais ou <b> false </b> se valores diferentes
	 */
	public static boolean equals(String value1, String value2) {
		return LIBStringImpl.equals(value1, value2);
	}
	
	/**
	 * Verifica se uma determinada string está vazia, onde uma string com valor {@code null} </br>
	 * ou uma string que contém apenas espaços será considerada vazia.
	 *
	 * @param value string a ser verificada
	 * @return <b> true </b> se a string estiver vazia ou <b> false </b> caso contenha algum valor
	 */
	public static boolean isEmpty(String value) {
		return LIBStringImpl.isEmpty(value);
	}
}
