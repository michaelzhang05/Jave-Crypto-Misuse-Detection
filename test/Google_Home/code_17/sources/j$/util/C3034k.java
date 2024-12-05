package j$.util;

import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3034k extends C3032i implements RandomAccess {
    private static final long serialVersionUID = 1530674583602358482L;

    private Object writeReplace() {
        return new C3032i(this.f33418c);
    }

    @Override // j$.util.C3032i, java.util.List
    public final java.util.List subList(int i8, int i9) {
        C3032i c3032i;
        synchronized (this.f33414b) {
            c3032i = new C3032i(this.f33418c.subList(i8, i9), this.f33414b);
        }
        return c3032i;
    }
}
