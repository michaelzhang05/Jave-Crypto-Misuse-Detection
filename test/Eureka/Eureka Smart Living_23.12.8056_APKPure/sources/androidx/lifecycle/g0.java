package androidx.lifecycle;

import androidx.lifecycle.f0;

/* loaded from: classes.dex */
public abstract /* synthetic */ class g0 {
    public static e0 a(f0.b bVar, Class cls) {
        f5.h.e(cls, "modelClass");
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    public static e0 b(f0.b bVar, Class cls, f0.a aVar) {
        f5.h.e(cls, "modelClass");
        f5.h.e(aVar, "extras");
        return bVar.a(cls);
    }
}
