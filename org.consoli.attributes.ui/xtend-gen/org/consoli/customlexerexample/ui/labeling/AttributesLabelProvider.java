/**
 * generated by Xtext
 */
package org.consoli.customlexerexample.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
@SuppressWarnings("all")
public class AttributesLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public AttributesLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
}
