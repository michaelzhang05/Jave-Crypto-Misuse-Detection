package kotlin.reflect.x.internal.l0.l.t1;

import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.x.internal.l0.f.b;
import kotlin.reflect.x.internal.l0.i.w.h;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.e1;
import kotlin.reflect.x.internal.l0.l.i;

/* compiled from: KotlinTypeRefiner.kt */
/* loaded from: classes2.dex */
public abstract class g extends i {

    /* compiled from: KotlinTypeRefiner.kt */
    /* loaded from: classes2.dex */
    public static final class a extends g {
        public static final a a = new a();

        private a() {
        }

        @Override // kotlin.reflect.x.internal.l0.l.t1.g
        public e b(b bVar) {
            l.f(bVar, "classId");
            return null;
        }

        @Override // kotlin.reflect.x.internal.l0.l.t1.g
        public <S extends h> S c(e eVar, Function0<? extends S> function0) {
            l.f(eVar, "classDescriptor");
            l.f(function0, "compute");
            return function0.invoke();
        }

        @Override // kotlin.reflect.x.internal.l0.l.t1.g
        public boolean d(g0 g0Var) {
            l.f(g0Var, "moduleDescriptor");
            return false;
        }

        @Override // kotlin.reflect.x.internal.l0.l.t1.g
        public boolean e(e1 e1Var) {
            l.f(e1Var, "typeConstructor");
            return false;
        }

        @Override // kotlin.reflect.x.internal.l0.l.t1.g
        public Collection<e0> g(e eVar) {
            l.f(eVar, "classDescriptor");
            Collection<e0> a2 = eVar.g().a();
            l.e(a2, "classDescriptor.typeConstructor.supertypes");
            return a2;
        }

        @Override // kotlin.reflect.x.internal.l0.l.i
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public e0 a(kotlin.reflect.x.internal.l0.l.w1.i iVar) {
            l.f(iVar, "type");
            return (e0) iVar;
        }

        @Override // kotlin.reflect.x.internal.l0.l.t1.g
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public e f(m mVar) {
            l.f(mVar, "descriptor");
            return null;
        }
    }

    public abstract e b(b bVar);

    public abstract <S extends h> S c(e eVar, Function0<? extends S> function0);

    public abstract boolean d(g0 g0Var);

    public abstract boolean e(e1 e1Var);

    public abstract kotlin.reflect.jvm.internal.impl.descriptors.h f(m mVar);

    public abstract Collection<e0> g(e eVar);

    /* renamed from: h */
    public abstract e0 a(kotlin.reflect.x.internal.l0.l.w1.i iVar);
}
