package kotlin.reflect.x.internal.l0.l;

import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.c;

/* compiled from: TypeAliasExpansionReportStrategy.kt */
/* loaded from: classes2.dex */
public interface x0 {

    /* compiled from: TypeAliasExpansionReportStrategy.kt */
    /* loaded from: classes2.dex */
    public static final class a implements x0 {
        public static final a a = new a();

        private a() {
        }

        @Override // kotlin.reflect.x.internal.l0.l.x0
        public void a(c cVar) {
            l.f(cVar, "annotation");
        }

        @Override // kotlin.reflect.x.internal.l0.l.x0
        public void b(d1 d1Var, e1 e1Var, e0 e0Var) {
            l.f(d1Var, "typeAlias");
            l.f(e0Var, "substitutedArgument");
        }

        @Override // kotlin.reflect.x.internal.l0.l.x0
        public void c(l1 l1Var, e0 e0Var, e0 e0Var2, e1 e1Var) {
            l.f(l1Var, "substitutor");
            l.f(e0Var, "unsubstitutedArgument");
            l.f(e0Var2, "argument");
            l.f(e1Var, "typeParameter");
        }

        @Override // kotlin.reflect.x.internal.l0.l.x0
        public void d(d1 d1Var) {
            l.f(d1Var, "typeAlias");
        }
    }

    void a(c cVar);

    void b(d1 d1Var, e1 e1Var, e0 e0Var);

    void c(l1 l1Var, e0 e0Var, e0 e0Var2, e1 e1Var);

    void d(d1 d1Var);
}
