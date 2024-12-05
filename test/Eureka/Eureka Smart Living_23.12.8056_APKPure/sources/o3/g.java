package o3;

import java.util.concurrent.atomic.AtomicReference;
import r3.b;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    private static final g f8234b = new g();

    /* renamed from: c, reason: collision with root package name */
    private static final b f8235c = new b();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f8236a = new AtomicReference();

    /* loaded from: classes.dex */
    private static class b implements r3.b {
        private b() {
        }

        @Override // r3.b
        public b.a a(r3.c cVar, String str, String str2) {
            return f.f8232a;
        }
    }

    public static g b() {
        return f8234b;
    }

    public r3.b a() {
        r3.b bVar = (r3.b) this.f8236a.get();
        return bVar == null ? f8235c : bVar;
    }
}
