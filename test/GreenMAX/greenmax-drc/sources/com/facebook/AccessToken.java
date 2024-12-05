package com.facebook;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import cm.aptoide.pt.DeepLinkIntentReceiver;
import cm.aptoide.pt.account.AndroidAccountManagerPersistence;
import cm.aptoide.pt.timeline.view.follow.TimeLineFollowFragment;
import com.facebook.internal.x;
import com.facebook.internal.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AccessToken implements Parcelable {
    public static final Parcelable.Creator<AccessToken> CREATOR;

    /* renamed from: f, reason: collision with root package name */
    private static final Date f8966f;

    /* renamed from: g, reason: collision with root package name */
    private static final Date f8967g;

    /* renamed from: h, reason: collision with root package name */
    private static final Date f8968h;

    /* renamed from: i, reason: collision with root package name */
    private static final c f8969i;

    /* renamed from: j, reason: collision with root package name */
    private final Date f8970j;

    /* renamed from: k, reason: collision with root package name */
    private final Set<String> f8971k;
    private final Set<String> l;
    private final Set<String> m;
    private final String n;
    private final c o;
    private final Date p;
    private final String q;
    private final String r;
    private final Date s;
    private final String t;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AccessToken createFromParcel(Parcel parcel) {
            return new AccessToken(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AccessToken[] newArray(int i2) {
            return new AccessToken[i2];
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(FacebookException facebookException);

        void b(AccessToken accessToken);
    }

    static {
        Date date = new Date(Long.MAX_VALUE);
        f8966f = date;
        f8967g = date;
        f8968h = new Date();
        f8969i = c.FACEBOOK_APPLICATION_WEB;
        CREATOR = new a();
    }

    public AccessToken(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, c cVar, Date date, Date date2, Date date3) {
        this(str, str2, str3, collection, collection2, collection3, cVar, date, date2, date3, null);
    }

    private void a(StringBuilder sb) {
        sb.append(" permissions:");
        if (this.f8971k == null) {
            sb.append("null");
            return;
        }
        sb.append("[");
        sb.append(TextUtils.join(", ", this.f8971k));
        sb.append("]");
    }

    static AccessToken b(AccessToken accessToken) {
        return new AccessToken(accessToken.n, accessToken.q, accessToken.s(), accessToken.n(), accessToken.i(), accessToken.j(), accessToken.o, new Date(), new Date(), accessToken.s);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AccessToken c(JSONObject jSONObject) throws JSONException {
        if (jSONObject.getInt("version") <= 1) {
            String string = jSONObject.getString("token");
            Date date = new Date(jSONObject.getLong("expires_at"));
            JSONArray jSONArray = jSONObject.getJSONArray("permissions");
            JSONArray jSONArray2 = jSONObject.getJSONArray("declined_permissions");
            JSONArray optJSONArray = jSONObject.optJSONArray("expired_permissions");
            Date date2 = new Date(jSONObject.getLong("last_refresh"));
            c valueOf = c.valueOf(jSONObject.getString("source"));
            return new AccessToken(string, jSONObject.getString("application_id"), jSONObject.getString(TimeLineFollowFragment.BundleKeys.USER_ID), x.T(jSONArray), x.T(jSONArray2), optJSONArray == null ? new ArrayList() : x.T(optJSONArray), valueOf, date, date2, new Date(jSONObject.optLong("data_access_expiration_time", 0L)), jSONObject.optString("graph_domain", null));
        }
        throw new FacebookException("Unknown AccessToken serialization format.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AccessToken d(Bundle bundle) {
        List<String> p = p(bundle, "com.facebook.TokenCachingStrategy.Permissions");
        List<String> p2 = p(bundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
        List<String> p3 = p(bundle, "com.facebook.TokenCachingStrategy.ExpiredPermissions");
        String c2 = k.c(bundle);
        if (x.Q(c2)) {
            c2 = f.f();
        }
        String str = c2;
        String f2 = k.f(bundle);
        try {
            return new AccessToken(f2, str, x.d(f2).getString(DeepLinkIntentReceiver.DeepLinksKeys.ID), p, p2, p3, k.e(bundle), k.d(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate"), k.d(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate"), null);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e() {
        AccessToken g2 = com.facebook.b.h().g();
        if (g2 != null) {
            v(b(g2));
        }
    }

    public static AccessToken g() {
        return com.facebook.b.h().g();
    }

    static List<String> p(Bundle bundle, String str) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
        if (stringArrayList == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(new ArrayList(stringArrayList));
    }

    public static boolean t() {
        AccessToken g2 = com.facebook.b.h().g();
        return (g2 == null || g2.u()) ? false : true;
    }

    public static void v(AccessToken accessToken) {
        com.facebook.b.h().m(accessToken);
    }

    private String x() {
        return this.n == null ? "null" : f.y(l.INCLUDE_ACCESS_TOKENS) ? this.n : "ACCESS_TOKEN_REMOVED";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) obj;
        if (this.f8970j.equals(accessToken.f8970j) && this.f8971k.equals(accessToken.f8971k) && this.l.equals(accessToken.l) && this.m.equals(accessToken.m) && this.n.equals(accessToken.n) && this.o == accessToken.o && this.p.equals(accessToken.p) && ((str = this.q) != null ? str.equals(accessToken.q) : accessToken.q == null) && this.r.equals(accessToken.r) && this.s.equals(accessToken.s)) {
            String str2 = this.t;
            String str3 = accessToken.t;
            if (str2 == null) {
                if (str3 == null) {
                    return true;
                }
            } else if (str2.equals(str3)) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        return this.q;
    }

    public Date h() {
        return this.s;
    }

    public int hashCode() {
        int hashCode = (((((((((((((527 + this.f8970j.hashCode()) * 31) + this.f8971k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.o.hashCode()) * 31) + this.p.hashCode()) * 31;
        String str = this.q;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.r.hashCode()) * 31) + this.s.hashCode()) * 31;
        String str2 = this.t;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public Set<String> i() {
        return this.l;
    }

    public Set<String> j() {
        return this.m;
    }

    public Date k() {
        return this.f8970j;
    }

    public String l() {
        return this.t;
    }

    public Date m() {
        return this.p;
    }

    public Set<String> n() {
        return this.f8971k;
    }

    public c q() {
        return this.o;
    }

    public String r() {
        return this.n;
    }

    public String s() {
        return this.r;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{AccessToken");
        sb.append(" token:");
        sb.append(x());
        a(sb);
        sb.append("}");
        return sb.toString();
    }

    public boolean u() {
        return new Date().after(this.f8970j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JSONObject w() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.n);
        jSONObject.put("expires_at", this.f8970j.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.f8971k));
        jSONObject.put("declined_permissions", new JSONArray((Collection) this.l));
        jSONObject.put("expired_permissions", new JSONArray((Collection) this.m));
        jSONObject.put("last_refresh", this.p.getTime());
        jSONObject.put("source", this.o.name());
        jSONObject.put("application_id", this.q);
        jSONObject.put(TimeLineFollowFragment.BundleKeys.USER_ID, this.r);
        jSONObject.put("data_access_expiration_time", this.s.getTime());
        String str = this.t;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f8970j.getTime());
        parcel.writeStringList(new ArrayList(this.f8971k));
        parcel.writeStringList(new ArrayList(this.l));
        parcel.writeStringList(new ArrayList(this.m));
        parcel.writeString(this.n);
        parcel.writeString(this.o.name());
        parcel.writeLong(this.p.getTime());
        parcel.writeString(this.q);
        parcel.writeString(this.r);
        parcel.writeLong(this.s.getTime());
        parcel.writeString(this.t);
    }

    public AccessToken(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, c cVar, Date date, Date date2, Date date3, String str4) {
        y.j(str, "accessToken");
        y.j(str2, "applicationId");
        y.j(str3, AndroidAccountManagerPersistence.ACCOUNT_ID);
        this.f8970j = date == null ? f8967g : date;
        this.f8971k = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        this.l = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        this.m = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        this.n = str;
        this.o = cVar == null ? f8969i : cVar;
        this.p = date2 == null ? f8968h : date2;
        this.q = str2;
        this.r = str3;
        this.s = (date3 == null || date3.getTime() == 0) ? f8967g : date3;
        this.t = str4;
    }

    AccessToken(Parcel parcel) {
        this.f8970j = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.f8971k = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.l = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.m = Collections.unmodifiableSet(new HashSet(arrayList));
        this.n = parcel.readString();
        this.o = c.valueOf(parcel.readString());
        this.p = new Date(parcel.readLong());
        this.q = parcel.readString();
        this.r = parcel.readString();
        this.s = new Date(parcel.readLong());
        this.t = parcel.readString();
    }
}
