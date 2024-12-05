package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class zzyg {
    protected static final Charset a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    private static final Charset f16184b = Charset.forName("ISO-8859-1");

    /* renamed from: c, reason: collision with root package name */
    public static final Object f16185c = new Object();

    public static void a(zzyc zzycVar, zzyc zzycVar2) {
        zzye zzyeVar = zzycVar.f16175b;
        if (zzyeVar != null) {
            zzycVar2.f16175b = (zzye) zzyeVar.clone();
        }
    }
}
