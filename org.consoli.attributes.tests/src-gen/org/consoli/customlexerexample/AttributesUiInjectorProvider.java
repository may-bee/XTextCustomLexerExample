/*
* generated by Xtext
*/
package org.consoli.customlexerexample;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class AttributesUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.consoli.customlexerexample.ui.internal.AttributesActivator.getInstance().getInjector("org.consoli.customlexerexample.Attributes");
	}
	
}
