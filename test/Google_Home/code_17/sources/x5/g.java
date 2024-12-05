package x5;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import x5.AbstractC4192a;

/* loaded from: classes5.dex */
public final class g extends AbstractC4192a {

    /* renamed from: b, reason: collision with root package name */
    private static final i f40758b = f.a(Collections.emptyMap());

    /* loaded from: classes5.dex */
    public static final class b extends AbstractC4192a.AbstractC0928a {
        public g b() {
            return new g(this.f40751a);
        }

        public b c(Object obj, i iVar) {
            super.a(obj, iVar);
            return this;
        }

        private b(int i8) {
            super(i8);
        }
    }

    public static b b(int i8) {
        return new b(i8);
    }

    @Override // L5.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Map get() {
        LinkedHashMap b8 = x5.b.b(a().size());
        for (Map.Entry entry : a().entrySet()) {
            b8.put(entry.getKey(), ((i) entry.getValue()).get());
        }
        return DesugarCollections.unmodifiableMap(b8);
    }

    private g(Map map) {
        super(map);
    }
}
