package kotlin.reflect.jvm.internal.impl.descriptors.o1;

import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.l.m0;

/* compiled from: PlatformDependentTypeTransformer.kt */
/* loaded from: classes2.dex */
public interface e {

    /* compiled from: PlatformDependentTypeTransformer.kt */
    /* loaded from: classes2.dex */
    public static final class a implements e {
        public static final a a = new a();

        private a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o1.e
        public m0 a(kotlin.reflect.x.internal.l0.f.b bVar, m0 m0Var) {
            l.f(bVar, "classId");
            l.f(m0Var, "computedType");
            return m0Var;
        }
    }

    m0 a(kotlin.reflect.x.internal.l0.f.b bVar, m0 m0Var);
}
