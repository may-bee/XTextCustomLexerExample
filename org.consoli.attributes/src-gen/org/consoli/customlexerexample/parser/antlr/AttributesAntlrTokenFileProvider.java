/*
* generated by Xtext
*/
package org.consoli.customlexerexample.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class AttributesAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.tokens");
	}
}
