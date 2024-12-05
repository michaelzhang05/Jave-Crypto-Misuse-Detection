package com.mbridge.msdk.e.a;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f18813a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f18814b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, String> f18815c;

    /* renamed from: d, reason: collision with root package name */
    public final List<i> f18816d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f18817e;

    /* renamed from: f, reason: collision with root package name */
    public final long f18818f;

    public m(int i8, byte[] bArr, boolean z8, long j8, List<i> list) {
        this(i8, bArr, a(list), list, z8, j8);
    }

    private static Map<String, String> a(List<i> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (i iVar : list) {
            treeMap.put(iVar.a(), iVar.b());
        }
        return treeMap;
    }

    private m(int i8, byte[] bArr, Map<String, String> map, List<i> list, boolean z8, long j8) {
        this.f18813a = i8;
        this.f18814b = bArr;
        this.f18815c = map;
        if (list == null) {
            this.f18816d = null;
        } else {
            this.f18816d = DesugarCollections.unmodifiableList(list);
        }
        this.f18817e = z8;
        this.f18818f = j8;
    }
}
