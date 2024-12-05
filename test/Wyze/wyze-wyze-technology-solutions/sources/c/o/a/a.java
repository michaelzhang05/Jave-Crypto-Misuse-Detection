package c.o.a;

import android.graphics.Color;
import android.util.TimingLogger;
import c.o.a.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorCutQuantizer.java */
/* loaded from: classes.dex */
public final class a {
    private static final Comparator<b> a = new C0075a();

    /* renamed from: b, reason: collision with root package name */
    final int[] f2834b;

    /* renamed from: c, reason: collision with root package name */
    final int[] f2835c;

    /* renamed from: d, reason: collision with root package name */
    final List<b.e> f2836d;

    /* renamed from: f, reason: collision with root package name */
    final b.c[] f2838f;

    /* renamed from: g, reason: collision with root package name */
    private final float[] f2839g = new float[3];

    /* renamed from: e, reason: collision with root package name */
    final TimingLogger f2837e = null;

    /* compiled from: ColorCutQuantizer.java */
    /* renamed from: c.o.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0075a implements Comparator<b> {
        C0075a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            return bVar2.g() - bVar.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ColorCutQuantizer.java */
    /* loaded from: classes.dex */
    public class b {
        private int a;

        /* renamed from: b, reason: collision with root package name */
        private int f2840b;

        /* renamed from: c, reason: collision with root package name */
        private int f2841c;

        /* renamed from: d, reason: collision with root package name */
        private int f2842d;

        /* renamed from: e, reason: collision with root package name */
        private int f2843e;

        /* renamed from: f, reason: collision with root package name */
        private int f2844f;

        /* renamed from: g, reason: collision with root package name */
        private int f2845g;

        /* renamed from: h, reason: collision with root package name */
        private int f2846h;

        /* renamed from: i, reason: collision with root package name */
        private int f2847i;

        b(int i2, int i3) {
            this.a = i2;
            this.f2840b = i3;
            c();
        }

        final boolean a() {
            return e() > 1;
        }

        final int b() {
            int f2 = f();
            a aVar = a.this;
            int[] iArr = aVar.f2834b;
            int[] iArr2 = aVar.f2835c;
            a.e(iArr, f2, this.a, this.f2840b);
            Arrays.sort(iArr, this.a, this.f2840b + 1);
            a.e(iArr, f2, this.a, this.f2840b);
            int i2 = this.f2841c / 2;
            int i3 = this.a;
            int i4 = 0;
            while (true) {
                int i5 = this.f2840b;
                if (i3 <= i5) {
                    i4 += iArr2[iArr[i3]];
                    if (i4 >= i2) {
                        return Math.min(i5 - 1, i3);
                    }
                    i3++;
                } else {
                    return this.a;
                }
            }
        }

        final void c() {
            a aVar = a.this;
            int[] iArr = aVar.f2834b;
            int[] iArr2 = aVar.f2835c;
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MIN_VALUE;
            int i7 = Integer.MIN_VALUE;
            int i8 = 0;
            for (int i9 = this.a; i9 <= this.f2840b; i9++) {
                int i10 = iArr[i9];
                i8 += iArr2[i10];
                int k2 = a.k(i10);
                int j2 = a.j(i10);
                int i11 = a.i(i10);
                if (k2 > i5) {
                    i5 = k2;
                }
                if (k2 < i2) {
                    i2 = k2;
                }
                if (j2 > i6) {
                    i6 = j2;
                }
                if (j2 < i3) {
                    i3 = j2;
                }
                if (i11 > i7) {
                    i7 = i11;
                }
                if (i11 < i4) {
                    i4 = i11;
                }
            }
            this.f2842d = i2;
            this.f2843e = i5;
            this.f2844f = i3;
            this.f2845g = i6;
            this.f2846h = i4;
            this.f2847i = i7;
            this.f2841c = i8;
        }

        final b.e d() {
            a aVar = a.this;
            int[] iArr = aVar.f2834b;
            int[] iArr2 = aVar.f2835c;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            for (int i6 = this.a; i6 <= this.f2840b; i6++) {
                int i7 = iArr[i6];
                int i8 = iArr2[i7];
                i3 += i8;
                i2 += a.k(i7) * i8;
                i4 += a.j(i7) * i8;
                i5 += i8 * a.i(i7);
            }
            float f2 = i3;
            return new b.e(a.b(Math.round(i2 / f2), Math.round(i4 / f2), Math.round(i5 / f2)), i3);
        }

        final int e() {
            return (this.f2840b + 1) - this.a;
        }

