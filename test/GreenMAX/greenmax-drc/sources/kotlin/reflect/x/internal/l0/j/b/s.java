package kotlin.reflect.x.internal.l0.j.b;

import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.e.q;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.m0;

/* compiled from: FlexibleTypeDeserializer.kt */
/* loaded from: classes2.dex */
public interface s {

    /* compiled from: FlexibleTypeDeserializer.kt */
    /* loaded from: classes2.dex */
    public static final class a implements s {
        public static final a a = new a();

        private a() {
        }

        @Override // kotlin.reflect.x.internal.l0.j.b.s
        public e0 a(q qVar, String str, m0 m0Var, m0 m0Var2) {
            l.f(qVar, "proto");
            l.f(str, "flexibleId");
            l.f(m0Var, "lowerBound");
            l.f(m0Var2, "upperBound");
            throw new IllegalArgumentException("This method should not be used.");
        }
    }

    e0 a(q qVar, String str, m0 m0Var, m0 m0Var2);
}
