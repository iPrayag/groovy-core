/*
 * Copyright 2003-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import groovy.util.AllTestSuite;
import junit.framework.Test;
import junit.framework.TestCase;

/**
 * Collects all VM 5 Bug-related tests.
 *
 * @author <a href="mailto:jeremy.rayner@bigfoot.com">Jeremy Rayner</a>
 * @version $Revision: 6190 $
 */
public class UberTestCaseBugs_VM5 extends TestCase {
    public static Test suite() {
        return AllTestSuite.suite("./src/test", "groovy/**/vm5/*Bug.groovy");
    }
}