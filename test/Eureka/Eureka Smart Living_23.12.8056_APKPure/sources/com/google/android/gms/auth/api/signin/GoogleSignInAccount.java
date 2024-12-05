package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import v1.n;
import w1.c;
import z1.d;
import z1.e;

/* loaded from: classes.dex */
public class GoogleSignInAccount extends w1.a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new a();

    /* renamed from: n, reason: collision with root package name */
    public static d f4525n = e.b();

    /* renamed from: a, reason: collision with root package name */
    final int f4526a;

    /* renamed from: b, reason: collision with root package name */
    private String f4527b;

    /* renamed from: c, reason: collision with root package name */
    private String f4528c;

    /* renamed from: d, reason: collision with root package name */
    private String f4529d;

    /* renamed from: e, reason: collision with root package name */
    private String f4530e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f4531f;

    /* renamed from: g, reason: collision with root package name */
    private String f4532g;

    /* renamed from: h, reason: collision with root package name */
    private long f4533h;

    /* renamed from: i, reason: collision with root package name */
    private String f4534i;

    /* renamed from: j, reason: collision with root package name */
    List f4535j;

    /* renamed from: k, reason: collision with root package name */
    private String f4536k;

    /* renamed from: l, reason: collision with root package name */
    private String f4537l;

    /* renamed from: m, reason: collision with root package name */
    private Set f4538m = new HashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleSignInAccount(int i6, String str, String str2, String str3, String str4, Uri uri, String str5, long j6, String str6, List list, String str7, String str8) {
        this.f4526a = i6;
        this.f4527b = str;
        this.f4528c = str2;
        this.f4529d = str3;
        this.f4530e = str4;
        this.f4531f = uri;
        this.f4532g = str5;
        this.f4533h = j6;
        this.f4534i = str6;
        this.f4535j = list;
        this.f4536k = str7;
        this.f4537l = str8;
    }

    public static GoogleSignInAccount k(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l6, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l6.longValue(), n.d(str7), new ArrayList((Collection) n.h(set)), str5, str6);
    }

    public static GoogleSignInAccount l(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i6 = 0; i6 < length; i6++) {
            hashSet.add(new Scope(jSONArray.getString(i6)));
        }
        GoogleSignInAccount k6 = k(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        k6.f4532g = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return k6;
    }

    public String a() {
        return this.f4530e;
    }

    public String b() {
        return this.f4529d;
    }

    public String c() {
        return this.f4537l;
    }

    public String d() {
        return this.f4536k;
    }

    public String e() {
        return this.f4527b;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f4534i.equals(this.f4534i) && googleSignInAccount.i().equals(i());
    }

    public String f() {
        return this.f4528c;
    }

    public Uri h() {
        return this.f4531f;
    }

    public int hashCode() {
        return ((this.f4534i.hashCode() + 527) * 31) + i().hashCode();
    }

    public Set i() {
        HashSet hashSet = new HashSet(this.f4535j);
        hashSet.addAll(this.f4538m);
        return hashSet;
    }

    public String j() {
        return this.f4532g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        int a6 = c.a(parcel);
        c.f(parcel, 1, this.f4526a);
        c.j(parcel, 2, e(), false);
        c.j(parcel, 3, f(), false);
        c.j(parcel, 4, b(), false);
        c.j(parcel, 5, a(), false);
        c.i(parcel, 6, h(), i6, false);
        c.j(parcel, 7, j(), false);
        c.h(parcel, 8, this.f4533h);
        c.j(parcel, 9, this.f4534i, false);
        c.m(parcel, 10, this.f4535j, false);
        c.j(parcel, 11, d(), false);
        c.j(parcel, 12, c(), false);
        c.b(parcel, a6);
    }
}
