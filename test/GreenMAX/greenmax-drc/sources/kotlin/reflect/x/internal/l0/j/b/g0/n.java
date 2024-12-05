package kotlin.reflect.x.internal.l0.j.b.g0;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.c;

/* compiled from: DeserializedAnnotations.kt */
/* loaded from: classes2.dex */
public final class n extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(kotlin.reflect.x.internal.l0.k.n nVar, Function0<? extends List<? extends c>> function0) {
        super(nVar, function0);
        l.f(nVar, "storageManager");
        l.f(function0, "compute");
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.g0.a, kotlin.reflect.jvm.internal.impl.descriptors.n1.g
    public boolean isEmpty() {
        return false;
    }
}
