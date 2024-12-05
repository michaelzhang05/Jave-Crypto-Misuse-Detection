package v6;

import O5.s;
import O5.t;
import S5.d;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.h;
import l6.C3374p;
import l6.InterfaceC3372o;
import q0.AbstractC3817a;
import q0.InterfaceC3821e;

/* loaded from: classes5.dex */
public abstract class b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC3821e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3372o f40306a;

        a(InterfaceC3372o interfaceC3372o) {
            this.f40306a = interfaceC3372o;
        }

        @Override // q0.InterfaceC3821e
        public final void a(Task task) {
            Exception i8 = task.i();
            if (i8 == null) {
                if (task.l()) {
                    InterfaceC3372o.a.a(this.f40306a, null, 1, null);
                    return;
                }
                InterfaceC3372o interfaceC3372o = this.f40306a;
                s.a aVar = s.f8302b;
                interfaceC3372o.resumeWith(s.b(task.j()));
                return;
            }
            InterfaceC3372o interfaceC3372o2 = this.f40306a;
            s.a aVar2 = s.f8302b;
            interfaceC3372o2.resumeWith(s.b(t.a(i8)));
        }
    }

    public static final Object a(Task task, d dVar) {
        return b(task, null, dVar);
    }

    private static final Object b(Task task, AbstractC3817a abstractC3817a, d dVar) {
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
        C3374p c3374p = new C3374p(T5.b.c(dVar), 1);
        c3374p.C();
        task.b(ExecutorC4115a.f40305a, new a(c3374p));
        Object y8 = c3374p.y();
        if (y8 == T5.b.e()) {
            h.c(dVar);
        }
        return y8;
    }
}
