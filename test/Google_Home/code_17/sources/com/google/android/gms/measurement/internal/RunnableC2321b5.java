package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import l0.InterfaceC3272g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.b5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2321b5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f17484a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f17485b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f17486c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ String f17487d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ b6 f17488e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ boolean f17489f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ D4 f17490g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2321b5(D4 d42, AtomicReference atomicReference, String str, String str2, String str3, b6 b6Var, boolean z8) {
        this.f17484a = atomicReference;
        this.f17485b = str;
        this.f17486c = str2;
        this.f17487d = str3;
        this.f17488e = b6Var;
        this.f17489f = z8;
        this.f17490g = d42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3272g interfaceC3272g;
        synchronized (this.f17484a) {
            try {
                try {
                    interfaceC3272g = this.f17490g.f17004d;
                } catch (RemoteException e8) {
                    this.f17490g.c().G().d("(legacy) Failed to get user properties; remote exception", C2367i2.s(this.f17485b), this.f17486c, e8);
                    this.f17484a.set(Collections.emptyList());
                }
                if (interfaceC3272g == null) {
                    this.f17490g.c().G().d("(legacy) Failed to get user properties; not connected to service", C2367i2.s(this.f17485b), this.f17486c, this.f17487d);
                    this.f17484a.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(this.f17485b)) {
                    AbstractC1400p.l(this.f17488e);
                    this.f17484a.set(interfaceC3272g.l0(this.f17486c, this.f17487d, this.f17489f, this.f17488e));
                } else {
                    this.f17484a.set(interfaceC3272g.z(this.f17485b, this.f17486c, this.f17487d, this.f17489f));
                }
                this.f17490g.m0();
                this.f17484a.notify();
            } finally {
                this.f17484a.notify();
            }
        }
    }
}
