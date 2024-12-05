package kotlinx.coroutines.i2;

import kotlinx.coroutines.m0;

/* compiled from: Tasks.kt */
/* loaded from: classes2.dex */
public final class k extends i {

    /* renamed from: h, reason: collision with root package name */
    public final Runnable f22194h;

    public k(Runnable runnable, long j2, j jVar) {
        super(j2, jVar);
        this.f22194h = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f22194h.run();
        } finally {
            this.f22193g.w();
        }
    }

    public String toString() {
        return "Task[" + m0.a(this.f22194h) + '@' + m0.b(this.f22194h) + ", " + this.f22192f + ", " + this.f22193g + ']';
    }
}
