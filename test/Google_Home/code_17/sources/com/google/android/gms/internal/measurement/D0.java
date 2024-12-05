package com.google.android.gms.internal.measurement;

import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes3.dex */
final class D0 extends A0 {
    @Override // com.google.android.gms.internal.measurement.A0
    public final URLConnection b(URL url, String str) {
        return url.openConnection();
    }

    private D0() {
    }
}
