package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public class c0 extends c implements d0, RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    private static final c0 f5465c;

    /* renamed from: d, reason: collision with root package name */
    public static final d0 f5466d;

    /* renamed from: b, reason: collision with root package name */
    private final List f5467b;

    static {
        c0 c0Var = new c0();
        f5465c = c0Var;
        c0Var.b();
        f5466d = c0Var;
    }

    public c0() {
        this(10);
    }

    private static String j(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof h ? ((h) obj).B() : z.i((byte[]) obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public d0 a() {
        return f() ? new m1(this) : this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    public boolean addAll(int i6, Collection collection) {
        h();
        if (collection instanceof d0) {
            collection = ((d0) collection).e();
        }
        boolean addAll = this.f5467b.addAll(i6, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public Object c(int i6) {
        return this.f5467b.get(i6);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        h();
        this.f5467b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public List e() {
        return Collections.unmodifiableList(this.f5467b);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, com.google.crypto.tink.shaded.protobuf.z.d
    public /* bridge */ /* synthetic */ boolean f() {
        return super.f();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void g(h hVar) {
        h();
        this.f5467b.add(hVar);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void add(int i6, String str) {
        h();
        this.f5467b.add(i6, str);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public String get(int i6) {
        Object obj = this.f5467b.get(i6);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            String B = hVar.B();
            if (hVar.q()) {
                this.f5467b.set(i6, B);
            }
            return B;
        }
        byte[] bArr = (byte[]) obj;
        String i7 = z.i(bArr);
        if (z.g(bArr)) {
            this.f5467b.set(i6, i7);
        }
        return i7;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.z.d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public c0 d(int i6) {
        if (i6 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i6);
        arrayList.addAll(this.f5467b);
        return new c0(arrayList);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public String remove(int i6) {
        h();
        Object remove = this.f5467b.remove(i6);
        ((AbstractList) this).modCount++;
        return j(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public String set(int i6, String str) {
        h();
        return j(this.f5467b.set(i6, str));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f5467b.size();
    }

    public c0(int i6) {
        this(new ArrayList(i6));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    private c0(ArrayList arrayList) {
        this.f5467b = arrayList;
    }
}
