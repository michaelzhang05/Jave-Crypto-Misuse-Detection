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
public class C2896a3 extends AbstractC2907d implements Consumer, Iterable {

    /* renamed from: e, reason: collision with root package name */
    protected Object[] f32478e = new Object[1 << 4];

    /* renamed from: f, reason: collision with root package name */
    protected Object[][] f32479f;

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        long length;
        int i8 = this.f32499b;
        Object[] objArr = this.f32478e;
        if (i8 == objArr.length) {
            if (this.f32479f == null) {
                Object[][] objArr2 = new Object[8];
                this.f32479f = objArr2;
                this.f32501d = new long[8];
                objArr2[0] = objArr;
            }
            int i9 = this.f32500c;
            int i10 = i9 + 1;
            Object[][] objArr3 = this.f32479f;
            if (i10 >= objArr3.length || objArr3[i10] == null) {
                if (i9 == 0) {
                    length = objArr.length;
                } else {
                    length = objArr3[i9].length + this.f32501d[i9];
                }
                r(length + 1);
            }
            this.f32499b = 0;
            int i11 = this.f32500c + 1;
            this.f32500c = i11;
            this.f32478e = this.f32479f[i11];
        }
        Object[] objArr4 = this.f32478e;
        int i12 = this.f32499b;
        this.f32499b = i12 + 1;
        objArr4[i12] = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.AbstractC2907d
    public final void clear() {
        Object[][] objArr = this.f32479f;
        if (objArr != null) {
            this.f32478e = objArr[0];
            int i8 = 0;
            while (true) {
                Object[] objArr2 = this.f32478e;
                if (i8 >= objArr2.length) {
                    break;
                }
                objArr2[i8] = null;
                i8++;
            }
            this.f32479f = null;
            this.f32501d = null;
        } else {
            for (int i9 = 0; i9 < this.f32499b; i9++) {
                this.f32478e[i9] = null;
            }
        }
        this.f32499b = 0;
        this.f32500c = 0;
    }

    @Override // java.lang.Iterable
    public void forEach(Consumer consumer) {
        for (int i8 = 0; i8 < this.f32500c; i8++) {
            for (Object obj : this.f32479f[i8]) {
                consumer.accept(obj);
            }
        }
        for (int i9 = 0; i9 < this.f32499b; i9++) {
            consumer.accept(this.f32478e[i9]);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return j$.util.u0.i(spliterator());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void r(long j8) {
        int i8 = this.f32500c;
        long length = i8 == 0 ? this.f32478e.length : this.f32501d[i8] + this.f32479f[i8].length;
        if (j8 > length) {
            if (this.f32479f == null) {
                Object[][] objArr = new Object[8];
                this.f32479f = objArr;
                this.f32501d = new long[8];
                objArr[0] = this.f32478e;
            }
            int i9 = i8 + 1;
            while (j8 > length) {
                Object[][] objArr2 = this.f32479f;
                if (i9 >= objArr2.length) {
                    int length2 = objArr2.length * 2;
                    this.f32479f = (Object[][]) Arrays.copyOf(objArr2, length2);
                    this.f32501d = Arrays.copyOf(this.f32501d, length2);
                }
                int i10 = this.f32498a;
                if (i9 != 0 && i9 != 1) {
                    i10 = Math.min((i10 + i9) - 1, 30);
                }
                int i11 = 1 << i10;
                this.f32479f[i9] = new Object[i11];
                long[] jArr = this.f32501d;
                jArr[i9] = jArr[i9 - 1] + r5[r7].length;
                length += i11;
                i9++;
            }
        }
    }

    @Override // java.lang.Iterable
    public Spliterator spliterator() {
        return new R2(this, 0, this.f32500c, 0, this.f32499b);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Objects.requireNonNull(arrayList);
        forEach(new C2892a(11, arrayList));
        return "SpinedBuffer:" + arrayList.toString();
    }
}
