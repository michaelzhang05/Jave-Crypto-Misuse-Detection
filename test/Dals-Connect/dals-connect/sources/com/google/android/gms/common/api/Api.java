package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class Api<O extends ApiOptions> {
    private final AbstractClientBuilder<?, O> a;

    /* renamed from: b, reason: collision with root package name */
    private final zaa<?, O> f10520b;

    /* renamed from: c, reason: collision with root package name */
    private final ClientKey<?> f10521c;

    /* renamed from: d, reason: collision with root package name */
    private final zab<?> f10522d;

    /* renamed from: e, reason: collision with root package name */
    private final String f10523e;

    @VisibleForTesting
    @KeepForSdk
    /* loaded from: classes2.dex */
    public static abstract class AbstractClientBuilder<T extends Client, O> extends BaseClientBuilder<T, O> {
        @KeepForSdk
        public abstract T c(Context context, Looper looper, ClientSettings clientSettings, O o, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener);
    }

    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface AnyClient {
    }

    @KeepForSdk
    /* loaded from: classes2.dex */
    public static class AnyClientKey<C extends AnyClient> {
    }

    /* loaded from: classes2.dex */
    public interface ApiOptions {

        /* loaded from: classes2.dex */
        public interface HasAccountOptions extends HasOptions, NotRequiredOptions {
            Account getAccount();
        }

        /* loaded from: classes2.dex */
        public interface HasGoogleSignInAccountOptions extends HasOptions {
            GoogleSignInAccount f();
        }

        /* loaded from: classes2.dex */
        public interface HasOptions extends ApiOptions {
        }

        /* loaded from: classes2.dex */
        public static final class NoOptions implements NotRequiredOptions {
            private NoOptions() {
            }
        }

        /* loaded from: classes2.dex */
        public interface NotRequiredOptions extends ApiOptions {
        }

        /* loaded from: classes2.dex */
        public interface Optional extends HasOptions, NotRequiredOptions {
        }
    }

    @VisibleForTesting
    @KeepForSdk
    /* loaded from: classes2.dex */
    public static abstract class BaseClientBuilder<T extends AnyClient, O> {
        @KeepForSdk
        public List<Scope> a(O o) {
            return Collections.emptyList();
        }

        @KeepForSdk
        public int b() {
            return Integer.MAX_VALUE;
        }
    }

    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface Client extends AnyClient {
        @KeepForSdk
        void connect(BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks);

        @KeepForSdk
        void disconnect();

        @KeepForSdk
        void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        @KeepForSdk
        Feature[] getAvailableFeatures();

        @KeepForSdk
        String getEndpointPackageName();

        @KeepForSdk
        int getMinApkVersion();

        @KeepForSdk
        void getRemoteService(IAccountAccessor iAccountAccessor, Set<Scope> set);

        @KeepForSdk
        IBinder getServiceBrokerBinder();

        @KeepForSdk
        Intent getSignInIntent();

        @KeepForSdk
        boolean isConnected();

        @KeepForSdk
        boolean isConnecting();

        @KeepForSdk
        void onUserSignOut(BaseGmsClient.SignOutCallbacks signOutCallbacks);

        @KeepForSdk
        boolean providesSignIn();

        @KeepForSdk
        boolean requiresGooglePlayServices();

        @KeepForSdk
        boolean requiresSignIn();
    }

    @VisibleForTesting
    @KeepForSdk
    /* loaded from: classes2.dex */
    public static final class ClientKey<C extends Client> extends AnyClientKey<C> {
    }

    /* loaded from: classes2.dex */
    public interface SimpleClient<T extends IInterface> extends AnyClient {
        T createServiceInterface(IBinder iBinder);

        void d(int i2, T t);

        String getServiceDescriptor();

        String getStartServiceAction();
    }

    @VisibleForTesting
    /* loaded from: classes2.dex */
    public static abstract class zaa<T extends SimpleClient, O> extends BaseClientBuilder<T, O> {
    }

    @VisibleForTesting
    /* loaded from: classes2.dex */
    public static final class zab<C extends SimpleClient> extends AnyClientKey<C> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <C extends Client> Api(String str, AbstractClientBuilder<C, O> abstractClientBuilder, ClientKey<C> clientKey) {
        Preconditions.k(abstractClientBuilder, "Cannot construct an Api with a null ClientBuilder");
        Preconditions.k(clientKey, "Cannot construct an Api with a null ClientKey");
        this.f10523e = str;
        this.a = abstractClientBuilder;
        this.f10520b = null;
        this.f10521c = clientKey;
        this.f10522d = null;
    }

    public final AnyClientKey<?> a() {
        ClientKey<?> clientKey = this.f10521c;
        if (clientKey != null) {
            return clientKey;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }

    public final String b() {
        return this.f10523e;
    }

    public final BaseClientBuilder<?, O> c() {
        return this.a;
    }

    public final AbstractClientBuilder<?, O> d() {
        Preconditions.m(this.a != null, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.a;
    }
}
