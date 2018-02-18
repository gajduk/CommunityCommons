// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package communitycommons.actions;

import org.community_commons.main.StringUtils;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * Returns true if a value matches a regular expression. Matches the behavior of a Regexp validation rule.
 * 
 * For the regexp specification see:
 * http://download.oracle.com/javase/1.4.2/docs/api/java/util/regex/Pattern.html
 * A decent regexp tester can be found at:
 */
public class RegexTest extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.String value;
	private java.lang.String regex;

	public RegexTest(IContext context, java.lang.String value, java.lang.String regex)
	{
		super(context);
		this.value = value;
		this.regex = regex;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		return StringUtils.regexTest(value, regex);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "RegexTest";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
