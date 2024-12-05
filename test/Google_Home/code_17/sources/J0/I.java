package J0;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f4638a = new AtomicInteger();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f4639b = new AtomicInteger();

    public void a() {
        this.f4639b.getAndIncrement();
    }

    public void b() {
        this.f4638a.getAndIncrement();
    }

    public void c() {
        this.f4639b.set(0);
    }
}
