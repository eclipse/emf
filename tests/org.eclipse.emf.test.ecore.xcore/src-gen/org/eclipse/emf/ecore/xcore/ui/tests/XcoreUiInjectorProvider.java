/*
 * generated by Xtext
 */
package org.eclipse.emf.ecore.xcore.ui.tests;

import com.google.inject.Injector;
import org.eclipse.emf.ecore.xcore.ui.internal.XcoreActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class XcoreUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return XcoreActivator.getInstance().getInjector("org.eclipse.emf.ecore.xcore.Xcore");
	}

}
