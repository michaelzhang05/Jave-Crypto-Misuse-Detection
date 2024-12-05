package androidx.core.os;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;

/* loaded from: classes.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f2155a = new d();

    private d() {
    }

    public static final void a(Bundle bundle, String str, Size size) {
        f5.h.e(bundle, "bundle");
        f5.h.e(str, "key");
        bundle.putSize(str, size);
    }

    public static final void b(Bundle bundle, String str, SizeF sizeF) {
        f5.h.e(bundle, "bundle");
        f5.h.e(str, "key");
        bundle.putSizeF(str, sizeF);
    }
}
