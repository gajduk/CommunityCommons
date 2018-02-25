package communitycommons;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.pdfbox.exceptions.COSVisitorException;
import org.community_commons.main.IFileDocument;
import org.community_commons.main.UserThrownException;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.integration.WebserviceException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

import communitycommons.proxies.LogLevel;
import system.proxies.FileDocument;
import system.proxies.Language;


public class Misc
{
	public static IFileDocument convertFileDocument(final FileDocument fd) {

		return new IFileDocument() {
			
			@Override
			public IMendixObject getMendixObject() {
				return fd.getMendixObject();
			}
			
			@Override
			public boolean getHasContents() {
				return fd.getHasContents();
			}
		};
	}
	
	public static org.community_commons.main.Logging.LogLevel getLogLevel(LogLevel loglevel) {
		switch ( loglevel ) {
			case Critical: return org.community_commons.main.Logging.LogLevel.Critical; 
			case Debug: return org.community_commons.main.Logging.LogLevel.Debug; 
			case Error: return org.community_commons.main.Logging.LogLevel.Error; 
			case Info: return org.community_commons.main.Logging.LogLevel.Info; 
			case Trace: return org.community_commons.main.Logging.LogLevel.Trace; 
			case Warning: return org.community_commons.main.Logging.LogLevel.Warning;
			default: return org.community_commons.main.Logging.LogLevel.Info;
		}
	}
	
	
	public static String getApplicationURL()
	{
		return org.community_commons.main.Misc.getApplicationURL();
	}

	public static String getRuntimeVersion()
	{
		return org.community_commons.main.Misc.getRuntimeVersion();
	}

	public static void throwException(String message) throws UserThrownException
	{
		throw new UserThrownException(message);		
	}
	
	public static void throwWebserviceException(String faultstring) throws WebserviceException {
		throw new WebserviceException(WebserviceException.clientFaultCode, faultstring);
	}

	public static String retrieveURL(String url, String postdata) throws Exception
	{
		return org.community_commons.main.Misc.retrieveURL(url, postdata);
	}

	public static Boolean duplicateFileDocument(IContext context, IMendixObject toClone, IMendixObject target) throws Exception
    {
		return org.community_commons.main.Misc.duplicateFileDocument(context, toClone, target);
    }

	public static Boolean duplicateImage(IContext context, IMendixObject toClone, IMendixObject target, int thumbWidth, int thumbHeight) throws Exception
	{
		return org.community_commons.main.Misc.duplicateImage(context, toClone, target,thumbWidth,thumbHeight);   
	}

	public static Boolean storeURLToFileDocument(IContext context, String url, IMendixObject __document, String filename) throws Exception
	{
		return org.community_commons.main.Misc.storeURLToFileDocument(context,url,__document,filename);
	}

    public static Long getFileSize(IContext context, IMendixObject document)
    {
    	return org.community_commons.main.Misc.getFileSize(context,document);
    }

	public static void delay(long delaytime) throws InterruptedException
	{
    	org.community_commons.main.Misc.delay(delaytime);
	}

	public static IContext getContextFor(IContext context, String username, boolean sudoContext) {
		return org.community_commons.main.Misc.getContextFor(context,username,sudoContext);
	}

	public static Object executeMicroflowAsUser(IContext context,
			String microflowName, String username, Boolean sudoContext, Object... args) throws Exception
	{
		return org.community_commons.main.Misc.executeMicroflowAsUser(context,microflowName,username,sudoContext,args);
	}


	public static Boolean runMicroflowAsyncInQueue(final String microflowName)
	{
		return org.community_commons.main.Misc.runMicroflowAsyncInQueue(microflowName);
	}	
	
	public static Boolean runMicroflowInBackground(final IContext context, final String microflowName,
			final IMendixObject paramObject)
	{
		return org.community_commons.main.Misc.runMicroflowInBackground(context,microflowName,paramObject);
	}	
	
	
	public static Boolean executeMicroflowInBatches(String xpath, final String microflow, int batchsize, boolean waitUntilFinished, boolean asc) throws CoreException, InterruptedException {
		return org.community_commons.main.Misc.executeMicroflowInBatches(xpath,microflow,batchsize,waitUntilFinished,asc);
	}
	
	public static Boolean recommitInBatches(String xpath, int batchsize,
			boolean waitUntilFinished, Boolean asc) throws CoreException, InterruptedException
	{
		return org.community_commons.main.Misc.recommitInBatches(xpath,batchsize,waitUntilFinished,asc);	
	}	
	
	/**
	 * These function can not be public as BatchState is private
	public static Boolean executeInBatches(String xpathRaw, BatchState batchState, int batchsize, boolean waitUntilFinished, boolean asc) throws CoreException, InterruptedException
	{
		
	
	static void executeInBatchesHelper(final String xpath, final int batchsize, final long last, final BatchState batchState, final long count, final boolean asc) {
		return org.community_commons.main.Misc.executeInBatchesHelper(xpath,batchsize,last,batchState,count,asc);		
	}
	}
	*/
	
	/**
	 * Tests if two objects are equal with throwing unecessary null pointer exceptions. 
	 * 
	 * This is almost the most stupid function ever, since it should be part of Java itself. 
	 * 
	 * In java 7 it will finally be available as static method Object.equals()
	 * @param left
	 * @param right
	 * @return
	 */
	public static boolean objectsAreEqual(Object left, Object right) {
		return org.community_commons.main.Misc.objectsAreEqual(left, right);
	}
	
	/**
	 * Get the default language
	 * @param context
	 * @return The default language
	 * @throws CoreException
	 */
	public static Language getDefaultLanguage(IContext context) throws CoreException {
		String languageCode = Core.getDefaultLanguage().getCode();
		List<Language> languageList = Language.load(context, "[Code = '" + languageCode + "']");
		if (languageList == null || languageList.isEmpty()) {
			throw new RuntimeException("No language found for default language constant value " + languageCode);
		}
		return languageList.get(0);		
	}
	
	public static boolean mergePDF(IContext context,List<FileDocument> documents,  IMendixObject mergedDocument ){
		return org.community_commons.main.Misc.mergePDF(context,
				documents.stream().map(d -> d==null?null:Misc.convertFileDocument(d)).collect(Collectors.toList()),
				mergedDocument);
	}
	

	/**
	 * Overlay a generated PDF document with another PDF (containing the company stationary for example)
	 * @param context
	 * @param generatedDocumentMendixObject The document to overlay
	 * @param overlayMendixObject The document containing the overlay
	 * @return boolean
	 * @throws IOException
	 */
	public static boolean overlayPdf(IContext context, IMendixObject generatedDocumentMendixObject, IMendixObject overlayMendixObject, boolean onTopOfContent) throws IOException {	
		return org.community_commons.main.Misc.overlayPdf(context, generatedDocumentMendixObject, overlayMendixObject, onTopOfContent);
	}
}
