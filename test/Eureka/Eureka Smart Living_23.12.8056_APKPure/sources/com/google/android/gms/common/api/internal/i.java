package com.google.android.gms.common.api.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f4598a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f4599b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(l lVar, int i6) {
        this.f4599b = lVar;
        this.f4598a = i6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4599b.k(this.f4598a);
    }
}
