package org.community_commons.main;

import com.mendix.systemwideinterfaces.core.IMendixObject;

public interface IFileDocument {
	
	public IMendixObject getMendixObject();

	public boolean getHasContents();
	
	public static String HAS_CONTENTS = "HasContents";
	public static String NAME = "Name";
	
}
