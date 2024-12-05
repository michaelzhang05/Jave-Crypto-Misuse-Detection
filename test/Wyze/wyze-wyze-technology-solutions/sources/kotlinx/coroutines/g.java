package kotlinx.coroutines;

/* compiled from: EventLoop.kt */
/* loaded from: classes2.dex */
public final class g extends z0 {
    private final Thread l;

    public g(Thread thread) {
        this.l = thread;
    }

    @Override // kotlinx.coroutines.a1
    protected Thread D0() {
        return this.l;
    }
}
