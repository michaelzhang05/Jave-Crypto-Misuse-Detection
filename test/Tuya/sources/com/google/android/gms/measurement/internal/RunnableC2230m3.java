package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC2029k0;
import java.util.List;
import m0.InterfaceC3391d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.m3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2230m3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f16687a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f16688b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ D4 f16689c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f16690d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC2029k0 f16691e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ K3 f16692f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2230m3(K3 k32, String str, String str2, D4 d42, boolean z8, InterfaceC2029k0 interfaceC2029k0) {
        this.f16692f = k32;
        this.f16687a = str;
        this.f16688b = str2;
        this.f16689c = d42;
        this.f16690d = z8;
        this.f16691e = interfaceC2029k0;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x009b: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:156), block:B:44:0x009a */
    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        RemoteException e8;
        Bundle bundle2;
        InterfaceC3391d interfaceC3391d;
        Bundle bundle3 = new Bundle();
        try {
            try {
                K3 k32 = this.f16692f;
                interfaceC3391d = k32.f16202d;
                if (interfaceC3391d == null) {
                    k32.f16777a.d().r().c("Failed to get user properties; not connected to service", this.f16687a, this.f16688b);
                    this.f16692f.f16777a.N().G(this.f16691e, bundle3);
                    return;
                }
                AbstractC1319p.l(this.f16689c);
                List<u4> W7 = interfaceC3391d.W(this.f16687a, this.f16688b, this.f16690d, this.f16689c);
                bundle = new Bundle();
                if (W7 != null) {
                    for (u4 u4Var : W7) {
                        String str = u4Var.f16881e;
                        if (str != null) {
                            bundle.putString(u4Var.f16878b, str);
                        } else {
                            Long l8 = u4Var.f16880d;
                            if (l8 != null) {
                                bundle.putLong(u4Var.f16878b, l8.longValue());
                            } else {
                                Double d8 = u4Var.f16883g;
                                if (d8 != null) {
                                    bundle.putDouble(u4Var.f16878b, d8.doubleValue());
                                }
                            }
                        }
                    }
                }
                try {
                    this.f16692f.E();
                    this.f16692f.f16777a.N().G(this.f16691e, bundle);
                } catch (RemoteException e9) {
                    e8 = e9;
                    this.f16692f.f16777a.d().r().c("Failed to get user properties; remote exception", this.f16687a, e8);
                    this.f16692f.f16777a.N().G(this.f16691e, bundle);
                }
            } catch (Throwable th) {
                th = th;
                bundle3 = bundle2;
                this.f16692f.f16777a.N().G(this.f16691e, bundle3);
                throw th;
            }
        } catch (RemoteException e10) {
            bundle = bundle3;
            e8 = e10;
        } catch (Throwable th2) {
            th = th2;
            this.f16692f.f16777a.N().G(this.f16691e, bundle3);
            throw th;
        }
    }
}
