package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.zzk;
import java.io.InputStream;
import java.util.concurrent.Future;

@zzard
/* loaded from: classes2.dex */
public final class zzwb {
    private zzvu a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f15692b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f15693c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f15694d = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzwb(Context context) {
        this.f15693c = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        synchronized (this.f15694d) {
            zzvu zzvuVar = this.a;
            if (zzvuVar == null) {
                return;
            }
            zzvuVar.disconnect();
            this.a = null;
            Binder.flushPendingCommands();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean c(zzwb zzwbVar, boolean z) {
        zzwbVar.f15692b = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Future<InputStream> e(zzvv zzvvVar) {
        z40 z40Var = new z40(this);
        a50 a50Var = new a50(this, zzvvVar, z40Var);
        e50 e50Var = new e50(this, z40Var);
        synchronized (this.f15694d) {
            zzvu zzvuVar = new zzvu(this.f15693c, zzk.zzlu().b(), a50Var, e50Var);
            this.a = zzvuVar;
            zzvuVar.checkAvailabilityAndConnect();
        }
        return z40Var;
    }
}
