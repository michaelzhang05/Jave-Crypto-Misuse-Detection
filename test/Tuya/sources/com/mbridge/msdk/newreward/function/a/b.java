package com.mbridge.msdk.newreward.function.a;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static int f20887a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static int f20888b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f20889c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static int f20890d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static int f20891e = 4;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.d.a.b f20892f;

    /* renamed from: g, reason: collision with root package name */
    private String f20893g;

    /* renamed from: h, reason: collision with root package name */
    private int f20894h = 21;

    /* renamed from: i, reason: collision with root package name */
    private int f20895i = f20888b;

    /* renamed from: j, reason: collision with root package name */
    private ArrayList<String> f20896j = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    private List<String> f20897k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    private List<String> f20898l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    private List<String> f20899m = new ArrayList();

    public final com.mbridge.msdk.newreward.function.d.a.b a() {
        return this.f20892f;
    }

    public final String b() {
        return this.f20893g;
    }

    public final String c() {
        ArrayList<String> arrayList = this.f20896j;
        if (arrayList == null) {
            return "";
        }
        return arrayList.toString();
    }

    public final String d() {
        List<String> list = this.f20897k;
        if (list == null) {
            return "";
        }
        return list.toString();
    }

    public final String e() {
        List<String> list = this.f20898l;
        if (list == null) {
            return "";
        }
        return list.toString();
    }

    public final String f() {
        List<String> list = this.f20899m;
        if (list == null) {
            return "";
        }
        return list.toString();
    }

    public final int g() {
        return this.f20894h;
    }

    public final int h() {
        return this.f20895i;
    }

    public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar) {
        this.f20892f = bVar;
    }

    public final void b(String str) {
        try {
            List<String> list = this.f20897k;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void a(String str) {
        try {
            ArrayList<String> arrayList = this.f20896j;
            if (arrayList != null) {
                arrayList.add(str);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void c(String str) {
        try {
            List<String> list = this.f20898l;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void d(String str) {
        this.f20893g = str;
    }

    public final void a(int i8) {
        this.f20895i = i8;
    }
}
