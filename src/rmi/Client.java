/*
 * Copyright &#169; 2004, 2010 Oracle and/or its affiliates. All  Rights Reserved.
 *  
 * Redistribution and use in source and binary forms, with or 
 * without modification, are permitted provided that the following 
 * conditions are met:
 * 
 * -Redistributions of source code must retain the above copyright  
 *  notice, this list of conditions and the following disclaimer.
 * 
 * -Redistribution in binary form must reproduce the above copyright 
 *  notice, this list of conditions and the following disclaimer in 
 *  the documentation and/or other materials provided with the 
 *  distribution.
 *  
 * Neither the name of Oracle and/or its affiliates. or the names of 
 * contributors may be used to endorse or promote products derived 
 * from this software without specific prior written permission.
 * 
 * This software is provided "AS IS," without a warranty of any
 * kind. ALL EXPRESS OR IMPLIED CONDITIONS, REPRESENTATIONS AND
 * WARRANTIES, INCLUDING ANY IMPLIED WARRANTY OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE OR NON-INFRINGEMENT, ARE HEREBY
 * EXCLUDED. Oracle and/or its affiliates. ("SUN") AND ITS LICENSORS SHALL
 * NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF
 * USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS
 * DERIVATIVES. IN NO EVENT WILL SUN OR ITS LICENSORS BE LIABLE FOR
 * ANY LOST REVENUE, PROFIT OR DATA, OR FOR DIRECT, INDIRECT,
 * SPECIAL, CONSEQUENTIAL, INCIDENTAL OR PUNITIVE DAMAGES, HOWEVER
 * CAUSED AND REGARDLESS OF THE THEORY OF LIABILITY, ARISING OUT OF
 * THE USE OF OR INABILITY TO USE THIS SOFTWARE, EVEN IF SUN HAS BEEN
 * ADVISED OF THE POSSIBILITY OF SUCH DAMAGES.
 *  
 * You acknowledge that Software is not designed, licensed or 
 * intended for use in the design, construction, operation or 
 * maintenance of any nuclear facility.
 */
package rmi;

import interfaces.IGestorDeJuegos;
import interfaces.IGestorDeUsuarios;
import interfaces.IUsuario_no_identificado;
import interfaces.IUsuario_registrado;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

	protected IUsuario_no_identificado stubUNR;
	protected IUsuario_registrado stubUR;
	protected IGestorDeJuegos stubGJ;
	protected IGestorDeUsuarios stubGU;

	public Client() {
		try {
			
			
			//Hello stub = (Hello) registry.lookup("Hello");
		   // String response = stub.sayHello();
		    //System.out.println("response: " + response);
			Registry registry =  LocateRegistry.getRegistry("127.0.0.1", 2012);
			stubUNR = (IUsuario_no_identificado) registry.lookup("mds");
			stubUR = (IUsuario_registrado) registry.lookup("mds");
			stubGJ = (IGestorDeJuegos) registry.lookup("mds");
			stubGU = (IGestorDeUsuarios) registry.lookup("mds");

		} catch (Exception e) {
			System.err.println("Client exception: " + e.toString());
			e.printStackTrace();
		}

	}
	public IUsuario_no_identificado getStubUNR() {
		return stubUNR;
	}

	public void setStubUNR(IUsuario_no_identificado stubUNR) {
		this.stubUNR = stubUNR;
	}

	public IUsuario_registrado getStubUR() {
		return stubUR;
	}

	public void setStubUR(IUsuario_registrado stubUR) {
		this.stubUR = stubUR;
	}

	public IGestorDeJuegos getStubGJ() {
		return stubGJ;
	}

	public void setStubGJ(IGestorDeJuegos stubGJ) {
		this.stubGJ = stubGJ;
	}

	public IGestorDeUsuarios getStubGU() {
		return stubGU;
	}

	public void setStubGU(IGestorDeUsuarios stubGU) {
		this.stubGU = stubGU;
	}
	
	
	

}
