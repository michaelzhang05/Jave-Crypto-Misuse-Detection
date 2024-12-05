package y6;

import M5.AbstractC1246t;
import j$.util.Map;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import z6.S;

@t6.g(with = w.class)
/* loaded from: classes5.dex */
public final class v extends AbstractC4007i implements Map<String, AbstractC4007i>, Y5.a, j$.util.Map {
    public static final a Companion = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Map f40023a;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final t6.b serializer() {
            return w.f40025a;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f40024a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(Map.Entry entry) {
            AbstractC3159y.i(entry, "<name for destructuring parameter 0>");
            String str = (String) entry.getKey();
            AbstractC4007i abstractC4007i = (AbstractC4007i) entry.getValue();
            StringBuilder sb = new StringBuilder();
            S.c(sb, str);
            sb.append(':');
            sb.append(abstractC4007i);
            String sb2 = sb.toString();
            AbstractC3159y.h(sb2, "toString(...)");
            return sb2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Map content) {
        super(null);
        AbstractC3159y.i(content, "content");
        this.f40023a = content;
    }

    public boolean a(String key) {
        AbstractC3159y.i(key, "key");
        return this.f40023a.containsKey(key);
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public /* bridge */ /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public /* bridge */ /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public /* bridge */ /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return a((String) obj);
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof AbstractC4007i)) {
            return false;
        }
        return g((AbstractC4007i) obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, AbstractC4007i>> entrySet() {
        return i();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return AbstractC3159y.d(this.f40023a, obj);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    public boolean g(AbstractC4007i value) {
        AbstractC3159y.i(value, "value");
        return this.f40023a.containsValue(value);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC4007i get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return h((String) obj);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    public AbstractC4007i h(String key) {
        AbstractC3159y.i(key, "key");
        return (AbstractC4007i) this.f40023a.get(key);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f40023a.hashCode();
    }

    public Set i() {
        return this.f40023a.entrySet();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f40023a.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return l();
    }

    public Set l() {
        return this.f40023a.keySet();
    }

    public int m() {
        return this.f40023a.size();
    }

    @Override // java.util.Map, j$.util.Map
    public /* bridge */ /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Collection p() {
        return this.f40023a.values();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ AbstractC4007i put(String str, AbstractC4007i abstractC4007i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends String, ? extends AbstractC4007i> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public /* bridge */ /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public AbstractC4007i remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public /* bridge */ /* synthetic */ Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m();
    }

    public String toString() {
        return AbstractC1246t.w0(this.f40023a.entrySet(), ",", "{", "}", 0, null, b.f40024a, 24, null);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<AbstractC4007i> values() {
        return p();
    }

    @Override // java.util.Map, j$.util.Map
    public /* bridge */ /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
