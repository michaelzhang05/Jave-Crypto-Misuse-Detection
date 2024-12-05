package L2;

import O5.s;
import com.google.android.gms.tasks.Task;
import kotlin.jvm.internal.AbstractC3255y;
import l6.C3374p;
import l6.InterfaceC3372o;
import q0.AbstractC3817a;
import q0.InterfaceC3821e;

/* loaded from: classes4.dex */
public abstract class i {
    public static final Object a(Task task, AbstractC3817a abstractC3817a, S5.d dVar) {
        if (task.m()) {
            return task;
        }
        final C3374p c3374p = new C3374p(T5.b.c(dVar), 1);
        c3374p.C();
        task.b(c.f5904a, new InterfaceC3821e() { // from class: L2.i.a
            @Override // q0.InterfaceC3821e
            public final void a(Task p02) {
                AbstractC3255y.i(p02, "p0");
                InterfaceC3372o.this.resumeWith(s.b(p02));
            }
        });
        Object y8 = c3374p.y();
        if (y8 == T5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y8;
    }

    public static /* synthetic */ Object b(Task task, AbstractC3817a abstractC3817a, S5.d dVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            abstractC3817a = null;
        }
        return a(task, abstractC3817a, dVar);
    }
}
