package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2164j8;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.s3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class CallableC2437s3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ b6 f17802a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Bundle f17803b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ W2 f17804c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC2437s3(W2 w22, b6 b6Var, Bundle bundle) {
        this.f17802a = b6Var;
        this.f17803b = bundle;
        this.f17804c = w22;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        I5 i52;
        I5 i53;
        i52 = this.f17804c.f17393a;
        i52.z0();
        i53 = this.f17804c.f17393a;
        b6 b6Var = this.f17802a;
        Bundle bundle = this.f17803b;
        i53.e().k();
        if (C2164j8.a() && i53.i0().H(b6Var.f17497a, H.f17066H0) && b6Var.f17497a != null) {
            if (bundle != null) {
                int[] intArray = bundle.getIntArray("uriSources");
                long[] longArray = bundle.getLongArray("uriTimestamps");
                if (intArray != null) {
                    if (longArray != null && longArray.length == intArray.length) {
                        for (int i8 = 0; i8 < intArray.length; i8++) {
                            C2392m l02 = i53.l0();
                            String str = b6Var.f17497a;
                            int i9 = intArray[i8];
                            long j8 = longArray[i8];
                            AbstractC1400p.f(str);
                            l02.k();
                            l02.r();
                            try {
                                int delete = l02.B().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i9), String.valueOf(j8)});
                                l02.c().K().d("Pruned " + delete + " trigger URIs. appId, source, timestamp", str, Integer.valueOf(i9), Long.valueOf(j8));
                            } catch (SQLiteException e8) {
                                l02.c().G().c("Error pruning trigger URIs. appId", C2367i2.s(str), e8);
                            }
                        }
                    } else {
                        i53.c().G().a("Uri sources and timestamps do not match");
                    }
                }
            }
            return i53.l0().W0(b6Var.f17497a);
        }
        return new ArrayList();
    }
}
