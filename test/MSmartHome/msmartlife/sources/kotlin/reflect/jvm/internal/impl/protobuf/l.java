package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: LazyStringArrayList.java */
/* loaded from: classes2.dex */
public class l extends AbstractList<String> implements RandomAccess, m {

    /* renamed from: f, reason: collision with root package name */
    public static final m f21941f = new l().E();

    /* renamed from: g, reason: collision with root package name */
    private final List<Object> f21942g;

    public l() {
        this.f21942g = new ArrayList();
    }

    private static d b(Object obj) {
        if (obj instanceof d) {
            return (d) obj;
        }
        if (obj instanceof String) {
            return d.x((String) obj);
        }
        return d.o((byte[]) obj);
    }

    private static String f(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof d) {
            return ((d) obj).U();
        }
        return i.b((byte[]) obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public m E() {
        return new u(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public void G(d dVar) {
        this.f21942g.add(dVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void add(int i2, String str) {
        this.f21942g.add(i2, str);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f21942g.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public String get(int i2) {
        Object obj = this.f21942g.get(i2);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String U = dVar.U();
            if (dVar.L()) {
                this.f21942g.set(i2, U);
            }
            return U;
        }
        byte[] bArr = (byte[]) obj;
        String b2 = i.b(bArr);
        if (i.a(bArr)) {
            this.f21942g.set(i2, b2);
        }
        return b2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f21942g.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public List<?> t() {
        return Collections.unmodifiableList(this.f21942g);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public String remove(int i2) {
        Object remove = this.f21942g.remove(i2);
        ((AbstractList) this).modCount++;
        return f(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public String set(int i2, String str) {
        return f(this.f21942g.set(i2, str));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public d y(int i2) {
        Object obj = this.f21942g.get(i2);
        d b2 = b(obj);
        if (b2 != obj) {
            this.f21942g.set(i2, b2);
        }
        return b2;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i2, Collection<? extends String> collection) {
        if (collection instanceof m) {
            collection = ((m) collection).t();
        }
        boolean addAll = this.f21942g.addAll(i2, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    public l(m mVar) {
        this.f21942g = new ArrayList(mVar.size());
        addAll(mVar);
    }
}
