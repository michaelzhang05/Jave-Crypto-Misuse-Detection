package com.google.android.gms.internal.measurement;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.g5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2001g5 {

    /* renamed from: c, reason: collision with root package name */
    private static final C2001g5 f15717c = new C2001g5();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f15719b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2034k5 f15718a = new R4();

    private C2001g5() {
    }

    public static C2001g5 a() {
        return f15717c;
    }

    public final InterfaceC2026j5 b(Class cls) {
        B4.c(cls, "messageType");
        InterfaceC2026j5 interfaceC2026j5 = (InterfaceC2026j5) this.f15719b.get(cls);
        if (interfaceC2026j5 == null) {
            interfaceC2026j5 = this.f15718a.a(cls);
            B4.c(cls, "messageType");
            B4.c(interfaceC2026j5, "schema");
            InterfaceC2026j5 interfaceC2026j52 = (InterfaceC2026j5) this.f15719b.putIfAbsent(cls, interfaceC2026j5);
            if (interfaceC2026j52 != null) {
                return interfaceC2026j52;
            }
        }
        return interfaceC2026j5;
    }
}
