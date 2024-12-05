package com.mbridge.msdk.newreward.function.a;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static int f21942a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static int f21943b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f21944c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static int f21945d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static int f21946e = 4;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.d.a.b f21947f;

    /* renamed from: g, reason: collision with root package name */
    private String f21948g;

    /* renamed from: h, reason: collision with root package name */
    private int f21949h = 21;

    /* renamed from: i, reason: collision with root package name */
    private int f21950i = f21943b;

    /* renamed from: j, reason: collision with root package name */
    private ArrayList<String> f21951j = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    private List<String> f21952k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    private List<String> f21953l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    private List<String> f21954m = new ArrayList();

    public final com.mbridge.msdk.newreward.function.d.a.b a() {
        return this.f21947f;
    }

    public final String b() {
        return this.f21948g;
    }

    public final String c() {
        ArrayList<String> arrayList = this.f21951j;
        if (arrayList == null) {
            return "";
        }
        return arrayList.toString();
    }

    public final String d() {
        List<String> list = this.f21952k;
        if (list == null) {
            return "";
        }
        return list.toString();
    }

    public final String e() {
        List<String> list = this.f21953l;
        if (list == null) {
            return "";
        }
        return list.toString();
    }

    public final String f() {
        List<String> list = this.f21954m;
        if (list == null) {
            return "";
        }
        return list.toString();
    }

    public final int g() {
        return this.f21949h;
    }

    public final int h() {
        return this.f21950i;
    }

    public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar) {
        this.f21947f = bVar;
    }

    public final void b(String str) {
        try {
            List<String> list = this.f21952k;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void a(String str) {
        try {
            ArrayList<String> arrayList = this.f21951j;
            if (arrayList != null) {
                arrayList.add(str);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void c(String str) {
        try {
            List<String> list = this.f21953l;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void d(String str) {
        this.f21948g = str;
    }

    public final void a(int i8) {
        this.f21950i = i8;
    }
}
