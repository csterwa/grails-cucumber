/*
 * Copyright 2011 Martin Hauner
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

package grails.plugin.cucumber

import grails.plugin.spock.*


class CucumberTestTypeSpec extends UnitSpec {

    def "the name is 'cucumber'" () {
        when:
        def testType = new CucumberTestType ('base', null, null)

        then:
        testType.name == "cucumber"
    }

    def "the relative source path is 'cucumber'" () {
        when:
        def testType = new CucumberTestType ('base', null, null)

        then:
        testType.relativeSourcePath == 'base'
    }

    def "the test extension is 'feature'" () {
        when:
        def testType = new CucumberTestType ('base', null, null)

        then:
        testType.testExtensions.size() == 1
        testType.testExtensions.contains ("feature")
    }
}
