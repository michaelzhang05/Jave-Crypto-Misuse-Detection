package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class zzdrv {
    private static final Charset a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    private static final Charset f14901b = Charset.forName("ISO-8859-1");

    /* renamed from: c, reason: collision with root package name */
    public static final Object f14902c = new Object();

    public static void a(zzdrr zzdrrVar, zzdrr zzdrrVar2) {
        zzdrt zzdrtVar = zzdrrVar.f14895b;
        if (zzdrtVar != null) {
            zzdrrVar2.f14895b = (zzdrt) zzdrtVar.clone();
        }
    }
}
