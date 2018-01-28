package communitycommons;

import java.io.IOException;
import java.security.DigestException;
import java.security.NoSuchAlgorithmException;
import java.util.regex.MatchResult;

import com.google.common.base.Function;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

import communitycommons.proxies.XSSPolicy;
import system.proxies.FileDocument;

public class StringUtils
{

	public static String hash(String value, int length) throws NoSuchAlgorithmException, DigestException
	{
	    return org.community_commons.main.StringUtils.hash(value,length);
	}

	public static String regexReplaceAll(String haystack, String needleRegex,
			String replacement)
	{
		return org.community_commons.main.StringUtils.regexReplaceAll(haystack,needleRegex,replacement);
	}

	public static boolean regexTest(String value, String regex)
	{
		return org.community_commons.main.StringUtils.regexTest(value,regex);
	}

	public static String leftPad(String value, Long amount, String fillCharacter)
	{
		return org.community_commons.main.StringUtils.leftPad(value,amount,fillCharacter);
	}

	public static String rightPad(String value, Long amount, String fillCharacter)
	{
		return org.community_commons.main.StringUtils.rightPad(value,amount,fillCharacter);
	}

	public static String randomString(int length)
	{
		return org.community_commons.main.StringUtils.randomString(length);
	}

	public static String substituteTemplate(final IContext context, String template,
			final IMendixObject substitute, final boolean HTMLEncode, final String datetimeformat) {
		return org.community_commons.main.StringUtils.substituteTemplate(context, template, substitute, HTMLEncode, datetimeformat);
	}

	public static String regexReplaceAll(String source, String regexString, Function<MatchResult, String> replaceFunction)  {
		return org.community_commons.main.StringUtils.regexReplaceAll(source, regexString, replaceFunction);
	}

	public static String HTMLEncode(String value)
	{
		return org.community_commons.main.StringUtils.HTMLEncode(value);
	}

	public static String randomHash()
	{
		return org.community_commons.main.StringUtils.randomHash();
	}

	public static String base64Decode(String encoded)
	{
		return org.community_commons.main.StringUtils.base64Decode(encoded);
	}

	public static void base64DecodeToFile(IContext context, String encoded, FileDocument targetFile) throws Exception
	{
		org.community_commons.main.StringUtils.base64DecodeToFile(context,encoded,targetFile.getMendixObject());
	}

	public static String base64Encode(String value)
	{
		return org.community_commons.main.StringUtils.base64Encode(value);
	}

	public static String base64EncodeFile(IContext context, FileDocument file) throws IOException
	{
		return org.community_commons.main.StringUtils.base64EncodeFile(context,Misc.convertFileDocument(file));
	}

	public static String stringFromFile(IContext context, FileDocument source) throws IOException
	{
		return org.community_commons.main.StringUtils.stringFromFile(context, Misc.convertFileDocument(source));
	}

	public static void stringToFile(IContext context, String value, FileDocument destination)
	{
		org.community_commons.main.StringUtils.stringToFile(context,value,Misc.convertFileDocument(destination));
	}

	public static String HTMLToPlainText(String html) throws IOException
	{
		return org.community_commons.main.StringUtils.HTMLToPlainText(html);
	}

	public static String XSSSanitize(String html, XSSPolicy policy)
			throws Exception {
		if (html == null)
			return "";
		// return HtmlSanitizer.sanitize(html);
		String policyString = policy == null ? "tinymce" : policy.toString()
				.toLowerCase();
		return XSSSanitize(html, policyString);
	}

	public static String XSSSanitize(String html, String policyString)
			throws Exception {
		return org.community_commons.main.StringUtils.XSSSanitize(html,policyString);
	}

	/**
	 * Returns a random strong password containing at least one number, lowercase character, uppercase character and strange character
	 * @param length
	 * @return
	 */
	public static String randomStrongPassword(int minLen, int maxLen, int noOfCAPSAlpha,
            int noOfDigits, int noOfSplChars) {
        return org.community_commons.main.StringUtils.randomStrongPassword(minLen,maxLen,noOfCAPSAlpha,noOfDigits,noOfSplChars);
    }

	public static String encryptString(String key, String valueToEncrypt) throws Exception
	{
		return org.community_commons.main.StringUtils.encryptString(key, valueToEncrypt);
	}

	public static String decryptString(String key, String valueToDecrypt) throws Exception
	{
		return org.community_commons.main.StringUtils.decryptString(key, valueToDecrypt);
	}

	public static String generateHmacSha256Hash(String key, String valueToEncrypt)
	{
		return org.community_commons.main.StringUtils.generateHmacSha256Hash(key, valueToEncrypt);
	}

	public static String escapeHTML(String input) {
		return org.community_commons.main.StringUtils.escapeHTML(input);
	}

	public static String regexQuote(String unquotedLiteral) {
		return org.community_commons.main.StringUtils.regexQuote(unquotedLiteral);
	}

	public static String substringBefore(String str, String separator) {
		return org.community_commons.main.StringUtils.substringBefore(str,separator);
	}

	public static String substringBeforeLast(String str, String separator) {
		return org.community_commons.main.StringUtils.substringBeforeLast(str,separator);
	}

	public static String substringAfter(String str, String separator) {
		return org.community_commons.main.StringUtils.substringAfter(str,separator);
	}

	public static String substringAfterLast(String str, String separator) {
		return org.community_commons.main.StringUtils.substringAfterLast(str,separator);
	}
}
