package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.g0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.o implements RecyclerView.y.b {
    private BitSet B;
    private boolean G;
    private boolean H;
    private e I;
    private int J;
    private int[] O;

    /* renamed from: t, reason: collision with root package name */
    f[] f3419t;

    /* renamed from: u, reason: collision with root package name */
    i f3420u;

    /* renamed from: v, reason: collision with root package name */
    i f3421v;

    /* renamed from: w, reason: collision with root package name */
    private int f3422w;

    /* renamed from: x, reason: collision with root package name */
    private int f3423x;

    /* renamed from: y, reason: collision with root package name */
    private final androidx.recyclerview.widget.f f3424y;

    /* renamed from: s, reason: collision with root package name */
    private int f3418s = -1;

    /* renamed from: z, reason: collision with root package name */
    boolean f3425z = false;
    boolean A = false;
    int C = -1;
    int D = Integer.MIN_VALUE;
    d E = new d();
    private int F = 2;
    private final Rect K = new Rect();
    private final b L = new b();
    private boolean M = false;
    private boolean N = true;
    private final Runnable P = new a();

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.S1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        int f3427a;

        /* renamed from: b, reason: collision with root package name */
        int f3428b;

        /* renamed from: c, reason: collision with root package name */
        boolean f3429c;

        /* renamed from: d, reason: collision with root package name */
        boolean f3430d;

        /* renamed from: e, reason: collision with root package name */
        boolean f3431e;

        /* renamed from: f, reason: collision with root package name */
        int[] f3432f;

        b() {
            c();
        }

        void a() {
            this.f3428b = this.f3429c ? StaggeredGridLayoutManager.this.f3420u.i() : StaggeredGridLayoutManager.this.f3420u.m();
        }

        void b(int i6) {
            this.f3428b = this.f3429c ? StaggeredGridLayoutManager.this.f3420u.i() - i6 : StaggeredGridLayoutManager.this.f3420u.m() + i6;
        }

        void c() {
            this.f3427a = -1;
            this.f3428b = Integer.MIN_VALUE;
            this.f3429c = false;
            this.f3430d = false;
            this.f3431e = false;
            int[] iArr = this.f3432f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        void d(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f3432f;
            if (iArr == null || iArr.length < length) {
                this.f3432f = new int[StaggeredGridLayoutManager.this.f3419t.length];
            }
            for (int i6 = 0; i6 < length; i6++) {
                this.f3432f[i6] = fVarArr[i6].p(Integer.MIN_VALUE);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends RecyclerView.p {

        /* renamed from: e, reason: collision with root package name */
        f f3434e;

        /* renamed from: f, reason: collision with root package name */
        boolean f3435f;

        public c(int i6, int i7) {
            super(i6, i7);
        }

        public final int e() {
            f fVar = this.f3434e;
            if (fVar == null) {
                return -1;
            }
            return fVar.f3456e;
        }

        public boolean f() {
            return this.f3435f;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        int[] f3436a;

        /* renamed from: b, reason: collision with root package name */
        List f3437b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0056a();

            /* renamed from: a, reason: collision with root package name */
            int f3438a;

            /* renamed from: b, reason: collision with root package name */
            int f3439b;

            /* renamed from: c, reason: collision with root package name */
            int[] f3440c;

            /* renamed from: d, reason: collision with root package name */
            boolean f3441d;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            static class C0056a implements Parcelable.Creator {
                C0056a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public a[] newArray(int i6) {
                    return new a[i6];
                }
            }

            a() {
            }

            a(Parcel parcel) {
                this.f3438a = parcel.readInt();
                this.f3439b = parcel.readInt();
                this.f3441d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f3440c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            int a(int i6) {
                int[] iArr = this.f3440c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i6];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f3438a + ", mGapDir=" + this.f3439b + ", mHasUnwantedGapAfter=" + this.f3441d + ", mGapPerSpan=" + Arrays.toString(this.f3440c) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i6) {
                parcel.writeInt(this.f3438a);
                parcel.writeInt(this.f3439b);
                parcel.writeInt(this.f3441d ? 1 : 0);
                int[] iArr = this.f3440c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f3440c);
                }
            }
        }

        d() {
        }

        private int i(int i6) {
            if (this.f3437b == null) {
                return -1;
            }
            a f6 = f(i6);
            if (f6 != null) {
                this.f3437b.remove(f6);
            }
            int size = this.f3437b.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    i7 = -1;
                    break;
                }
                if (((a) this.f3437b.get(i7)).f3438a >= i6) {
                    break;
                }
                i7++;
            }
            if (i7 == -1) {
                return -1;
            }
            a aVar = (a) this.f3437b.get(i7);
            this.f3437b.remove(i7);
            return aVar.f3438a;
        }

        private void l(int i6, int i7) {
            List list = this.f3437b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f3437b.get(size);
                int i8 = aVar.f3438a;
                if (i8 >= i6) {
                    aVar.f3438a = i8 + i7;
                }
            }
        }

        private void m(int i6, int i7) {
            List list = this.f3437b;
            if (list == null) {
                return;
            }
            int i8 = i6 + i7;
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f3437b.get(size);
                int i9 = aVar.f3438a;
                if (i9 >= i6) {
                    if (i9 < i8) {
                        this.f3437b.remove(size);
                    } else {
                        aVar.f3438a = i9 - i7;
                    }
                }
            }
        }

        public void a(a aVar) {
            if (this.f3437b == null) {
                this.f3437b = new ArrayList();
            }
            int size = this.f3437b.size();
            for (int i6 = 0; i6 < size; i6++) {
                a aVar2 = (a) this.f3437b.get(i6);
                if (aVar2.f3438a == aVar.f3438a) {
                    this.f3437b.remove(i6);
                }
                if (aVar2.f3438a >= aVar.f3438a) {
                    this.f3437b.add(i6, aVar);
                    return;
                }
            }
            this.f3437b.add(aVar);
        }

        void b() {
            int[] iArr = this.f3436a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3437b = null;
        }

        void c(int i6) {
            int[] iArr = this.f3436a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i6, 10) + 1];
                this.f3436a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i6 >= iArr.length) {
                int[] iArr3 = new int[o(i6)];
                this.f3436a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f3436a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        int d(int i6) {
            List list = this.f3437b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((a) this.f3437b.get(size)).f3438a >= i6) {
                        this.f3437b.remove(size);
                    }
                }
            }
            return h(i6);
        }

        public a e(int i6, int i7, int i8, boolean z5) {
            List list = this.f3437b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                a aVar = (a) this.f3437b.get(i9);
                int i10 = aVar.f3438a;
                if (i10 >= i7) {
                    return null;
                }
                if (i10 >= i6 && (i8 == 0 || aVar.f3439b == i8 || (z5 && aVar.f3441d))) {
                    return aVar;
                }
            }
            return null;
        }

        public a f(int i6) {
            List list = this.f3437b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f3437b.get(size);
                if (aVar.f3438a == i6) {
                    return aVar;
                }
            }
            return null;
        }

        int g(int i6) {
            int[] iArr = this.f3436a;
            if (iArr == null || i6 >= iArr.length) {
                return -1;
            }
            return iArr[i6];
        }

        int h(int i6) {
            int[] iArr = this.f3436a;
            if (iArr == null || i6 >= iArr.length) {
                return -1;
            }
            int i7 = i(i6);
            if (i7 == -1) {
                int[] iArr2 = this.f3436a;
                Arrays.fill(iArr2, i6, iArr2.length, -1);
                return this.f3436a.length;
            }
            int i8 = i7 + 1;
            Arrays.fill(this.f3436a, i6, i8, -1);
            return i8;
        }

        void j(int i6, int i7) {
            int[] iArr = this.f3436a;
            if (iArr == null || i6 >= iArr.length) {
                return;
            }
            int i8 = i6 + i7;
            c(i8);
            int[] iArr2 = this.f3436a;
            System.arraycopy(iArr2, i6, iArr2, i8, (iArr2.length - i6) - i7);
            Arrays.fill(this.f3436a, i6, i8, -1);
            l(i6, i7);
        }

        void k(int i6, int i7) {
            int[] iArr = this.f3436a;
            if (iArr == null || i6 >= iArr.length) {
                return;
            }
            int i8 = i6 + i7;
            c(i8);
            int[] iArr2 = this.f3436a;
            System.arraycopy(iArr2, i8, iArr2, i6, (iArr2.length - i6) - i7);
            int[] iArr3 = this.f3436a;
            Arrays.fill(iArr3, iArr3.length - i7, iArr3.length, -1);
            m(i6, i7);
        }

        void n(int i6, f fVar) {
            c(i6);
            this.f3436a[i6] = fVar.f3456e;
        }

        int o(int i6) {
            int length = this.f3436a.length;
            while (length <= i6) {
                length *= 2;
            }
            return length;
        }
    }

    /* loaded from: classes.dex */
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        int f3442a;

        /* renamed from: b, reason: collision with root package name */
        int f3443b;

        /* renamed from: c, reason: collision with root package name */
        int f3444c;

        /* renamed from: d, reason: collision with root package name */
        int[] f3445d;

        /* renamed from: e, reason: collision with root package name */
        int f3446e;

        /* renamed from: f, reason: collision with root package name */
        int[] f3447f;

        /* renamed from: g, reason: collision with root package name */
        List f3448g;

        /* renamed from: h, reason: collision with root package name */
        boolean f3449h;

        /* renamed from: i, reason: collision with root package name */
        boolean f3450i;

        /* renamed from: j, reason: collision with root package name */
        boolean f3451j;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i6) {
                return new e[i6];
            }
        }

        public e() {
        }

        e(Parcel parcel) {
            this.f3442a = parcel.readInt();
            this.f3443b = parcel.readInt();
            int readInt = parcel.readInt();
            this.f3444c = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f3445d = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f3446e = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f3447f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f3449h = parcel.readInt() == 1;
            this.f3450i = parcel.readInt() == 1;
            this.f3451j = parcel.readInt() == 1;
            this.f3448g = parcel.readArrayList(d.a.class.getClassLoader());
        }

        void a() {
            this.f3445d = null;
            this.f3444c = 0;
            this.f3442a = -1;
            this.f3443b = -1;
        }

        void b() {
            this.f3445d = null;
            this.f3444c = 0;
            this.f3446e = 0;
            this.f3447f = null;
            this.f3448g = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i6) {
            parcel.writeInt(this.f3442a);
            parcel.writeInt(this.f3443b);
            parcel.writeInt(this.f3444c);
            if (this.f3444c > 0) {
                parcel.writeIntArray(this.f3445d);
            }
            parcel.writeInt(this.f3446e);
            if (this.f3446e > 0) {
                parcel.writeIntArray(this.f3447f);
            }
            parcel.writeInt(this.f3449h ? 1 : 0);
            parcel.writeInt(this.f3450i ? 1 : 0);
            parcel.writeInt(this.f3451j ? 1 : 0);
            parcel.writeList(this.f3448g);
        }

        public e(e eVar) {
            this.f3444c = eVar.f3444c;
            this.f3442a = eVar.f3442a;
            this.f3443b = eVar.f3443b;
            this.f3445d = eVar.f3445d;
            this.f3446e = eVar.f3446e;
            this.f3447f = eVar.f3447f;
            this.f3449h = eVar.f3449h;
            this.f3450i = eVar.f3450i;
            this.f3451j = eVar.f3451j;
            this.f3448g = eVar.f3448g;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f {

        /* renamed from: a, reason: collision with root package name */
        ArrayList f3452a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        int f3453b = Integer.MIN_VALUE;

        /* renamed from: c, reason: collision with root package name */
        int f3454c = Integer.MIN_VALUE;

        /* renamed from: d, reason: collision with root package name */
        int f3455d = 0;

        /* renamed from: e, reason: collision with root package name */
        final int f3456e;

        f(int i6) {
            this.f3456e = i6;
        }

        void a(View view) {
            c n6 = n(view);
            n6.f3434e = this;
            this.f3452a.add(view);
            this.f3454c = Integer.MIN_VALUE;
            if (this.f3452a.size() == 1) {
                this.f3453b = Integer.MIN_VALUE;
            }
            if (n6.c() || n6.b()) {
                this.f3455d += StaggeredGridLayoutManager.this.f3420u.e(view);
            }
        }

        void b(boolean z5, int i6) {
            int l6 = z5 ? l(Integer.MIN_VALUE) : p(Integer.MIN_VALUE);
            e();
            if (l6 == Integer.MIN_VALUE) {
                return;
            }
            if (!z5 || l6 >= StaggeredGridLayoutManager.this.f3420u.i()) {
                if (z5 || l6 <= StaggeredGridLayoutManager.this.f3420u.m()) {
                    if (i6 != Integer.MIN_VALUE) {
                        l6 += i6;
                    }
                    this.f3454c = l6;
                    this.f3453b = l6;
                }
            }
        }

        void c() {
            d.a f6;
            ArrayList arrayList = this.f3452a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            c n6 = n(view);
            this.f3454c = StaggeredGridLayoutManager.this.f3420u.d(view);
            if (n6.f3435f && (f6 = StaggeredGridLayoutManager.this.E.f(n6.a())) != null && f6.f3439b == 1) {
                this.f3454c += f6.a(this.f3456e);
            }
        }

        void d() {
            d.a f6;
            View view = (View) this.f3452a.get(0);
            c n6 = n(view);
            this.f3453b = StaggeredGridLayoutManager.this.f3420u.g(view);
            if (n6.f3435f && (f6 = StaggeredGridLayoutManager.this.E.f(n6.a())) != null && f6.f3439b == -1) {
                this.f3453b -= f6.a(this.f3456e);
            }
        }

        void e() {
            this.f3452a.clear();
            q();
            this.f3455d = 0;
        }

        public int f() {
            return StaggeredGridLayoutManager.this.f3425z ? i(this.f3452a.size() - 1, -1, true) : i(0, this.f3452a.size(), true);
        }

        public int g() {
            return StaggeredGridLayoutManager.this.f3425z ? i(0, this.f3452a.size(), true) : i(this.f3452a.size() - 1, -1, true);
        }

        int h(int i6, int i7, boolean z5, boolean z6, boolean z7) {
            int m6 = StaggeredGridLayoutManager.this.f3420u.m();
            int i8 = StaggeredGridLayoutManager.this.f3420u.i();
            int i9 = i7 > i6 ? 1 : -1;
            while (i6 != i7) {
                View view = (View) this.f3452a.get(i6);
                int g6 = StaggeredGridLayoutManager.this.f3420u.g(view);
                int d6 = StaggeredGridLayoutManager.this.f3420u.d(view);
                boolean z8 = false;
                boolean z9 = !z7 ? g6 >= i8 : g6 > i8;
                if (!z7 ? d6 > m6 : d6 >= m6) {
                    z8 = true;
                }
                if (z9 && z8) {
                    if (!z5 || !z6) {
                        if (!z6 && g6 >= m6 && d6 <= i8) {
                        }
                        return StaggeredGridLayoutManager.this.h0(view);
                    }
                    if (g6 >= m6 && d6 <= i8) {
                        return StaggeredGridLayoutManager.this.h0(view);
                    }
                }
                i6 += i9;
            }
            return -1;
        }

        int i(int i6, int i7, boolean z5) {
            return h(i6, i7, false, false, z5);
        }

        public int j() {
            return this.f3455d;
        }

        int k() {
            int i6 = this.f3454c;
            if (i6 != Integer.MIN_VALUE) {
                return i6;
            }
            c();
            return this.f3454c;
        }

        int l(int i6) {
            int i7 = this.f3454c;
            if (i7 != Integer.MIN_VALUE) {
                return i7;
            }
            if (this.f3452a.size() == 0) {
                return i6;
            }
            c();
            return this.f3454c;
        }

        public View m(int i6, int i7) {
            View view = null;
            if (i7 != -1) {
                int size = this.f3452a.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.f3452a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f3425z && staggeredGridLayoutManager.h0(view2) >= i6) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f3425z && staggeredGridLayoutManager2.h0(view2) <= i6) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f3452a.size();
                int i8 = 0;
                while (i8 < size2) {
                    View view3 = (View) this.f3452a.get(i8);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f3425z && staggeredGridLayoutManager3.h0(view3) <= i6) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f3425z && staggeredGridLayoutManager4.h0(view3) >= i6) || !view3.hasFocusable()) {
                        break;
                    }
                    i8++;
                    view = view3;
                }
            }
            return view;
        }

        c n(View view) {
            return (c) view.getLayoutParams();
        }

        int o() {
            int i6 = this.f3453b;
            if (i6 != Integer.MIN_VALUE) {
                return i6;
            }
            d();
            return this.f3453b;
        }

        int p(int i6) {
            int i7 = this.f3453b;
            if (i7 != Integer.MIN_VALUE) {
                return i7;
            }
            if (this.f3452a.size() == 0) {
                return i6;
            }
            d();
            return this.f3453b;
        }

        void q() {
            this.f3453b = Integer.MIN_VALUE;
            this.f3454c = Integer.MIN_VALUE;
        }

        void r(int i6) {
            int i7 = this.f3453b;
            if (i7 != Integer.MIN_VALUE) {
                this.f3453b = i7 + i6;
            }
            int i8 = this.f3454c;
            if (i8 != Integer.MIN_VALUE) {
                this.f3454c = i8 + i6;
            }
        }

        void s() {
            int size = this.f3452a.size();
            View view = (View) this.f3452a.remove(size - 1);
            c n6 = n(view);
            n6.f3434e = null;
            if (n6.c() || n6.b()) {
                this.f3455d -= StaggeredGridLayoutManager.this.f3420u.e(view);
            }
            if (size == 1) {
                this.f3453b = Integer.MIN_VALUE;
            }
            this.f3454c = Integer.MIN_VALUE;
        }

        void t() {
            View view = (View) this.f3452a.remove(0);
            c n6 = n(view);
            n6.f3434e = null;
            if (this.f3452a.size() == 0) {
                this.f3454c = Integer.MIN_VALUE;
            }
            if (n6.c() || n6.b()) {
                this.f3455d -= StaggeredGridLayoutManager.this.f3420u.e(view);
            }
            this.f3453b = Integer.MIN_VALUE;
        }

        void u(View view) {
            c n6 = n(view);
            n6.f3434e = this;
            this.f3452a.add(0, view);
            this.f3453b = Integer.MIN_VALUE;
            if (this.f3452a.size() == 1) {
                this.f3454c = Integer.MIN_VALUE;
            }
            if (n6.c() || n6.b()) {
                this.f3455d += StaggeredGridLayoutManager.this.f3420u.e(view);
            }
        }

        void v(int i6) {
            this.f3453b = i6;
            this.f3454c = i6;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i6, int i7) {
        RecyclerView.o.d i02 = RecyclerView.o.i0(context, attributeSet, i6, i7);
        H2(i02.f3362a);
        J2(i02.f3363b);
        I2(i02.f3364c);
        this.f3424y = new androidx.recyclerview.widget.f();
        a2();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
    
        if (r4.f3576e == (-1)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A2(androidx.recyclerview.widget.RecyclerView.u r3, androidx.recyclerview.widget.f r4) {
        /*
            r2 = this;
            boolean r0 = r4.f3572a
            if (r0 == 0) goto L4d
            boolean r0 = r4.f3580i
            if (r0 == 0) goto L9
            goto L4d
        L9:
            int r0 = r4.f3573b
            r1 = -1
            if (r0 != 0) goto L1e
            int r0 = r4.f3576e
            if (r0 != r1) goto L18
        L12:
            int r4 = r4.f3578g
        L14:
            r2.B2(r3, r4)
            goto L4d
        L18:
            int r4 = r4.f3577f
        L1a:
            r2.C2(r3, r4)
            goto L4d
        L1e:
            int r0 = r4.f3576e
            if (r0 != r1) goto L37
            int r0 = r4.f3577f
            int r1 = r2.m2(r0)
            int r0 = r0 - r1
            if (r0 >= 0) goto L2c
            goto L12
        L2c:
            int r1 = r4.f3578g
            int r4 = r4.f3573b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r1 - r4
            goto L14
        L37:
            int r0 = r4.f3578g
            int r0 = r2.n2(r0)
            int r1 = r4.f3578g
            int r0 = r0 - r1
            if (r0 >= 0) goto L43
            goto L18
        L43:
            int r1 = r4.f3577f
            int r4 = r4.f3573b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r4 + r1
            goto L1a
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A2(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.f):void");
    }

    private void B2(RecyclerView.u uVar, int i6) {
        for (int J = J() - 1; J >= 0; J--) {
            View I = I(J);
            if (this.f3420u.g(I) < i6 || this.f3420u.q(I) < i6) {
                return;
            }
            c cVar = (c) I.getLayoutParams();
            if (cVar.f3435f) {
                for (int i7 = 0; i7 < this.f3418s; i7++) {
                    if (this.f3419t[i7].f3452a.size() == 1) {
                        return;
                    }
                }
                for (int i8 = 0; i8 < this.f3418s; i8++) {
                    this.f3419t[i8].s();
                }
            } else if (cVar.f3434e.f3452a.size() == 1) {
                return;
            } else {
                cVar.f3434e.s();
            }
            m1(I, uVar);
        }
    }

    private void C2(RecyclerView.u uVar, int i6) {
        while (J() > 0) {
            View I = I(0);
            if (this.f3420u.d(I) > i6 || this.f3420u.p(I) > i6) {
                return;
            }
            c cVar = (c) I.getLayoutParams();
            if (cVar.f3435f) {
                for (int i7 = 0; i7 < this.f3418s; i7++) {
                    if (this.f3419t[i7].f3452a.size() == 1) {
                        return;
                    }
                }
                for (int i8 = 0; i8 < this.f3418s; i8++) {
                    this.f3419t[i8].t();
                }
            } else if (cVar.f3434e.f3452a.size() == 1) {
                return;
            } else {
                cVar.f3434e.t();
            }
            m1(I, uVar);
        }
    }

    private void D2() {
        if (this.f3421v.k() == 1073741824) {
            return;
        }
        int J = J();
        float f6 = 0.0f;
        for (int i6 = 0; i6 < J; i6++) {
            View I = I(i6);
            float e6 = this.f3421v.e(I);
            if (e6 >= f6) {
                if (((c) I.getLayoutParams()).f()) {
                    e6 = (e6 * 1.0f) / this.f3418s;
                }
                f6 = Math.max(f6, e6);
            }
        }
        int i7 = this.f3423x;
        int round = Math.round(f6 * this.f3418s);
        if (this.f3421v.k() == Integer.MIN_VALUE) {
            round = Math.min(round, this.f3421v.n());
        }
        P2(round);
        if (this.f3423x == i7) {
            return;
        }
        for (int i8 = 0; i8 < J; i8++) {
            View I2 = I(i8);
            c cVar = (c) I2.getLayoutParams();
            if (!cVar.f3435f) {
                if (t2() && this.f3422w == 1) {
                    int i9 = this.f3418s;
                    int i10 = cVar.f3434e.f3456e;
                    I2.offsetLeftAndRight(((-((i9 - 1) - i10)) * this.f3423x) - ((-((i9 - 1) - i10)) * i7));
                } else {
                    int i11 = cVar.f3434e.f3456e;
                    int i12 = this.f3422w;
                    int i13 = (this.f3423x * i11) - (i11 * i7);
                    if (i12 == 1) {
                        I2.offsetLeftAndRight(i13);
                    } else {
                        I2.offsetTopAndBottom(i13);
                    }
                }
            }
        }
    }

    private void E2() {
        this.A = (this.f3422w == 1 || !t2()) ? this.f3425z : !this.f3425z;
    }

    private void G2(int i6) {
        androidx.recyclerview.widget.f fVar = this.f3424y;
        fVar.f3576e = i6;
        fVar.f3575d = this.A != (i6 == -1) ? -1 : 1;
    }

    private void K2(int i6, int i7) {
        for (int i8 = 0; i8 < this.f3418s; i8++) {
            if (!this.f3419t[i8].f3452a.isEmpty()) {
                Q2(this.f3419t[i8], i6, i7);
            }
        }
    }

    private boolean L2(RecyclerView.z zVar, b bVar) {
        boolean z5 = this.G;
        int b6 = zVar.b();
        bVar.f3427a = z5 ? g2(b6) : c2(b6);
        bVar.f3428b = Integer.MIN_VALUE;
        return true;
    }

    private void M1(View view) {
        for (int i6 = this.f3418s - 1; i6 >= 0; i6--) {
            this.f3419t[i6].a(view);
        }
    }

    private void N1(b bVar) {
        boolean z5;
        e eVar = this.I;
        int i6 = eVar.f3444c;
        if (i6 > 0) {
            if (i6 == this.f3418s) {
                for (int i7 = 0; i7 < this.f3418s; i7++) {
                    this.f3419t[i7].e();
                    e eVar2 = this.I;
                    int i8 = eVar2.f3445d[i7];
                    if (i8 != Integer.MIN_VALUE) {
                        i8 += eVar2.f3450i ? this.f3420u.i() : this.f3420u.m();
                    }
                    this.f3419t[i7].v(i8);
                }
            } else {
                eVar.b();
                e eVar3 = this.I;
                eVar3.f3442a = eVar3.f3443b;
            }
        }
        e eVar4 = this.I;
        this.H = eVar4.f3451j;
        I2(eVar4.f3449h);
        E2();
        e eVar5 = this.I;
        int i9 = eVar5.f3442a;
        if (i9 != -1) {
            this.C = i9;
            z5 = eVar5.f3450i;
        } else {
            z5 = this.A;
        }
        bVar.f3429c = z5;
        if (eVar5.f3446e > 1) {
            d dVar = this.E;
            dVar.f3436a = eVar5.f3447f;
            dVar.f3437b = eVar5.f3448g;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void O2(int r5, androidx.recyclerview.widget.RecyclerView.z r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.f r0 = r4.f3424y
            r1 = 0
            r0.f3573b = r1
            r0.f3574c = r5
            boolean r0 = r4.x0()
            r2 = 1
            if (r0 == 0) goto L2e
            int r6 = r6.c()
            r0 = -1
            if (r6 == r0) goto L2e
            boolean r0 = r4.A
            if (r6 >= r5) goto L1b
            r5 = 1
            goto L1c
        L1b:
            r5 = 0
        L1c:
            if (r0 != r5) goto L25
            androidx.recyclerview.widget.i r5 = r4.f3420u
            int r5 = r5.n()
            goto L2f
        L25:
            androidx.recyclerview.widget.i r5 = r4.f3420u
            int r5 = r5.n()
            r6 = r5
            r5 = 0
            goto L30
        L2e:
            r5 = 0
        L2f:
            r6 = 0
        L30:
            boolean r0 = r4.M()
            if (r0 == 0) goto L4d
            androidx.recyclerview.widget.f r0 = r4.f3424y
            androidx.recyclerview.widget.i r3 = r4.f3420u
            int r3 = r3.m()
            int r3 = r3 - r6
            r0.f3577f = r3
            androidx.recyclerview.widget.f r6 = r4.f3424y
            androidx.recyclerview.widget.i r0 = r4.f3420u
            int r0 = r0.i()
            int r0 = r0 + r5
            r6.f3578g = r0
            goto L5d
        L4d:
            androidx.recyclerview.widget.f r0 = r4.f3424y
            androidx.recyclerview.widget.i r3 = r4.f3420u
            int r3 = r3.h()
            int r3 = r3 + r5
            r0.f3578g = r3
            androidx.recyclerview.widget.f r5 = r4.f3424y
            int r6 = -r6
            r5.f3577f = r6
        L5d:
            androidx.recyclerview.widget.f r5 = r4.f3424y
            r5.f3579h = r1
            r5.f3572a = r2
            androidx.recyclerview.widget.i r6 = r4.f3420u
            int r6 = r6.k()
            if (r6 != 0) goto L74
            androidx.recyclerview.widget.i r6 = r4.f3420u
            int r6 = r6.h()
            if (r6 != 0) goto L74
            r1 = 1
        L74:
            r5.f3580i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.O2(int, androidx.recyclerview.widget.RecyclerView$z):void");
    }

    private void Q1(View view, c cVar, androidx.recyclerview.widget.f fVar) {
        if (fVar.f3576e == 1) {
            if (cVar.f3435f) {
                M1(view);
                return;
            } else {
                cVar.f3434e.a(view);
                return;
            }
        }
        if (cVar.f3435f) {
            z2(view);
        } else {
            cVar.f3434e.u(view);
        }
    }

    private void Q2(f fVar, int i6, int i7) {
        int j6 = fVar.j();
        if (i6 == -1) {
            if (fVar.o() + j6 > i7) {
                return;
            }
        } else if (fVar.k() - j6 < i7) {
            return;
        }
        this.B.set(fVar.f3456e, false);
    }

    private int R1(int i6) {
        if (J() == 0) {
            return this.A ? 1 : -1;
        }
        return (i6 < j2()) != this.A ? -1 : 1;
    }

    private int R2(int i6, int i7, int i8) {
        if (i7 == 0 && i8 == 0) {
            return i6;
        }
        int mode = View.MeasureSpec.getMode(i6);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i6) - i7) - i8), mode) : i6;
    }

    private boolean T1(f fVar) {
        if (this.A) {
            if (fVar.k() < this.f3420u.i()) {
                ArrayList arrayList = fVar.f3452a;
                return !fVar.n((View) arrayList.get(arrayList.size() - 1)).f3435f;
            }
        } else if (fVar.o() > this.f3420u.m()) {
            return !fVar.n((View) fVar.f3452a.get(0)).f3435f;
        }
        return false;
    }

    private int U1(RecyclerView.z zVar) {
        if (J() == 0) {
            return 0;
        }
        return l.a(zVar, this.f3420u, e2(!this.N), d2(!this.N), this, this.N);
    }

    private int V1(RecyclerView.z zVar) {
        if (J() == 0) {
            return 0;
        }
        return l.b(zVar, this.f3420u, e2(!this.N), d2(!this.N), this, this.N, this.A);
    }

    private int W1(RecyclerView.z zVar) {
        if (J() == 0) {
            return 0;
        }
        return l.c(zVar, this.f3420u, e2(!this.N), d2(!this.N), this, this.N);
    }

    private int X1(int i6) {
        return i6 != 1 ? i6 != 2 ? i6 != 17 ? i6 != 33 ? i6 != 66 ? (i6 == 130 && this.f3422w == 1) ? 1 : Integer.MIN_VALUE : this.f3422w == 0 ? 1 : Integer.MIN_VALUE : this.f3422w == 1 ? -1 : Integer.MIN_VALUE : this.f3422w == 0 ? -1 : Integer.MIN_VALUE : (this.f3422w != 1 && t2()) ? -1 : 1 : (this.f3422w != 1 && t2()) ? 1 : -1;
    }

    private d.a Y1(int i6) {
        d.a aVar = new d.a();
        aVar.f3440c = new int[this.f3418s];
        for (int i7 = 0; i7 < this.f3418s; i7++) {
            aVar.f3440c[i7] = i6 - this.f3419t[i7].l(i6);
        }
        return aVar;
    }

    private d.a Z1(int i6) {
        d.a aVar = new d.a();
        aVar.f3440c = new int[this.f3418s];
        for (int i7 = 0; i7 < this.f3418s; i7++) {
            aVar.f3440c[i7] = this.f3419t[i7].p(i6) - i6;
        }
        return aVar;
    }

    private void a2() {
        this.f3420u = i.b(this, this.f3422w);
        this.f3421v = i.b(this, 1 - this.f3422w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r9v7 */
    private int b2(RecyclerView.u uVar, androidx.recyclerview.widget.f fVar, RecyclerView.z zVar) {
        int i6;
        f fVar2;
        int e6;
        int i7;
        int i8;
        int e7;
        RecyclerView.o oVar;
        View view;
        int i9;
        int i10;
        ?? r9 = 0;
        this.B.set(0, this.f3418s, true);
        if (this.f3424y.f3580i) {
            i6 = fVar.f3576e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i6 = fVar.f3576e == 1 ? fVar.f3578g + fVar.f3573b : fVar.f3577f - fVar.f3573b;
        }
        K2(fVar.f3576e, i6);
        int i11 = this.A ? this.f3420u.i() : this.f3420u.m();
        boolean z5 = false;
        while (fVar.a(zVar) && (this.f3424y.f3580i || !this.B.isEmpty())) {
            View b6 = fVar.b(uVar);
            c cVar = (c) b6.getLayoutParams();
            int a6 = cVar.a();
            int g6 = this.E.g(a6);
            boolean z6 = g6 == -1;
            if (z6) {
                fVar2 = cVar.f3435f ? this.f3419t[r9] : p2(fVar);
                this.E.n(a6, fVar2);
            } else {
                fVar2 = this.f3419t[g6];
            }
            f fVar3 = fVar2;
            cVar.f3434e = fVar3;
            if (fVar.f3576e == 1) {
                d(b6);
            } else {
                e(b6, r9);
            }
            v2(b6, cVar, r9);
            if (fVar.f3576e == 1) {
                int l22 = cVar.f3435f ? l2(i11) : fVar3.l(i11);
                int e8 = this.f3420u.e(b6) + l22;
                if (z6 && cVar.f3435f) {
                    d.a Y1 = Y1(l22);
                    Y1.f3439b = -1;
                    Y1.f3438a = a6;
                    this.E.a(Y1);
                }
                i7 = e8;
                e6 = l22;
            } else {
                int o22 = cVar.f3435f ? o2(i11) : fVar3.p(i11);
                e6 = o22 - this.f3420u.e(b6);
                if (z6 && cVar.f3435f) {
                    d.a Z1 = Z1(o22);
                    Z1.f3439b = 1;
                    Z1.f3438a = a6;
                    this.E.a(Z1);
                }
                i7 = o22;
            }
            if (cVar.f3435f && fVar.f3575d == -1) {
                if (!z6) {
                    if (!(fVar.f3576e == 1 ? O1() : P1())) {
                        d.a f6 = this.E.f(a6);
                        if (f6 != null) {
                            f6.f3441d = true;
                        }
                    }
                }
                this.M = true;
            }
            Q1(b6, cVar, fVar);
            if (t2() && this.f3422w == 1) {
                int i12 = cVar.f3435f ? this.f3421v.i() : this.f3421v.i() - (((this.f3418s - 1) - fVar3.f3456e) * this.f3423x);
                e7 = i12;
                i8 = i12 - this.f3421v.e(b6);
            } else {
                int m6 = cVar.f3435f ? this.f3421v.m() : (fVar3.f3456e * this.f3423x) + this.f3421v.m();
                i8 = m6;
                e7 = this.f3421v.e(b6) + m6;
            }
            if (this.f3422w == 1) {
                oVar = this;
                view = b6;
                i9 = i8;
                i8 = e6;
                i10 = e7;
            } else {
                oVar = this;
                view = b6;
                i9 = e6;
                i10 = i7;
                i7 = e7;
            }
            oVar.z0(view, i9, i8, i10, i7);
            if (cVar.f3435f) {
                K2(this.f3424y.f3576e, i6);
            } else {
                Q2(fVar3, this.f3424y.f3576e, i6);
            }
            A2(uVar, this.f3424y);
            if (this.f3424y.f3579h && b6.hasFocusable()) {
                if (cVar.f3435f) {
                    this.B.clear();
                } else {
                    this.B.set(fVar3.f3456e, false);
                    z5 = true;
                    r9 = 0;
                }
            }
            z5 = true;
            r9 = 0;
        }
        if (!z5) {
            A2(uVar, this.f3424y);
        }
        int m7 = this.f3424y.f3576e == -1 ? this.f3420u.m() - o2(this.f3420u.m()) : l2(this.f3420u.i()) - this.f3420u.i();
        if (m7 > 0) {
            return Math.min(fVar.f3573b, m7);
        }
        return 0;
    }

    private int c2(int i6) {
        int J = J();
        for (int i7 = 0; i7 < J; i7++) {
            int h02 = h0(I(i7));
            if (h02 >= 0 && h02 < i6) {
                return h02;
            }
        }
        return 0;
    }

    private int g2(int i6) {
        for (int J = J() - 1; J >= 0; J--) {
            int h02 = h0(I(J));
            if (h02 >= 0 && h02 < i6) {
                return h02;
            }
        }
        return 0;
    }

    private void h2(RecyclerView.u uVar, RecyclerView.z zVar, boolean z5) {
        int i6;
        int l22 = l2(Integer.MIN_VALUE);
        if (l22 != Integer.MIN_VALUE && (i6 = this.f3420u.i() - l22) > 0) {
            int i7 = i6 - (-F2(-i6, uVar, zVar));
            if (!z5 || i7 <= 0) {
                return;
            }
            this.f3420u.r(i7);
        }
    }

    private void i2(RecyclerView.u uVar, RecyclerView.z zVar, boolean z5) {
        int m6;
        int o22 = o2(Integer.MAX_VALUE);
        if (o22 != Integer.MAX_VALUE && (m6 = o22 - this.f3420u.m()) > 0) {
            int F2 = m6 - F2(m6, uVar, zVar);
            if (!z5 || F2 <= 0) {
                return;
            }
            this.f3420u.r(-F2);
        }
    }

    private int l2(int i6) {
        int l6 = this.f3419t[0].l(i6);
        for (int i7 = 1; i7 < this.f3418s; i7++) {
            int l7 = this.f3419t[i7].l(i6);
            if (l7 > l6) {
                l6 = l7;
            }
        }
        return l6;
    }

    private int m2(int i6) {
        int p6 = this.f3419t[0].p(i6);
        for (int i7 = 1; i7 < this.f3418s; i7++) {
            int p7 = this.f3419t[i7].p(i6);
            if (p7 > p6) {
                p6 = p7;
            }
        }
        return p6;
    }

    private int n2(int i6) {
        int l6 = this.f3419t[0].l(i6);
        for (int i7 = 1; i7 < this.f3418s; i7++) {
            int l7 = this.f3419t[i7].l(i6);
            if (l7 < l6) {
                l6 = l7;
            }
        }
        return l6;
    }

    private int o2(int i6) {
        int p6 = this.f3419t[0].p(i6);
        for (int i7 = 1; i7 < this.f3418s; i7++) {
            int p7 = this.f3419t[i7].p(i6);
            if (p7 < p6) {
                p6 = p7;
            }
        }
        return p6;
    }

    private f p2(androidx.recyclerview.widget.f fVar) {
        int i6;
        int i7;
        int i8;
        if (x2(fVar.f3576e)) {
            i7 = this.f3418s - 1;
            i6 = -1;
            i8 = -1;
        } else {
            i6 = this.f3418s;
            i7 = 0;
            i8 = 1;
        }
        f fVar2 = null;
        if (fVar.f3576e == 1) {
            int m6 = this.f3420u.m();
            int i9 = Integer.MAX_VALUE;
            while (i7 != i6) {
                f fVar3 = this.f3419t[i7];
                int l6 = fVar3.l(m6);
                if (l6 < i9) {
                    fVar2 = fVar3;
                    i9 = l6;
                }
                i7 += i8;
            }
            return fVar2;
        }
        int i10 = this.f3420u.i();
        int i11 = Integer.MIN_VALUE;
        while (i7 != i6) {
            f fVar4 = this.f3419t[i7];
            int p6 = fVar4.p(i10);
            if (p6 > i11) {
                fVar2 = fVar4;
                i11 = p6;
            }
            i7 += i8;
        }
        return fVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void q2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.A
            if (r0 == 0) goto L9
            int r0 = r6.k2()
            goto Ld
        L9:
            int r0 = r6.j2()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.E
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.E
            r7.j(r8, r4)
            goto L41
        L36:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.k(r7, r8)
            goto L41
        L3c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.j(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.A
            if (r7 == 0) goto L4d
            int r7 = r6.j2()
            goto L51
        L4d:
            int r7 = r6.k2()
        L51:
            if (r3 > r7) goto L56
            r6.t1()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.q2(int, int, int):void");
    }

    private void u2(View view, int i6, int i7, boolean z5) {
        j(view, this.K);
        c cVar = (c) view.getLayoutParams();
        int i8 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.K;
        int R2 = R2(i6, i8 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i9 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.K;
        int R22 = R2(i7, i9 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z5 ? H1(view, R2, R22, cVar) : F1(view, R2, R22, cVar)) {
            view.measure(R2, R22);
        }
    }

    private void v2(View view, c cVar, boolean z5) {
        int K;
        int K2;
        if (cVar.f3435f) {
            if (this.f3422w != 1) {
                u2(view, RecyclerView.o.K(o0(), p0(), e0() + f0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.J, z5);
                return;
            }
            K = this.J;
        } else {
            if (this.f3422w != 1) {
                K = RecyclerView.o.K(o0(), p0(), e0() + f0(), ((ViewGroup.MarginLayoutParams) cVar).width, true);
                K2 = RecyclerView.o.K(this.f3423x, X(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false);
                u2(view, K, K2, z5);
            }
            K = RecyclerView.o.K(this.f3423x, p0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false);
        }
        K2 = RecyclerView.o.K(W(), X(), g0() + d0(), ((ViewGroup.MarginLayoutParams) cVar).height, true);
        u2(view, K, K2, z5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x014b, code lost:
    
        if (S1() != false) goto L90;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void w2(androidx.recyclerview.widget.RecyclerView.u r9, androidx.recyclerview.widget.RecyclerView.z r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.w2(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$z, boolean):void");
    }

    private boolean x2(int i6) {
        if (this.f3422w == 0) {
            return (i6 == -1) != this.A;
        }
        return ((i6 == -1) == this.A) == t2();
    }

    private void z2(View view) {
        for (int i6 = this.f3418s - 1; i6 >= 0; i6--) {
            this.f3419t[i6].u(view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void C0(int i6) {
        super.C0(i6);
        for (int i7 = 0; i7 < this.f3418s; i7++) {
            this.f3419t[i7].r(i6);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void C1(Rect rect, int i6, int i7) {
        int n6;
        int n7;
        int e02 = e0() + f0();
        int g02 = g0() + d0();
        if (this.f3422w == 1) {
            n7 = RecyclerView.o.n(i7, rect.height() + g02, b0());
            n6 = RecyclerView.o.n(i6, (this.f3423x * this.f3418s) + e02, c0());
        } else {
            n6 = RecyclerView.o.n(i6, rect.width() + e02, c0());
            n7 = RecyclerView.o.n(i7, (this.f3423x * this.f3418s) + g02, b0());
        }
        B1(n6, n7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p D() {
        return this.f3422w == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void D0(int i6) {
        super.D0(i6);
        for (int i7 = 0; i7 < this.f3418s; i7++) {
            this.f3419t[i7].r(i6);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p E(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p F(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    int F2(int i6, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (J() == 0 || i6 == 0) {
            return 0;
        }
        y2(i6, zVar);
        int b22 = b2(uVar, this.f3424y, zVar);
        if (this.f3424y.f3573b >= b22) {
            i6 = i6 < 0 ? -b22 : b22;
        }
        this.f3420u.r(-i6);
        this.G = this.A;
        androidx.recyclerview.widget.f fVar = this.f3424y;
        fVar.f3573b = 0;
        A2(uVar, fVar);
        return i6;
    }

    public void H2(int i6) {
        if (i6 != 0 && i6 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        g(null);
        if (i6 == this.f3422w) {
            return;
        }
        this.f3422w = i6;
        i iVar = this.f3420u;
        this.f3420u = this.f3421v;
        this.f3421v = iVar;
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void I0(RecyclerView recyclerView, RecyclerView.u uVar) {
        super.I0(recyclerView, uVar);
        o1(this.P);
        for (int i6 = 0; i6 < this.f3418s; i6++) {
            this.f3419t[i6].e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void I1(RecyclerView recyclerView, RecyclerView.z zVar, int i6) {
        g gVar = new g(recyclerView.getContext());
        gVar.p(i6);
        J1(gVar);
    }

    public void I2(boolean z5) {
        g(null);
        e eVar = this.I;
        if (eVar != null && eVar.f3449h != z5) {
            eVar.f3449h = z5;
        }
        this.f3425z = z5;
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View J0(View view, int i6, RecyclerView.u uVar, RecyclerView.z zVar) {
        View B;
        View m6;
        if (J() == 0 || (B = B(view)) == null) {
            return null;
        }
        E2();
        int X1 = X1(i6);
        if (X1 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) B.getLayoutParams();
        boolean z5 = cVar.f3435f;
        f fVar = cVar.f3434e;
        int k22 = X1 == 1 ? k2() : j2();
        O2(k22, zVar);
        G2(X1);
        androidx.recyclerview.widget.f fVar2 = this.f3424y;
        fVar2.f3574c = fVar2.f3575d + k22;
        fVar2.f3573b = (int) (this.f3420u.n() * 0.33333334f);
        androidx.recyclerview.widget.f fVar3 = this.f3424y;
        fVar3.f3579h = true;
        fVar3.f3572a = false;
        b2(uVar, fVar3, zVar);
        this.G = this.A;
        if (!z5 && (m6 = fVar.m(k22, X1)) != null && m6 != B) {
            return m6;
        }
        if (x2(X1)) {
            for (int i7 = this.f3418s - 1; i7 >= 0; i7--) {
                View m7 = this.f3419t[i7].m(k22, X1);
                if (m7 != null && m7 != B) {
                    return m7;
                }
            }
        } else {
            for (int i8 = 0; i8 < this.f3418s; i8++) {
                View m8 = this.f3419t[i8].m(k22, X1);
                if (m8 != null && m8 != B) {
                    return m8;
                }
            }
        }
        boolean z6 = (this.f3425z ^ true) == (X1 == -1);
        if (!z5) {
            View C = C(z6 ? fVar.f() : fVar.g());
            if (C != null && C != B) {
                return C;
            }
        }
        if (x2(X1)) {
            for (int i9 = this.f3418s - 1; i9 >= 0; i9--) {
                if (i9 != fVar.f3456e) {
                    f[] fVarArr = this.f3419t;
                    View C2 = C(z6 ? fVarArr[i9].f() : fVarArr[i9].g());
                    if (C2 != null && C2 != B) {
                        return C2;
                    }
                }
            }
        } else {
            for (int i10 = 0; i10 < this.f3418s; i10++) {
                f[] fVarArr2 = this.f3419t;
                View C3 = C(z6 ? fVarArr2[i10].f() : fVarArr2[i10].g());
                if (C3 != null && C3 != B) {
                    return C3;
                }
            }
        }
        return null;
    }

    public void J2(int i6) {
        g(null);
        if (i6 != this.f3418s) {
            s2();
            this.f3418s = i6;
            this.B = new BitSet(this.f3418s);
            this.f3419t = new f[this.f3418s];
            for (int i7 = 0; i7 < this.f3418s; i7++) {
                this.f3419t[i7] = new f(i7);
            }
            t1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void K0(AccessibilityEvent accessibilityEvent) {
        super.K0(accessibilityEvent);
        if (J() > 0) {
            View e22 = e2(false);
            View d22 = d2(false);
            if (e22 == null || d22 == null) {
                return;
            }
            int h02 = h0(e22);
            int h03 = h0(d22);
            if (h02 < h03) {
                accessibilityEvent.setFromIndex(h02);
                accessibilityEvent.setToIndex(h03);
            } else {
                accessibilityEvent.setFromIndex(h03);
                accessibilityEvent.setToIndex(h02);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean L1() {
        return this.I == null;
    }

    boolean M2(RecyclerView.z zVar, b bVar) {
        int i6;
        int m6;
        int g6;
        if (!zVar.e() && (i6 = this.C) != -1) {
            if (i6 >= 0 && i6 < zVar.b()) {
                e eVar = this.I;
                if (eVar == null || eVar.f3442a == -1 || eVar.f3444c < 1) {
                    View C = C(this.C);
                    if (C != null) {
                        bVar.f3427a = this.A ? k2() : j2();
                        if (this.D != Integer.MIN_VALUE) {
                            if (bVar.f3429c) {
                                m6 = this.f3420u.i() - this.D;
                                g6 = this.f3420u.d(C);
                            } else {
                                m6 = this.f3420u.m() + this.D;
                                g6 = this.f3420u.g(C);
                            }
                            bVar.f3428b = m6 - g6;
                            return true;
                        }
                        if (this.f3420u.e(C) > this.f3420u.n()) {
                            bVar.f3428b = bVar.f3429c ? this.f3420u.i() : this.f3420u.m();
                            return true;
                        }
                        int g7 = this.f3420u.g(C) - this.f3420u.m();
                        if (g7 < 0) {
                            bVar.f3428b = -g7;
                            return true;
                        }
                        int i7 = this.f3420u.i() - this.f3420u.d(C);
                        if (i7 < 0) {
                            bVar.f3428b = i7;
                            return true;
                        }
                        bVar.f3428b = Integer.MIN_VALUE;
                    } else {
                        int i8 = this.C;
                        bVar.f3427a = i8;
                        int i9 = this.D;
                        if (i9 == Integer.MIN_VALUE) {
                            bVar.f3429c = R1(i8) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i9);
                        }
                        bVar.f3430d = true;
                    }
                } else {
                    bVar.f3428b = Integer.MIN_VALUE;
                    bVar.f3427a = this.C;
                }
                return true;
            }
            this.C = -1;
            this.D = Integer.MIN_VALUE;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int N(RecyclerView.u uVar, RecyclerView.z zVar) {
        return this.f3422w == 1 ? this.f3418s : super.N(uVar, zVar);
    }

    void N2(RecyclerView.z zVar, b bVar) {
        if (M2(zVar, bVar) || L2(zVar, bVar)) {
            return;
        }
        bVar.a();
        bVar.f3427a = 0;
    }

    boolean O1() {
        int l6 = this.f3419t[0].l(Integer.MIN_VALUE);
        for (int i6 = 1; i6 < this.f3418s; i6++) {
            if (this.f3419t[i6].l(Integer.MIN_VALUE) != l6) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void P0(RecyclerView.u uVar, RecyclerView.z zVar, View view, g0 g0Var) {
        int i6;
        int i7;
        int e6;
        int i8;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.O0(view, g0Var);
            return;
        }
        c cVar = (c) layoutParams;
        if (this.f3422w == 0) {
            i6 = cVar.e();
            i7 = cVar.f3435f ? this.f3418s : 1;
            e6 = -1;
            i8 = -1;
        } else {
            i6 = -1;
            i7 = -1;
            e6 = cVar.e();
            i8 = cVar.f3435f ? this.f3418s : 1;
        }
        g0Var.a0(g0.d.a(i6, i7, e6, i8, false, false));
    }

    boolean P1() {
        int p6 = this.f3419t[0].p(Integer.MIN_VALUE);
        for (int i6 = 1; i6 < this.f3418s; i6++) {
            if (this.f3419t[i6].p(Integer.MIN_VALUE) != p6) {
                return false;
            }
        }
        return true;
    }

    void P2(int i6) {
        this.f3423x = i6 / this.f3418s;
        this.J = View.MeasureSpec.makeMeasureSpec(i6, this.f3421v.k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void R0(RecyclerView recyclerView, int i6, int i7) {
        q2(i6, i7, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void S0(RecyclerView recyclerView) {
        this.E.b();
        t1();
    }

    boolean S1() {
        int j22;
        int k22;
        if (J() == 0 || this.F == 0 || !r0()) {
            return false;
        }
        if (this.A) {
            j22 = k2();
            k22 = j2();
        } else {
            j22 = j2();
            k22 = k2();
        }
        if (j22 == 0 && r2() != null) {
            this.E.b();
        } else {
            if (!this.M) {
                return false;
            }
            int i6 = this.A ? -1 : 1;
            int i7 = k22 + 1;
            d.a e6 = this.E.e(j22, i7, i6, true);
            if (e6 == null) {
                this.M = false;
                this.E.d(i7);
                return false;
            }
            d.a e7 = this.E.e(j22, e6.f3438a, i6 * (-1), true);
            if (e7 == null) {
                this.E.d(e6.f3438a);
            } else {
                this.E.d(e7.f3438a + 1);
            }
        }
        u1();
        t1();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void T0(RecyclerView recyclerView, int i6, int i7, int i8) {
        q2(i6, i7, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void U0(RecyclerView recyclerView, int i6, int i7) {
        q2(i6, i7, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void W0(RecyclerView recyclerView, int i6, int i7, Object obj) {
        q2(i6, i7, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void X0(RecyclerView.u uVar, RecyclerView.z zVar) {
        w2(uVar, zVar, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Y0(RecyclerView.z zVar) {
        super.Y0(zVar);
        this.C = -1;
        this.D = Integer.MIN_VALUE;
        this.I = null;
        this.L.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y.b
    public PointF a(int i6) {
        int R1 = R1(i6);
        PointF pointF = new PointF();
        if (R1 == 0) {
            return null;
        }
        if (this.f3422w == 0) {
            pointF.x = R1;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = R1;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void c1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            this.I = (e) parcelable;
            t1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable d1() {
        int p6;
        int m6;
        int[] iArr;
        if (this.I != null) {
            return new e(this.I);
        }
        e eVar = new e();
        eVar.f3449h = this.f3425z;
        eVar.f3450i = this.G;
        eVar.f3451j = this.H;
        d dVar = this.E;
        if (dVar == null || (iArr = dVar.f3436a) == null) {
            eVar.f3446e = 0;
        } else {
            eVar.f3447f = iArr;
            eVar.f3446e = iArr.length;
            eVar.f3448g = dVar.f3437b;
        }
        if (J() > 0) {
            eVar.f3442a = this.G ? k2() : j2();
            eVar.f3443b = f2();
            int i6 = this.f3418s;
            eVar.f3444c = i6;
            eVar.f3445d = new int[i6];
            for (int i7 = 0; i7 < this.f3418s; i7++) {
                if (this.G) {
                    p6 = this.f3419t[i7].l(Integer.MIN_VALUE);
                    if (p6 != Integer.MIN_VALUE) {
                        m6 = this.f3420u.i();
                        p6 -= m6;
                        eVar.f3445d[i7] = p6;
                    } else {
                        eVar.f3445d[i7] = p6;
                    }
                } else {
                    p6 = this.f3419t[i7].p(Integer.MIN_VALUE);
                    if (p6 != Integer.MIN_VALUE) {
                        m6 = this.f3420u.m();
                        p6 -= m6;
                        eVar.f3445d[i7] = p6;
                    } else {
                        eVar.f3445d[i7] = p6;
                    }
                }
            }
        } else {
            eVar.f3442a = -1;
            eVar.f3443b = -1;
            eVar.f3444c = 0;
        }
        return eVar;
    }

    View d2(boolean z5) {
        int m6 = this.f3420u.m();
        int i6 = this.f3420u.i();
        View view = null;
        for (int J = J() - 1; J >= 0; J--) {
            View I = I(J);
            int g6 = this.f3420u.g(I);
            int d6 = this.f3420u.d(I);
            if (d6 > m6 && g6 < i6) {
                if (d6 <= i6 || !z5) {
                    return I;
                }
                if (view == null) {
                    view = I;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void e1(int i6) {
        if (i6 == 0) {
            S1();
        }
    }

    View e2(boolean z5) {
        int m6 = this.f3420u.m();
        int i6 = this.f3420u.i();
        int J = J();
        View view = null;
        for (int i7 = 0; i7 < J; i7++) {
            View I = I(i7);
            int g6 = this.f3420u.g(I);
            if (this.f3420u.d(I) > m6 && g6 < i6) {
                if (g6 >= m6 || !z5) {
                    return I;
                }
                if (view == null) {
                    view = I;
                }
            }
        }
        return view;
    }

    int f2() {
        View d22 = this.A ? d2(true) : e2(true);
        if (d22 == null) {
            return -1;
        }
        return h0(d22);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g(String str) {
        if (this.I == null) {
            super.g(str);
        }
    }

    int j2() {
        if (J() == 0) {
            return 0;
        }
        return h0(I(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean k() {
        return this.f3422w == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int k0(RecyclerView.u uVar, RecyclerView.z zVar) {
        return this.f3422w == 0 ? this.f3418s : super.k0(uVar, zVar);
    }

    int k2() {
        int J = J();
        if (J == 0) {
            return 0;
        }
        return h0(I(J - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean l() {
        return this.f3422w == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean m(RecyclerView.p pVar) {
        return pVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void o(int i6, int i7, RecyclerView.z zVar, RecyclerView.o.c cVar) {
        int l6;
        int i8;
        if (this.f3422w != 0) {
            i6 = i7;
        }
        if (J() == 0 || i6 == 0) {
            return;
        }
        y2(i6, zVar);
        int[] iArr = this.O;
        if (iArr == null || iArr.length < this.f3418s) {
            this.O = new int[this.f3418s];
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f3418s; i10++) {
            androidx.recyclerview.widget.f fVar = this.f3424y;
            if (fVar.f3575d == -1) {
                l6 = fVar.f3577f;
                i8 = this.f3419t[i10].p(l6);
            } else {
                l6 = this.f3419t[i10].l(fVar.f3578g);
                i8 = this.f3424y.f3578g;
            }
            int i11 = l6 - i8;
            if (i11 >= 0) {
                this.O[i9] = i11;
                i9++;
            }
        }
        Arrays.sort(this.O, 0, i9);
        for (int i12 = 0; i12 < i9 && this.f3424y.a(zVar); i12++) {
            cVar.a(this.f3424y.f3574c, this.O[i12]);
            androidx.recyclerview.widget.f fVar2 = this.f3424y;
            fVar2.f3574c += fVar2.f3575d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int q(RecyclerView.z zVar) {
        return U1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int r(RecyclerView.z zVar) {
        return V1(zVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        if (r10 == r11) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0088, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0086, code lost:
    
        if (r10 == r11) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    android.view.View r2() {
        /*
            r12 = this;
            int r0 = r12.J()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f3418s
            r2.<init>(r3)
            int r3 = r12.f3418s
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f3422w
            r5 = -1
            if (r3 != r1) goto L20
            boolean r3 = r12.t2()
            if (r3 == 0) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = -1
        L21:
            boolean r6 = r12.A
            if (r6 == 0) goto L27
            r6 = -1
            goto L2b
        L27:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L2b:
            if (r0 >= r6) goto L2e
            r5 = 1
        L2e:
            if (r0 == r6) goto Lab
            android.view.View r7 = r12.I(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f3434e
            int r9 = r9.f3456e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L54
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f3434e
            boolean r9 = r12.T1(r9)
            if (r9 == 0) goto L4d
            return r7
        L4d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f3434e
            int r9 = r9.f3456e
            r2.clear(r9)
        L54:
            boolean r9 = r8.f3435f
            if (r9 == 0) goto L59
            goto La9
        L59:
            int r9 = r0 + r5
            if (r9 == r6) goto La9
            android.view.View r9 = r12.I(r9)
            boolean r10 = r12.A
            if (r10 == 0) goto L77
            androidx.recyclerview.widget.i r10 = r12.f3420u
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.i r11 = r12.f3420u
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L74
            return r7
        L74:
            if (r10 != r11) goto L8a
            goto L88
        L77:
            androidx.recyclerview.widget.i r10 = r12.f3420u
            int r10 = r10.g(r7)
            androidx.recyclerview.widget.i r11 = r12.f3420u
            int r11 = r11.g(r9)
            if (r10 <= r11) goto L86
            return r7
        L86:
            if (r10 != r11) goto L8a
        L88:
            r10 = 1
            goto L8b
        L8a:
            r10 = 0
        L8b:
            if (r10 == 0) goto La9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f3434e
            int r8 = r8.f3456e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f3434e
            int r9 = r9.f3456e
            int r8 = r8 - r9
            if (r8 >= 0) goto La0
            r8 = 1
            goto La1
        La0:
            r8 = 0
        La1:
            if (r3 >= 0) goto La5
            r9 = 1
            goto La6
        La5:
            r9 = 0
        La6:
            if (r8 == r9) goto La9
            return r7
        La9:
            int r0 = r0 + r5
            goto L2e
        Lab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.r2():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int s(RecyclerView.z zVar) {
        return W1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean s0() {
        return this.F != 0;
    }

    public void s2() {
        this.E.b();
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int t(RecyclerView.z zVar) {
        return U1(zVar);
    }

    boolean t2() {
        return Z() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int u(RecyclerView.z zVar) {
        return V1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int v(RecyclerView.z zVar) {
        return W1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int w1(int i6, RecyclerView.u uVar, RecyclerView.z zVar) {
        return F2(i6, uVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void x1(int i6) {
        e eVar = this.I;
        if (eVar != null && eVar.f3442a != i6) {
            eVar.a();
        }
        this.C = i6;
        this.D = Integer.MIN_VALUE;
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int y1(int i6, RecyclerView.u uVar, RecyclerView.z zVar) {
        return F2(i6, uVar, zVar);
    }

    void y2(int i6, RecyclerView.z zVar) {
        int j22;
        int i7;
        if (i6 > 0) {
            j22 = k2();
            i7 = 1;
        } else {
            j22 = j2();
            i7 = -1;
        }
        this.f3424y.f3572a = true;
        O2(j22, zVar);
        G2(i7);
        androidx.recyclerview.widget.f fVar = this.f3424y;
        fVar.f3574c = j22 + fVar.f3575d;
        fVar.f3573b = Math.abs(i6);
    }
}
