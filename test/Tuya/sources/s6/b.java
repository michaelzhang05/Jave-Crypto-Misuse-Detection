package s6;

import L5.s;
import L5.t;
import P5.d;
import com.google.android.gms.tasks.Task;
import i6.C2839p;
import i6.InterfaceC2837o;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.h;
import r0.AbstractC3670a;
import r0.InterfaceC3674e;

/* loaded from: classes5.dex */
public abstract class b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC3674e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2837o f38033a;

        a(InterfaceC2837o interfaceC2837o) {
            this.f38033a = interfaceC2837o;
        }

        @Override // r0.InterfaceC3674e
        public final void a(Task task) {
            Exception i8 = task.i();
            if (i8 == null) {
                if (task.l()) {
                    InterfaceC2837o.a.a(this.f38033a, null, 1, null);
                    return;
                }
                InterfaceC2837o interfaceC2837o = this.f38033a;
                s.a aVar = s.f6511b;
                interfaceC2837o.resumeWith(s.b(task.j()));
                return;
            }
            InterfaceC2837o interfaceC2837o2 = this.f38033a;
            s.a aVar2 = s.f6511b;
            interfaceC2837o2.resumeWith(s.b(t.a(i8)));
        }
    }

    public static final Object a(Task task, d dVar) {
        return b(task, null, dVar);
    }

    private static final Object b(Task task, AbstractC3670a abstractC3670a, d dVar) {
        if (task.m()) {
            Exception i8 = task.i();
            if (i8 == null) {
                if (!task.l()) {
                    return task.j();
                }
                throw new CancellationException("Task " + task + " was cancelled normally.");
            }
            throw i8;
        }
        C2839p c2839p = new C2839p(Q5.b.c(dVar), 1);
        c2839p.B();
        task.b(ExecutorC3762a.f38032a, new a(c2839p));
        Object y8 = c2839p.y();
        if (y8 == Q5.b.e()) {
            h.c(dVar);
        }
        return y8;
    }
}
