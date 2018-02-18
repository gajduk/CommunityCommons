// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package communitycommons.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import org.community_commons.main.DateTime;

/**
 * Converts a Unix timestamp to a dateTime object
 */
public class LongToDateTime extends CustomJavaAction<java.util.Date>
{
	private java.lang.Long value;

	public LongToDateTime(IContext context, java.lang.Long value)
	{
		super(context);
		this.value = value;
	}

	@Override
	public java.util.Date executeAction() throws Exception
	{
		// BEGIN USER CODE
		return DateTime.longToDateTime(value);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "LongToDateTime";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
