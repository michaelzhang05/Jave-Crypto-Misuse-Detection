package kotlin.reflect.x.internal.l0.k;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* compiled from: locks.kt */
/* loaded from: classes2.dex */
public class d implements k {

    /* renamed from: b, reason: collision with root package name */
    private final Lock f21157b;

    public d(Lock lock) {
        l.f(lock, "lock");
        this.f21157b = lock;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Lock a() {
        return this.f21157b;
    }

    @Override // kotlin.reflect.x.internal.l0.k.k
    public void lock() {
        this.f21157b.lock();
    }

    @Override // kotlin.reflect.x.internal.l0.k.k
    public void unlock() {
        this.f21157b.unlock();
    }

    public /* synthetic */ d(Lock lock, int i2, g gVar) {
        this((i2 & 1) != 0 ? new ReentrantLock() : lock);
    }
}
