package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.GmsClientEventManager;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Iterator;
import java.util.Set;

@KeepForSdk
/* loaded from: classes2.dex */
public abstract class GmsClient<T extends IInterface> extends BaseGmsClient<T> implements Api.Client, GmsClientEventManager.GmsClientEventState {
    private final ClientSettings a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<Scope> f10851b;

    /* renamed from: c, reason: collision with root package name */
    private final Account f10852c;

    /* JADX INFO: Access modifiers changed from: protected */
    @KeepForSdk
    public GmsClient(Context context, Looper looper, int i2, ClientSettings clientSettings, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, GmsClientSupervisor.a(context), GoogleApiAvailability.r(), i2, clientSettings, (GoogleApiClient.ConnectionCallbacks) Preconditions.j(connectionCallbacks), (GoogleApiClient.OnConnectionFailedListener) Preconditions.j(onConnectionFailedListener));
    }

    private static BaseGmsClient.BaseConnectionCallbacks h(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        if (connectionCallbacks == null) {
            return null;
        }
        return new d(connectionCallbacks);
    }

    private static BaseGmsClient.BaseOnConnectionFailedListener i(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        if (onConnectionFailedListener == null) {
            return null;
        }
        return new e(onConnectionFailedListener);
    }

    private final Set<Scope> j(Set<Scope> set) {
        Set<Scope> g2 = g(set);
        Iterator<Scope> it = g2.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return g2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @KeepForSdk
    public final ClientSettings f() {
        return this.a;
    }

    @KeepForSdk
    protected Set<Scope> g(Set<Scope> set) {
        return set;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Account getAccount() {
        return this.f10852c;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public int getMinApkVersion() {
        return super.getMinApkVersion();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final Set<Scope> getScopes() {
        return this.f10851b;
    }

    @VisibleForTesting
    protected GmsClient(Context context, Looper looper, GmsClientSupervisor gmsClientSupervisor, GoogleApiAvailability googleApiAvailability, int i2, ClientSettings clientSettings, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, gmsClientSupervisor, googleApiAvailability, i2, h(connectionCallbacks), i(onConnectionFailedListener), clientSettings.i());
        this.a = clientSettings;
        this.f10852c = clientSettings.b();
        this.f10851b = j(clientSettings.e());
    }
}
