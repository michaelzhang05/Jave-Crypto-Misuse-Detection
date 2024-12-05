package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* loaded from: classes2.dex */
public interface zzrv {
    long a(zzry zzryVar) throws IOException;

    void close() throws IOException;

    Uri n0();

    int read(byte[] bArr, int i2, int i3) throws IOException;
}
