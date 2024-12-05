package com.google.android.gms.internal.measurement;

import java.io.File;

/* renamed from: com.google.android.gms.internal.measurement.m0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2184m0 implements InterfaceC2193n0 {
    @Override // com.google.android.gms.internal.measurement.InterfaceC2193n0
    public final String a(String str, AbstractC2228r0 abstractC2228r0, EnumC2202o0 enumC2202o0) {
        return str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2193n0
    public final /* synthetic */ String b(File file, String str) {
        return e(file, str, AbstractC2228r0.f16791a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2193n0
    public final /* synthetic */ String c(String str) {
        return d(str, AbstractC2228r0.f16791a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2193n0
    public final /* synthetic */ String d(String str, AbstractC2228r0 abstractC2228r0) {
        return a(str, abstractC2228r0, EnumC2202o0.RAW_FILE_IO_TYPE);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2193n0
    public final /* synthetic */ String e(File file, String str, AbstractC2228r0 abstractC2228r0) {
        return d(new File(file, str).getPath(), abstractC2228r0);
    }
}
