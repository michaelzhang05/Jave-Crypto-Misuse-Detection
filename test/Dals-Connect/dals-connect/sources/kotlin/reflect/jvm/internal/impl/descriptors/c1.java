package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import kotlin.jvm.functions.Function1;

/* compiled from: SupertypeLoopChecker.kt */
/* loaded from: classes2.dex */
public interface c1 {

    /* compiled from: SupertypeLoopChecker.kt */
    /* loaded from: classes2.dex */
    public static final class a implements c1 {
        public static final a a = new a();

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.c1
        public Collection<kotlin.reflect.x.internal.l0.l.e0> a(kotlin.reflect.x.internal.l0.l.e1 e1Var, Collection<? extends kotlin.reflect.x.internal.l0.l.e0> collection, Function1<? super kotlin.reflect.x.internal.l0.l.e1, ? extends Iterable<? extends kotlin.reflect.x.internal.l0.l.e0>> function1, Function1<? super kotlin.reflect.x.internal.l0.l.e0, kotlin.u> function12) {
            kotlin.jvm.internal.l.f(e1Var, "currentTypeConstructor");
            kotlin.jvm.internal.l.f(collection, "superTypes");
            kotlin.jvm.internal.l.f(function1, "neighbors");
            kotlin.jvm.internal.l.f(function12, "reportLoop");
            return collection;
        }
    }

    Collection<kotlin.reflect.x.internal.l0.l.e0> a(kotlin.reflect.x.internal.l0.l.e1 e1Var, Collection<? extends kotlin.reflect.x.internal.l0.l.e0> collection, Function1<? super kotlin.reflect.x.internal.l0.l.e1, ? extends Iterable<? extends kotlin.reflect.x.internal.l0.l.e0>> function1, Function1<? super kotlin.reflect.x.internal.l0.l.e0, kotlin.u> function12);
}
