package com.google.android.gms.auth.api.signin;

import O.a;
import Q.AbstractC1400p;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class GoogleSignInOptions extends R.a implements a.d, ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* renamed from: l, reason: collision with root package name */
    public static final GoogleSignInOptions f15842l;

    /* renamed from: m, reason: collision with root package name */
    public static final GoogleSignInOptions f15843m;

    /* renamed from: n, reason: collision with root package name */
    public static final Scope f15844n = new Scope("profile");

    /* renamed from: o, reason: collision with root package name */
    public static final Scope f15845o = new Scope(NotificationCompat.CATEGORY_EMAIL);

    /* renamed from: p, reason: collision with root package name */
    public static final Scope f15846p = new Scope("openid");

    /* renamed from: q, reason: collision with root package name */
    public static final Scope f15847q;

    /* renamed from: r, reason: collision with root package name */
    public static final Scope f15848r;

    /* renamed from: s, reason: collision with root package name */
    private static final Comparator f15849s;

    /* renamed from: a, reason: collision with root package name */
    final int f15850a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f15851b;

    /* renamed from: c, reason: collision with root package name */
    private Account f15852c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f15853d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f15854e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f15855f;

    /* renamed from: g, reason: collision with root package name */
    private String f15856g;

    /* renamed from: h, reason: collision with root package name */
    private String f15857h;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f15858i;

    /* renamed from: j, reason: collision with root package name */
    private String f15859j;

    /* renamed from: k, reason: collision with root package name */
    private Map f15860k;

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        f15847q = scope;
        f15848r = new Scope("https://www.googleapis.com/auth/games");
        a aVar = new a();
        aVar.c();
        aVar.e();
        f15842l = aVar.a();
        a aVar2 = new a();
        aVar2.f(scope, new Scope[0]);
        f15843m = aVar2.a();
        CREATOR = new e();
        f15849s = new d();
    }

    public static GoogleSignInOptions W(String str) {
        String str2;
        Account account;
        String str3;
        String str4 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i8 = 0; i8 < length; i8++) {
            hashSet.add(new Scope(jSONArray.getString(i8)));
        }
        if (jSONObject.has("accountName")) {
            str2 = jSONObject.optString("accountName");
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            account = new Account(str2, "com.google");
        } else {
            account = null;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        boolean z8 = jSONObject.getBoolean("idTokenRequested");
        boolean z9 = jSONObject.getBoolean("serverAuthRequested");
        boolean z10 = jSONObject.getBoolean("forceCodeForRefreshToken");
        if (jSONObject.has("serverClientId")) {
            str3 = jSONObject.optString("serverClientId");
        } else {
            str3 = null;
        }
        if (jSONObject.has("hostedDomain")) {
            str4 = jSONObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, arrayList, account, z8, z9, z10, str3, str4, new HashMap(), (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map h0(List list) {
        HashMap hashMap = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                K.a aVar = (K.a) it.next();
                hashMap.put(Integer.valueOf(aVar.p()), aVar);
            }
        }
        return hashMap;
    }

    public boolean H() {
        return this.f15853d;
    }

    public boolean J() {
        return this.f15854e;
    }

    public final String a0() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f15851b, f15849s);
            Iterator it = this.f15851b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Scope) it.next()).p());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f15852c;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f15853d);
            jSONObject.put("forceCodeForRefreshToken", this.f15855f);
            jSONObject.put("serverAuthRequested", this.f15854e);
            if (!TextUtils.isEmpty(this.f15856g)) {
                jSONObject.put("serverClientId", this.f15856g);
            }
            if (!TextUtils.isEmpty(this.f15857h)) {
                jSONObject.put("hostedDomain", this.f15857h);
            }
            return jSONObject.toString();
        } catch (JSONException e8) {
            throw new RuntimeException(e8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0048, code lost:
    
        if (r1.equals(r4.l()) != false) goto L22;
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
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r1 = r3.f15858i     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.isEmpty()     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
            java.util.ArrayList r1 = r4.f15858i     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.isEmpty()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L18
            goto L90
        L18:
            java.util.ArrayList r1 = r3.f15851b     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.v()     // Catch: java.lang.ClassCastException -> L90
            int r2 = r2.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.util.ArrayList r1 = r3.f15851b     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.v()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.containsAll(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L35
            goto L90
        L35:
            android.accounts.Account r1 = r3.f15852c     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L40
            android.accounts.Account r1 = r4.l()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L90
            goto L4a
        L40:
            android.accounts.Account r2 = r4.l()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
        L4a:
            java.lang.String r1 = r3.f15856g     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L5d
            java.lang.String r1 = r4.y()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
            goto L6a
        L5d:
            java.lang.String r1 = r3.f15856g     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r2 = r4.y()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L6a
            goto L90
        L6a:
            boolean r1 = r3.f15855f     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.z()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.f15853d     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.H()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.f15854e     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.J()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.lang.String r1 = r3.f15859j     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r4 = r4.u()     // Catch: java.lang.ClassCastException -> L90
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch: java.lang.ClassCastException -> L90
            if (r4 == 0) goto L90
            r4 = 1
            return r4
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f15851b;
        int size = arrayList2.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(((Scope) arrayList2.get(i8)).p());
        }
        Collections.sort(arrayList);
        K.b bVar = new K.b();
        bVar.a(arrayList);
        bVar.a(this.f15852c);
        bVar.a(this.f15856g);
        bVar.c(this.f15855f);
        bVar.c(this.f15853d);
        bVar.c(this.f15854e);
        bVar.a(this.f15859j);
        return bVar.b();
    }

    public Account l() {
        return this.f15852c;
    }

    public ArrayList p() {
        return this.f15858i;
    }

    public String u() {
        return this.f15859j;
    }

    public ArrayList v() {
        return new ArrayList(this.f15851b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f15850a;
        int a8 = R.c.a(parcel);
        R.c.k(parcel, 1, i9);
        R.c.u(parcel, 2, v(), false);
        R.c.p(parcel, 3, l(), i8, false);
        R.c.c(parcel, 4, H());
        R.c.c(parcel, 5, J());
        R.c.c(parcel, 6, z());
        R.c.q(parcel, 7, y(), false);
        R.c.q(parcel, 8, this.f15857h, false);
        R.c.u(parcel, 9, p(), false);
        R.c.q(parcel, 10, u(), false);
        R.c.b(parcel, a8);
    }

    public String y() {
        return this.f15856g;
    }

    public boolean z() {
        return this.f15855f;
    }

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Set f15861a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f15862b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f15863c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f15864d;

        /* renamed from: e, reason: collision with root package name */
        private String f15865e;

        /* renamed from: f, reason: collision with root package name */
        private Account f15866f;

        /* renamed from: g, reason: collision with root package name */
        private String f15867g;

        /* renamed from: h, reason: collision with root package name */
        private Map f15868h;

        /* renamed from: i, reason: collision with root package name */
        private String f15869i;

        public a() {
            this.f15861a = new HashSet();
            this.f15868h = new HashMap();
        }

        private final String h(String str) {
            AbstractC1400p.f(str);
            String str2 = this.f15865e;
            boolean z8 = true;
            if (str2 != null && !str2.equals(str)) {
                z8 = false;
            }
            AbstractC1400p.b(z8, "two different server client ids provided");
            return str;
        }

        public GoogleSignInOptions a() {
            if (this.f15861a.contains(GoogleSignInOptions.f15848r)) {
                Set set = this.f15861a;
                Scope scope = GoogleSignInOptions.f15847q;
                if (set.contains(scope)) {
                    this.f15861a.remove(scope);
                }
            }
            if (this.f15864d && (this.f15866f == null || !this.f15861a.isEmpty())) {
                c();
            }
            return new GoogleSignInOptions(new ArrayList(this.f15861a), this.f15866f, this.f15864d, this.f15862b, this.f15863c, this.f15865e, this.f15867g, this.f15868h, this.f15869i);
        }

        public a b() {
            this.f15861a.add(GoogleSignInOptions.f15845o);
            return this;
        }

        public a c() {
            this.f15861a.add(GoogleSignInOptions.f15846p);
            return this;
        }

        public a d(String str) {
            this.f15864d = true;
            h(str);
            this.f15865e = str;
            return this;
        }

        public a e() {
            this.f15861a.add(GoogleSignInOptions.f15844n);
            return this;
        }

        public a f(Scope scope, Scope... scopeArr) {
            this.f15861a.add(scope);
            this.f15861a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        public a g(String str) {
            this.f15869i = str;
            return this;
        }

        public a(GoogleSignInOptions googleSignInOptions) {
            this.f15861a = new HashSet();
            this.f15868h = new HashMap();
            AbstractC1400p.l(googleSignInOptions);
            this.f15861a = new HashSet(googleSignInOptions.f15851b);
            this.f15862b = googleSignInOptions.f15854e;
            this.f15863c = googleSignInOptions.f15855f;
            this.f15864d = googleSignInOptions.f15853d;
            this.f15865e = googleSignInOptions.f15856g;
            this.f15866f = googleSignInOptions.f15852c;
            this.f15867g = googleSignInOptions.f15857h;
            this.f15868h = GoogleSignInOptions.h0(googleSignInOptions.f15858i);
            this.f15869i = googleSignInOptions.f15859j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleSignInOptions(int i8, ArrayList arrayList, Account account, boolean z8, boolean z9, boolean z10, String str, String str2, ArrayList arrayList2, String str3) {
        this(i8, arrayList, account, z8, z9, z10, str, str2, h0(arrayList2), str3);
    }

    private GoogleSignInOptions(int i8, ArrayList arrayList, Account account, boolean z8, boolean z9, boolean z10, String str, String str2, Map map, String str3) {
        this.f15850a = i8;
        this.f15851b = arrayList;
        this.f15852c = account;
        this.f15853d = z8;
        this.f15854e = z9;
        this.f15855f = z10;
        this.f15856g = str;
        this.f15857h = str2;
        this.f15858i = new ArrayList(map.values());
        this.f15860k = map;
        this.f15859j = str3;
    }
}
