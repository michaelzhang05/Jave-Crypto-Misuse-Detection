package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.z;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class i0 extends LinkedHashMap {

    /* renamed from: b, reason: collision with root package name */
    private static final i0 f5521b;

    /* renamed from: a, reason: collision with root package name */
    private boolean f5522a;

    static {
        i0 i0Var = new i0();
        f5521b = i0Var;
        i0Var.j();
    }

    private i0() {
        this.f5522a = true;
    }

    static int a(Map map) {
        int i6 = 0;
        for (Map.Entry entry : map.entrySet()) {
            i6 += b(entry.getValue()) ^ b(entry.getKey());
        }
        return i6;
    }

    private static int b(Object obj) {
        if (obj instanceof byte[]) {
            return z.d((byte[]) obj);
        }
        if (obj instanceof z.a) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    private static void c(Map map) {
        for (Object obj : map.keySet()) {
            z.a(obj);
            z.a(map.get(obj));
        }
    }

    public static i0 d() {
        return f5521b;
    }

    private void e() {
        if (!i()) {
            throw new UnsupportedOperationException();
        }
    }

    private static boolean f(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    static boolean h(Map map, Map map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !f(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        e();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && h(this, (Map) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return a(this);
    }

    public boolean i() {
        return this.f5522a;
    }

    public void j() {
        this.f5522a = false;
    }

    public void k(i0 i0Var) {
        e();
        if (i0Var.isEmpty()) {
            return;
        }
        putAll(i0Var);
    }

    public i0 l() {
        return isEmpty() ? new i0() : new i0(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        e();
        z.a(obj);
        z.a(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        e();
        c(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        e();
        return super.remove(obj);
    }

    private i0(Map map) {
        super(map);
        this.f5522a = true;
    }
}
