package s6;

import l6.Q;

/* renamed from: s6.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4016k extends AbstractRunnableC4013h {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f39320c;

    public C4016k(Runnable runnable, long j8, InterfaceC4014i interfaceC4014i) {
        super(j8, interfaceC4014i);
        this.f39320c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f39320c.run();
        } finally {
            this.f39318b.a();
        }
    }

    public String toString() {
        return "Task[" + Q.a(this.f39320c) + '@' + Q.b(this.f39320c) + ", " + this.f39317a + ", " + this.f39318b + ']';
    }
}
