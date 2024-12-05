package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import l0.InterfaceC3272g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class I4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f17181a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ b6 f17182b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Bundle f17183c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ D4 f17184d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public I4(D4 d42, AtomicReference atomicReference, b6 b6Var, Bundle bundle) {
        this.f17181a = atomicReference;
        this.f17182b = b6Var;
        this.f17183c = bundle;
        this.f17184d = d42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3272g interfaceC3272g;
        synchronized (this.f17181a) {
            try {
                try {
                    interfaceC3272g = this.f17184d.f17004d;
                } catch (RemoteException e8) {
                    this.f17184d.c().G().b("Failed to get trigger URIs; remote exception", e8);
                }
                if (interfaceC3272g == null) {
                    this.f17184d.c().G().a("Failed to get trigger URIs; not connected to service");
                    return;
                }
                AbstractC1400p.l(this.f17182b);
                this.f17181a.set(interfaceC3272g.N(this.f17182b, this.f17183c));
                this.f17184d.m0();
                this.f17181a.notify();
            } finally {
                this.f17181a.notify();
            }
        }
    }
}
