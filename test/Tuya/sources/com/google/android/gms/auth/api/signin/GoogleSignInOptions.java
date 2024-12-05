package com.google.android.gms.auth.api.signin;

import P.a;
import R.AbstractC1319p;
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
public class GoogleSignInOptions extends S.a implements a.d, ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* renamed from: l, reason: collision with root package name */
    public static final GoogleSignInOptions f15041l;

    /* renamed from: m, reason: collision with root package name */
    public static final GoogleSignInOptions f15042m;

    /* renamed from: n, reason: collision with root package name */
    public static final Scope f15043n = new Scope("profile");

    /* renamed from: o, reason: collision with root package name */
    public static final Scope f15044o = new Scope(NotificationCompat.CATEGORY_EMAIL);

    /* renamed from: p, reason: collision with root package name */
    public static final Scope f15045p = new Scope("openid");

    /* renamed from: q, reason: collision with root package name */
    public static final Scope f15046q;

    /* renamed from: r, reason: collision with root package name */
    public static final Scope f15047r;

    /* renamed from: s, reason: collision with root package name */
    private static final Comparator f15048s;

    /* renamed from: a, reason: collision with root package name */
    final int f15049a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f15050b;

    /* renamed from: c, reason: collision with root package name */
    private Account f15051c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f15052d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f15053e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f15054f;

    /* renamed from: g, reason: collision with root package name */
    private String f15055g;

    /* renamed from: h, reason: collision with root package name */
    private String f15056h;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f15057i;

    /* renamed from: j, reason: collision with root package name */
    private String f15058j;

    /* renamed from: k, reason: collision with root package name */
    private Map f15059k;

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        f15046q = scope;
        f15047r = new Scope("https://www.googleapis.com/auth/games");
        a aVar = new a();
        aVar.c();
        aVar.e();
        f15041l = aVar.a();
        a aVar2 = new a();
        aVar2.f(scope, new Scope[0]);
        f15042m = aVar2.a();
        CREATOR = new e();
        f15048s = new d();
    }

    public static GoogleSignInOptions Y(String str) {
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
    public static Map j0(List list) {
        HashMap hashMap = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                L.a aVar = (L.a) it.next();
                hashMap.put(Integer.valueOf(aVar.s()), aVar);
            }
        }
        return hashMap;
    }

    public String G() {
        return this.f15055g;
    }

    public boolean I() {
        return this.f15054f;
    }

    public boolean L() {
        return this.f15052d;
    }

    public boolean V() {
        return this.f15053e;
    }

    public final String c0() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f15050b, f15048s);
            Iterator it = this.f15050b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Scope) it.next()).s());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f15051c;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f15052d);
            jSONObject.put("forceCodeForRefreshToken", this.f15054f);
            jSONObject.put("serverAuthRequested", this.f15053e);
            if (!TextUtils.isEmpty(this.f15055g)) {
                jSONObject.put("serverClientId", this.f15055g);
            }
            if (!TextUtils.isEmpty(this.f15056h)) {
                jSONObject.put("hostedDomain", this.f15056h);
            }
            return jSONObject.toString();
        } catch (JSONException e8) {
            throw new RuntimeException(e8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0048, code lost:
    
        if (r1.equals(r4.i()) != false) goto L22;
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
            java.util.ArrayList r1 = r3.f15057i     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.isEmpty()     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
            java.util.ArrayList r1 = r4.f15057i     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.isEmpty()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L18
            goto L90
        L18:
            java.util.ArrayList r1 = r3.f15050b     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.z()     // Catch: java.lang.ClassCastException -> L90
            int r2 = r2.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.util.ArrayList r1 = r3.f15050b     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.z()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.containsAll(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L35
            goto L90
        L35:
            android.accounts.Account r1 = r3.f15051c     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L40
            android.accounts.Account r1 = r4.i()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L90
            goto L4a
        L40:
            android.accounts.Account r2 = r4.i()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
        L4a:
            java.lang.String r1 = r3.f15055g     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L5d
            java.lang.String r1 = r4.G()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
            goto L6a
        L5d:
            java.lang.String r1 = r3.f15055g     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r2 = r4.G()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L6a
            goto L90
        L6a:
            boolean r1 = r3.f15054f     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.I()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.f15052d     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.L()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.f15053e     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.V()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.lang.String r1 = r3.f15058j     // Catch: java.lang.ClassCastException -> L90
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
        ArrayList arrayList2 = this.f15050b;
        int size = arrayList2.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(((Scope) arrayList2.get(i8)).s());
        }
        Collections.sort(arrayList);
        L.b bVar = new L.b();
        bVar.a(arrayList);
        bVar.a(this.f15051c);
        bVar.a(this.f15055g);
        bVar.c(this.f15054f);
        bVar.c(this.f15052d);
        bVar.c(this.f15053e);
        bVar.a(this.f15058j);
        return bVar.b();
    }

    public Account i() {
        return this.f15051c;
    }

    public ArrayList s() {
        return this.f15057i;
    }

    public String u() {
        return this.f15058j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f15049a;
        int a8 = S.c.a(parcel);
        S.c.k(parcel, 1, i9);
        S.c.u(parcel, 2, z(), false);
        S.c.p(parcel, 3, i(), i8, false);
        S.c.c(parcel, 4, L());
        S.c.c(parcel, 5, V());
        S.c.c(parcel, 6, I());
        S.c.q(parcel, 7, G(), false);
        S.c.q(parcel, 8, this.f15056h, false);
        S.c.u(parcel, 9, s(), false);
        S.c.q(parcel, 10, u(), false);
        S.c.b(parcel, a8);
    }

    public ArrayList z() {
        return new ArrayList(this.f15050b);
    }

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Set f15060a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f15061b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f15062c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f15063d;

        /* renamed from: e, reason: collision with root package name */
        private String f15064e;

        /* renamed from: f, reason: collision with root package name */
        private Account f15065f;

        /* renamed from: g, reason: collision with root package name */
        private String f15066g;

        /* renamed from: h, reason: collision with root package name */
        private Map f15067h;

        /* renamed from: i, reason: collision with root package name */
        private String f15068i;

        public a() {
            this.f15060a = new HashSet();
            this.f15067h = new HashMap();
        }

        private final String h(String str) {
            AbstractC1319p.f(str);
            String str2 = this.f15064e;
            boolean z8 = true;
            if (str2 != null && !str2.equals(str)) {
                z8 = false;
            }
            AbstractC1319p.b(z8, "two different server client ids provided");
            return str;
        }

        public GoogleSignInOptions a() {
            if (this.f15060a.contains(GoogleSignInOptions.f15047r)) {
                Set set = this.f15060a;
                Scope scope = GoogleSignInOptions.f15046q;
                if (set.contains(scope)) {
                    this.f15060a.remove(scope);
                }
            }
            if (this.f15063d && (this.f15065f == null || !this.f15060a.isEmpty())) {
                c();
            }
            return new GoogleSignInOptions(new ArrayList(this.f15060a), this.f15065f, this.f15063d, this.f15061b, this.f15062c, this.f15064e, this.f15066g, this.f15067h, this.f15068i);
        }

        public a b() {
            this.f15060a.add(GoogleSignInOptions.f15044o);
            return this;
        }

        public a c() {
            this.f15060a.add(GoogleSignInOptions.f15045p);
            return this;
        }

        public a d(String str) {
            this.f15063d = true;
            h(str);
            this.f15064e = str;
            return this;
        }

        public a e() {
            this.f15060a.add(GoogleSignInOptions.f15043n);
            return this;
        }

        public a f(Scope scope, Scope... scopeArr) {
            this.f15060a.add(scope);
            this.f15060a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        public a g(String str) {
            this.f15068i = str;
            return this;
        }

        public a(GoogleSignInOptions googleSignInOptions) {
            this.f15060a = new HashSet();
            this.f15067h = new HashMap();
            AbstractC1319p.l(googleSignInOptions);
            this.f15060a = new HashSet(googleSignInOptions.f15050b);
            this.f15061b = googleSignInOptions.f15053e;
            this.f15062c = googleSignInOptions.f15054f;
            this.f15063d = googleSignInOptions.f15052d;
            this.f15064e = googleSignInOptions.f15055g;
            this.f15065f = googleSignInOptions.f15051c;
            this.f15066g = googleSignInOptions.f15056h;
            this.f15067h = GoogleSignInOptions.j0(googleSignInOptions.f15057i);
            this.f15068i = googleSignInOptions.f15058j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleSignInOptions(int i8, ArrayList arrayList, Account account, boolean z8, boolean z9, boolean z10, String str, String str2, ArrayList arrayList2, String str3) {
        this(i8, arrayList, account, z8, z9, z10, str, str2, j0(arrayList2), str3);
    }

    private GoogleSignInOptions(int i8, ArrayList arrayList, Account account, boolean z8, boolean z9, boolean z10, String str, String str2, Map map, String str3) {
        this.f15049a = i8;
        this.f15050b = arrayList;
        this.f15051c = account;
        this.f15052d = z8;
        this.f15053e = z9;
        this.f15054f = z10;
        this.f15055g = str;
        this.f15056h = str2;
        this.f15057i = new ArrayList(map.values());
        this.f15059k = map;
        this.f15058j = str3;
    }
}
