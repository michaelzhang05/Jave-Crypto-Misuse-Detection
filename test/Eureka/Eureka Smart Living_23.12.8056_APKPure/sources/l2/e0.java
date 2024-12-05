package l2;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f7358a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private Queue f7359b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7360c;

    public final void a(d0 d0Var) {
        synchronized (this.f7358a) {
            if (this.f7359b == null) {
                this.f7359b = new ArrayDeque();
            }
            this.f7359b.add(d0Var);
        }
    }

    public final void b(i iVar) {
        d0 d0Var;
        synchronized (this.f7358a) {
            if (this.f7359b != null && !this.f7360c) {
                this.f7360c = true;
                while (true) {
                    synchronized (this.f7358a) {
                        d0Var = (d0) this.f7359b.poll();
                        if (d0Var == null) {
                            this.f7360c = false;
                            return;
                        }
                    }
                    d0Var.b(iVar);
                }
            }
        }
    }
}
