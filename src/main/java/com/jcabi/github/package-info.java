/**
 * Copyright (c) 2012-2013, JCabi.com
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met: 1) Redistributions of source code must retain the above
 * copyright notice, this list of conditions and the following
 * disclaimer. 2) Redistributions in binary form must reproduce the above
 * copyright notice, this list of conditions and the following
 * disclaimer in the documentation and/or other materials provided
 * with the distribution. 3) Neither the name of the jcabi.com nor
 * the names of its contributors may be used to endorse or promote
 * products derived from this software without specific prior written
 * permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT
 * NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 * FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL
 * THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 */

/**
 * Object Oriented Github API.
 *
 * <p>The only dependency you need is (check our latest version available
 * at <a href="http://github.jcabi.com">github.jcabi.com</a>):
 *
 * <pre>&lt;depedency&gt;
 *   &lt;groupId&gt;com.jcabi&lt;/groupId&gt;
 *   &lt;artifactId&gt;jcabi-github&lt;/artifactId&gt;
 * &lt;/dependency&gt;</pre>
 *
 * @author Yegor Bugayenko (yegor@tpc2.com)
 * @version $Id$
 * @since 0.1
 * @see <a href="http://github.jcabi.com/">project website</a>
 * @todo #1:1hr Use RequestBody#set(JsonValue) as soon as it is introduced
 *  in rexsl-test. Let's use this new method as soon as it becomes
 *  available. Instead of building objects using JsonGenerator (for example,
 *  see GhComments#post), let's use JsonObjectBuilder. See
 *  https://github.com/yegor256/rexsl/issues/740
 * @todo #1 Change class prefixes from Gh to Rt. Let's rename all classes
 *  by changing their prefixes. Now we're using Gh, which is semantically
 *  not correct. Rt will stand for REST. Also, let's rename DefaultGithub
 *  to RtGithub. Let's not forget to update Maven documentation and README.md.
 */
package com.jcabi.github;