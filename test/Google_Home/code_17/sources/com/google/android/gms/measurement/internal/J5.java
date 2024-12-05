package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class J5 implements InterfaceC2409o2 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f17232a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ List f17233b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ I5 f17234c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public J5(I5 i52, String str, List list) {
        this.f17232a = str;
        this.f17233b = list;
        this.f17234c = i52;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2409o2
    public final void a(String str, int i8, Throwable th, byte[] bArr, Map map) {
        this.f17234c.K(true, i8, th, bArr, this.f17232a, this.f17233b);
    }
}
