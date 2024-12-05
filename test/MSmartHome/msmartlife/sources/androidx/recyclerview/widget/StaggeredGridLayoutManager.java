package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.d0.c;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.o implements RecyclerView.y.b {

    /* renamed from: b, reason: collision with root package name */
    d[] f1458b;

    /* renamed from: c, reason: collision with root package name */
    n f1459c;

    /* renamed from: d, reason: collision with root package name */
    n f1460d;

    /* renamed from: e, reason: collision with root package name */
    private int f1461e;

    /* renamed from: f, reason: collision with root package name */
    private int f1462f;

    /* renamed from: g, reason: collision with root package name */
    private final i f1463g;

    /* renamed from: j, reason: collision with root package name */
    private BitSet f1466j;
    private boolean o;
    private boolean p;
    private SavedState q;
    private int r;
    private int[] w;
    private int a = -1;

    /* renamed from: h, reason: collision with root package name */
    boolean f1464h = false;

    /* renamed from: i, reason: collision with root package name */
    boolean f1465i = false;

    /* renamed from: k, reason: collision with root package name */
    int f1467k = -1;
    int l = Integer.MIN_VALUE;
    LazySpanLookup m = new LazySpanLookup();
    private int n = 2;
    private final Rect s = new Rect();
    private final b t = new b();
    private boolean u = false;
    private boolean v = true;
    private final Runnable x = new a();

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: f, reason: collision with root package name */
        int f1473f;

        /* renamed from: g, reason: collision with root package name */
        int f1474g;

        /* renamed from: h, reason: collision with root package name */
        int f1475h;

        /* renamed from: i, reason: collision with root package name */
        int[] f1476i;

        /* renamed from: j, reason: collision with root package name */
        int f1477j;

        /* renamed from: k, reason: collision with root package name */
        int[] f1478k;
        List<LazySpanLookup.FullSpanItem> l;
        boolean m;
        boolean n;
        boolean o;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        public SavedState() {
        }

        void a() {
            this.f1476i = null;
            this.f1475h = 0;
            this.f1473f = -1;
            this.f1474g = -1;
        }

        void b() {
            this.f1476i = null;
            this.f1475h = 0;
            this.f1477j = 0;
            this.f1478k = null;
            this.l = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f1473f);
            parcel.writeInt(this.f1474g);
            parcel.writeInt(this.f1475h);
            if (this.f1475h > 0) {
                parcel.writeIntArray(this.f1476i);
            }
            parcel.writeInt(this.f1477j);
            if (this.f1477j > 0) {
                parcel.writeIntArray(this.f1478k);
            }
            parcel.writeInt(this.m ? 1 : 0);
            parcel.writeInt(this.n ? 1 : 0);
            parcel.writeInt(this.o ? 1 : 0);
            parcel.writeList(this.l);
        }

        SavedState(Parcel parcel) {
            this.f1473f = parcel.readInt();
            this.f1474g = parcel.readInt();
            int readInt = parcel.readInt();
            this.f1475h = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f1476i = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f1477j = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f1478k = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.m = parcel.readInt() == 1;
            this.n = parcel.readInt() == 1;
            this.o = parcel.readInt() == 1;
            this.l = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f1475h = savedState.f1475h;
            this.f1473f = savedState.f1473f;
            this.f1474g = savedState.f1474g;
            this.f1476i = savedState.f1476i;
            this.f1477j = savedState.f1477j;
            this.f1478k = savedState.f1478k;
            this.m = savedState.m;
            this.n = savedState.n;
            this.o = savedState.o;
            this.l = savedState.l;
        }
    }

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b {
        int a;

        /* renamed from: b, reason: collision with root package name */
        int f1480b;

        /* renamed from: c, reason: collision with root package name */
        boolean f1481c;

        /* renamed from: d, reason: collision with root package name */
        boolean f1482d;

        /* renamed from: e, reason: collision with root package name */
        boolean f1483e;

        /* renamed from: f, reason: collision with root package name */
        int[] f1484f;

        b() {
            c();
        }

        void a() {
            this.f1480b = this.f1481c ? StaggeredGridLayoutManager.this.f1459c.i() : StaggeredGridLayoutManager.this.f1459c.m();
        }

        void b(int i2) {
            if (this.f1481c) {
                this.f1480b = StaggeredGridLayoutManager.this.f1459c.i() - i2;
            } else {
                this.f1480b = StaggeredGridLayoutManager.this.f1459c.m() + i2;
            }
        }

        void c() {
            this.a = -1;
            this.f1480b = Integer.MIN_VALUE;
            this.f1481c = false;
            this.f1482d = false;
            this.f1483e = false;
            int[] iArr = this.f1484f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        void d(d[] dVarArr) {
            int length = dVarArr.length;
            int[] iArr = this.f1484f;
            if (iArr == null || iArr.length < length) {
                this.f1484f = new int[StaggeredGridLayoutManager.this.f1458b.length];
            }
            for (int i2 = 0; i2 < length; i2++) {
                this.f1484f[i2] = dVarArr[i2].p(Integer.MIN_VALUE);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends RecyclerView.p {

        /* renamed from: e, reason: collision with root package name */
        d f1486e;

        /* renamed from: f, reason: collision with root package name */
        boolean f1487f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final int e() {
            d dVar = this.f1486e;
            if (dVar == null) {
                return -1;
            }
            return dVar.f1491e;
        }

        public boolean f() {
            return this.f1487f;
        }

        public c(int i2, int i3) {
            super(i2, i3);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d {
        ArrayList<View> a = new ArrayList<>();

        /* renamed from: b, reason: collision with root package name */
        int f1488b = Integer.MIN_VALUE;

        /* renamed from: c, reason: collision with root package name */
        int f1489c = Integer.MIN_VALUE;

        /* renamed from: d, reason: collision with root package name */
        int f1490d = 0;

        /* renamed from: e, reason: collision with root package name */
        final int f1491e;

        d(int i2) {
            this.f1491e = i2;
        }

        void a(View view) {
            c n = n(view);
            n.f1486e = this;
            this.a.add(view);
            this.f1489c = Integer.MIN_VALUE;
            if (this.a.size() == 1) {
                this.f1488b = Integer.MIN_VALUE;
            }
            if (n.c() || n.b()) {
                this.f1490d += StaggeredGridLayoutManager.this.f1459c.e(view);
            }
        }

        void b(boolean z, int i2) {
            int p;
            if (z) {
                p = l(Integer.MIN_VALUE);
            } else {
                p = p(Integer.MIN_VALUE);
            }
            e();
            if (p == Integer.MIN_VALUE) {
                return;
            }
            if (!z || p >= StaggeredGridLayoutManager.this.f1459c.i()) {
                if (z || p <= StaggeredGridLayoutManager.this.f1459c.m()) {
                    if (i2 != Integer.MIN_VALUE) {
                        p += i2;
                    }
                    this.f1489c = p;
                    this.f1488b = p;
                }
            }
        }

        void c() {
            LazySpanLookup.FullSpanItem f2;
            ArrayList<View> arrayList = this.a;
            View view = arrayList.get(arrayList.size() - 1);
            c n = n(view);
            this.f1489c = StaggeredGridLayoutManager.this.f1459c.d(view);
            if (n.f1487f && (f2 = StaggeredGridLayoutManager.this.m.f(n.a())) != null && f2.f1470g == 1) {
                this.f1489c += f2.a(this.f1491e);
            }
        }

        void d() {
            LazySpanLookup.FullSpanItem f2;
            View view = this.a.get(0);
            c n = n(view);
            this.f1488b = StaggeredGridLayoutManager.this.f1459c.g(view);
            if (n.f1487f && (f2 = StaggeredGridLayoutManager.this.m.f(n.a())) != null && f2.f1470g == -1) {
                this.f1488b -= f2.a(this.f1491e);
            }
        }

        void e() {
            this.a.clear();
            q();
            this.f1490d = 0;
        }

        public int f() {
            if (StaggeredGridLayoutManager.this.f1464h) {
                return i(this.a.size() - 1, -1, true);
            }
            return i(0, this.a.size(), true);
        }

        public int g() {
            if (StaggeredGridLayoutManager.this.f1464h) {
                return i(0, this.a.size(), true);
            }
            return i(this.a.size() - 1, -1, true);
        }

        int h(int i2, int i3, boolean z, boolean z2, boolean z3) {
            int m = StaggeredGridLayoutManager.this.f1459c.m();
            int i4 = StaggeredGridLayoutManager.this.f1459c.i();
            int i5 = i3 > i2 ? 1 : -1;
            while (i2 != i3) {
                View view = this.a.get(i2);
                int g2 = StaggeredGridLayoutManager.this.f1459c.g(view);
                int d2 = StaggeredGridLayoutManager.this.f1459c.d(view);
                boolean z4 = false;
                boolean z5 = !z3 ? g2 >= i4 : g2 > i4;
                if (!z3 ? d2 > m : d2 >= m) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (z && z2) {
                        if (g2 >= m && d2 <= i4) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    } else {
                        if (z2) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                        if (g2 < m || d2 > i4) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    }
                }
                i2 += i5;
            }
            return -1;
        }

        int i(int i2, int i3, boolean z) {
            return h(i2, i3, false, false, z);
        }

        public int j() {
            return this.f1490d;
        }

        int k() {
            int i2 = this.f1489c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            c();
            return this.f1489c;
        }

        int l(int i2) {
            int i3 = this.f1489c;
            if (i3 != Integer.MIN_VALUE) {
                return i3;
            }
            if (this.a.size() == 0) {
                return i2;
            }
            c();
            return this.f1489c;
        }

        public View m(int i2, int i3) {
            View view = null;
            if (i3 == -1) {
                int size = this.a.size();
                int i4 = 0;
                while (i4 < size) {
                    View view2 = this.a.get(i4);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f1464h && staggeredGridLayoutManager.getPosition(view2) <= i2) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f1464h && staggeredGridLayoutManager2.getPosition(view2) >= i2) || !view2.hasFocusable()) {
                        break;
                    }
                    i4++;
                    view = view2;
                }
            } else {
                int size2 = this.a.size() - 1;
                while (size2 >= 0) {
                    View view3 = this.a.get(size2);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f1464h && staggeredGridLayoutManager3.getPosition(view3) >= i2) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f1464h && staggeredGridLayoutManager4.getPosition(view3) <= i2) || !view3.hasFocusable()) {
                        break;
                    }
                    size2--;
                    view = view3;
                }
            }
            return view;
        }

        c n(View view) {
            return (c) view.getLayoutParams();
        }

        int o() {
            int i2 = this.f1488b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            d();
            return this.f1488b;
        }

        int p(int i2) {
            int i3 = this.f1488b;
            if (i3 != Integer.MIN_VALUE) {
                return i3;
            }
            if (this.a.size() == 0) {
                return i2;
            }
            d();
            return this.f1488b;
        }

        void q() {
            this.f1488b = Integer.MIN_VALUE;
            this.f1489c = Integer.MIN_VALUE;
        }

        void r(int i2) {
            int i3 = this.f1488b;
            if (i3 != Integer.MIN_VALUE) {
                this.f1488b = i3 + i2;
            }
            int i4 = this.f1489c;
            if (i4 != Integer.MIN_VALUE) {
                this.f1489c = i4 + i2;
            }
        }

        void s() {
            int size = this.a.size();
            View remove = this.a.remove(size - 1);
            c n = n(remove);
            n.f1486e = null;
            if (n.c() || n.b()) {
                this.f1490d -= StaggeredGridLayoutManager.this.f1459c.e(remove);
            }
            if (size == 1) {
                this.f1488b = Integer.MIN_VALUE;
            }
            this.f1489c = Integer.MIN_VALUE;
        }

        void t() {
            View remove = this.a.remove(0);
            c n = n(remove);
            n.f1486e = null;
            if (this.a.size() == 0) {
                this.f1489c = Integer.MIN_VALUE;
            }
            if (n.c() || n.b()) {
                this.f1490d -= StaggeredGridLayoutManager.this.f1459c.e(remove);
            }
            this.f1488b = Integer.MIN_VALUE;
        }

        void u(View view) {
            c n = n(view);
            n.f1486e = this;
            this.a.add(0, view);
            this.f1488b = Integer.MIN_VALUE;
            if (this.a.size() == 1) {
                this.f1489c = Integer.MIN_VALUE;
            }
            if (n.c() || n.b()) {
                this.f1490d += StaggeredGridLayoutManager.this.f1459c.e(view);
            }
        }

        void v(int i2) {
            this.f1488b = i2;
            this.f1489c = i2;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        RecyclerView.o.d properties = RecyclerView.o.getProperties(context, attributeSet, i2, i3);
        setOrientation(properties.a);
        setSpanCount(properties.f1424b);
        setReverseLayout(properties.f1425c);
        this.f1463g = new i();
        k();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f1465i
            if (r0 == 0) goto L9
            int r0 = r6.u()
            goto Ld
        L9:
            int r0 = r6.t()
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
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.m
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.m
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.m
            r7.j(r8, r4)
            goto L41
        L36:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.m
            r9.k(r7, r8)
            goto L41
        L3c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.m
            r9.j(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.f1465i
            if (r7 == 0) goto L4d
            int r7 = r6.t()
            goto L51
        L4d:
            int r7 = r6.u()
        L51:
            if (r3 > r7) goto L56
            r6.requestLayout()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A(int, int, int):void");
    }

    private void D(View view, c cVar, boolean z) {
        if (cVar.f1487f) {
            if (this.f1461e == 1) {
                measureChildWithDecorationsAndMargin(view, this.r, RecyclerView.o.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z);
                return;
            } else {
                measureChildWithDecorationsAndMargin(view, RecyclerView.o.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.r, z);
                return;
            }
        }
        if (this.f1461e == 1) {
            measureChildWithDecorationsAndMargin(view, RecyclerView.o.getChildMeasureSpec(this.f1462f, getWidthMode(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.o.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z);
        } else {
            measureChildWithDecorationsAndMargin(view, RecyclerView.o.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.o.getChildMeasureSpec(this.f1462f, getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0157, code lost:
    
        if (g() != false) goto L90;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void E(androidx.recyclerview.widget.RecyclerView.v r9, androidx.recyclerview.widget.RecyclerView.z r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.E(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$z, boolean):void");
    }

    private boolean F(int i2) {
        if (this.f1461e == 0) {
            return (i2 == -1) != this.f1465i;
        }
        return ((i2 == -1) == this.f1465i) == isLayoutRTL();
    }

    private void H(View view) {
        for (int i2 = this.a - 1; i2 >= 0; i2--) {
            this.f1458b[i2].u(view);
        }
    }

    private void I(RecyclerView.v vVar, i iVar) {
        int min;
        int min2;
        if (!iVar.a || iVar.f1589i) {
            return;
        }
        if (iVar.f1582b == 0) {
            if (iVar.f1585e == -1) {
                J(vVar, iVar.f1587g);
                return;
            } else {
                K(vVar, iVar.f1586f);
                return;
            }
        }
        if (iVar.f1585e == -1) {
            int i2 = iVar.f1586f;
            int w = i2 - w(i2);
            if (w < 0) {
                min2 = iVar.f1587g;
            } else {
                min2 = iVar.f1587g - Math.min(w, iVar.f1582b);
            }
            J(vVar, min2);
            return;
        }
        int x = x(iVar.f1587g) - iVar.f1587g;
        if (x < 0) {
            min = iVar.f1586f;
        } else {
            min = Math.min(x, iVar.f1582b) + iVar.f1586f;
        }
        K(vVar, min);
    }

    private void J(RecyclerView.v vVar, int i2) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f1459c.g(childAt) < i2 || this.f1459c.q(childAt) < i2) {
                return;
            }
            c cVar = (c) childAt.getLayoutParams();
            if (cVar.f1487f) {
                for (int i3 = 0; i3 < this.a; i3++) {
                    if (this.f1458b[i3].a.size() == 1) {
                        return;
                    }
                }
                for (int i4 = 0; i4 < this.a; i4++) {
                    this.f1458b[i4].s();
                }
            } else if (cVar.f1486e.a.size() == 1) {
                return;
            } else {
                cVar.f1486e.s();
            }
            removeAndRecycleView(childAt, vVar);
        }
    }

    private void K(RecyclerView.v vVar, int i2) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f1459c.d(childAt) > i2 || this.f1459c.p(childAt) > i2) {
                return;
            }
            c cVar = (c) childAt.getLayoutParams();
            if (cVar.f1487f) {
                for (int i3 = 0; i3 < this.a; i3++) {
                    if (this.f1458b[i3].a.size() == 1) {
                        return;
                    }
                }
                for (int i4 = 0; i4 < this.a; i4++) {
                    this.f1458b[i4].t();
                }
            } else if (cVar.f1486e.a.size() == 1) {
                return;
            } else {
                cVar.f1486e.t();
            }
            removeAndRecycleView(childAt, vVar);
        }
    }

    private void L() {
        if (this.f1460d.k() == 1073741824) {
            return;
        }
        float f2 = 0.0f;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            float e2 = this.f1460d.e(childAt);
            if (e2 >= f2) {
                if (((c) childAt.getLayoutParams()).f()) {
                    e2 = (e2 * 1.0f) / this.a;
                }
                f2 = Math.max(f2, e2);
            }
        }
        int i3 = this.f1462f;
        int round = Math.round(f2 * this.a);
        if (this.f1460d.k() == Integer.MIN_VALUE) {
            round = Math.min(round, this.f1460d.n());
        }
        S(round);
        if (this.f1462f == i3) {
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            c cVar = (c) childAt2.getLayoutParams();
            if (!cVar.f1487f) {
                if (isLayoutRTL() && this.f1461e == 1) {
                    int i5 = this.a;
                    int i6 = cVar.f1486e.f1491e;
                    childAt2.offsetLeftAndRight(((-((i5 - 1) - i6)) * this.f1462f) - ((-((i5 - 1) - i6)) * i3));
                } else {
                    int i7 = cVar.f1486e.f1491e;
                    int i8 = this.f1462f * i7;
                    int i9 = i7 * i3;
                    if (this.f1461e == 1) {
                        childAt2.offsetLeftAndRight(i8 - i9);
                    } else {
                        childAt2.offsetTopAndBottom(i8 - i9);
                    }
                }
            }
        }
    }

    private void M(int i2) {
        i iVar = this.f1463g;
        iVar.f1585e = i2;
        iVar.f1584d = this.f1465i != (i2 == -1) ? -1 : 1;
    }

    private void N(int i2, int i3) {
        for (int i4 = 0; i4 < this.a; i4++) {
            if (!this.f1458b[i4].a.isEmpty()) {
                T(this.f1458b[i4], i2, i3);
            }
        }
    }

    private boolean O(RecyclerView.z zVar, b bVar) {
        int m;
        if (this.o) {
            m = q(zVar.b());
        } else {
            m = m(zVar.b());
        }
        bVar.a = m;
        bVar.f1480b = Integer.MIN_VALUE;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void R(int r5, androidx.recyclerview.widget.RecyclerView.z r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.i r0 = r4.f1463g
            r1 = 0
            r0.f1582b = r1
            r0.f1583c = r5
            boolean r0 = r4.isSmoothScrolling()
            r2 = 1
            if (r0 == 0) goto L2e
            int r6 = r6.c()
            r0 = -1
            if (r6 == r0) goto L2e
            boolean r0 = r4.f1465i
            if (r6 >= r5) goto L1b
            r5 = 1
            goto L1c
        L1b:
            r5 = 0
        L1c:
            if (r0 != r5) goto L25
            androidx.recyclerview.widget.n r5 = r4.f1459c
            int r5 = r5.n()
            goto L2f
        L25:
            androidx.recyclerview.widget.n r5 = r4.f1459c
            int r5 = r5.n()
            r6 = r5
            r5 = 0
            goto L30
        L2e:
            r5 = 0
        L2f:
            r6 = 0
        L30:
            boolean r0 = r4.getClipToPadding()
            if (r0 == 0) goto L4d
            androidx.recyclerview.widget.i r0 = r4.f1463g
            androidx.recyclerview.widget.n r3 = r4.f1459c
            int r3 = r3.m()
            int r3 = r3 - r6
            r0.f1586f = r3
            androidx.recyclerview.widget.i r6 = r4.f1463g
            androidx.recyclerview.widget.n r0 = r4.f1459c
            int r0 = r0.i()
            int r0 = r0 + r5
            r6.f1587g = r0
            goto L5d
        L4d:
            androidx.recyclerview.widget.i r0 = r4.f1463g
            androidx.recyclerview.widget.n r3 = r4.f1459c
            int r3 = r3.h()
            int r3 = r3 + r5
            r0.f1587g = r3
            androidx.recyclerview.widget.i r5 = r4.f1463g
            int r6 = -r6
            r5.f1586f = r6
        L5d:
            androidx.recyclerview.widget.i r5 = r4.f1463g
            r5.f1588h = r1
            r5.a = r2
            androidx.recyclerview.widget.n r6 = r4.f1459c
            int r6 = r6.k()
            if (r6 != 0) goto L74
            androidx.recyclerview.widget.n r6 = r4.f1459c
            int r6 = r6.h()
            if (r6 != 0) goto L74
            r1 = 1
        L74:
            r5.f1589i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.R(int, androidx.recyclerview.widget.RecyclerView$z):void");
    }

    private void T(d dVar, int i2, int i3) {
        int j2 = dVar.j();
        if (i2 == -1) {
            if (dVar.o() + j2 <= i3) {
                this.f1466j.set(dVar.f1491e, false);
            }
        } else if (dVar.k() - j2 >= i3) {
            this.f1466j.set(dVar.f1491e, false);
        }
    }

    private int U(int i2, int i3, int i4) {
        if (i3 == 0 && i4 == 0) {
            return i2;
        }
        int mode = View.MeasureSpec.getMode(i2);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - i3) - i4), mode) : i2;
    }

    private void a(View view) {
        for (int i2 = this.a - 1; i2 >= 0; i2--) {
            this.f1458b[i2].a(view);
        }
    }

    private void b(b bVar) {
        int m;
        SavedState savedState = this.q;
        int i2 = savedState.f1475h;
        if (i2 > 0) {
            if (i2 == this.a) {
                for (int i3 = 0; i3 < this.a; i3++) {
                    this.f1458b[i3].e();
                    SavedState savedState2 = this.q;
                    int i4 = savedState2.f1476i[i3];
                    if (i4 != Integer.MIN_VALUE) {
                        if (savedState2.n) {
                            m = this.f1459c.i();
                        } else {
                            m = this.f1459c.m();
                        }
                        i4 += m;
                    }
                    this.f1458b[i3].v(i4);
                }
            } else {
                savedState.b();
                SavedState savedState3 = this.q;
                savedState3.f1473f = savedState3.f1474g;
            }
        }
        SavedState savedState4 = this.q;
        this.p = savedState4.o;
        setReverseLayout(savedState4.m);
        resolveShouldLayoutReverse();
        SavedState savedState5 = this.q;
        int i5 = savedState5.f1473f;
        if (i5 != -1) {
            this.f1467k = i5;
            bVar.f1481c = savedState5.n;
        } else {
            bVar.f1481c = this.f1465i;
        }
        if (savedState5.f1477j > 1) {
            LazySpanLookup lazySpanLookup = this.m;
            lazySpanLookup.a = savedState5.f1478k;
            lazySpanLookup.f1468b = savedState5.l;
        }
    }

    private int computeScrollExtent(RecyclerView.z zVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        return p.a(zVar, this.f1459c, o(!this.v), n(!this.v), this, this.v);
    }

    private int computeScrollOffset(RecyclerView.z zVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        return p.b(zVar, this.f1459c, o(!this.v), n(!this.v), this, this.v, this.f1465i);
    }

    private int computeScrollRange(RecyclerView.z zVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        return p.c(zVar, this.f1459c, o(!this.v), n(!this.v), this, this.v);
    }

    private int convertFocusDirectionToLayoutDirection(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 17 ? i2 != 33 ? i2 != 66 ? (i2 == 130 && this.f1461e == 1) ? 1 : Integer.MIN_VALUE : this.f1461e == 0 ? 1 : Integer.MIN_VALUE : this.f1461e == 1 ? -1 : Integer.MIN_VALUE : this.f1461e == 0 ? -1 : Integer.MIN_VALUE : (this.f1461e != 1 && isLayoutRTL()) ? -1 : 1 : (this.f1461e != 1 && isLayoutRTL()) ? 1 : -1;
    }

    private void e(View view, c cVar, i iVar) {
        if (iVar.f1585e == 1) {
            if (cVar.f1487f) {
                a(view);
                return;
            } else {
                cVar.f1486e.a(view);
                return;
            }
        }
        if (cVar.f1487f) {
            H(view);
        } else {
            cVar.f1486e.u(view);
        }
    }

    private int f(int i2) {
        if (getChildCount() == 0) {
            return this.f1465i ? 1 : -1;
        }
        return (i2 < t()) != this.f1465i ? -1 : 1;
    }

    private boolean h(d dVar) {
        if (this.f1465i) {
            if (dVar.k() < this.f1459c.i()) {
                ArrayList<View> arrayList = dVar.a;
                return !dVar.n(arrayList.get(arrayList.size() - 1)).f1487f;
            }
        } else if (dVar.o() > this.f1459c.m()) {
            return !dVar.n(dVar.a.get(0)).f1487f;
        }
        return false;
    }

    private LazySpanLookup.FullSpanItem i(int i2) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f1471h = new int[this.a];
        for (int i3 = 0; i3 < this.a; i3++) {
            fullSpanItem.f1471h[i3] = i2 - this.f1458b[i3].l(i2);
        }
        return fullSpanItem;
    }

    private LazySpanLookup.FullSpanItem j(int i2) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f1471h = new int[this.a];
        for (int i3 = 0; i3 < this.a; i3++) {
            fullSpanItem.f1471h[i3] = this.f1458b[i3].p(i2) - i2;
        }
        return fullSpanItem;
    }

    private void k() {
        this.f1459c = n.b(this, this.f1461e);
        this.f1460d = n.b(this, 1 - this.f1461e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r9v7 */
    private int l(RecyclerView.v vVar, i iVar, RecyclerView.z zVar) {
        int i2;
        int i3;
        int m;
        int v;
        d dVar;
        int e2;
        int i4;
        int i5;
        int e3;
        boolean d2;
        ?? r9 = 0;
        this.f1466j.set(0, this.a, true);
        if (this.f1463g.f1589i) {
            i3 = iVar.f1585e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            if (iVar.f1585e == 1) {
                i2 = iVar.f1587g + iVar.f1582b;
            } else {
                i2 = iVar.f1586f - iVar.f1582b;
            }
            i3 = i2;
        }
        N(iVar.f1585e, i3);
        if (this.f1465i) {
            m = this.f1459c.i();
        } else {
            m = this.f1459c.m();
        }
        int i6 = m;
        boolean z = false;
        while (iVar.a(zVar) && (this.f1463g.f1589i || !this.f1466j.isEmpty())) {
            View b2 = iVar.b(vVar);
            c cVar = (c) b2.getLayoutParams();
            int a2 = cVar.a();
            int g2 = this.m.g(a2);
            boolean z2 = g2 == -1;
            if (z2) {
                dVar = cVar.f1487f ? this.f1458b[r9] : z(iVar);
                this.m.n(a2, dVar);
            } else {
                dVar = this.f1458b[g2];
            }
            d dVar2 = dVar;
            cVar.f1486e = dVar2;
            if (iVar.f1585e == 1) {
                addView(b2);
            } else {
                addView(b2, r9);
            }
            D(b2, cVar, r9);
            if (iVar.f1585e == 1) {
                int v2 = cVar.f1487f ? v(i6) : dVar2.l(i6);
                int e4 = this.f1459c.e(b2) + v2;
                if (z2 && cVar.f1487f) {
                    LazySpanLookup.FullSpanItem i7 = i(v2);
                    i7.f1470g = -1;
                    i7.f1469f = a2;
                    this.m.a(i7);
                }
                i4 = e4;
                e2 = v2;
            } else {
                int y = cVar.f1487f ? y(i6) : dVar2.p(i6);
                e2 = y - this.f1459c.e(b2);
                if (z2 && cVar.f1487f) {
                    LazySpanLookup.FullSpanItem j2 = j(y);
                    j2.f1470g = 1;
                    j2.f1469f = a2;
                    this.m.a(j2);
                }
                i4 = y;
            }
            if (cVar.f1487f && iVar.f1584d == -1) {
                if (z2) {
                    this.u = true;
                } else {
                    if (iVar.f1585e == 1) {
                        d2 = c();
                    } else {
                        d2 = d();
                    }
                    if (!d2) {
                        LazySpanLookup.FullSpanItem f2 = this.m.f(a2);
                        if (f2 != null) {
                            f2.f1472i = true;
                        }
                        this.u = true;
                    }
                }
            }
            e(b2, cVar, iVar);
            if (isLayoutRTL() && this.f1461e == 1) {
                int i8 = cVar.f1487f ? this.f1460d.i() : this.f1460d.i() - (((this.a - 1) - dVar2.f1491e) * this.f1462f);
                e3 = i8;
                i5 = i8 - this.f1460d.e(b2);
            } else {
                int m2 = cVar.f1487f ? this.f1460d.m() : (dVar2.f1491e * this.f1462f) + this.f1460d.m();
                i5 = m2;
                e3 = this.f1460d.e(b2) + m2;
            }
            if (this.f1461e == 1) {
                layoutDecoratedWithMargins(b2, i5, e2, e3, i4);
            } else {
                layoutDecoratedWithMargins(b2, e2, i5, i4, e3);
            }
            if (cVar.f1487f) {
                N(this.f1463g.f1585e, i3);
            } else {
                T(dVar2, this.f1463g.f1585e, i3);
            }
            I(vVar, this.f1463g);
            if (this.f1463g.f1588h && b2.hasFocusable()) {
                if (cVar.f1487f) {
                    this.f1466j.clear();
                } else {
                    this.f1466j.set(dVar2.f1491e, false);
                    z = true;
                    r9 = 0;
                }
            }
            z = true;
            r9 = 0;
        }
        if (!z) {
            I(vVar, this.f1463g);
        }
        if (this.f1463g.f1585e == -1) {
            v = this.f1459c.m() - y(this.f1459c.m());
        } else {
            v = v(this.f1459c.i()) - this.f1459c.i();
        }
        if (v > 0) {
            return Math.min(iVar.f1582b, v);
        }
        return 0;
    }

    private int m(int i2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            int position = getPosition(getChildAt(i3));
            if (position >= 0 && position < i2) {
                return position;
            }
        }
        return 0;
    }

    private void measureChildWithDecorationsAndMargin(View view, int i2, int i3, boolean z) {
        boolean shouldMeasureChild;
        calculateItemDecorationsForChild(view, this.s);
        c cVar = (c) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.s;
        int U = U(i2, i4 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i5 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.s;
        int U2 = U(i3, i5 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z) {
            shouldMeasureChild = shouldReMeasureChild(view, U, U2, cVar);
        } else {
            shouldMeasureChild = shouldMeasureChild(view, U, U2, cVar);
        }
        if (shouldMeasureChild) {
            view.measure(U, U2);
        }
    }

    private int q(int i2) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            int position = getPosition(getChildAt(childCount));
            if (position >= 0 && position < i2) {
                return position;
            }
        }
        return 0;
    }

    private void r(RecyclerView.v vVar, RecyclerView.z zVar, boolean z) {
        int i2;
        int v = v(Integer.MIN_VALUE);
        if (v != Integer.MIN_VALUE && (i2 = this.f1459c.i() - v) > 0) {
            int i3 = i2 - (-scrollBy(-i2, vVar, zVar));
            if (!z || i3 <= 0) {
                return;
            }
            this.f1459c.r(i3);
        }
    }

    private void resolveShouldLayoutReverse() {
        if (this.f1461e != 1 && isLayoutRTL()) {
            this.f1465i = !this.f1464h;
        } else {
            this.f1465i = this.f1464h;
        }
    }

    private void s(RecyclerView.v vVar, RecyclerView.z zVar, boolean z) {
        int m;
        int y = y(Integer.MAX_VALUE);
        if (y != Integer.MAX_VALUE && (m = y - this.f1459c.m()) > 0) {
            int scrollBy = m - scrollBy(m, vVar, zVar);
            if (!z || scrollBy <= 0) {
                return;
            }
            this.f1459c.r(-scrollBy);
        }
    }

    private int v(int i2) {
        int l = this.f1458b[0].l(i2);
        for (int i3 = 1; i3 < this.a; i3++) {
            int l2 = this.f1458b[i3].l(i2);
            if (l2 > l) {
                l = l2;
            }
        }
        return l;
    }

    private int w(int i2) {
        int p = this.f1458b[0].p(i2);
        for (int i3 = 1; i3 < this.a; i3++) {
            int p2 = this.f1458b[i3].p(i2);
            if (p2 > p) {
                p = p2;
            }
        }
        return p;
    }

    private int x(int i2) {
        int l = this.f1458b[0].l(i2);
        for (int i3 = 1; i3 < this.a; i3++) {
            int l2 = this.f1458b[i3].l(i2);
            if (l2 < l) {
                l = l2;
            }
        }
        return l;
    }

    private int y(int i2) {
        int p = this.f1458b[0].p(i2);
        for (int i3 = 1; i3 < this.a; i3++) {
            int p2 = this.f1458b[i3].p(i2);
            if (p2 < p) {
                p = p2;
            }
        }
        return p;
    }

    private d z(i iVar) {
        int i2;
        int i3;
        int i4 = -1;
        if (F(iVar.f1585e)) {
            i2 = this.a - 1;
            i3 = -1;
        } else {
            i2 = 0;
            i4 = this.a;
            i3 = 1;
        }
        d dVar = null;
        if (iVar.f1585e == 1) {
            int i5 = Integer.MAX_VALUE;
            int m = this.f1459c.m();
            while (i2 != i4) {
                d dVar2 = this.f1458b[i2];
                int l = dVar2.l(m);
                if (l < i5) {
                    dVar = dVar2;
                    i5 = l;
                }
                i2 += i3;
            }
            return dVar;
        }
        int i6 = Integer.MIN_VALUE;
        int i7 = this.f1459c.i();
        while (i2 != i4) {
            d dVar3 = this.f1458b[i2];
            int p = dVar3.p(i7);
            if (p > i6) {
                dVar = dVar3;
                i6 = p;
            }
            i2 += i3;
        }
        return dVar;
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
    android.view.View B() {
        /*
            r12 = this;
            int r0 = r12.getChildCount()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.a
            r2.<init>(r3)
            int r3 = r12.a
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f1461e
            r5 = -1
            if (r3 != r1) goto L20
            boolean r3 = r12.isLayoutRTL()
            if (r3 == 0) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = -1
        L21:
            boolean r6 = r12.f1465i
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
            android.view.View r7 = r12.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f1486e
            int r9 = r9.f1491e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L54
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f1486e
            boolean r9 = r12.h(r9)
            if (r9 == 0) goto L4d
            return r7
        L4d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f1486e
            int r9 = r9.f1491e
            r2.clear(r9)
        L54:
            boolean r9 = r8.f1487f
            if (r9 == 0) goto L59
            goto La9
        L59:
            int r9 = r0 + r5
            if (r9 == r6) goto La9
            android.view.View r9 = r12.getChildAt(r9)
            boolean r10 = r12.f1465i
            if (r10 == 0) goto L77
            androidx.recyclerview.widget.n r10 = r12.f1459c
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.n r11 = r12.f1459c
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L74
            return r7
        L74:
            if (r10 != r11) goto L8a
            goto L88
        L77:
            androidx.recyclerview.widget.n r10 = r12.f1459c
            int r10 = r10.g(r7)
            androidx.recyclerview.widget.n r11 = r12.f1459c
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
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r8 = r8.f1486e
            int r8 = r8.f1491e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r9.f1486e
            int r9 = r9.f1491e
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.B():android.view.View");
    }

    public void C() {
        this.m.b();
        requestLayout();
    }

    void G(int i2, RecyclerView.z zVar) {
        int t;
        int i3;
        if (i2 > 0) {
            t = u();
            i3 = 1;
        } else {
            t = t();
            i3 = -1;
        }
        this.f1463g.a = true;
        R(t, zVar);
        M(i3);
        i iVar = this.f1463g;
        iVar.f1583c = t + iVar.f1584d;
        iVar.f1582b = Math.abs(i2);
    }

    boolean P(RecyclerView.z zVar, b bVar) {
        int i2;
        int m;
        if (!zVar.e() && (i2 = this.f1467k) != -1) {
            if (i2 >= 0 && i2 < zVar.b()) {
                SavedState savedState = this.q;
                if (savedState != null && savedState.f1473f != -1 && savedState.f1475h >= 1) {
                    bVar.f1480b = Integer.MIN_VALUE;
                    bVar.a = this.f1467k;
                } else {
                    View findViewByPosition = findViewByPosition(this.f1467k);
                    if (findViewByPosition != null) {
                        bVar.a = this.f1465i ? u() : t();
                        if (this.l != Integer.MIN_VALUE) {
                            if (bVar.f1481c) {
                                bVar.f1480b = (this.f1459c.i() - this.l) - this.f1459c.d(findViewByPosition);
                            } else {
                                bVar.f1480b = (this.f1459c.m() + this.l) - this.f1459c.g(findViewByPosition);
                            }
                            return true;
                        }
                        if (this.f1459c.e(findViewByPosition) > this.f1459c.n()) {
                            if (bVar.f1481c) {
                                m = this.f1459c.i();
                            } else {
                                m = this.f1459c.m();
                            }
                            bVar.f1480b = m;
                            return true;
                        }
                        int g2 = this.f1459c.g(findViewByPosition) - this.f1459c.m();
                        if (g2 < 0) {
                            bVar.f1480b = -g2;
                            return true;
                        }
                        int i3 = this.f1459c.i() - this.f1459c.d(findViewByPosition);
                        if (i3 < 0) {
                            bVar.f1480b = i3;
                            return true;
                        }
                        bVar.f1480b = Integer.MIN_VALUE;
                    } else {
                        int i4 = this.f1467k;
                        bVar.a = i4;
                        int i5 = this.l;
                        if (i5 == Integer.MIN_VALUE) {
                            bVar.f1481c = f(i4) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i5);
                        }
                        bVar.f1482d = true;
                    }
                }
                return true;
            }
            this.f1467k = -1;
            this.l = Integer.MIN_VALUE;
        }
        return false;
    }

    void Q(RecyclerView.z zVar, b bVar) {
        if (P(zVar, bVar) || O(zVar, bVar)) {
            return;
        }
        bVar.a();
        bVar.a = 0;
    }

    void S(int i2) {
        this.f1462f = i2 / this.a;
        this.r = View.MeasureSpec.makeMeasureSpec(i2, this.f1460d.k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void assertNotInLayoutOrScroll(String str) {
        if (this.q == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    boolean c() {
        int l = this.f1458b[0].l(Integer.MIN_VALUE);
        for (int i2 = 1; i2 < this.a; i2++) {
            if (this.f1458b[i2].l(Integer.MIN_VALUE) != l) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean canScrollHorizontally() {
        return this.f1461e == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean canScrollVertically() {
        return this.f1461e == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean checkLayoutParams(RecyclerView.p pVar) {
        return pVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void collectAdjacentPrefetchPositions(int i2, int i3, RecyclerView.z zVar, RecyclerView.o.c cVar) {
        int l;
        int i4;
        if (this.f1461e != 0) {
            i2 = i3;
        }
        if (getChildCount() == 0 || i2 == 0) {
            return;
        }
        G(i2, zVar);
        int[] iArr = this.w;
        if (iArr == null || iArr.length < this.a) {
            this.w = new int[this.a];
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.a; i6++) {
            i iVar = this.f1463g;
            if (iVar.f1584d == -1) {
                l = iVar.f1586f;
                i4 = this.f1458b[i6].p(l);
            } else {
                l = this.f1458b[i6].l(iVar.f1587g);
                i4 = this.f1463g.f1587g;
            }
            int i7 = l - i4;
            if (i7 >= 0) {
                this.w[i5] = i7;
                i5++;
            }
        }
        Arrays.sort(this.w, 0, i5);
        for (int i8 = 0; i8 < i5 && this.f1463g.a(zVar); i8++) {
            cVar.a(this.f1463g.f1583c, this.w[i8]);
            i iVar2 = this.f1463g;
            iVar2.f1583c += iVar2.f1584d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeHorizontalScrollExtent(RecyclerView.z zVar) {
        return computeScrollExtent(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeHorizontalScrollOffset(RecyclerView.z zVar) {
        return computeScrollOffset(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeHorizontalScrollRange(RecyclerView.z zVar) {
        return computeScrollRange(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y.b
    public PointF computeScrollVectorForPosition(int i2) {
        int f2 = f(i2);
        PointF pointF = new PointF();
        if (f2 == 0) {
            return null;
        }
        if (this.f1461e == 0) {
            pointF.x = f2;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = f2;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeVerticalScrollExtent(RecyclerView.z zVar) {
        return computeScrollExtent(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeVerticalScrollOffset(RecyclerView.z zVar) {
        return computeScrollOffset(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeVerticalScrollRange(RecyclerView.z zVar) {
        return computeScrollRange(zVar);
    }

    boolean d() {
        int p = this.f1458b[0].p(Integer.MIN_VALUE);
        for (int i2 = 1; i2 < this.a; i2++) {
            if (this.f1458b[i2].p(Integer.MIN_VALUE) != p) {
                return false;
            }
        }
        return true;
    }

    boolean g() {
        int t;
        int u;
        if (getChildCount() == 0 || this.n == 0 || !isAttachedToWindow()) {
            return false;
        }
        if (this.f1465i) {
            t = u();
            u = t();
        } else {
            t = t();
            u = u();
        }
        if (t == 0 && B() != null) {
            this.m.b();
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        }
        if (!this.u) {
            return false;
        }
        int i2 = this.f1465i ? -1 : 1;
        int i3 = u + 1;
        LazySpanLookup.FullSpanItem e2 = this.m.e(t, i3, i2, true);
        if (e2 == null) {
            this.u = false;
            this.m.d(i3);
            return false;
        }
        LazySpanLookup.FullSpanItem e3 = this.m.e(t, e2.f1469f, i2 * (-1), true);
        if (e3 == null) {
            this.m.d(e2.f1469f);
        } else {
            this.m.d(e3.f1469f + 1);
        }
        requestSimpleAnimationsInNextLayout();
        requestLayout();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p generateDefaultLayoutParams() {
        if (this.f1461e == 0) {
            return new c(-2, -1);
        }
        return new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int getColumnCountForAccessibility(RecyclerView.v vVar, RecyclerView.z zVar) {
        if (this.f1461e == 1) {
            return this.a;
        }
        return super.getColumnCountForAccessibility(vVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int getRowCountForAccessibility(RecyclerView.v vVar, RecyclerView.z zVar) {
        if (this.f1461e == 0) {
            return this.a;
        }
        return super.getRowCountForAccessibility(vVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean isAutoMeasureEnabled() {
        return this.n != 0;
    }

    boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    View n(boolean z) {
        int m = this.f1459c.m();
        int i2 = this.f1459c.i();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int g2 = this.f1459c.g(childAt);
            int d2 = this.f1459c.d(childAt);
            if (d2 > m && g2 < i2) {
                if (d2 <= i2 || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    View o(boolean z) {
        int m = this.f1459c.m();
        int i2 = this.f1459c.i();
        int childCount = getChildCount();
        View view = null;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int g2 = this.f1459c.g(childAt);
            if (this.f1459c.d(childAt) > m && g2 < i2) {
                if (g2 >= m || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void offsetChildrenHorizontal(int i2) {
        super.offsetChildrenHorizontal(i2);
        for (int i3 = 0; i3 < this.a; i3++) {
            this.f1458b[i3].r(i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void offsetChildrenVertical(int i2) {
        super.offsetChildrenVertical(i2);
        for (int i3 = 0; i3 < this.a; i3++) {
            this.f1458b[i3].r(i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.onDetachedFromWindow(recyclerView, vVar);
        removeCallbacks(this.x);
        for (int i2 = 0; i2 < this.a; i2++) {
            this.f1458b[i2].e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View onFocusSearchFailed(View view, int i2, RecyclerView.v vVar, RecyclerView.z zVar) {
        View findContainingItemView;
        int t;
        int g2;
        int g3;
        int g4;
        View m;
        if (getChildCount() == 0 || (findContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        resolveShouldLayoutReverse();
        int convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i2);
        if (convertFocusDirectionToLayoutDirection == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) findContainingItemView.getLayoutParams();
        boolean z = cVar.f1487f;
        d dVar = cVar.f1486e;
        if (convertFocusDirectionToLayoutDirection == 1) {
            t = u();
        } else {
            t = t();
        }
        R(t, zVar);
        M(convertFocusDirectionToLayoutDirection);
        i iVar = this.f1463g;
        iVar.f1583c = iVar.f1584d + t;
        iVar.f1582b = (int) (this.f1459c.n() * 0.33333334f);
        i iVar2 = this.f1463g;
        iVar2.f1588h = true;
        iVar2.a = false;
        l(vVar, iVar2, zVar);
        this.o = this.f1465i;
        if (!z && (m = dVar.m(t, convertFocusDirectionToLayoutDirection)) != null && m != findContainingItemView) {
            return m;
        }
        if (F(convertFocusDirectionToLayoutDirection)) {
            for (int i3 = this.a - 1; i3 >= 0; i3--) {
                View m2 = this.f1458b[i3].m(t, convertFocusDirectionToLayoutDirection);
                if (m2 != null && m2 != findContainingItemView) {
                    return m2;
                }
            }
        } else {
            for (int i4 = 0; i4 < this.a; i4++) {
                View m3 = this.f1458b[i4].m(t, convertFocusDirectionToLayoutDirection);
                if (m3 != null && m3 != findContainingItemView) {
                    return m3;
                }
            }
        }
        boolean z2 = (this.f1464h ^ true) == (convertFocusDirectionToLayoutDirection == -1);
        if (!z) {
            if (z2) {
                g4 = dVar.f();
            } else {
                g4 = dVar.g();
            }
            View findViewByPosition = findViewByPosition(g4);
            if (findViewByPosition != null && findViewByPosition != findContainingItemView) {
                return findViewByPosition;
            }
        }
        if (F(convertFocusDirectionToLayoutDirection)) {
            for (int i5 = this.a - 1; i5 >= 0; i5--) {
                if (i5 != dVar.f1491e) {
                    if (z2) {
                        g3 = this.f1458b[i5].f();
                    } else {
                        g3 = this.f1458b[i5].g();
                    }
                    View findViewByPosition2 = findViewByPosition(g3);
                    if (findViewByPosition2 != null && findViewByPosition2 != findContainingItemView) {
                        return findViewByPosition2;
                    }
                }
            }
        } else {
            for (int i6 = 0; i6 < this.a; i6++) {
                if (z2) {
                    g2 = this.f1458b[i6].f();
                } else {
                    g2 = this.f1458b[i6].g();
                }
                View findViewByPosition3 = findViewByPosition(g2);
                if (findViewByPosition3 != null && findViewByPosition3 != findContainingItemView) {
                    return findViewByPosition3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View o = o(false);
            View n = n(false);
            if (o == null || n == null) {
                return;
            }
            int position = getPosition(o);
            int position2 = getPosition(n);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.v vVar, RecyclerView.z zVar, View view, androidx.core.view.d0.c cVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, cVar);
            return;
        }
        c cVar2 = (c) layoutParams;
        if (this.f1461e == 0) {
            cVar.b0(c.C0022c.f(cVar2.e(), cVar2.f1487f ? this.a : 1, -1, -1, false, false));
        } else {
            cVar.b0(c.C0022c.f(-1, -1, cVar2.e(), cVar2.f1487f ? this.a : 1, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsAdded(RecyclerView recyclerView, int i2, int i3) {
        A(i2, i3, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsChanged(RecyclerView recyclerView) {
        this.m.b();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsMoved(RecyclerView recyclerView, int i2, int i3, int i4) {
        A(i2, i3, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsRemoved(RecyclerView recyclerView, int i2, int i3) {
        A(i2, i3, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsUpdated(RecyclerView recyclerView, int i2, int i3, Object obj) {
        A(i2, i3, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onLayoutChildren(RecyclerView.v vVar, RecyclerView.z zVar) {
        E(vVar, zVar, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onLayoutCompleted(RecyclerView.z zVar) {
        super.onLayoutCompleted(zVar);
        this.f1467k = -1;
        this.l = Integer.MIN_VALUE;
        this.q = null;
        this.t.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.q = (SavedState) parcelable;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable onSaveInstanceState() {
        int p;
        int m;
        int[] iArr;
        if (this.q != null) {
            return new SavedState(this.q);
        }
        SavedState savedState = new SavedState();
        savedState.m = this.f1464h;
        savedState.n = this.o;
        savedState.o = this.p;
        LazySpanLookup lazySpanLookup = this.m;
        if (lazySpanLookup != null && (iArr = lazySpanLookup.a) != null) {
            savedState.f1478k = iArr;
            savedState.f1477j = iArr.length;
            savedState.l = lazySpanLookup.f1468b;
        } else {
            savedState.f1477j = 0;
        }
        if (getChildCount() > 0) {
            savedState.f1473f = this.o ? u() : t();
            savedState.f1474g = p();
            int i2 = this.a;
            savedState.f1475h = i2;
            savedState.f1476i = new int[i2];
            for (int i3 = 0; i3 < this.a; i3++) {
                if (this.o) {
                    p = this.f1458b[i3].l(Integer.MIN_VALUE);
                    if (p != Integer.MIN_VALUE) {
                        m = this.f1459c.i();
                        p -= m;
                        savedState.f1476i[i3] = p;
                    } else {
                        savedState.f1476i[i3] = p;
                    }
                } else {
                    p = this.f1458b[i3].p(Integer.MIN_VALUE);
                    if (p != Integer.MIN_VALUE) {
                        m = this.f1459c.m();
                        p -= m;
                        savedState.f1476i[i3] = p;
                    } else {
                        savedState.f1476i[i3] = p;
                    }
                }
            }
        } else {
            savedState.f1473f = -1;
            savedState.f1474g = -1;
            savedState.f1475h = 0;
        }
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onScrollStateChanged(int i2) {
        if (i2 == 0) {
            g();
        }
    }

    int p() {
        View n = this.f1465i ? n(true) : o(true);
        if (n == null) {
            return -1;
        }
        return getPosition(n);
    }

    int scrollBy(int i2, RecyclerView.v vVar, RecyclerView.z zVar) {
        if (getChildCount() == 0 || i2 == 0) {
            return 0;
        }
        G(i2, zVar);
        int l = l(vVar, this.f1463g, zVar);
        if (this.f1463g.f1582b >= l) {
            i2 = i2 < 0 ? -l : l;
        }
        this.f1459c.r(-i2);
        this.o = this.f1465i;
        i iVar = this.f1463g;
        iVar.f1582b = 0;
        I(vVar, iVar);
        return i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int scrollHorizontallyBy(int i2, RecyclerView.v vVar, RecyclerView.z zVar) {
        return scrollBy(i2, vVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void scrollToPosition(int i2) {
        SavedState savedState = this.q;
        if (savedState != null && savedState.f1473f != i2) {
            savedState.a();
        }
        this.f1467k = i2;
        this.l = Integer.MIN_VALUE;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int scrollVerticallyBy(int i2, RecyclerView.v vVar, RecyclerView.z zVar) {
        return scrollBy(i2, vVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void setMeasuredDimension(Rect rect, int i2, int i3) {
        int chooseSize;
        int chooseSize2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f1461e == 1) {
            chooseSize2 = RecyclerView.o.chooseSize(i3, rect.height() + paddingTop, getMinimumHeight());
            chooseSize = RecyclerView.o.chooseSize(i2, (this.f1462f * this.a) + paddingLeft, getMinimumWidth());
        } else {
            chooseSize = RecyclerView.o.chooseSize(i2, rect.width() + paddingLeft, getMinimumWidth());
            chooseSize2 = RecyclerView.o.chooseSize(i3, (this.f1462f * this.a) + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    public void setOrientation(int i2) {
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i2 == this.f1461e) {
            return;
        }
        this.f1461e = i2;
        n nVar = this.f1459c;
        this.f1459c = this.f1460d;
        this.f1460d = nVar;
        requestLayout();
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll(null);
        SavedState savedState = this.q;
        if (savedState != null && savedState.m != z) {
            savedState.m = z;
        }
        this.f1464h = z;
        requestLayout();
    }

    public void setSpanCount(int i2) {
        assertNotInLayoutOrScroll(null);
        if (i2 != this.a) {
            C();
            this.a = i2;
            this.f1466j = new BitSet(this.a);
            this.f1458b = new d[this.a];
            for (int i3 = 0; i3 < this.a; i3++) {
                this.f1458b[i3] = new d(i3);
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.z zVar, int i2) {
        j jVar = new j(recyclerView.getContext());
        jVar.setTargetPosition(i2);
        startSmoothScroll(jVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean supportsPredictiveItemAnimations() {
        return this.q == null;
    }

    int t() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    int u() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class LazySpanLookup {
        int[] a;

        /* renamed from: b, reason: collision with root package name */
        List<FullSpanItem> f1468b;

        LazySpanLookup() {
        }

        private int i(int i2) {
            if (this.f1468b == null) {
                return -1;
            }
            FullSpanItem f2 = f(i2);
            if (f2 != null) {
                this.f1468b.remove(f2);
            }
            int size = this.f1468b.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    i3 = -1;
                    break;
                }
                if (this.f1468b.get(i3).f1469f >= i2) {
                    break;
                }
                i3++;
            }
            if (i3 == -1) {
                return -1;
            }
            FullSpanItem fullSpanItem = this.f1468b.get(i3);
            this.f1468b.remove(i3);
            return fullSpanItem.f1469f;
        }

        private void l(int i2, int i3) {
            List<FullSpanItem> list = this.f1468b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f1468b.get(size);
                int i4 = fullSpanItem.f1469f;
                if (i4 >= i2) {
                    fullSpanItem.f1469f = i4 + i3;
                }
            }
        }

        private void m(int i2, int i3) {
            List<FullSpanItem> list = this.f1468b;
            if (list == null) {
                return;
            }
            int i4 = i2 + i3;
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f1468b.get(size);
                int i5 = fullSpanItem.f1469f;
                if (i5 >= i2) {
                    if (i5 < i4) {
                        this.f1468b.remove(size);
                    } else {
                        fullSpanItem.f1469f = i5 - i3;
                    }
                }
            }
        }

        public void a(FullSpanItem fullSpanItem) {
            if (this.f1468b == null) {
                this.f1468b = new ArrayList();
            }
            int size = this.f1468b.size();
            for (int i2 = 0; i2 < size; i2++) {
                FullSpanItem fullSpanItem2 = this.f1468b.get(i2);
                if (fullSpanItem2.f1469f == fullSpanItem.f1469f) {
                    this.f1468b.remove(i2);
                }
                if (fullSpanItem2.f1469f >= fullSpanItem.f1469f) {
                    this.f1468b.add(i2, fullSpanItem);
                    return;
                }
            }
            this.f1468b.add(fullSpanItem);
        }

        void b() {
            int[] iArr = this.a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f1468b = null;
        }

        void c(int i2) {
            int[] iArr = this.a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i2, 10) + 1];
                this.a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i2 >= iArr.length) {
                int[] iArr3 = new int[o(i2)];
                this.a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        int d(int i2) {
            List<FullSpanItem> list = this.f1468b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f1468b.get(size).f1469f >= i2) {
                        this.f1468b.remove(size);
                    }
                }
            }
            return h(i2);
        }

        public FullSpanItem e(int i2, int i3, int i4, boolean z) {
            List<FullSpanItem> list = this.f1468b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                FullSpanItem fullSpanItem = this.f1468b.get(i5);
                int i6 = fullSpanItem.f1469f;
                if (i6 >= i3) {
                    return null;
                }
                if (i6 >= i2 && (i4 == 0 || fullSpanItem.f1470g == i4 || (z && fullSpanItem.f1472i))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public FullSpanItem f(int i2) {
            List<FullSpanItem> list = this.f1468b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f1468b.get(size);
                if (fullSpanItem.f1469f == i2) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        int g(int i2) {
            int[] iArr = this.a;
            if (iArr == null || i2 >= iArr.length) {
                return -1;
            }
            return iArr[i2];
        }

        int h(int i2) {
            int[] iArr = this.a;
            if (iArr == null || i2 >= iArr.length) {
                return -1;
            }
            int i3 = i(i2);
            if (i3 == -1) {
                int[] iArr2 = this.a;
                Arrays.fill(iArr2, i2, iArr2.length, -1);
                return this.a.length;
            }
            int i4 = i3 + 1;
            Arrays.fill(this.a, i2, i4, -1);
            return i4;
        }

        void j(int i2, int i3) {
            int[] iArr = this.a;
            if (iArr == null || i2 >= iArr.length) {
                return;
            }
            int i4 = i2 + i3;
            c(i4);
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, i2, iArr2, i4, (iArr2.length - i2) - i3);
            Arrays.fill(this.a, i2, i4, -1);
            l(i2, i3);
        }

        void k(int i2, int i3) {
            int[] iArr = this.a;
            if (iArr == null || i2 >= iArr.length) {
                return;
            }
            int i4 = i2 + i3;
            c(i4);
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, i4, iArr2, i2, (iArr2.length - i2) - i3);
            int[] iArr3 = this.a;
            Arrays.fill(iArr3, iArr3.length - i3, iArr3.length, -1);
            m(i2, i3);
        }

        void n(int i2, d dVar) {
            c(i2);
            this.a[i2] = dVar.f1491e;
        }

        int o(int i2) {
            int length = this.a.length;
            while (length <= i2) {
                length *= 2;
            }
            return length;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: classes.dex */
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new a();

            /* renamed from: f, reason: collision with root package name */
            int f1469f;

            /* renamed from: g, reason: collision with root package name */
            int f1470g;

            /* renamed from: h, reason: collision with root package name */
            int[] f1471h;

            /* renamed from: i, reason: collision with root package name */
            boolean f1472i;

            /* loaded from: classes.dex */
            static class a implements Parcelable.Creator<FullSpanItem> {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public FullSpanItem[] newArray(int i2) {
                    return new FullSpanItem[i2];
                }
            }

            FullSpanItem(Parcel parcel) {
                this.f1469f = parcel.readInt();
                this.f1470g = parcel.readInt();
                this.f1472i = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f1471h = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            int a(int i2) {
                int[] iArr = this.f1471h;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i2];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f1469f + ", mGapDir=" + this.f1470g + ", mHasUnwantedGapAfter=" + this.f1472i + ", mGapPerSpan=" + Arrays.toString(this.f1471h) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i2) {
                parcel.writeInt(this.f1469f);
                parcel.writeInt(this.f1470g);
                parcel.writeInt(this.f1472i ? 1 : 0);
                int[] iArr = this.f1471h;
                if (iArr != null && iArr.length > 0) {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f1471h);
                } else {
                    parcel.writeInt(0);
                }
            }

            FullSpanItem() {
            }
        }
    }
}
