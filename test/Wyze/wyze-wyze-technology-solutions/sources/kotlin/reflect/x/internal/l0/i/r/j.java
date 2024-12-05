package kotlin.reflect.x.internal.l0.i.r;

import kotlin.Pair;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.x;
import kotlin.reflect.x.internal.l0.f.b;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.i.d;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.m0;
import kotlin.reflect.x.internal.l0.l.u1.k;
import kotlin.s;

/* compiled from: constantValues.kt */
/* loaded from: classes2.dex */
public final class j extends g<Pair<? extends b, ? extends f>> {

    /* renamed from: b, reason: collision with root package name */
    private final b f20871b;

    /* renamed from: c, reason: collision with root package name */
    private final f f20872c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(b bVar, f fVar) {
        super(s.a(bVar, fVar));
        l.f(bVar, "enumClassId");
        l.f(fVar, "enumEntryName");
        this.f20871b = bVar;
        this.f20872c = fVar;
    }

    @Override // kotlin.reflect.x.internal.l0.i.r.g
    public e0 a(g0 g0Var) {
        l.f(g0Var, "module");
        e a = x.a(g0Var, this.f20871b);
        m0 m0Var = null;
        if (a != null) {
            if (!d.A(a)) {
                a = null;
            }
            if (a != null) {
                m0Var = a.s();
            }
        }
        if (m0Var != null) {
            return m0Var;
        }
        kotlin.reflect.x.internal.l0.l.u1.j jVar = kotlin.reflect.x.internal.l0.l.u1.j.B0;
        String bVar = this.f20871b.toString();
        l.e(bVar, "enumClassId.toString()");
        String fVar = this.f20872c.toString();
        l.e(fVar, "enumEntryName.toString()");
        return k.d(jVar, bVar, fVar);
    }

    public final f c() {
        return this.f20872c;
    }

    @Override // kotlin.reflect.x.internal.l0.i.r.g
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f20871b.j());
        sb.append('.');
        sb.append(this.f20872c);
        return sb.toString();
    }
}
