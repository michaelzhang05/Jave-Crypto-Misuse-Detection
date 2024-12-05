package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzbol extends zzbnf {

    /* renamed from: f, reason: collision with root package name */
    private final zzaga f13443f;

    /* renamed from: g, reason: collision with root package name */
    private final Runnable f13444g;

    /* renamed from: h, reason: collision with root package name */
    private final Executor f13445h;

    public zzbol(zzaga zzagaVar, Runnable runnable, Executor executor) {
        this.f13443f = zzagaVar;
        this.f13444g = runnable;
        this.f13445h = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final void c() {
        final AtomicReference atomicReference = new AtomicReference(this.f13444g);
        final Runnable runnable = new Runnable(atomicReference) { // from class: com.google.android.gms.internal.ads.dd

            /* renamed from: f, reason: collision with root package name */
            private final AtomicReference f11314f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11314f = atomicReference;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable2 = (Runnable) this.f11314f.getAndSet(null);
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        };
        this.f13445h.execute(new Runnable(this, runnable) { // from class: com.google.android.gms.internal.ads.ed

            /* renamed from: f, reason: collision with root package name */
            private final zzbol f11360f;

            /* renamed from: g, reason: collision with root package name */
            private final Runnable f11361g;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11360f = this;
                this.f11361g = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f11360f.m(this.f11361g);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbnf
    public final zzaar g() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnf
    public final void h(ViewGroup viewGroup, zzyd zzydVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbnf
    public final View i() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnf
    public final zzcxn j() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnf
    public final int k() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbnf
    public final void l() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void m(Runnable runnable) {
        try {
            if (this.f13443f.N2(ObjectWrapper.i0(runnable))) {
                return;
            }
            runnable.run();
        } catch (RemoteException unused) {
            runnable.run();
        }
    }
}
