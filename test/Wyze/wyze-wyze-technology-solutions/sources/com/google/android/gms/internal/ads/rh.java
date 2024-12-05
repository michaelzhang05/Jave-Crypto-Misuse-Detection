package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class rh<T> implements zzaho<Object> {
    private final WeakReference<T> a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12105b;

    /* renamed from: c, reason: collision with root package name */
    private final zzaho<T> f12106c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ zzccj f12107d;

    private rh(zzccj zzccjVar, WeakReference<T> weakReference, String str, zzaho<T> zzahoVar) {
        this.f12107d = zzccjVar;
        this.a = weakReference;
        this.f12105b = str;
        this.f12106c = zzahoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaho
    public final void a(Object obj, Map<String, String> map) {
        T t = this.a.get();
        if (t == null) {
            this.f12107d.h(this.f12105b, this);
        } else {
            this.f12106c.a(t, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ rh(zzccj zzccjVar, WeakReference weakReference, String str, zzaho zzahoVar, lh lhVar) {
        this(zzccjVar, weakReference, str, zzahoVar);
    }
}
