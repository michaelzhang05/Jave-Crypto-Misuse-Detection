package j$.util;

import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3168v extends C3039p implements RandomAccess {
    private static final long serialVersionUID = -2542308836966382001L;

    private Object writeReplace() {
        return new C3039p(this.f33445b);
    }

    @Override // j$.util.C3039p, java.util.List
    public final java.util.List subList(int i8, int i9) {
        return new C3039p(this.f33445b.subList(i8, i9));
    }
}
