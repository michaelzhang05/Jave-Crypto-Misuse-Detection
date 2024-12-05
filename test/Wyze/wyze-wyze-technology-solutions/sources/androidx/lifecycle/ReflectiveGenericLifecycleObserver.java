package androidx.lifecycle;

import androidx.lifecycle.a;
import androidx.lifecycle.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements h {
    private final Object a;

    /* renamed from: b, reason: collision with root package name */
    private final a.C0025a f1251b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.a = obj;
        this.f1251b = a.a.c(obj.getClass());
    }

    @Override // androidx.lifecycle.h
    public void a(j jVar, f.a aVar) {
        this.f1251b.a(jVar, aVar, this.a);
    }
}
