package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
final class o30 implements ThreadFactory {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f11919f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o30(String str) {
        this.f11919f = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f11919f);
    }
}
