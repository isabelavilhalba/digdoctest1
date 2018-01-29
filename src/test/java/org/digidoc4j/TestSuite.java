package org.digidoc4j;

import org.digidoc4j.test.Refactored;
import org.junit.runner.RunWith;

import com.googlecode.junittoolbox.IncludeCategories;
import com.googlecode.junittoolbox.SuiteClasses;
import com.googlecode.junittoolbox.WildcardPatternSuite;

/**
 * Created by Janar Rahumeel (CGI Estonia)
 */

@SuiteClasses("**/*Test.class")
@RunWith(WildcardPatternSuite.class)
@IncludeCategories({Refactored.class})
public final class TestSuite {
}
