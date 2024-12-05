package kotlin.reflect.x.internal.l0.l;

import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.f.c;
import kotlin.reflect.x.internal.l0.f.d;
import kotlin.reflect.x.internal.l0.l.w1.i;
import kotlin.reflect.x.internal.l0.l.w1.k;
import kotlin.reflect.x.internal.l0.l.w1.n;
import kotlin.reflect.x.internal.l0.l.w1.o;
import kotlin.reflect.x.internal.l0.l.w1.p;

/* compiled from: TypeSystemCommonBackendContext.kt */
/* loaded from: classes2.dex */
public interface m1 extends p {

    /* compiled from: TypeSystemCommonBackendContext.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static i a(m1 m1Var, i iVar) {
            k d2;
            l.f(iVar, "$receiver");
            k a = m1Var.a(iVar);
            return (a == null || (d2 = m1Var.d(a, true)) == null) ? iVar : d2;
        }
    }

    i C0(i iVar);

    d K(n nVar);

    boolean a0(n nVar);

    i b0(i iVar);

    boolean i(n nVar);

    kotlin.reflect.x.internal.l0.b.i i0(n nVar);

    kotlin.reflect.x.internal.l0.b.i l(n nVar);

    boolean l0(i iVar, c cVar);

    i m(o oVar);
}
