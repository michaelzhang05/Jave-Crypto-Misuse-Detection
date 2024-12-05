package com.squareup.moshi;

import com.squareup.moshi.f;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;

/* compiled from: MapJsonAdapter.java */
/* loaded from: classes2.dex */
final class q<K, V> extends f<Map<K, V>> {
    public static final f.e a = new a();

    /* renamed from: b, reason: collision with root package name */
    private final f<K> f17294b;

    /* renamed from: c, reason: collision with root package name */
    private final f<V> f17295c;

    /* compiled from: MapJsonAdapter.java */
    /* loaded from: classes2.dex */
    class a implements f.e {
        a() {
        }

        @Override // com.squareup.moshi.f.e
        public f<?> a(Type type, Set<? extends Annotation> set, r rVar) {
            Class<?> g2;
            if (!set.isEmpty() || (g2 = u.g(type)) != Map.class) {
                return null;
            }
            Type[] i2 = u.i(type, g2);
            return new q(rVar, i2[0], i2[1]).nullSafe();
        }
    }

    q(r rVar, Type type, Type type2) {
        this.f17294b = rVar.d(type);
        this.f17295c = rVar.d(type2);
    }

    @Override // com.squareup.moshi.f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map<K, V> fromJson(i iVar) throws IOException {
        p pVar = new p();
        iVar.b();
        while (iVar.z()) {
            iVar.k0();
            K fromJson = this.f17294b.fromJson(iVar);
            V fromJson2 = this.f17295c.fromJson(iVar);
            V put = pVar.put(fromJson, fromJson2);
            if (put != null) {
                throw new JsonDataException("Map key '" + fromJson + "' has multiple values at path " + iVar.c() + ": " + put + " and " + fromJson2);
            }
        }
        iVar.o();
        return pVar;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(o oVar, Map<K, V> map) throws IOException {
        oVar.b();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                oVar.c0();
                this.f17294b.toJson(oVar, (o) entry.getKey());
                this.f17295c.toJson(oVar, (o) entry.getValue());
            } else {
                throw new JsonDataException("Map key is null at " + oVar.c());
            }
        }
        oVar.w();
    }

    public String toString() {
        return "JsonAdapter(" + this.f17294b + "=" + this.f17295c + ")";
    }
}
