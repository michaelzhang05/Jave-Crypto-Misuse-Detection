package q0;

import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: q0.F, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3812F {

    /* renamed from: a, reason: collision with root package name */
    private final Object f38062a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private Queue f38063b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f38064c;

    public final void a(InterfaceC3811E interfaceC3811E) {
        synchronized (this.f38062a) {
            try {
                if (this.f38063b == null) {
                    this.f38063b = new ArrayDeque();
                }
                this.f38063b.add(interfaceC3811E);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Task task) {
        InterfaceC3811E interfaceC3811E;
        synchronized (this.f38062a) {
            if (this.f38063b != null && !this.f38064c) {
                this.f38064c = true;
                while (true) {
                    synchronized (this.f38062a) {
                        try {
                            interfaceC3811E = (InterfaceC3811E) this.f38063b.poll();
                            if (interfaceC3811E == null) {
                                this.f38064c = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    interfaceC3811E.b(task);
                }
            }
        }
    }
}
