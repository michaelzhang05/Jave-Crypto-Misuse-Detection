package kotlin.reflect.x.internal.l0.b.p;

import java.util.List;
import kotlin.collections.s;
import kotlin.collections.t;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.x.internal.l0.i.w.e;
import kotlin.reflect.x.internal.l0.k.n;

/* compiled from: FunctionClassScope.kt */
/* loaded from: classes2.dex */
public final class d extends e {

    /* compiled from: FunctionClassScope.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            iArr[c.f19742g.ordinal()] = 1;
            iArr[c.f19743h.ordinal()] = 2;
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n nVar, b bVar) {
        super(nVar, bVar);
        l.f(nVar, "storageManager");
        l.f(bVar, "containingClass");
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.e
    protected List<y> i() {
        List<y> e2;
        List<y> e3;
        List<y> i2;
        kotlin.reflect.jvm.internal.impl.descriptors.e l = l();
        l.d(l, "null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor");
        int i3 = a.a[((b) l).V0().ordinal()];
        if (i3 == 1) {
            e2 = s.e(e.J.a((b) l(), false));
            return e2;
        }
        if (i3 != 2) {
            i2 = t.i();
            return i2;
        }
        e3 = s.e(e.J.a((b) l(), true));
        return e3;
    }
}
