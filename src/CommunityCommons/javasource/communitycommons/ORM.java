package communitycommons;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.core.objectmanagement.member.MendixAutoNumber;
import com.mendix.core.objectmanagement.member.MendixDateTime;
import com.mendix.core.objectmanagement.member.MendixEnum;
import com.mendix.core.objectmanagement.member.MendixObjectReference;
import com.mendix.core.objectmanagement.member.MendixObjectReferenceSet;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.IMendixObject.ObjectState;
import com.mendix.systemwideinterfaces.core.IMendixObjectMember;
import com.mendix.systemwideinterfaces.core.IMendixObjectMember.MemberState;
import com.mendix.systemwideinterfaces.core.ISession;
import com.mendix.systemwideinterfaces.core.meta.IMetaAssociation;
import com.mendix.systemwideinterfaces.core.meta.IMetaAssociation.AssociationType;
import com.mendix.systemwideinterfaces.core.meta.IMetaEnumValue;
import com.mendix.systemwideinterfaces.core.meta.IMetaEnumeration;
import com.mendix.systemwideinterfaces.core.meta.IMetaObject;
import com.mendix.systemwideinterfaces.core.meta.IMetaPrimitive;
import com.mendix.systemwideinterfaces.core.meta.IMetaPrimitive.PrimitiveType;

public class ORM
{



	public static Long getGUID(IMendixObject item)
	{
		return org.community_commons.main.ORM.getGUID(item);
	}

	public static String getOriginalValueAsString(IContext context, IMendixObject item,
			String member)
	{
		return org.community_commons.main.ORM.getOriginalValueAsString(context,item,member);
	}
	
	public static boolean objectHasChanged(IMendixObject anyobject) {
		return org.community_commons.main.ORM.objectHasChanged(anyobject);
	}

	/**
	 * checks whether a certain member of an object has changed. If the objects itself is still new, we consider to be changes as well.
	 * @param item
	 * @param member
	 * @param context
	 * @return
	 */
	public static boolean memberHasChanged(IContext context, IMendixObject item, String member)
	{
		return org.community_commons.main.ORM.memberHasChanged(context,item,member);
	}

	public static void deepClone(IContext c, IMendixObject source, IMendixObject target, String membersToSkip, String membersToKeep, String reverseAssociations, String excludeEntities, String excludeModules) throws CoreException
	{
		org.community_commons.main.ORM.deepClone(c, source, target, membersToSkip, membersToKeep, reverseAssociations, excludeEntities, excludeModules);
	}

	public static Boolean commitWithoutEvents(IContext context, IMendixObject subject) throws CoreException
	{
		return org.community_commons.main.ORM.commitWithoutEvents(context, subject);
	}

	public static String getValueOfPath(IContext context, IMendixObject substitute, String fullpath, String datetimeformat) throws Exception
	{
		return org.community_commons.main.ORM.getValueOfPath(context, substitute, fullpath, datetimeformat);		
	}

	public static Boolean cloneObject(IContext c, IMendixObject source,
			IMendixObject target, Boolean withAssociations)
	{
		return org.community_commons.main.ORM.cloneObject(c, source, target, withAssociations);
	}

	public static synchronized Boolean acquireLock(IContext context, IMendixObject item) 
	{
		return org.community_commons.main.ORM.acquireLock(context,item);
	}

	public synchronized static Boolean releaseLock(IContext context, IMendixObject item, Boolean force)
	{
		return org.community_commons.main.ORM.releaseLock(context,item,force);
		
	}

	public static Boolean waitForLock(IContext context, IMendixObject item,
			Long timeOutSeconds) throws  InterruptedException
	{
		return org.community_commons.main.ORM.waitForLock(context,item,timeOutSeconds);
	}

	public static String getLockOwner(IMendixObject item)
	{
		return org.community_commons.main.ORM.getLockOwner(item);
	}

	public static IMendixObject firstWhere(IContext c, String entityName,
			Object member, String value) throws CoreException
	{
		return org.community_commons.main.ORM.firstWhere(c,entityName,member,value);
	}

	public synchronized static void releaseOldLocks()
	{
		org.community_commons.main.ORM.releaseOldLocks();
	}

	public static IMendixObject getLastChangedByUser(IContext context,
			IMendixObject thing) throws CoreException
	{
		return org.community_commons.main.ORM.getLastChangedByUser(context,thing);
	}

	public static IMendixObject getCreatedByUser(IContext context,
			IMendixObject thing) throws CoreException
	{
		return org.community_commons.main.ORM.getCreatedByUser(context,thing);
	}

	public static boolean encryptMemberIfChanged(IContext context, IMendixObject item,
			String member, String key) throws Exception
	{
		return org.community_commons.main.ORM.encryptMemberIfChanged(context,item,member,key);
		
	}

	public static void commitSilent(IContext c, IMendixObject mendixObject)
	{
		org.community_commons.main.ORM.commitSilent(c,mendixObject);
	}

	public static void copyAttributes(IContext context, IMendixObject source, IMendixObject target)
	{
		org.community_commons.main.ORM.copyAttributes(context,source,target);
	}
}
