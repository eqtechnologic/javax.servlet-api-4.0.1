/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2017-2017 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * https://oss.oracle.com/licenses/CDDL+GPL-1.1
 * or LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */

package jakarta.servlet.annotation;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * This annotation is used to declare the class types that a
 * {@link jakarta.servlet.ServletContainerInitializer
 * ServletContainerInitializer} can handle.
 *
 * @see jakarta.servlet.ServletContainerInitializer
 *
 * @since Servlet 3.0
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface HandlesTypes {

    /**
     * The classes in which a {@link jakarta.servlet.ServletContainerInitializer
     * ServletContainerInitializer} has expressed interest.
     *
     * <p>If an implementation of <tt>ServletContainerInitializer</tt> 
     * specifies this annotation, the Servlet container must pass the
     * <tt>Set</tt> of application classes that extend, implement, or have
     * been annotated with the class types listed by this annotation to
     * the {@link jakarta.servlet.ServletContainerInitializer#onStartup}
     * method of the ServletContainerInitializer (if no matching classes
     * are found, <tt>null</tt> must be passed instead)
     * 
     * @return the classes in which {@link jakarta.servlet.ServletContainerInitializer
     *         ServletContainerInitializer} has expressed interest
     */
    Class<?>[] value();
}
