package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@VisibleForTesting
@KeepForSdk
/* loaded from: classes2.dex */
public final class ClientSettings {
    private final Account a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<Scope> f10825b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<Scope> f10826c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<Api<?>, OptionalApiSettings> f10827d;

    /* renamed from: e, reason: collision with root package name */
    private final int f10828e;

    /* renamed from: f, reason: collision with root package name */
    private final View f10829f;

    /* renamed from: g, reason: collision with root package name */
    private final String f10830g;

    /* renamed from: h, reason: collision with root package name */
    private final String f10831h;

    /* renamed from: i, reason: collision with root package name */
    private final SignInOptions f10832i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f10833j;

    /* renamed from: k, reason: collision with root package name */
    private Integer f10834k;

    @KeepForSdk
    /* loaded from: classes2.dex */
    public static final class Builder {
        private Account a;

        /* renamed from: b, reason: collision with root package name */
        private c.e.b<Scope> f10835b;

        /* renamed from: c, reason: collision with root package name */
        private Map<Api<?>, OptionalApiSettings> f10836c;

        /* renamed from: e, reason: collision with root package name */
        private View f10838e;

        /* renamed from: f, reason: collision with root package name */
        private String f10839f;

        /* renamed from: g, reason: collision with root package name */
        private String f10840g;

        /* renamed from: i, reason: collision with root package name */
        private boolean f10842i;

        /* renamed from: d, reason: collision with root package name */
        private int f10837d = 0;

        /* renamed from: h, reason: collision with root package name */
        private SignInOptions f10841h = SignInOptions.f16313f;

        public final Builder a(Collection<Scope> collection) {
            if (this.f10835b == null) {
                this.f10835b = new c.e.b<>();
            }
            this.f10835b.addAll(collection);
            return this;
        }

        @KeepForSdk
        public final ClientSettings b() {
            return new ClientSettings(this.a, this.f10835b, this.f10836c, this.f10837d, this.f10838e, this.f10839f, this.f10840g, this.f10841h, this.f10842i);
        }

        public final Builder c(Account account) {
            this.a = account;
            return this;
        }

        public final Builder d(String str) {
            this.f10840g = str;
            return this;
        }

        @KeepForSdk
        public final Builder e(String str) {
            this.f10839f = str;
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public static final class OptionalApiSettings {
        public final Set<Scope> a;
    }

    public ClientSettings(Account account, Set<Scope> set, Map<Api<?>, OptionalApiSettings> map, int i2, View view, String str, String str2, SignInOptions signInOptions, boolean z) {
        this.a = account;
        Set<Scope> unmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f10825b = unmodifiableSet;
        map = map == null ? Collections.EMPTY_MAP : map;
        this.f10827d = map;
        this.f10829f = view;
        this.f10828e = i2;
        this.f10830g = str;
        this.f10831h = str2;
        this.f10832i = signInOptions;
        this.f10833j = z;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator<OptionalApiSettings> it = map.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().a);
        }
        this.f10826c = Collections.unmodifiableSet(hashSet);
    }

    @KeepForSdk
    public static ClientSettings a(Context context) {
        return new GoogleApiClient.Builder(context).f();
    }

    @KeepForSdk
    public final Account b() {
        return this.a;
    }

    @KeepForSdk
    @Deprecated
    public final String c() {
        Account account = this.a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    @KeepForSdk
    public final Account d() {
        Account account = this.a;
        return account != null ? account : new Account(BaseGmsClient.DEFAULT_ACCOUNT, "com.google");
    }

    @KeepForSdk
    public final Set<Scope> e() {
        return this.f10826c;
    }

    @KeepForSdk
    public final Set<Scope> f(Api<?> api) {
        OptionalApiSettings optionalApiSettings = this.f10827d.get(api);
        if (optionalApiSettings != null && !optionalApiSettings.a.isEmpty()) {
            HashSet hashSet = new HashSet(this.f10825b);
            hashSet.addAll(optionalApiSettings.a);
            return hashSet;
        }
        return this.f10825b;
    }

    public final Integer g() {
        return this.f10834k;
    }

    public final Map<Api<?>, OptionalApiSettings> h() {
        return this.f10827d;
    }

    public final String i() {
        return this.f10831h;
    }

    @KeepForSdk
    public final String j() {
        return this.f10830g;
    }

    @KeepForSdk
    public final Set<Scope> k() {
        return this.f10825b;
    }

    public final SignInOptions l() {
        return this.f10832i;
    }

    public final boolean m() {
        return this.f10833j;
    }

    public final void n(Integer num) {
        this.f10834k = num;
    }
}
