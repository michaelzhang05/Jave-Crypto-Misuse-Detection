package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import m0.InterfaceC3391d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class B3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f16016a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f16017b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f16018c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ D4 f16019d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ K3 f16020e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B3(K3 k32, AtomicReference atomicReference, String str, String str2, String str3, D4 d42) {
        this.f16020e = k32;
        this.f16016a = atomicReference;
        this.f16017b = str2;
        this.f16018c = str3;
        this.f16019d = d42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        K3 k32;
        InterfaceC3391d interfaceC3391d;
        synchronized (this.f16016a) {
            try {
                try {
                    k32 = this.f16020e;
                    interfaceC3391d = k32.f16202d;
                } catch (RemoteException e8) {
                    this.f16020e.f16777a.d().r().d("(legacy) Failed to get conditional properties; remote exception", null, this.f16017b, e8);
                    this.f16016a.set(Collections.emptyList());
                    atomicReference = this.f16016a;
                }
                if (interfaceC3391d == null) {
                    k32.f16777a.d().r().d("(legacy) Failed to get conditional properties; not connected to service", null, this.f16017b, this.f16018c);
                    this.f16016a.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    AbstractC1319p.l(this.f16019d);
                    this.f16016a.set(interfaceC3391d.P(this.f16017b, this.f16018c, this.f16019d));
                } else {
                    this.f16016a.set(interfaceC3391d.D(null, this.f16017b, this.f16018c));
                }
                this.f16020e.E();
                atomicReference = this.f16016a;
                atomicReference.notify();
            } finally {
                this.f16016a.notify();
            }
        }
    }
}
