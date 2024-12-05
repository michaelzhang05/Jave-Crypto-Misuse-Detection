package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class K4 extends M4 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ K4(J4 j42) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.M4
    public final void a(Object obj, long j8) {
        ((A4) AbstractC2153z5.k(obj, j8)).b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.M4
    public final void b(Object obj, Object obj2, long j8) {
        A4 a42 = (A4) AbstractC2153z5.k(obj, j8);
        A4 a43 = (A4) AbstractC2153z5.k(obj2, j8);
        int size = a42.size();
        int size2 = a43.size();
        if (size > 0 && size2 > 0) {
            if (!a42.c()) {
                a42 = a42.k(size2 + size);
            }
            a42.addAll(a43);
        }
        if (size > 0) {
            a43 = a42;
        }
        AbstractC2153z5.x(obj, j8, a43);
    }
}
