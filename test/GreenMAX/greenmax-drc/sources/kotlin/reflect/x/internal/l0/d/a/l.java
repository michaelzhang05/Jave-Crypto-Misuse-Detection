package kotlin.reflect.x.internal.l0.d.a;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.b0;
import kotlin.collections.t;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.i1;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.x.internal.l0.d.a.l0.m.f;
import kotlin.reflect.x.internal.l0.i.e;
import kotlin.reflect.x.internal.l0.i.j;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.sequences.Sequence;
import kotlin.sequences.n;

/* compiled from: ErasedOverridabilityCondition.kt */
/* loaded from: classes2.dex */
public final class l implements e {

    /* compiled from: ErasedOverridabilityCondition.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[j.i.a.values().length];
            iArr[j.i.a.OVERRIDABLE.ordinal()] = 1;
            a = iArr;
        }
    }

    /* compiled from: ErasedOverridabilityCondition.kt */
    /* loaded from: classes2.dex */
    static final class b extends Lambda implements Function1<i1, e0> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f19952f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e0 invoke(i1 i1Var) {
            return i1Var.getType();
        }
    }

    @Override // kotlin.reflect.x.internal.l0.i.e
    public e.a a() {
        return e.a.SUCCESS_ONLY;
    }

    @Override // kotlin.reflect.x.internal.l0.i.e
    public e.b b(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        Sequence I;
        Sequence u;
        Sequence x;
        List m;
        Sequence w;
        boolean z;
        kotlin.reflect.jvm.internal.impl.descriptors.a c2;
        List<e1> i2;
        kotlin.jvm.internal.l.f(aVar, "superDescriptor");
        kotlin.jvm.internal.l.f(aVar2, "subDescriptor");
        if (aVar2 instanceof kotlin.reflect.x.internal.l0.d.a.k0.e) {
            kotlin.reflect.x.internal.l0.d.a.k0.e eVar2 = (kotlin.reflect.x.internal.l0.d.a.k0.e) aVar2;
            kotlin.jvm.internal.l.e(eVar2.getTypeParameters(), "subDescriptor.typeParameters");
            if (!(!r0.isEmpty())) {
                j.i w2 = j.w(aVar, aVar2);
                if ((w2 != null ? w2.c() : null) != null) {
                    return e.b.UNKNOWN;
                }
                List<i1> h2 = eVar2.h();
                kotlin.jvm.internal.l.e(h2, "subDescriptor.valueParameters");
                I = b0.I(h2);
                u = n.u(I, b.f19952f);
                e0 returnType = eVar2.getReturnType();
                kotlin.jvm.internal.l.c(returnType);
                x = n.x(u, returnType);
                w0 m0 = eVar2.m0();
                m = t.m(m0 != null ? m0.getType() : null);
                w = n.w(x, m);
                Iterator it = w.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    e0 e0Var = (e0) it.next();
                    if ((e0Var.M0().isEmpty() ^ true) && !(e0Var.R0() instanceof f)) {
                        z = true;
                        break;
                    }
                }
                if (!z && (c2 = aVar.c(new kotlin.reflect.x.internal.l0.d.a.l0.m.e(null, 1, null).c())) != null) {
                    if (c2 instanceof y0) {
                        y0 y0Var = (y0) c2;
                        kotlin.jvm.internal.l.e(y0Var.getTypeParameters(), "erasedSuper.typeParameters");
                        if (!r0.isEmpty()) {
                            y.a<? extends y0> u2 = y0Var.u();
                            i2 = t.i();
                            c2 = u2.m(i2).a();
                            kotlin.jvm.internal.l.c(c2);
                        }
                    }
                    j.i.a c3 = j.f20836b.F(c2, aVar2, false).c();
                    kotlin.jvm.internal.l.e(c3, "DEFAULT.isOverridableByW…Descriptor, false).result");
                    if (a.a[c3.ordinal()] == 1) {
                        return e.b.OVERRIDABLE;
                    }
                    return e.b.UNKNOWN;
                }
                return e.b.UNKNOWN;
            }
        }
        return e.b.UNKNOWN;
    }
}
