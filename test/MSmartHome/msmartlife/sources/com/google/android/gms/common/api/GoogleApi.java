package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.zabp;
import com.google.android.gms.common.api.internal.zace;
import com.google.android.gms.common.api.internal.zai;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.Set;

@KeepForSdk
/* loaded from: classes2.dex */
public class GoogleApi<O extends Api.ApiOptions> {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final Api<O> f10530b;

    /* renamed from: c, reason: collision with root package name */
    private final O f10531c;

    /* renamed from: d, reason: collision with root package name */
    private final zai<O> f10532d;

    /* renamed from: e, reason: collision with root package name */
    private final Looper f10533e;

    /* renamed from: f, reason: collision with root package name */
    private final int f10534f;

    /* renamed from: g, reason: collision with root package name */
    private final GoogleApiClient f10535g;

    /* renamed from: h, reason: collision with root package name */
    private final StatusExceptionMapper f10536h;

    /* renamed from: i, reason: collision with root package name */
    protected final GoogleApiManager f10537i;

    @KeepForSdk
    /* loaded from: classes2.dex */
    public static class Settings {

        @KeepForSdk
        public static final Settings a = new Builder().a();

        /* renamed from: b, reason: collision with root package name */
        public final StatusExceptionMapper f10538b;

        /* renamed from: c, reason: collision with root package name */
        public final Looper f10539c;

        @KeepForSdk
        /* loaded from: classes2.dex */
        public static class Builder {
            private StatusExceptionMapper a;

            /* renamed from: b, reason: collision with root package name */
            private Looper f10540b;

            @KeepForSdk
            public Builder() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @KeepForSdk
            public Settings a() {
                if (this.a == null) {
                    this.a = new ApiExceptionMapper();
                }
                if (this.f10540b == null) {
                    this.f10540b = Looper.getMainLooper();
                }
                return new Settings(this.a, this.f10540b);
            }

            @KeepForSdk
            public Builder b(StatusExceptionMapper statusExceptionMapper) {
                Preconditions.k(statusExceptionMapper, "StatusExceptionMapper must not be null.");
                this.a = statusExceptionMapper;
                return this;
            }
        }

        @KeepForSdk
        private Settings(StatusExceptionMapper statusExceptionMapper, Account account, Looper looper) {
            this.f10538b = statusExceptionMapper;
            this.f10539c = looper;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @KeepForSdk
    public GoogleApi(Context context, Api<O> api, Looper looper) {
        Preconditions.k(context, "Null context is not permitted.");
        Preconditions.k(api, "Api must not be null.");
        Preconditions.k(looper, "Looper must not be null.");
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.f10530b = api;
        this.f10531c = null;
        this.f10533e = looper;
        this.f10532d = zai.a(api);
        this.f10535g = new zabp(this);
        GoogleApiManager k2 = GoogleApiManager.k(applicationContext);
        this.f10537i = k2;
        this.f10534f = k2.o();
        this.f10536h = new ApiExceptionMapper();
    }

    private final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T j(int i2, T t) {
        t.r();
        this.f10537i.h(this, i2, t);
        return t;
    }

    @KeepForSdk
    public GoogleApiClient a() {
        return this.f10535g;
    }

    @KeepForSdk
    protected ClientSettings.Builder b() {
        Account account;
        Set<Scope> emptySet;
        GoogleSignInAccount f2;
        GoogleSignInAccount f3;
        ClientSettings.Builder builder = new ClientSettings.Builder();
        O o = this.f10531c;
        if ((o instanceof Api.ApiOptions.HasGoogleSignInAccountOptions) && (f3 = ((Api.ApiOptions.HasGoogleSignInAccountOptions) o).f()) != null) {
            account = f3.getAccount();
        } else {
            O o2 = this.f10531c;
            account = o2 instanceof Api.ApiOptions.HasAccountOptions ? ((Api.ApiOptions.HasAccountOptions) o2).getAccount() : null;
        }
        ClientSettings.Builder c2 = builder.c(account);
        O o3 = this.f10531c;
        if ((o3 instanceof Api.ApiOptions.HasGoogleSignInAccountOptions) && (f2 = ((Api.ApiOptions.HasGoogleSignInAccountOptions) o3).f()) != null) {
            emptySet = f2.i0();
        } else {
            emptySet = Collections.emptySet();
        }
        return c2.a(emptySet).d(this.a.getClass().getName()).e(this.a.getPackageName());
    }

    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T c(T t) {
        return (T) j(0, t);
    }

    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T d(T t) {
        return (T) j(1, t);
    }

    public final Api<O> e() {
        return this.f10530b;
    }

    @KeepForSdk
    public Context f() {
        return this.a;
    }

    public final int g() {
        return this.f10534f;
    }

    @KeepForSdk
    public Looper h() {
        return this.f10533e;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [com.google.android.gms.common.api.Api$Client] */
    public Api.Client i(Looper looper, GoogleApiManager.zaa<O> zaaVar) {
        return this.f10530b.d().c(this.a, looper, b().b(), this.f10531c, zaaVar, zaaVar);
    }

    public zace k(Context context, Handler handler) {
        return new zace(context, handler, b().b());
    }

    public final zai<O> l() {
        return this.f10532d;
    }

    @KeepForSdk
    public GoogleApi(Context context, Api<O> api, O o, Settings settings) {
        Preconditions.k(context, "Null context is not permitted.");
        Preconditions.k(api, "Api must not be null.");
        Preconditions.k(settings, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.f10530b = api;
        this.f10531c = o;
        this.f10533e = settings.f10539c;
        this.f10532d = zai.b(api, o);
        this.f10535g = new zabp(this);
        GoogleApiManager k2 = GoogleApiManager.k(applicationContext);
        this.f10537i = k2;
        this.f10534f = k2.o();
        this.f10536h = settings.f10538b;
        k2.g(this);
    }

    @KeepForSdk
    @Deprecated
    public GoogleApi(Context context, Api<O> api, O o, StatusExceptionMapper statusExceptionMapper) {
        this(context, api, o, new Settings.Builder().b(statusExceptionMapper).a());
    }
}