        final int f() {
            int i2 = this.f2843e - this.f2842d;
            int i3 = this.f2845g - this.f2844f;
            int i4 = this.f2847i - this.f2846h;
            if (i2 < i3 || i2 < i4) {
                return (i3 < i2 || i3 < i4) ? -1 : -2;
            }
            return -3;
        }

        final int g() {
            return ((this.f2843e - this.f2842d) + 1) * ((this.f2845g - this.f2844f) + 1) * ((this.f2847i - this.f2846h) + 1);
        }

        final b h() {
            if (a()) {
                int b2 = b();
                b bVar = new b(b2 + 1, this.f2840b);
                this.f2840b = b2;
                c();
                return bVar;
            }
            throw new IllegalStateException("Can not split a box with only 1 color");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(int[] iArr, int i2, b.c[] cVarArr) {
        this.f2838f = cVarArr;
        int[] iArr2 = new int[32768];
        this.f2835c = iArr2;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int g2 = g(iArr[i3]);
            iArr[i3] = g2;
            iArr2[g2] = iArr2[g2] + 1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < 32768; i5++) {
            if (iArr2[i5] > 0 && l(i5)) {
                iArr2[i5] = 0;
            }
            if (iArr2[i5] > 0) {
                i4++;
            }
        }
        int[] iArr3 = new int[i4];
        this.f2834b = iArr3;
        int i6 = 0;
        for (int i7 = 0; i7 < 32768; i7++) {
            if (iArr2[i7] > 0) {
                iArr3[i6] = i7;
                i6++;
            }
        }
        if (i4 <= i2) {
            this.f2836d = new ArrayList();
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = iArr3[i8];
                this.f2836d.add(new b.e(a(i9), iArr2[i9]));
            }
            return;
        }
        this.f2836d = h(i2);
    }

    private static int a(int i2) {
        return b(k(i2), j(i2), i(i2));
    }

    static int b(int i2, int i3, int i4) {
        return Color.rgb(f(i2, 5, 8), f(i3, 5, 8), f(i4, 5, 8));
    }

    private List<b.e> c(Collection<b> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<b> it = collection.iterator();
        while (it.hasNext()) {
            b.e d2 = it.next().d();
            if (!n(d2)) {
                arrayList.add(d2);
            }
        }
        return arrayList;
    }

    static void e(int[] iArr, int i2, int i3, int i4) {
        if (i2 == -2) {
            while (i3 <= i4) {
                int i5 = iArr[i3];
                iArr[i3] = i(i5) | (j(i5) << 10) | (k(i5) << 5);
                i3++;
            }
            return;
        }
        if (i2 != -1) {
            return;
        }
        while (i3 <= i4) {
            int i6 = iArr[i3];
            iArr[i3] = k(i6) | (i(i6) << 10) | (j(i6) << 5);
            i3++;
        }
    }

    private static int f(int i2, int i3, int i4) {
        return (i4 > i3 ? i2 << (i4 - i3) : i2 >> (i3 - i4)) & ((1 << i4) - 1);
    }

    private static int g(int i2) {
        return f(Color.blue(i2), 8, 5) | (f(Color.red(i2), 8, 5) << 10) | (f(Color.green(i2), 8, 5) << 5);
    }

    private List<b.e> h(int i2) {
        PriorityQueue<b> priorityQueue = new PriorityQueue<>(i2, a);
        priorityQueue.offer(new b(0, this.f2834b.length - 1));
        o(priorityQueue, i2);
        return c(priorityQueue);
    }

    static int i(int i2) {
        return i2 & 31;
    }

    static int j(int i2) {
        return (i2 >> 5) & 31;
    }

    static int k(int i2) {
        return (i2 >> 10) & 31;
    }

    private boolean l(int i2) {
        int a2 = a(i2);
        c.h.e.a.g(a2, this.f2839g);
        return m(a2, this.f2839g);
    }

    private boolean m(int i2, float[] fArr) {
        b.c[] cVarArr = this.f2838f;
        if (cVarArr != null && cVarArr.length > 0) {
            int length = cVarArr.length;
            for (int i3 = 0; i3 < length; i3++) {
                if (!this.f2838f[i3].a(i2, fArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean n(b.e eVar) {
        return m(eVar.e(), eVar.c());
    }

    private void o(PriorityQueue<b> priorityQueue, int i2) {
        b poll;
        while (priorityQueue.size() < i2 && (poll = priorityQueue.poll()) != null && poll.a()) {
            priorityQueue.offer(poll.h());
            priorityQueue.offer(poll);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<b.e> d() {
        return this.f2836d;
    }
}
