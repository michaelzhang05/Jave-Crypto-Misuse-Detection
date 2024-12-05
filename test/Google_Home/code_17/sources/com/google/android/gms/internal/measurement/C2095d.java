package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2095d {

    /* renamed from: a, reason: collision with root package name */
    private C2105e f16595a;

    /* renamed from: b, reason: collision with root package name */
    private C2105e f16596b;

    /* renamed from: c, reason: collision with root package name */
    private List f16597c;

    public C2095d() {
        this.f16595a = new C2105e("", 0L, null);
        this.f16596b = new C2105e("", 0L, null);
        this.f16597c = new ArrayList();
    }

    public final C2105e a() {
        return this.f16595a;
    }

    public final void b(C2105e c2105e) {
        this.f16595a = c2105e;
        this.f16596b = (C2105e) c2105e.clone();
        this.f16597c.clear();
    }

    public final void c(String str, long j8, Map map) {
        HashMap hashMap = new HashMap();
        for (String str2 : map.keySet()) {
            hashMap.put(str2, C2105e.c(str2, this.f16595a.b(str2), map.get(str2)));
        }
        this.f16597c.add(new C2105e(str, j8, hashMap));
    }

    public final /* synthetic */ Object clone() {
        C2095d c2095d = new C2095d((C2105e) this.f16595a.clone());
        Iterator it = this.f16597c.iterator();
        while (it.hasNext()) {
            c2095d.f16597c.add((C2105e) ((C2105e) it.next()).clone());
        }
        return c2095d;
    }

    public final C2105e d() {
        return this.f16596b;
    }

    public final void e(C2105e c2105e) {
        this.f16596b = c2105e;
    }

    public final List f() {
        return this.f16597c;
    }

    private C2095d(C2105e c2105e) {
        this.f16595a = c2105e;
        this.f16596b = (C2105e) c2105e.clone();
        this.f16597c = new ArrayList();
    }
}
