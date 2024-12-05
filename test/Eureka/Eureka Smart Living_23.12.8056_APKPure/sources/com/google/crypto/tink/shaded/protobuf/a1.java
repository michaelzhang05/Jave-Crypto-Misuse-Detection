package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a1 extends c implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final a1 f5442d;

    /* renamed from: b, reason: collision with root package name */
    private Object[] f5443b;

    /* renamed from: c, reason: collision with root package name */
    private int f5444c;

    static {
        a1 a1Var = new a1(new Object[0], 0);
        f5442d = a1Var;
        a1Var.b();
    }

    private a1(Object[] objArr, int i6) {
        this.f5443b = objArr;
        this.f5444c = i6;
    }

    private static Object[] i(int i6) {
        return new Object[i6];
    }

    public static a1 j() {
        return f5442d;
    }

    private void k(int i6) {
        if (i6 < 0 || i6 >= this.f5444c) {
            throw new IndexOutOfBoundsException(l(i6));
        }
    }

    private String l(int i6) {
        return "Index:" + i6 + ", Size:" + this.f5444c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i6, Object obj) {
        int i7;
        h();
        if (i6 < 0 || i6 > (i7 = this.f5444c)) {
            throw new IndexOutOfBoundsException(l(i6));
        }
        Object[] objArr = this.f5443b;
        if (i7 < objArr.length) {
            System.arraycopy(objArr, i6, objArr, i6 + 1, i7 - i6);
        } else {
            Object[] i8 = i(((i7 * 3) / 2) + 1);
            System.arraycopy(this.f5443b, 0, i8, 0, i6);
            System.arraycopy(this.f5443b, i6, i8, i6 + 1, this.f5444c - i6);
            this.f5443b = i8;
        }
        this.f5443b[i6] = obj;
        this.f5444c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i6) {
        k(i6);
        return this.f5443b[i6];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.z.d
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public a1 d(int i6) {
        if (i6 >= this.f5444c) {
            return new a1(Arrays.copyOf(this.f5443b, i6), this.f5444c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    public Object remove(int i6) {
        h();
        k(i6);
        Object[] objArr = this.f5443b;
        Object obj = objArr[i6];
        if (i6 < this.f5444c - 1) {
            System.arraycopy(objArr, i6 + 1, objArr, i6, (r2 - i6) - 1);
        }
        this.f5444c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i6, Object obj) {
        h();
        k(i6);
        Object[] objArr = this.f5443b;
        Object obj2 = objArr[i6];
        objArr[i6] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f5444c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        h();
        int i6 = this.f5444c;
        Object[] objArr = this.f5443b;
        if (i6 == objArr.length) {
            this.f5443b = Arrays.copyOf(objArr, ((i6 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f5443b;
        int i7 = this.f5444c;
        this.f5444c = i7 + 1;
        objArr2[i7] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
