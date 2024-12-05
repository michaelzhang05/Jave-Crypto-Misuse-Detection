package I2;

import L5.s;
import com.google.android.gms.tasks.Task;
import i6.C2839p;
import i6.InterfaceC2837o;
import kotlin.jvm.internal.AbstractC3159y;
import r0.AbstractC3670a;
import r0.InterfaceC3674e;

/* loaded from: classes4.dex */
public abstract class i {
    public static final Object a(Task task, AbstractC3670a abstractC3670a, P5.d dVar) {
        if (task.m()) {
            return task;
        }
        final C2839p c2839p = new C2839p(Q5.b.c(dVar), 1);
        c2839p.B();
        task.b(c.f3909a, new InterfaceC3674e() { // from class: I2.i.a
            @Override // r0.InterfaceC3674e
            public final void a(Task p02) {
                AbstractC3159y.i(p02, "p0");
                InterfaceC2837o.this.resumeWith(s.b(p02));
            }
        });
        Object y8 = c2839p.y();
        if (y8 == Q5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y8;
    }

    public static /* synthetic */ Object b(Task task, AbstractC3670a abstractC3670a, P5.d dVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            abstractC3670a = null;
        }
        return a(task, abstractC3670a, dVar);
    }
}
