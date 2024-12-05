package com.mbridge.msdk.foundation.same.b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private List<a> f20517a;

    /* renamed from: b, reason: collision with root package name */
    private String f20518b;

    /* renamed from: c, reason: collision with root package name */
    private a f20519c;

    /* renamed from: d, reason: collision with root package name */
    private c f20520d;

    public final void a(c cVar, String str) {
        a aVar = new a();
        aVar.f20520d = cVar;
        aVar.f20518b = str;
        a(aVar);
    }

    public final String b() {
        return this.f20518b;
    }

    public final a c() {
        return this.f20519c;
    }

    public final c d() {
        return this.f20520d;
    }

    private void a(a aVar) {
        if (this.f20517a == null) {
            this.f20517a = new ArrayList();
        }
        aVar.f20519c = this;
        this.f20517a.add(aVar);
    }

    public final void a(List<a> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator<a> it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public final List<a> a() {
        return this.f20517a;
    }

    public final void a(String str) {
        this.f20518b = str;
    }

    public final void a(c cVar) {
        this.f20520d = cVar;
    }
}
