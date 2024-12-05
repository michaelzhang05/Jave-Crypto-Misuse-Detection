package kotlin.reflect.x.internal.l0.i.v;

import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.x.internal.l0.k.n;
import kotlin.reflect.x.internal.l0.l.m0;

/* compiled from: SamConversionResolverImpl.kt */
/* loaded from: classes2.dex */
public final class b implements a {
    private final Iterable<Object> a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.k.b<e, m0> f20905b;

    public b(n nVar, Iterable<? extends Object> iterable) {
        l.f(nVar, "storageManager");
        l.f(iterable, "samWithReceiverResolvers");
        this.a = iterable;
        this.f20905b = nVar.a();
    }
}
