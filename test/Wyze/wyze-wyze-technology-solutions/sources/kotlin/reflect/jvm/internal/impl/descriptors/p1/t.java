package kotlin.reflect.jvm.internal.impl.descriptors.p1;

import kotlin.reflect.x.internal.l0.l.j1;

/* compiled from: ModuleAwareClassDescriptor.kt */
/* loaded from: classes2.dex */
public abstract class t implements kotlin.reflect.jvm.internal.impl.descriptors.e {

    /* renamed from: f, reason: collision with root package name */
    public static final a f21791f = new a(null);

    /* compiled from: ModuleAwareClassDescriptor.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final kotlin.reflect.x.internal.l0.i.w.h a(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, j1 j1Var, kotlin.reflect.x.internal.l0.l.t1.g gVar) {
            kotlin.reflect.x.internal.l0.i.w.h v;
            kotlin.jvm.internal.l.f(eVar, "<this>");
            kotlin.jvm.internal.l.f(j1Var, "typeSubstitution");
            kotlin.jvm.internal.l.f(gVar, "kotlinTypeRefiner");
            t tVar = eVar instanceof t ? (t) eVar : null;
            if (tVar != null && (v = tVar.v(j1Var, gVar)) != null) {
                return v;
            }
            kotlin.reflect.x.internal.l0.i.w.h a0 = eVar.a0(j1Var);
            kotlin.jvm.internal.l.e(a0, "this.getMemberScope(\n   …ubstitution\n            )");
            return a0;
        }

        public final kotlin.reflect.x.internal.l0.i.w.h b(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, kotlin.reflect.x.internal.l0.l.t1.g gVar) {
            kotlin.reflect.x.internal.l0.i.w.h H;
            kotlin.jvm.internal.l.f(eVar, "<this>");
            kotlin.jvm.internal.l.f(gVar, "kotlinTypeRefiner");
            t tVar = eVar instanceof t ? (t) eVar : null;
            if (tVar != null && (H = tVar.H(gVar)) != null) {
                return H;
            }
            kotlin.reflect.x.internal.l0.i.w.h D0 = eVar.D0();
            kotlin.jvm.internal.l.e(D0, "this.unsubstitutedMemberScope");
            return D0;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract kotlin.reflect.x.internal.l0.i.w.h H(kotlin.reflect.x.internal.l0.l.t1.g gVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract kotlin.reflect.x.internal.l0.i.w.h v(j1 j1Var, kotlin.reflect.x.internal.l0.l.t1.g gVar);
}
