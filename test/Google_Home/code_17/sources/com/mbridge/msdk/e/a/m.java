package com.mbridge.msdk.e.a;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f19868a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f19869b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, String> f19870c;

    /* renamed from: d, reason: collision with root package name */
    public final List<i> f19871d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f19872e;

    /* renamed from: f, reason: collision with root package name */
    public final long f19873f;

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
        this.f19868a = i8;
        this.f19869b = bArr;
        this.f19870c = map;
        if (list == null) {
            this.f19871d = null;
        } else {
            this.f19871d = DesugarCollections.unmodifiableList(list);
        }
        this.f19872e = z8;
        this.f19873f = j8;
    }
}
