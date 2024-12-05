package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.q5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2225q5 implements InterfaceC2233r5 {
    private static InterfaceC2180l5 c(Object obj, long j8) {
        return (InterfaceC2180l5) AbstractC2243s6.B(obj, j8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2233r5
    public final void a(Object obj, long j8) {
        c(obj, j8).x();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2233r5
    public final void b(Object obj, Object obj2, long j8) {
        InterfaceC2180l5 c8 = c(obj, j8);
        InterfaceC2180l5 c9 = c(obj2, j8);
        int size = c8.size();
        int size2 = c9.size();
        if (size > 0 && size2 > 0) {
            if (!c8.b()) {
                c8 = c8.a(size2 + size);
            }
            c8.addAll(c9);
        }
        if (size > 0) {
            c9 = c8;
        }
        AbstractC2243s6.j(obj, j8, c9);
    }
}
