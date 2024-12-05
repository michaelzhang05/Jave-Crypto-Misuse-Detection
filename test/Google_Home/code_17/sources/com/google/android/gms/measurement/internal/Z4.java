package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import l0.InterfaceC3272g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Z4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f17436a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f17437b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f17438c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ String f17439d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ b6 f17440e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ D4 f17441f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Z4(D4 d42, AtomicReference atomicReference, String str, String str2, String str3, b6 b6Var) {
        this.f17436a = atomicReference;
        this.f17437b = str;
        this.f17438c = str2;
        this.f17439d = str3;
        this.f17440e = b6Var;
        this.f17441f = d42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3272g interfaceC3272g;
        synchronized (this.f17436a) {
            try {
                try {
                    interfaceC3272g = this.f17441f.f17004d;
                } catch (RemoteException e8) {
                    this.f17441f.c().G().d("(legacy) Failed to get conditional properties; remote exception", C2367i2.s(this.f17437b), this.f17438c, e8);
                    this.f17436a.set(Collections.emptyList());
                }
                if (interfaceC3272g == null) {
                    this.f17441f.c().G().d("(legacy) Failed to get conditional properties; not connected to service", C2367i2.s(this.f17437b), this.f17438c, this.f17439d);
                    this.f17436a.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(this.f17437b)) {
                    AbstractC1400p.l(this.f17440e);
                    this.f17436a.set(interfaceC3272g.u(this.f17438c, this.f17439d, this.f17440e));
                } else {
                    this.f17436a.set(interfaceC3272g.T(this.f17437b, this.f17438c, this.f17439d));
                }
                this.f17441f.m0();
                this.f17436a.notify();
            } finally {
                this.f17436a.notify();
            }
        }
    }
}
