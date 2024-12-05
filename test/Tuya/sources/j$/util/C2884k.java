package j$.util;

import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2884k extends C2882i implements RandomAccess {
    private static final long serialVersionUID = 1530674583602358482L;

    private Object writeReplace() {
        return new C2882i(this.f32224c);
    }

    @Override // j$.util.C2882i, java.util.List
    public final java.util.List subList(int i8, int i9) {
        C2882i c2882i;
        synchronized (this.f32220b) {
            c2882i = new C2882i(this.f32224c.subList(i8, i9), this.f32220b);
        }
        return c2882i;
    }
}
