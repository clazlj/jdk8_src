package org.omg.PortableServer;


/**
* org/omg/PortableServer/ServantRetentionPolicyOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/workspace/8-2-build-windows-amd64-cygwin/jdk8u31/2394/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Wednesday, December 17, 2014 9:02:22 PM PST
*/


/**
	 * This policy specifies whether the created POA retains 
	 * active servants in an Active Object Map. 
	 */
public interface ServantRetentionPolicyOperations  extends org.omg.CORBA.PolicyOperations
{

  /**
	 * specifies the policy value
	 */
  org.omg.PortableServer.ServantRetentionPolicyValue value ();
} // interface ServantRetentionPolicyOperations