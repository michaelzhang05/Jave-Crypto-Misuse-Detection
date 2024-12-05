package r0;

import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    private final Object f37510a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private Queue f37511b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f37512c;

    public final void a(E e8) {
        synchronized (this.f37510a) {
            try {
                if (this.f37511b == null) {
                    this.f37511b = new ArrayDeque();
                }
                this.f37511b.add(e8);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Task task) {
        E e8;
        synchronized (this.f37510a) {
            if (this.f37511b != null && !this.f37512c) {
                this.f37512c = true;
                while (true) {
                    synchronized (this.f37510a) {
                        try {
                            e8 = (E) this.f37511b.poll();
                            if (e8 == null) {
                                this.f37512c = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    e8.a(task);
                }
            }
        }
    }
}
