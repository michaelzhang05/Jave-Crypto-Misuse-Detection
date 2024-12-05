package com.google.android.gms.auth.api.signin;

import R.AbstractC1319p;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class GoogleSignInAccount extends S.a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new c();

    /* renamed from: n, reason: collision with root package name */
    public static final W.d f15027n = W.g.b();

    /* renamed from: a, reason: collision with root package name */
    final int f15028a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15029b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15030c;

    /* renamed from: d, reason: collision with root package name */
    private final String f15031d;

    /* renamed from: e, reason: collision with root package name */
    private final String f15032e;

    /* renamed from: f, reason: collision with root package name */
    private final Uri f15033f;

    /* renamed from: g, reason: collision with root package name */
    private String f15034g;

    /* renamed from: h, reason: collision with root package name */
    private final long f15035h;

    /* renamed from: i, reason: collision with root package name */
    private final String f15036i;

    /* renamed from: j, reason: collision with root package name */
    final List f15037j;

    /* renamed from: k, reason: collision with root package name */
    private final String f15038k;

    /* renamed from: l, reason: collision with root package name */
    private final String f15039l;

    /* renamed from: m, reason: collision with root package name */
    private final Set f15040m = new HashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleSignInAccount(int i8, String str, String str2, String str3, String str4, Uri uri, String str5, long j8, String str6, List list, String str7, String str8) {
        this.f15028a = i8;
        this.f15029b = str;
        this.f15030c = str2;
        this.f15031d = str3;
        this.f15032e = str4;
        this.f15033f = uri;
        this.f15034g = str5;
        this.f15035h = j8;
        this.f15036i = str6;
        this.f15037j = list;
        this.f15038k = str7;
        this.f15039l = str8;
    }

    public static GoogleSignInAccount Y(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l8, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l8.longValue(), AbstractC1319p.f(str7), new ArrayList((Collection) AbstractC1319p.l(set)), str5, str6);
    }

    public static GoogleSignInAccount Z(String str) {
        Uri uri;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        if (!TextUtils.isEmpty(optString)) {
            uri = Uri.parse(optString);
        } else {
            uri = null;
        }
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i8 = 0; i8 < length; i8++) {
            hashSet.add(new Scope(jSONArray.getString(i8)));
        }
        String optString2 = jSONObject.optString("id");
        if (jSONObject.has("tokenId")) {
            str2 = jSONObject.optString("tokenId");
        } else {
            str2 = null;
        }
        if (jSONObject.has(NotificationCompat.CATEGORY_EMAIL)) {
            str3 = jSONObject.optString(NotificationCompat.CATEGORY_EMAIL);
        } else {
            str3 = null;
        }
        if (jSONObject.has("displayName")) {
            str4 = jSONObject.optString("displayName");
        } else {
            str4 = null;
        }
        if (jSONObject.has("givenName")) {
            str5 = jSONObject.optString("givenName");
        } else {
            str5 = null;
        }
        if (jSONObject.has("familyName")) {
            str6 = jSONObject.optString("familyName");
        } else {
            str6 = null;
        }
        GoogleSignInAccount Y7 = Y(optString2, str2, str3, str4, str5, str6, uri, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        if (jSONObject.has("serverAuthCode")) {
            str7 = jSONObject.optString("serverAuthCode");
        }
        Y7.f15034g = str7;
        return Y7;
    }

    public String G() {
        return this.f15038k;
    }

    public String I() {
        return this.f15030c;
    }

    public Uri L() {
        return this.f15033f;
    }

    public Set V() {
        HashSet hashSet = new HashSet(this.f15037j);
        hashSet.addAll(this.f15040m);
        return hashSet;
    }

    public String X() {
        return this.f15034g;
    }

    public final String a0() {
        return this.f15036i;
    }

    public final String b0() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (getId() != null) {
                jSONObject.put("id", getId());
            }
            if (I() != null) {
                jSONObject.put("tokenId", I());
            }
            if (u() != null) {
                jSONObject.put(NotificationCompat.CATEGORY_EMAIL, u());
            }
            if (s() != null) {
                jSONObject.put("displayName", s());
            }
            if (G() != null) {
                jSONObject.put("givenName", G());
            }
            if (z() != null) {
                jSONObject.put("familyName", z());
            }
            Uri L8 = L();
            if (L8 != null) {
                jSONObject.put("photoUrl", L8.toString());
            }
            if (X() != null) {
                jSONObject.put("serverAuthCode", X());
            }
            jSONObject.put("expirationTime", this.f15035h);
            jSONObject.put("obfuscatedIdentifier", this.f15036i);
            JSONArray jSONArray = new JSONArray();
            List list = this.f15037j;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, new Comparator() { // from class: K.c
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
                    return ((Scope) obj).s().compareTo(((Scope) obj2).s());
                }
            });
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.s());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e8) {
            throw new RuntimeException(e8);
        }
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
        if (!googleSignInAccount.f15036i.equals(this.f15036i) || !googleSignInAccount.V().equals(V())) {
            return false;
        }
        return true;
    }

    public String getId() {
        return this.f15029b;
    }

    public int hashCode() {
        return ((this.f15036i.hashCode() + 527) * 31) + V().hashCode();
    }

    public String s() {
        return this.f15032e;
    }

    public String u() {
        return this.f15031d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.k(parcel, 1, this.f15028a);
        S.c.q(parcel, 2, getId(), false);
        S.c.q(parcel, 3, I(), false);
        S.c.q(parcel, 4, u(), false);
        S.c.q(parcel, 5, s(), false);
        S.c.p(parcel, 6, L(), i8, false);
        S.c.q(parcel, 7, X(), false);
        S.c.n(parcel, 8, this.f15035h);
        S.c.q(parcel, 9, this.f15036i, false);
        S.c.u(parcel, 10, this.f15037j, false);
        S.c.q(parcel, 11, G(), false);
        S.c.q(parcel, 12, z(), false);
        S.c.b(parcel, a8);
    }

    public String z() {
        return this.f15039l;
    }
}
