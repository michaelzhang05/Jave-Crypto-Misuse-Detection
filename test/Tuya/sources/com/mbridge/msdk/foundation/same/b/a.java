package com.mbridge.msdk.foundation.same.b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private List<a> f19462a;

    /* renamed from: b, reason: collision with root package name */
    private String f19463b;

    /* renamed from: c, reason: collision with root package name */
    private a f19464c;

    /* renamed from: d, reason: collision with root package name */
    private c f19465d;

    public final void a(c cVar, String str) {
        a aVar = new a();
        aVar.f19465d = cVar;
        aVar.f19463b = str;
        a(aVar);
    }

    public final String b() {
        return this.f19463b;
    }

    public final a c() {
        return this.f19464c;
    }

    public final c d() {
        return this.f19465d;
    }

    private void a(a aVar) {
        if (this.f19462a == null) {
            this.f19462a = new ArrayList();
        }
        aVar.f19464c = this;
        this.f19462a.add(aVar);
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
        return this.f19462a;
    }

    public final void a(String str) {
        this.f19463b = str;
    }

    public final void a(c cVar) {
        this.f19465d = cVar;
    }
}
