/**
 *
 * Copyright © 2016 Mycelium.
 * Use of this source code is governed by an ISC
 * license that can be found in the LICENSE file.
 *
 */

package com.shuffle.p2p;

import com.shuffle.chan.SendChan;

import java.io.IOException;

/**
 * The session is an open means of communication between two peers.
 *
 * Created by Daniel Krawisz on 1/25/16.
 */
public interface Session<Identity, Message> extends SendChan<Message> {

    // Whether the session has been closed.
    boolean closed();

    // The peer corresponding to this session.
    Peer<Identity, Message> peer();
}
