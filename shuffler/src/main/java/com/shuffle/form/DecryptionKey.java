package com.shuffle.form;

/**
 * A private key used for decryption.
 *
 * Created by Daniel Krawisz on 12/4/15.
 */
public interface DecryptionKey {
    EncryptionKey EncryptionKey();
    boolean decrypt(Packet m);
}
