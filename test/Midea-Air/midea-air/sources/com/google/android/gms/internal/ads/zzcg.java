package com.google.android.gms.internal.ads;

import android.util.Base64;

/* loaded from: classes2.dex */
public final class zzcg {
    public static String a(byte[] bArr, boolean z) {
        return Base64.encodeToString(bArr, z ? 11 : 2);
    }

    public static byte[] b(String str, boolean z) throws IllegalArgumentException {
        byte[] decode = Base64.decode(str, z ? 11 : 2);
        if (decode.length != 0 || str.length() <= 0) {
            return decode;
        }
        throw new IllegalArgumentException(str.length() != 0 ? "Unable to decode ".concat(str) : new String("Unable to decode "));
    }
}
