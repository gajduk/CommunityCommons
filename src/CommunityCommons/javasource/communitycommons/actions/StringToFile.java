// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package communitycommons.actions;

import com.mendix.systemwideinterfaces.core.IMendixObject;
import org.community_commons.main.StringUtils;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import communitycommons.Misc;

/**
 * Stores a string into the provides filedocument
 * 
 * Note that destination will be committed.
 */
public class StringToFile extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.String value;
	private IMendixObject __destination;
	private system.proxies.FileDocument destination;

	public StringToFile(IContext context, java.lang.String value, IMendixObject destination)
	{
		super(context);
		this.value = value;
		this.__destination = destination;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		this.destination = __destination == null ? null : system.proxies.FileDocument.initialize(getContext(), __destination);

		// BEGIN USER CODE
		StringUtils.stringToFile(getContext(), value, Misc.convertFileDocument(destination));
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "StringToFile";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
