package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.a3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3046a3 extends AbstractC3057d implements Consumer, Iterable {

    /* renamed from: e, reason: collision with root package name */
    protected Object[] f33672e = new Object[1 << 4];

    /* renamed from: f, reason: collision with root package name */
    protected Object[][] f33673f;

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        long length;
        int i8 = this.f33693b;
        Object[] objArr = this.f33672e;
        if (i8 == objArr.length) {
            if (this.f33673f == null) {
                Object[][] objArr2 = new Object[8];
                this.f33673f = objArr2;
                this.f33695d = new long[8];
                objArr2[0] = objArr;
            }
            int i9 = this.f33694c;
            int i10 = i9 + 1;
            Object[][] objArr3 = this.f33673f;
            if (i10 >= objArr3.length || objArr3[i10] == null) {
                if (i9 == 0) {
                    length = objArr.length;
                } else {
                    length = objArr3[i9].length + this.f33695d[i9];
                }
                r(length + 1);
            }
            this.f33693b = 0;
            int i11 = this.f33694c + 1;
            this.f33694c = i11;
            this.f33672e = this.f33673f[i11];
        }
        Object[] objArr4 = this.f33672e;
        int i12 = this.f33693b;
        this.f33693b = i12 + 1;
        objArr4[i12] = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.AbstractC3057d
    public final void clear() {
        Object[][] objArr = this.f33673f;
        if (objArr != null) {
            this.f33672e = objArr[0];
            int i8 = 0;
            while (true) {
                Object[] objArr2 = this.f33672e;
                if (i8 >= objArr2.length) {
                    break;
                }
                objArr2[i8] = null;
                i8++;
            }
            this.f33673f = null;
            this.f33695d = null;
        } else {
            for (int i9 = 0; i9 < this.f33693b; i9++) {
                this.f33672e[i9] = null;
            }
        }
        this.f33693b = 0;
        this.f33694c = 0;
    }

    @Override // java.lang.Iterable
    public void forEach(Consumer consumer) {
        for (int i8 = 0; i8 < this.f33694c; i8++) {
            for (Object obj : this.f33673f[i8]) {
                consumer.accept(obj);
            }
        }
        for (int i9 = 0; i9 < this.f33693b; i9++) {
            consumer.accept(this.f33672e[i9]);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return j$.util.u0.i(spliterator());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void r(long j8) {
        int i8 = this.f33694c;
        long length = i8 == 0 ? this.f33672e.length : this.f33695d[i8] + this.f33673f[i8].length;
        if (j8 > length) {
            if (this.f33673f == null) {
                Object[][] objArr = new Object[8];
                this.f33673f = objArr;
                this.f33695d = new long[8];
                objArr[0] = this.f33672e;
            }
            int i9 = i8 + 1;
            while (j8 > length) {
                Object[][] objArr2 = this.f33673f;
                if (i9 >= objArr2.length) {
                    int length2 = objArr2.length * 2;
                    this.f33673f = (Object[][]) Arrays.copyOf(objArr2, length2);
                    this.f33695d = Arrays.copyOf(this.f33695d, length2);
                }
                int i10 = this.f33692a;
                if (i9 != 0 && i9 != 1) {
                    i10 = Math.min((i10 + i9) - 1, 30);
                }
                int i11 = 1 << i10;
                this.f33673f[i9] = new Object[i11];
                long[] jArr = this.f33695d;
                jArr[i9] = jArr[i9 - 1] + r5[r7].length;
                length += i11;
                i9++;
            }
        }
    }

    @Override // java.lang.Iterable
    public Spliterator spliterator() {
        return new R2(this, 0, this.f33694c, 0, this.f33693b);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Objects.requireNonNull(arrayList);
        forEach(new C3042a(11, arrayList));
        return "SpinedBuffer:" + arrayList.toString();
    }
}
