package h.a.z.j;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AtomicThrowable.java */
/* loaded from: classes2.dex */
public final class a extends AtomicReference<Throwable> {
    public boolean a(Throwable th) {
        return c.a(this, th);
    }

    public Throwable b() {
        return c.b(this);
    }
}
