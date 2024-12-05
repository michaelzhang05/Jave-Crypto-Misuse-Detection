package j$.util;

import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3018v extends C2889p implements RandomAccess {
    private static final long serialVersionUID = -2542308836966382001L;

    private Object writeReplace() {
        return new C2889p(this.f32251b);
    }

    @Override // j$.util.C2889p, java.util.List
    public final java.util.List subList(int i8, int i9) {
        return new C2889p(this.f32251b.subList(i8, i9));
    }
}
