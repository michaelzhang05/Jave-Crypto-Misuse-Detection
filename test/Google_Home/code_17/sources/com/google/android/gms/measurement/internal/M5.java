package com.google.android.gms.measurement.internal;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class M5 implements InterfaceC2409o2 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f17264a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ S5 f17265b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ I5 f17266c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public M5(I5 i52, String str, S5 s52) {
        this.f17264a = str;
        this.f17265b = s52;
        this.f17266c = i52;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2409o2
    public final void a(String str, int i8, Throwable th, byte[] bArr, Map map) {
        this.f17266c.A(this.f17264a, i8, th, bArr, this.f17265b);
    }
}
