/**
 *
 * Copyright © 2016 Mycelium.
 * Use of this source code is governed by an ISC
 * license that can be found in the LICENSE file.
 *
 */

package com.shuffle.protocol;

import com.shuffle.bitcoin.impl.BitcoinCrypto;

import org.junit.Test;

import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/**
 * It is possible for a player to generate a different signature than everyone else. The players
 * all must check that the signature each of them generates matches the transaction that each of
 * them created.
 *
 * Created by Daniel Krawisz on 3/17/16.
 */
public class TestInvalidSignature extends TestShuffleMachine{
    public TestInvalidSignature() {
        super(99, 1);
    }

    private void InvalidTransactionSignature(int numPlayers, int[] mutants)
            throws NoSuchAlgorithmException, ExecutionException,
            InterruptedException, BitcoinCrypto.Exception {

        String description = "case " + caseNo + "; invalid transaction signature test case.";
        check(newTestCase(description).invalidSignatureTestCase(numPlayers, mutants));
    }

    @Test
    public void testInvalidSignature()
            throws NoSuchAlgorithmException, ExecutionException,
            InterruptedException, BitcoinCrypto.Exception {

        // Player generates a different transaction signature to everyone else.
        InvalidTransactionSignature(2, new int[]{2});
        InvalidTransactionSignature(5, new int[]{2});
        InvalidTransactionSignature(5, new int[]{2, 3});
        InvalidTransactionSignature(10, new int[]{2, 5, 6, 7});
    }
}
