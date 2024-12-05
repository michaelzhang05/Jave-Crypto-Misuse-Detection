package kotlin.reflect.x.internal.l0.e.z;

import java.util.List;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* compiled from: ProtoBufUtil.kt */
/* loaded from: classes2.dex */
public final class e {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <M extends h.d<M>, T> T a(h.d<M> dVar, h.f<M, T> fVar) {
        l.f(dVar, "<this>");
        l.f(fVar, "extension");
        if (dVar.z(fVar)) {
            return (T) dVar.u(fVar);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <M extends h.d<M>, T> T b(h.d<M> dVar, h.f<M, List<T>> fVar, int i2) {
        l.f(dVar, "<this>");
        l.f(fVar, "extension");
        if (i2 < dVar.y(fVar)) {
            return (T) dVar.v(fVar, i2);
        }
        return null;
    }
}
