package com.facebook.internal;

import android.net.Uri;
import java.util.EnumSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: FetchedAppSettings.java */
/* loaded from: classes.dex */
public final class m {
    private boolean a;

    /* renamed from: b, reason: collision with root package name */
    private String f9174b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9175c;

    /* renamed from: d, reason: collision with root package name */
    private int f9176d;

    /* renamed from: e, reason: collision with root package name */
    private EnumSet<w> f9177e;

    /* renamed from: f, reason: collision with root package name */
    private Map<String, Map<String, a>> f9178f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f9179g;

    /* renamed from: h, reason: collision with root package name */
    private h f9180h;

    /* renamed from: i, reason: collision with root package name */
    private String f9181i;

    /* renamed from: j, reason: collision with root package name */
    private String f9182j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f9183k;
    private boolean l;
    private String m;
    private JSONArray n;
    private boolean o;
    private boolean p;
    private String q;
    private String r;
    private String s;

    /* compiled from: FetchedAppSettings.java */
    /* loaded from: classes.dex */
    public static class a {
        private String a;

        /* renamed from: b, reason: collision with root package name */
        private String f9184b;

        /* renamed from: c, reason: collision with root package name */
        private Uri f9185c;

        /* renamed from: d, reason: collision with root package name */
        private int[] f9186d;

        private a(String str, String str2, Uri uri, int[] iArr) {
            this.a = str;
            this.f9184b = str2;
            this.f9185c = uri;
            this.f9186d = iArr;
        }

        public static a c(JSONObject jSONObject) {
            String optString = jSONObject.optString("name");
            if (x.Q(optString)) {
                return null;
            }
            String[] split = optString.split("\\|");
            if (split.length != 2) {
                return null;
            }
            String str = split[0];
            String str2 = split[1];
            if (x.Q(str) || x.Q(str2)) {
                return null;
            }
            String optString2 = jSONObject.optString("url");
            return new a(str, str2, x.Q(optString2) ? null : Uri.parse(optString2), d(jSONObject.optJSONArray("versions")));
        }

        private static int[] d(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            int[] iArr = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = -1;
                int optInt = jSONArray.optInt(i2, -1);
                if (optInt == -1) {
                    String optString = jSONArray.optString(i2);
                    if (!x.Q(optString)) {
                        try {
                            i3 = Integer.parseInt(optString);
                        } catch (NumberFormatException e2) {
                            x.U("FacebookSDK", e2);
                        }
                        iArr[i2] = i3;
                    }
                }
                i3 = optInt;
                iArr[i2] = i3;
            }
            return iArr;
        }

        public String a() {
            return this.a;
        }

        public String b() {
            return this.f9184b;
        }
    }

    public m(boolean z, String str, boolean z2, int i2, EnumSet<w> enumSet, Map<String, Map<String, a>> map, boolean z3, h hVar, String str2, String str3, boolean z4, boolean z5, JSONArray jSONArray, String str4, boolean z6, boolean z7, String str5, String str6, String str7) {
        this.a = z;
        this.f9174b = str;
        this.f9175c = z2;
        this.f9178f = map;
        this.f9180h = hVar;
        this.f9176d = i2;
        this.f9179g = z3;
        this.f9177e = enumSet;
        this.f9181i = str2;
        this.f9182j = str3;
        this.f9183k = z4;
        this.l = z5;
        this.n = jSONArray;
        this.m = str4;
        this.o = z6;
        this.p = z7;
        this.q = str5;
        this.r = str6;
        this.s = str7;
    }

    public boolean a() {
        return this.f9179g;
    }

    public boolean b() {
        return this.l;
    }

    public h c() {
        return this.f9180h;
    }

    public JSONArray d() {
        return this.n;
    }

    public boolean e() {
        return this.f9183k;
    }

    public boolean f() {
        return this.p;
    }

    public String g() {
        return this.q;
    }

    public String h() {
        return this.s;
    }

    public String i() {
        return this.m;
    }

    public int j() {
        return this.f9176d;
    }

    public EnumSet<w> k() {
        return this.f9177e;
    }

    public String l() {
        return this.r;
    }

    public boolean m() {
        return this.a;
    }
}
