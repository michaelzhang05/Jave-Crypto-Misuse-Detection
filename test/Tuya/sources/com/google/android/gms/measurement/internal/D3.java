package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import m0.InterfaceC3391d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class D3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f16055a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f16056b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f16057c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ D4 f16058d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f16059e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ K3 f16060f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public D3(K3 k32, AtomicReference atomicReference, String str, String str2, String str3, D4 d42, boolean z8) {
        this.f16060f = k32;
        this.f16055a = atomicReference;
        this.f16056b = str2;
        this.f16057c = str3;
        this.f16058d = d42;
        this.f16059e = z8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        K3 k32;
        InterfaceC3391d interfaceC3391d;
        synchronized (this.f16055a) {
            try {
                try {
                    k32 = this.f16060f;
                    interfaceC3391d = k32.f16202d;
                } catch (RemoteException e8) {
                    this.f16060f.f16777a.d().r().d("(legacy) Failed to get user properties; remote exception", null, this.f16056b, e8);
                    this.f16055a.set(Collections.emptyList());
                    atomicReference = this.f16055a;
                }
                if (interfaceC3391d == null) {
                    k32.f16777a.d().r().d("(legacy) Failed to get user properties; not connected to service", null, this.f16056b, this.f16057c);
                    this.f16055a.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    AbstractC1319p.l(this.f16058d);
                    this.f16055a.set(interfaceC3391d.W(this.f16056b, this.f16057c, this.f16059e, this.f16058d));
                } else {
                    this.f16055a.set(interfaceC3391d.t(null, this.f16056b, this.f16057c, this.f16059e));
                }
                this.f16060f.E();
                atomicReference = this.f16055a;
                atomicReference.notify();
            } finally {
                this.f16055a.notify();
            }
        }
    }
}
