package androidx.core.os;

import android.os.Bundle;
import android.os.IBinder;

/* loaded from: classes.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f2154a = new c();

    private c() {
    }

    public static final void a(Bundle bundle, String str, IBinder iBinder) {
        f5.h.e(bundle, "bundle");
        f5.h.e(str, "key");
        bundle.putBinder(str, iBinder);
    }
}
