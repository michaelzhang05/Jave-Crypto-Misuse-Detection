package rx.l.b;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: RxAndroidPlugins.java */
/* loaded from: classes2.dex */
public final class a {
    private static final a a = new a();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference<b> f22461b = new AtomicReference<>();

    a() {
    }

    public static a a() {
        return a;
    }

    public b b() {
        if (this.f22461b.get() == null) {
            this.f22461b.compareAndSet(null, b.a());
        }
        return this.f22461b.get();
    }
}
