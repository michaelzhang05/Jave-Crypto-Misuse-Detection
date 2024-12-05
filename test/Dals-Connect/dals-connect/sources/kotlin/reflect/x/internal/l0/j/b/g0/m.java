package kotlin.reflect.x.internal.l0.j.b.g0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.c;
import kotlin.reflect.jvm.internal.impl.descriptors.p1.b;
import kotlin.reflect.x.internal.l0.e.q;
import kotlin.reflect.x.internal.l0.e.s;
import kotlin.reflect.x.internal.l0.e.z.f;
import kotlin.reflect.x.internal.l0.j.b.d0;
import kotlin.reflect.x.internal.l0.l.e0;

/* compiled from: DeserializedTypeParameterDescriptor.kt */
/* loaded from: classes2.dex */
public final class m extends b {
    private final kotlin.reflect.x.internal.l0.j.b.m p;
    private final s q;
    private final kotlin.reflect.x.internal.l0.j.b.g0.a r;

    /* compiled from: DeserializedTypeParameterDescriptor.kt */
    /* loaded from: classes2.dex */
    static final class a extends Lambda implements Function0<List<? extends c>> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends c> invoke() {
            List<? extends c> y0;
            y0 = b0.y0(m.this.p.c().d().a(m.this.P0(), m.this.p.g()));
            return y0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m(kotlin.reflect.x.internal.l0.j.b.m r12, kotlin.reflect.x.internal.l0.e.s r13, int r14) {
        /*
            r11 = this;
            java.lang.String r0 = "c"
            kotlin.jvm.internal.l.f(r12, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.l.f(r13, r0)
            kotlin.f0.x.e.l0.k.n r2 = r12.h()
            kotlin.reflect.jvm.internal.impl.descriptors.m r3 = r12.e()
            kotlin.reflect.jvm.internal.impl.descriptors.n1.g$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.n1.g.f21674c
            kotlin.reflect.jvm.internal.impl.descriptors.n1.g r4 = r0.b()
            kotlin.f0.x.e.l0.e.z.c r0 = r12.g()
            int r1 = r13.P()
            kotlin.f0.x.e.l0.f.f r5 = kotlin.reflect.x.internal.l0.j.b.x.b(r0, r1)
            kotlin.f0.x.e.l0.j.b.a0 r0 = kotlin.reflect.x.internal.l0.j.b.a0.a
            kotlin.f0.x.e.l0.e.s$c r1 = r13.V()
            java.lang.String r6 = "proto.variance"
            kotlin.jvm.internal.l.e(r1, r6)
            kotlin.f0.x.e.l0.l.r1 r6 = r0.d(r1)
            boolean r7 = r13.Q()
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r9 = kotlin.reflect.jvm.internal.impl.descriptors.z0.a
            kotlin.reflect.jvm.internal.impl.descriptors.c1$a r10 = kotlin.reflect.jvm.internal.impl.descriptors.c1.a.a
            r1 = r11
            r8 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.p = r12
            r11.q = r13
            kotlin.f0.x.e.l0.j.b.g0.a r13 = new kotlin.f0.x.e.l0.j.b.g0.a
            kotlin.f0.x.e.l0.k.n r12 = r12.h()
            kotlin.f0.x.e.l0.j.b.g0.m$a r14 = new kotlin.f0.x.e.l0.j.b.g0.m$a
            r14.<init>()
            r13.<init>(r12, r14)
            r11.r = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.l0.j.b.g0.m.<init>(kotlin.f0.x.e.l0.j.b.m, kotlin.f0.x.e.l0.e.s, int):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.e
    protected List<e0> M0() {
        int t;
        List<e0> e2;
        List<q> p = f.p(this.q, this.p.j());
        if (p.isEmpty()) {
            e2 = kotlin.collections.s.e(kotlin.reflect.x.internal.l0.i.t.a.f(this).y());
            return e2;
        }
        d0 i2 = this.p.i();
        t = u.t(p, 10);
        ArrayList arrayList = new ArrayList(t);
        Iterator<T> it = p.iterator();
        while (it.hasNext()) {
            arrayList.add(i2.q((q) it.next()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n1.b, kotlin.reflect.jvm.internal.impl.descriptors.n1.a
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.x.internal.l0.j.b.g0.a getAnnotations() {
        return this.r;
    }

    public final s P0() {
        return this.q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.e
    /* renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public Void L0(e0 e0Var) {
        l.f(e0Var, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }
}
