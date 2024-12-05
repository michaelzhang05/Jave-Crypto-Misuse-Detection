package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

/* loaded from: classes2.dex */
public final class zzdll implements zzdby {
    private Mac a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14798b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14799c;

    /* renamed from: d, reason: collision with root package name */
    private final Key f14800d;

    public zzdll(String str, Key key, int i2) throws GeneralSecurityException {
        if (i2 >= 10) {
            str.hashCode();
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1823053428:
                    if (str.equals("HMACSHA1")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 392315118:
                    if (str.equals("HMACSHA256")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 392317873:
                    if (str.equals("HMACSHA512")) {
                        c2 = 2;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    if (i2 > 20) {
                        throw new InvalidAlgorithmParameterException("tag size too big");
                    }
                    break;
                case 1:
                    if (i2 > 32) {
                        throw new InvalidAlgorithmParameterException("tag size too big");
                    }
                    break;
                case 2:
                    if (i2 > 64) {
                        throw new InvalidAlgorithmParameterException("tag size too big");
                    }
                    break;
                default:
                    throw new NoSuchAlgorithmException(str.length() != 0 ? "unknown Hmac algorithm: ".concat(str) : new String("unknown Hmac algorithm: "));
            }
            this.f14799c = str;
            this.f14798b = i2;
            this.f14800d = key;
            Mac b2 = zzdkx.f14784d.b(str);
            this.a = b2;
            b2.init(key);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    @Override // com.google.android.gms.internal.ads.zzdby
    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        Mac b2;
        try {
            b2 = (Mac) this.a.clone();
        } catch (CloneNotSupportedException unused) {
            b2 = zzdkx.f14784d.b(this.f14799c);
            b2.init(this.f14800d);
        }
        b2.update(bArr);
        byte[] bArr2 = new byte[this.f14798b];
        System.arraycopy(b2.doFinal(), 0, bArr2, 0, this.f14798b);
        return bArr2;
    }
}
