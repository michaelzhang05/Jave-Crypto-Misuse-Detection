package com.mbridge.msdk.foundation.b;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static int f20076a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static int f20077b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f20078c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static int f20079d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static int f20080e = 4;

    /* renamed from: f, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f20081f;

    /* renamed from: g, reason: collision with root package name */
    private String f20082g;

    /* renamed from: h, reason: collision with root package name */
    private int f20083h = 21;

    /* renamed from: i, reason: collision with root package name */
    private int f20084i = f20077b;

    /* renamed from: j, reason: collision with root package name */
    private ArrayList<String> f20085j = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    private List<String> f20086k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    private List<String> f20087l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    private List<String> f20088m = new ArrayList();

    public final CopyOnWriteArrayList<CampaignEx> a() {
        return this.f20081f;
    }

    public final String b() {
        return this.f20082g;
    }

    public final String c() {
        ArrayList<String> arrayList = this.f20085j;
        if (arrayList == null) {
            return "";
        }
        return arrayList.toString();
    }

    public final String d() {
        List<String> list = this.f20086k;
        if (list == null) {
            return "";
        }
        return list.toString();
    }

    public final String e() {
        List<String> list = this.f20087l;
        if (list == null) {
            return "";
        }
        return list.toString();
    }

    public final String f() {
        List<String> list = this.f20088m;
        if (list == null) {
            return "";
        }
        return list.toString();
    }

    public final int g() {
        return this.f20084i;
    }

    public final void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.f20081f = copyOnWriteArrayList;
    }

    public final void b(String str) {
        try {
            List<String> list = this.f20086k;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void a(String str) {
        try {
            ArrayList<String> arrayList = this.f20085j;
            if (arrayList != null) {
                arrayList.add(str);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void c(String str) {
        try {
            List<String> list = this.f20087l;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void d(String str) {
        this.f20082g = str;
    }

    public final void a(int i8) {
        this.f20084i = i8;
    }
}
