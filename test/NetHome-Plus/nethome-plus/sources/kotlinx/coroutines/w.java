package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: CompletionState.kt */
/* loaded from: classes2.dex */
public class w {
    private static final /* synthetic */ AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(w.class, "_handled");
    private volatile /* synthetic */ int _handled;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f22295b;

    public w(Throwable th, boolean z) {
        this.f22295b = th;
        this._handled = z ? 1 : 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean a() {
        return this._handled;
    }

    public final boolean b() {
        return a.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return m0.a(this) + '[' + this.f22295b + ']';
    }

    public /* synthetic */ w(Throwable th, boolean z, int i2, kotlin.jvm.internal.g gVar) {
        this(th, (i2 & 2) != 0 ? false : z);
    }
}
