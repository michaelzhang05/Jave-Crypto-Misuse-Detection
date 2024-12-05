package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgd extends Exception {

    /* renamed from: f, reason: collision with root package name */
    private final boolean f15064f;

    public zzgd(String str) {
        super(str);
        this.f15064f = false;
    }

    public zzgd(Throwable th) {
        super(th);
        this.f15064f = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgd(Throwable th, boolean z) {
        super(th);
        this.f15064f = true;
    }
}
