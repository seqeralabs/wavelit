/*
 *  Copyright (c) 2023, Seqera Labs.
 *
 *  This Source Code Form is subject to the terms of the Mozilla Public
 *  License, v. 2.0. If a copy of the MPL was not distributed with this
 *  file, You can obtain one at http://mozilla.org/MPL/2.0/.
 *
 *  This Source Code Form is "Incompatible With Secondary Licenses", as
 *  defined by the Mozilla Public License, v. 2.0.
 */

package io.seqera.wavelit.exception;

/**
 * Exception thrown to report a CLI validation error
 *
 * @author Paolo Di Tommaso <paolo.ditommaso@gmail.com>
 */
public class IllegalCliArgumentException extends RuntimeException {

    public IllegalCliArgumentException(String message) {
        super(message);
    }

    public IllegalCliArgumentException(String message, Throwable cause) {
        super(message, cause);
    }
}
