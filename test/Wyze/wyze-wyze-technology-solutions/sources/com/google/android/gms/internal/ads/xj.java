package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final /* synthetic */ class xj implements Callable {

    /* renamed from: f, reason: collision with root package name */
    private final zzcja f12395f;

    private xj(zzcja zzcjaVar) {
        this.f12395f = zzcjaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Callable a(zzcja zzcjaVar) {
        return new xj(zzcjaVar);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f12395f.getWritableDatabase();
    }
}
