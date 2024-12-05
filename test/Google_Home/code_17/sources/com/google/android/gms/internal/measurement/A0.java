package com.google.android.gms.internal.measurement;

import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes3.dex */
public abstract class A0 {

    /* renamed from: a, reason: collision with root package name */
    private static A0 f16049a = new D0();

    public static synchronized A0 a() {
        A0 a02;
        synchronized (A0.class) {
            a02 = f16049a;
        }
        return a02;
    }

    public abstract URLConnection b(URL url, String str);
}
