package kotlin.reflect.x.internal.l0.i.w;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.x.internal.l0.c.b.b;
import kotlin.reflect.x.internal.l0.f.f;

/* compiled from: ResolutionScope.kt */
/* loaded from: classes2.dex */
public interface k {

    /* compiled from: ResolutionScope.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Collection a(k kVar, d dVar, Function1 function1, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContributedDescriptors");
            }
            if ((i2 & 1) != 0) {
                dVar = d.m;
            }
            if ((i2 & 2) != 0) {
                function1 = h.a.a();
            }
            return kVar.g(dVar, function1);
        }
    }

    h f(f fVar, b bVar);

    Collection<m> g(d dVar, Function1<? super f, Boolean> function1);
}
