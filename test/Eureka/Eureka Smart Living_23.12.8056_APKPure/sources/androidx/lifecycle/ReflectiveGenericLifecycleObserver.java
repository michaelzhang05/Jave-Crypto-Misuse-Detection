package androidx.lifecycle;

import androidx.lifecycle.b;
import androidx.lifecycle.h;

/* JADX INFO: Access modifiers changed from: package-private */
@Deprecated
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements k {

    /* renamed from: a, reason: collision with root package name */
    private final Object f3043a;

    /* renamed from: b, reason: collision with root package name */
    private final b.a f3044b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f3043a = obj;
        this.f3044b = b.f3054c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.k
    public void d(m mVar, h.a aVar) {
        this.f3044b.a(mVar, aVar, this.f3043a);
    }
}
