package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.auth.api.signin.internal.HashAccumulator;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public class GoogleSignInOptions extends AbstractSafeParcelable implements Api.ApiOptions.Optional, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* renamed from: f, reason: collision with root package name */
    @VisibleForTesting
    public static final Scope f10426f = new Scope("profile");

    /* renamed from: g, reason: collision with root package name */
    @VisibleForTesting
    public static final Scope f10427g = new Scope("email");

    /* renamed from: h, reason: collision with root package name */
    @VisibleForTesting
    public static final Scope f10428h = new Scope("openid");

    /* renamed from: i, reason: collision with root package name */
    @VisibleForTesting
    public static final Scope f10429i;

    /* renamed from: j, reason: collision with root package name */
    @VisibleForTesting
    public static final Scope f10430j;

    /* renamed from: k, reason: collision with root package name */
    public static final GoogleSignInOptions f10431k;
    public static final GoogleSignInOptions l;
    private static Comparator<Scope> m;

    @SafeParcelable.VersionField
    private final int n;

    @SafeParcelable.Field
    private final ArrayList<Scope> o;

    @SafeParcelable.Field
    private Account p;

    @SafeParcelable.Field
    private boolean q;

    @SafeParcelable.Field
    private final boolean r;

    @SafeParcelable.Field
    private final boolean s;

    @SafeParcelable.Field
    private String t;

    @SafeParcelable.Field
    private String u;

    @SafeParcelable.Field
    private ArrayList<GoogleSignInOptionsExtensionParcelable> v;
    private Map<Integer, GoogleSignInOptionsExtensionParcelable> w;

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        f10429i = scope;
        f10430j = new Scope("https://www.googleapis.com/auth/games");
        f10431k = new Builder().c().d().a();
        l = new Builder().e(scope, new Scope[0]).a();
        CREATOR = new zad();
        m = new b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public GoogleSignInOptions(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) ArrayList<Scope> arrayList, @SafeParcelable.Param(id = 3) Account account, @SafeParcelable.Param(id = 4) boolean z, @SafeParcelable.Param(id = 5) boolean z2, @SafeParcelable.Param(id = 6) boolean z3, @SafeParcelable.Param(id = 7) String str, @SafeParcelable.Param(id = 8) String str2, @SafeParcelable.Param(id = 9) ArrayList<GoogleSignInOptionsExtensionParcelable> arrayList2) {
        this(i2, arrayList, account, z, z2, z3, str, str2, i0(arrayList2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<Integer, GoogleSignInOptionsExtensionParcelable> i0(List<GoogleSignInOptionsExtensionParcelable> list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable : list) {
            hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.w()), googleSignInOptionsExtensionParcelable);
        }
        return hashMap;
    }

    public static GoogleSignInOptions q0(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new Scope(jSONArray.getString(i2)));
        }
        String optString = jSONObject.optString("accountName", null);
        return new GoogleSignInOptions(3, (ArrayList<Scope>) new ArrayList(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.optString("serverClientId", null), jSONObject.optString("hostedDomain", null), new HashMap());
    }

    private final JSONObject v0() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.o, m);
            ArrayList<Scope> arrayList = this.o;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Scope scope = arrayList.get(i2);
                i2++;
                jSONArray.put(scope.w());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.p;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.q);
            jSONObject.put("forceCodeForRefreshToken", this.s);
            jSONObject.put("serverAuthRequested", this.r);
            if (!TextUtils.isEmpty(this.t)) {
                jSONObject.put("serverClientId", this.t);
            }
            if (!TextUtils.isEmpty(this.u)) {
                jSONObject.put("hostedDomain", this.u);
            }
            return jSONObject;
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    @KeepForSdk
    public String D() {
        return this.t;
    }

    @KeepForSdk
    public boolean J() {
        return this.s;
    }

    @KeepForSdk
    public boolean L() {
        return this.q;
    }

    @KeepForSdk
    public boolean P() {
        return this.r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0066, code lost:
    
        if (r3.t.equals(r4.D()) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0047, code lost:
    
        if (r1.equals(r4.getAccount()) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch: java.lang.ClassCastException -> L82
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r3.v     // Catch: java.lang.ClassCastException -> L82
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L82
            if (r1 > 0) goto L82
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r4.v     // Catch: java.lang.ClassCastException -> L82
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L82
            if (r1 <= 0) goto L17
            goto L82
        L17:
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.o     // Catch: java.lang.ClassCastException -> L82
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L82
            java.util.ArrayList r2 = r4.z()     // Catch: java.lang.ClassCastException -> L82
            int r2 = r2.size()     // Catch: java.lang.ClassCastException -> L82
            if (r1 != r2) goto L82
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.o     // Catch: java.lang.ClassCastException -> L82
            java.util.ArrayList r2 = r4.z()     // Catch: java.lang.ClassCastException -> L82
            boolean r1 = r1.containsAll(r2)     // Catch: java.lang.ClassCastException -> L82
            if (r1 != 0) goto L34
            goto L82
        L34:
            android.accounts.Account r1 = r3.p     // Catch: java.lang.ClassCastException -> L82
            if (r1 != 0) goto L3f
            android.accounts.Account r1 = r4.getAccount()     // Catch: java.lang.ClassCastException -> L82
            if (r1 != 0) goto L82
            goto L49
        L3f:
            android.accounts.Account r2 = r4.getAccount()     // Catch: java.lang.ClassCastException -> L82
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L82
            if (r1 == 0) goto L82
        L49:
            java.lang.String r1 = r3.t     // Catch: java.lang.ClassCastException -> L82
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L82
            if (r1 == 0) goto L5c
            java.lang.String r1 = r4.D()     // Catch: java.lang.ClassCastException -> L82
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L82
            if (r1 == 0) goto L82
            goto L68
        L5c:
            java.lang.String r1 = r3.t     // Catch: java.lang.ClassCastException -> L82
            java.lang.String r2 = r4.D()     // Catch: java.lang.ClassCastException -> L82
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L82
            if (r1 == 0) goto L82
        L68:
            boolean r1 = r3.s     // Catch: java.lang.ClassCastException -> L82
            boolean r2 = r4.J()     // Catch: java.lang.ClassCastException -> L82
            if (r1 != r2) goto L82
            boolean r1 = r3.q     // Catch: java.lang.ClassCastException -> L82
            boolean r2 = r4.L()     // Catch: java.lang.ClassCastException -> L82
            if (r1 != r2) goto L82
            boolean r1 = r3.r     // Catch: java.lang.ClassCastException -> L82
            boolean r4 = r4.P()     // Catch: java.lang.ClassCastException -> L82
            if (r1 != r4) goto L82
            r4 = 1
            return r4
        L82:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    @KeepForSdk
    public Account getAccount() {
        return this.p;
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.o;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Scope scope = arrayList2.get(i2);
            i2++;
            arrayList.add(scope.w());
        }
        Collections.sort(arrayList);
        return new HashAccumulator().a(arrayList).a(this.p).a(this.t).c(this.s).c(this.q).c(this.r).b();
    }

    @KeepForSdk
    public ArrayList<GoogleSignInOptionsExtensionParcelable> w() {
        return this.v;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.i(parcel, 1, this.n);
        SafeParcelWriter.u(parcel, 2, z(), false);
        SafeParcelWriter.o(parcel, 3, getAccount(), i2, false);
        SafeParcelWriter.c(parcel, 4, L());
        SafeParcelWriter.c(parcel, 5, P());
        SafeParcelWriter.c(parcel, 6, J());
        SafeParcelWriter.q(parcel, 7, D(), false);
        SafeParcelWriter.q(parcel, 8, this.u, false);
        SafeParcelWriter.u(parcel, 9, w(), false);
        SafeParcelWriter.b(parcel, a);
    }

    public final String x0() {
        return v0().toString();
    }

    @KeepForSdk
    public ArrayList<Scope> z() {
        return new ArrayList<>(this.o);
    }

    /* loaded from: classes2.dex */
    public static final class Builder {
        private Set<Scope> a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f10432b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f10433c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f10434d;

        /* renamed from: e, reason: collision with root package name */
        private String f10435e;

        /* renamed from: f, reason: collision with root package name */
        private Account f10436f;

        /* renamed from: g, reason: collision with root package name */
        private String f10437g;

        /* renamed from: h, reason: collision with root package name */
        private Map<Integer, GoogleSignInOptionsExtensionParcelable> f10438h;

        public Builder() {
            this.a = new HashSet();
            this.f10438h = new HashMap();
        }

        private final String h(String str) {
            Preconditions.g(str);
            String str2 = this.f10435e;
            Preconditions.b(str2 == null || str2.equals(str), "two different server client ids provided");
            return str;
        }

        public final GoogleSignInOptions a() {
            if (this.a.contains(GoogleSignInOptions.f10430j)) {
                Set<Scope> set = this.a;
                Scope scope = GoogleSignInOptions.f10429i;
                if (set.contains(scope)) {
                    this.a.remove(scope);
                }
            }
            if (this.f10434d && (this.f10436f == null || !this.a.isEmpty())) {
                c();
            }
            return new GoogleSignInOptions(3, new ArrayList(this.a), this.f10436f, this.f10434d, this.f10432b, this.f10433c, this.f10435e, this.f10437g, this.f10438h, null);
        }

        public final Builder b() {
            this.a.add(GoogleSignInOptions.f10427g);
            return this;
        }

        public final Builder c() {
            this.a.add(GoogleSignInOptions.f10428h);
            return this;
        }

        public final Builder d() {
            this.a.add(GoogleSignInOptions.f10426f);
            return this;
        }

        public final Builder e(Scope scope, Scope... scopeArr) {
            this.a.add(scope);
            this.a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        public final Builder f(String str) {
            return g(str, false);
        }

        public final Builder g(String str, boolean z) {
            this.f10432b = true;
            this.f10435e = h(str);
            this.f10433c = z;
            return this;
        }

        public Builder(GoogleSignInOptions googleSignInOptions) {
            this.a = new HashSet();
            this.f10438h = new HashMap();
            Preconditions.j(googleSignInOptions);
            this.a = new HashSet(googleSignInOptions.o);
            this.f10432b = googleSignInOptions.r;
            this.f10433c = googleSignInOptions.s;
            this.f10434d = googleSignInOptions.q;
            this.f10435e = googleSignInOptions.t;
            this.f10436f = googleSignInOptions.p;
            this.f10437g = googleSignInOptions.u;
            this.f10438h = GoogleSignInOptions.i0(googleSignInOptions.v);
        }
    }

    private GoogleSignInOptions(int i2, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map<Integer, GoogleSignInOptionsExtensionParcelable> map) {
        this.n = i2;
        this.o = arrayList;
        this.p = account;
        this.q = z;
        this.r = z2;
        this.s = z3;
        this.t = str;
        this.u = str2;
        this.v = new ArrayList<>(map.values());
        this.w = map;
    }

    /* synthetic */ GoogleSignInOptions(int i2, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, b bVar) {
        this(3, (ArrayList<Scope>) arrayList, account, z, z2, z3, str, str2, (Map<Integer, GoogleSignInOptionsExtensionParcelable>) map);
    }
}
