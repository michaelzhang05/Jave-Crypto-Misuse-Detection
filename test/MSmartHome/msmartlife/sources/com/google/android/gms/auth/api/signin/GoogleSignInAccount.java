package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import cm.aptoide.pt.DeepLinkIntentReceiver;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new zab();

    /* renamed from: f, reason: collision with root package name */
    @VisibleForTesting
    private static Clock f10417f = DefaultClock.c();

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.VersionField
    private final int f10418g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private String f10419h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    private String f10420i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.Field
    private String f10421j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.Field
    private String f10422k;

    @SafeParcelable.Field
    private Uri l;

    @SafeParcelable.Field
    private String m;

    @SafeParcelable.Field
    private long n;

    @SafeParcelable.Field
    private String o;

    @SafeParcelable.Field
    private List<Scope> p;

    @SafeParcelable.Field
    private String q;

    @SafeParcelable.Field
    private String r;
    private Set<Scope> s = new HashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public GoogleSignInAccount(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String str3, @SafeParcelable.Param(id = 5) String str4, @SafeParcelable.Param(id = 6) Uri uri, @SafeParcelable.Param(id = 7) String str5, @SafeParcelable.Param(id = 8) long j2, @SafeParcelable.Param(id = 9) String str6, @SafeParcelable.Param(id = 10) List<Scope> list, @SafeParcelable.Param(id = 11) String str7, @SafeParcelable.Param(id = 12) String str8) {
        this.f10418g = i2;
        this.f10419h = str;
        this.f10420i = str2;
        this.f10421j = str3;
        this.f10422k = str4;
        this.l = uri;
        this.m = str5;
        this.n = j2;
        this.o = str6;
        this.p = list;
        this.q = str7;
        this.r = str8;
    }

    public static GoogleSignInAccount t0(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl", null);
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new Scope(jSONArray.getString(i2)));
        }
        GoogleSignInAccount u0 = u0(jSONObject.optString(DeepLinkIntentReceiver.DeepLinksKeys.ID), jSONObject.optString("tokenId", null), jSONObject.optString("email", null), jSONObject.optString("displayName", null), jSONObject.optString("givenName", null), jSONObject.optString("familyName", null), parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        u0.m = jSONObject.optString("serverAuthCode", null);
        return u0;
    }

    private static GoogleSignInAccount u0(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, String str7, Set<Scope> set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, (l == null ? Long.valueOf(f10417f.a() / 1000) : l).longValue(), Preconditions.g(str7), new ArrayList((Collection) Preconditions.j(set)), str5, str6);
    }

    private final JSONObject x0() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (L() != null) {
                jSONObject.put(DeepLinkIntentReceiver.DeepLinksKeys.ID, L());
            }
            if (P() != null) {
                jSONObject.put("tokenId", P());
            }
            if (z() != null) {
                jSONObject.put("email", z());
            }
            if (w() != null) {
                jSONObject.put("displayName", w());
            }
            if (J() != null) {
                jSONObject.put("givenName", J());
            }
            if (D() != null) {
                jSONObject.put("familyName", D());
            }
            if (Y() != null) {
                jSONObject.put("photoUrl", Y().toString());
            }
            if (q0() != null) {
                jSONObject.put("serverAuthCode", q0());
            }
            jSONObject.put("expirationTime", this.n);
            jSONObject.put("obfuscatedIdentifier", this.o);
            JSONArray jSONArray = new JSONArray();
            List<Scope> list = this.p;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, a.f10444f);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.w());
            }
            jSONObject.put("grantedScopes", jSONArray);
            return jSONObject;
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public String D() {
        return this.r;
    }

    public String J() {
        return this.q;
    }

    public String L() {
        return this.f10419h;
    }

    public String P() {
        return this.f10420i;
    }

    public Uri Y() {
        return this.l;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.o.equals(this.o) && googleSignInAccount.i0().equals(i0());
    }

    public Account getAccount() {
        if (this.f10421j == null) {
            return null;
        }
        return new Account(this.f10421j, "com.google");
    }

    public int hashCode() {
        return ((this.o.hashCode() + 527) * 31) + i0().hashCode();
    }

    @KeepForSdk
    public Set<Scope> i0() {
        HashSet hashSet = new HashSet(this.p);
        hashSet.addAll(this.s);
        return hashSet;
    }

    public String q0() {
        return this.m;
    }

    public final String v0() {
        return this.o;
    }

    public String w() {
        return this.f10422k;
    }

    public final String w0() {
        JSONObject x0 = x0();
        x0.remove("serverAuthCode");
        return x0.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.i(parcel, 1, this.f10418g);
        SafeParcelWriter.q(parcel, 2, L(), false);
        SafeParcelWriter.q(parcel, 3, P(), false);
        SafeParcelWriter.q(parcel, 4, z(), false);
        SafeParcelWriter.q(parcel, 5, w(), false);
        SafeParcelWriter.o(parcel, 6, Y(), i2, false);
        SafeParcelWriter.q(parcel, 7, q0(), false);
        SafeParcelWriter.l(parcel, 8, this.n);
        SafeParcelWriter.q(parcel, 9, this.o, false);
        SafeParcelWriter.u(parcel, 10, this.p, false);
        SafeParcelWriter.q(parcel, 11, J(), false);
        SafeParcelWriter.q(parcel, 12, D(), false);
        SafeParcelWriter.b(parcel, a);
    }

    public String z() {
        return this.f10421j;
    }
}
