package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
final class e0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ ConnectionResult f10619f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ GoogleApiManager.b f10620g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e0(GoogleApiManager.b bVar, ConnectionResult connectionResult) {
        this.f10620g = bVar;
        this.f10619f = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zai zaiVar;
        Api.Client client;
        zai zaiVar2;
        Api.Client client2;
        if (!this.f10619f.L()) {
            Map map = GoogleApiManager.this.r;
            zaiVar = this.f10620g.f10587b;
            ((GoogleApiManager.zaa) map.get(zaiVar)).i0(this.f10619f);
            return;
        }
        GoogleApiManager.b.e(this.f10620g, true);
        client = this.f10620g.a;
        if (client.requiresSignIn()) {
            this.f10620g.g();
            return;
        }
        try {
            client2 = this.f10620g.a;
            client2.getRemoteService(null, Collections.emptySet());
        } catch (SecurityException e2) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e2);
            Map map2 = GoogleApiManager.this.r;
            zaiVar2 = this.f10620g.f10587b;
            ((GoogleApiManager.zaa) map2.get(zaiVar2)).i0(new ConnectionResult(10));
        }
    }
}
