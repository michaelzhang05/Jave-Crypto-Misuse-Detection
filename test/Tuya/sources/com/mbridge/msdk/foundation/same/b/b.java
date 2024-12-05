package com.mbridge.msdk.foundation.same.b;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    protected a f19466a;

    public b(String str) {
        a aVar = new a();
        aVar.a(str);
        aVar.a(c.AD_ROOT);
        List<a> a8 = a();
        if (a8 != null && a8.size() > 0) {
            aVar.a(a8);
        }
        this.f19466a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final a a(ArrayList<a> arrayList, c cVar, String str) {
        a aVar = new a();
        aVar.a(cVar);
        aVar.a(str);
        arrayList.add(aVar);
        return aVar;
    }

    protected abstract List<a> a();

    public final a b() {
        return this.f19466a;
    }
}
