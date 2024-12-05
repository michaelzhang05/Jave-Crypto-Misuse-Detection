package L6;

import I6.B;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final Set f6297a = new LinkedHashSet();

    public synchronized void a(B b8) {
        this.f6297a.remove(b8);
    }

    public synchronized void b(B b8) {
        this.f6297a.add(b8);
    }

    public synchronized boolean c(B b8) {
        return this.f6297a.contains(b8);
    }
}
