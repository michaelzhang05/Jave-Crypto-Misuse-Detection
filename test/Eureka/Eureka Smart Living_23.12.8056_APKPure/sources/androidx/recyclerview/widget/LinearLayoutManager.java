package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.o implements RecyclerView.y.b {
    int A;
    int B;
    private boolean C;
    d D;
    final a E;
    private final b F;
    private int G;
    private int[] H;

    /* renamed from: s, reason: collision with root package name */
    int f3213s;

    /* renamed from: t, reason: collision with root package name */
    private c f3214t;

    /* renamed from: u, reason: collision with root package name */
    i f3215u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f3216v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f3217w;

    /* renamed from: x, reason: collision with root package name */
    boolean f3218x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f3219y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f3220z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        i f3221a;

        /* renamed from: b, reason: collision with root package name */
        int f3222b;

        /* renamed from: c, reason: collision with root package name */
        int f3223c;

        /* renamed from: d, reason: collision with root package name */
        boolean f3224d;

        /* renamed from: e, reason: collision with root package name */
        boolean f3225e;

        a() {
            e();
        }

        void a() {
            this.f3223c = this.f3224d ? this.f3221a.i() : this.f3221a.m();
        }

        public void b(View view, int i6) {
            this.f3223c = this.f3224d ? this.f3221a.d(view) + this.f3221a.o() : this.f3221a.g(view);
            this.f3222b = i6;
        }

        public void c(View view, int i6) {
            int o6 = this.f3221a.o();
            if (o6 >= 0) {
                b(view, i6);
                return;
            }
            this.f3222b = i6;
            if (this.f3224d) {
                int i7 = (this.f3221a.i() - o6) - this.f3221a.d(view);
                this.f3223c = this.f3221a.i() - i7;
                if (i7 > 0) {
                    int e6 = this.f3223c - this.f3221a.e(view);
                    int m6 = this.f3221a.m();
                    int min = e6 - (m6 + Math.min(this.f3221a.g(view) - m6, 0));
                    if (min < 0) {
                        this.f3223c += Math.min(i7, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g6 = this.f3221a.g(view);
            int m7 = g6 - this.f3221a.m();
            this.f3223c = g6;
            if (m7 > 0) {
                int i8 = (this.f3221a.i() - Math.min(0, (this.f3221a.i() - o6) - this.f3221a.d(view))) - (g6 + this.f3221a.e(view));
                if (i8 < 0) {
                    this.f3223c -= Math.min(m7, -i8);
                }
            }
        }

        boolean d(View view, RecyclerView.z zVar) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return !pVar.c() && pVar.a() >= 0 && pVar.a() < zVar.b();
        }

        void e() {
            this.f3222b = -1;
            this.f3223c = Integer.MIN_VALUE;
            this.f3224d = false;
            this.f3225e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f3222b + ", mCoordinate=" + this.f3223c + ", mLayoutFromEnd=" + this.f3224d + ", mValid=" + this.f3225e + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f3226a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f3227b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f3228c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f3229d;

        protected b() {
        }

        void a() {
            this.f3226a = 0;
            this.f3227b = false;
            this.f3228c = false;
            this.f3229d = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: b, reason: collision with root package name */
        int f3231b;

        /* renamed from: c, reason: collision with root package name */
        int f3232c;

        /* renamed from: d, reason: collision with root package name */
        int f3233d;

        /* renamed from: e, reason: collision with root package name */
        int f3234e;

        /* renamed from: f, reason: collision with root package name */
        int f3235f;

        /* renamed from: g, reason: collision with root package name */
        int f3236g;

        /* renamed from: k, reason: collision with root package name */
        int f3240k;

        /* renamed from: m, reason: collision with root package name */
        boolean f3242m;

        /* renamed from: a, reason: collision with root package name */
        boolean f3230a = true;

        /* renamed from: h, reason: collision with root package name */
        int f3237h = 0;

        /* renamed from: i, reason: collision with root package name */
        int f3238i = 0;

        /* renamed from: j, reason: collision with root package name */
        boolean f3239j = false;

        /* renamed from: l, reason: collision with root package name */
        List f3241l = null;

        c() {
        }

        private View e() {
            int size = this.f3241l.size();
            for (int i6 = 0; i6 < size; i6++) {
                View view = ((RecyclerView.c0) this.f3241l.get(i6)).f3308a;
                RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
                if (!pVar.c() && this.f3233d == pVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b(null);
        }

        public void b(View view) {
            View f6 = f(view);
            this.f3233d = f6 == null ? -1 : ((RecyclerView.p) f6.getLayoutParams()).a();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean c(RecyclerView.z zVar) {
            int i6 = this.f3233d;
            return i6 >= 0 && i6 < zVar.b();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public View d(RecyclerView.u uVar) {
            if (this.f3241l != null) {
                return e();
            }
            View o6 = uVar.o(this.f3233d);
            this.f3233d += this.f3234e;
            return o6;
        }

        public View f(View view) {
            int a6;
            int size = this.f3241l.size();
            View view2 = null;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < size; i7++) {
                View view3 = ((RecyclerView.c0) this.f3241l.get(i7)).f3308a;
                RecyclerView.p pVar = (RecyclerView.p) view3.getLayoutParams();
                if (view3 != view && !pVar.c() && (a6 = (pVar.a() - this.f3233d) * this.f3234e) >= 0 && a6 < i6) {
                    view2 = view3;
                    if (a6 == 0) {
                        break;
                    }
                    i6 = a6;
                }
            }
            return view2;
        }
    }

    /* loaded from: classes.dex */
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        int f3243a;

        /* renamed from: b, reason: collision with root package name */
        int f3244b;

        /* renamed from: c, reason: collision with root package name */
        boolean f3245c;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i6) {
                return new d[i6];
            }
        }

        public d() {
        }

        d(Parcel parcel) {
            this.f3243a = parcel.readInt();
            this.f3244b = parcel.readInt();
            this.f3245c = parcel.readInt() == 1;
        }

        boolean a() {
            return this.f3243a >= 0;
        }

        void b() {
            this.f3243a = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i6) {
            parcel.writeInt(this.f3243a);
            parcel.writeInt(this.f3244b);
            parcel.writeInt(this.f3245c ? 1 : 0);
        }

        public d(d dVar) {
            this.f3243a = dVar.f3243a;
            this.f3244b = dVar.f3244b;
            this.f3245c = dVar.f3245c;
        }
    }

    public LinearLayoutManager(Context context, int i6, boolean z5) {
        this.f3213s = 1;
        this.f3217w = false;
        this.f3218x = false;
        this.f3219y = false;
        this.f3220z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        C2(i6);
        D2(z5);
    }

    private void A2() {
        this.f3218x = (this.f3213s == 1 || !q2()) ? this.f3217w : !this.f3217w;
    }

    private boolean F2(RecyclerView.u uVar, RecyclerView.z zVar, a aVar) {
        if (J() == 0) {
            return false;
        }
        View V = V();
        if (V != null && aVar.d(V, zVar)) {
            aVar.c(V, h0(V));
            return true;
        }
        if (this.f3216v != this.f3219y) {
            return false;
        }
        View i22 = aVar.f3224d ? i2(uVar, zVar) : j2(uVar, zVar);
        if (i22 == null) {
            return false;
        }
        aVar.b(i22, h0(i22));
        if (!zVar.e() && L1()) {
            if (this.f3215u.g(i22) >= this.f3215u.i() || this.f3215u.d(i22) < this.f3215u.m()) {
                aVar.f3223c = aVar.f3224d ? this.f3215u.i() : this.f3215u.m();
            }
        }
        return true;
    }

    private boolean G2(RecyclerView.z zVar, a aVar) {
        int i6;
        if (!zVar.e() && (i6 = this.A) != -1) {
            if (i6 >= 0 && i6 < zVar.b()) {
                aVar.f3222b = this.A;
                d dVar = this.D;
                if (dVar != null && dVar.a()) {
                    boolean z5 = this.D.f3245c;
                    aVar.f3224d = z5;
                    aVar.f3223c = z5 ? this.f3215u.i() - this.D.f3244b : this.f3215u.m() + this.D.f3244b;
                    return true;
                }
                if (this.B != Integer.MIN_VALUE) {
                    boolean z6 = this.f3218x;
                    aVar.f3224d = z6;
                    aVar.f3223c = z6 ? this.f3215u.i() - this.B : this.f3215u.m() + this.B;
                    return true;
                }
                View C = C(this.A);
                if (C == null) {
                    if (J() > 0) {
                        aVar.f3224d = (this.A < h0(I(0))) == this.f3218x;
                    }
                    aVar.a();
                } else {
                    if (this.f3215u.e(C) > this.f3215u.n()) {
                        aVar.a();
                        return true;
                    }
                    if (this.f3215u.g(C) - this.f3215u.m() < 0) {
                        aVar.f3223c = this.f3215u.m();
                        aVar.f3224d = false;
                        return true;
                    }
                    if (this.f3215u.i() - this.f3215u.d(C) < 0) {
                        aVar.f3223c = this.f3215u.i();
                        aVar.f3224d = true;
                        return true;
                    }
                    aVar.f3223c = aVar.f3224d ? this.f3215u.d(C) + this.f3215u.o() : this.f3215u.g(C);
                }
                return true;
            }
            this.A = -1;
            this.B = Integer.MIN_VALUE;
        }
        return false;
    }

    private void H2(RecyclerView.u uVar, RecyclerView.z zVar, a aVar) {
        if (G2(zVar, aVar) || F2(uVar, zVar, aVar)) {
            return;
        }
        aVar.a();
        aVar.f3222b = this.f3219y ? zVar.b() - 1 : 0;
    }

    private void I2(int i6, int i7, boolean z5, RecyclerView.z zVar) {
        int m6;
        this.f3214t.f3242m = z2();
        this.f3214t.f3235f = i6;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        M1(zVar, iArr);
        int max = Math.max(0, this.H[0]);
        int max2 = Math.max(0, this.H[1]);
        boolean z6 = i6 == 1;
        c cVar = this.f3214t;
        int i8 = z6 ? max2 : max;
        cVar.f3237h = i8;
        if (!z6) {
            max = max2;
        }
        cVar.f3238i = max;
        if (z6) {
            cVar.f3237h = i8 + this.f3215u.j();
            View m22 = m2();
            c cVar2 = this.f3214t;
            cVar2.f3234e = this.f3218x ? -1 : 1;
            int h02 = h0(m22);
            c cVar3 = this.f3214t;
            cVar2.f3233d = h02 + cVar3.f3234e;
            cVar3.f3231b = this.f3215u.d(m22);
            m6 = this.f3215u.d(m22) - this.f3215u.i();
        } else {
            View n22 = n2();
            this.f3214t.f3237h += this.f3215u.m();
            c cVar4 = this.f3214t;
            cVar4.f3234e = this.f3218x ? 1 : -1;
            int h03 = h0(n22);
            c cVar5 = this.f3214t;
            cVar4.f3233d = h03 + cVar5.f3234e;
            cVar5.f3231b = this.f3215u.g(n22);
            m6 = (-this.f3215u.g(n22)) + this.f3215u.m();
        }
        c cVar6 = this.f3214t;
        cVar6.f3232c = i7;
        if (z5) {
            cVar6.f3232c = i7 - m6;
        }
        cVar6.f3236g = m6;
    }

    private void J2(int i6, int i7) {
        this.f3214t.f3232c = this.f3215u.i() - i7;
        c cVar = this.f3214t;
        cVar.f3234e = this.f3218x ? -1 : 1;
        cVar.f3233d = i6;
        cVar.f3235f = 1;
        cVar.f3231b = i7;
        cVar.f3236g = Integer.MIN_VALUE;
    }

    private void K2(a aVar) {
        J2(aVar.f3222b, aVar.f3223c);
    }

    private void L2(int i6, int i7) {
        this.f3214t.f3232c = i7 - this.f3215u.m();
        c cVar = this.f3214t;
        cVar.f3233d = i6;
        cVar.f3234e = this.f3218x ? 1 : -1;
        cVar.f3235f = -1;
        cVar.f3231b = i7;
        cVar.f3236g = Integer.MIN_VALUE;
    }

    private void M2(a aVar) {
        L2(aVar.f3222b, aVar.f3223c);
    }

    private int O1(RecyclerView.z zVar) {
        if (J() == 0) {
            return 0;
        }
        T1();
        return l.a(zVar, this.f3215u, Y1(!this.f3220z, true), X1(!this.f3220z, true), this, this.f3220z);
    }

    private int P1(RecyclerView.z zVar) {
        if (J() == 0) {
            return 0;
        }
        T1();
        return l.b(zVar, this.f3215u, Y1(!this.f3220z, true), X1(!this.f3220z, true), this, this.f3220z, this.f3218x);
    }

    private int Q1(RecyclerView.z zVar) {
        if (J() == 0) {
            return 0;
        }
        T1();
        return l.c(zVar, this.f3215u, Y1(!this.f3220z, true), X1(!this.f3220z, true), this, this.f3220z);
    }

    private View V1() {
        return d2(0, J());
    }

    private View W1(RecyclerView.u uVar, RecyclerView.z zVar) {
        return h2(uVar, zVar, 0, J(), zVar.b());
    }

    private View a2() {
        return d2(J() - 1, -1);
    }

    private View b2(RecyclerView.u uVar, RecyclerView.z zVar) {
        return h2(uVar, zVar, J() - 1, -1, zVar.b());
    }

    private View f2() {
        return this.f3218x ? V1() : a2();
    }

    private View g2() {
        return this.f3218x ? a2() : V1();
    }

    private View i2(RecyclerView.u uVar, RecyclerView.z zVar) {
        return this.f3218x ? W1(uVar, zVar) : b2(uVar, zVar);
    }

    private View j2(RecyclerView.u uVar, RecyclerView.z zVar) {
        return this.f3218x ? b2(uVar, zVar) : W1(uVar, zVar);
    }

    private int k2(int i6, RecyclerView.u uVar, RecyclerView.z zVar, boolean z5) {
        int i7;
        int i8 = this.f3215u.i() - i6;
        if (i8 <= 0) {
            return 0;
        }
        int i9 = -B2(-i8, uVar, zVar);
        int i10 = i6 + i9;
        if (!z5 || (i7 = this.f3215u.i() - i10) <= 0) {
            return i9;
        }
        this.f3215u.r(i7);
        return i7 + i9;
    }

    private int l2(int i6, RecyclerView.u uVar, RecyclerView.z zVar, boolean z5) {
        int m6;
        int m7 = i6 - this.f3215u.m();
        if (m7 <= 0) {
            return 0;
        }
        int i7 = -B2(m7, uVar, zVar);
        int i8 = i6 + i7;
        if (!z5 || (m6 = i8 - this.f3215u.m()) <= 0) {
            return i7;
        }
        this.f3215u.r(-m6);
        return i7 - m6;
    }

    private View m2() {
        return I(this.f3218x ? 0 : J() - 1);
    }

    private View n2() {
        return I(this.f3218x ? J() - 1 : 0);
    }

    private void t2(RecyclerView.u uVar, RecyclerView.z zVar, int i6, int i7) {
        if (!zVar.g() || J() == 0 || zVar.e() || !L1()) {
            return;
        }
        List k6 = uVar.k();
        int size = k6.size();
        int h02 = h0(I(0));
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            RecyclerView.c0 c0Var = (RecyclerView.c0) k6.get(i10);
            if (!c0Var.v()) {
                char c6 = (c0Var.m() < h02) != this.f3218x ? (char) 65535 : (char) 1;
                int e6 = this.f3215u.e(c0Var.f3308a);
                if (c6 == 65535) {
                    i8 += e6;
                } else {
                    i9 += e6;
                }
            }
        }
        this.f3214t.f3241l = k6;
        if (i8 > 0) {
            L2(h0(n2()), i6);
            c cVar = this.f3214t;
            cVar.f3237h = i8;
            cVar.f3232c = 0;
            cVar.a();
            U1(uVar, this.f3214t, zVar, false);
        }
        if (i9 > 0) {
            J2(h0(m2()), i7);
            c cVar2 = this.f3214t;
            cVar2.f3237h = i9;
            cVar2.f3232c = 0;
            cVar2.a();
            U1(uVar, this.f3214t, zVar, false);
        }
        this.f3214t.f3241l = null;
    }

    private void v2(RecyclerView.u uVar, c cVar) {
        if (!cVar.f3230a || cVar.f3242m) {
            return;
        }
        int i6 = cVar.f3236g;
        int i7 = cVar.f3238i;
        if (cVar.f3235f == -1) {
            x2(uVar, i6, i7);
        } else {
            y2(uVar, i6, i7);
        }
    }

    private void w2(RecyclerView.u uVar, int i6, int i7) {
        if (i6 == i7) {
            return;
        }
        if (i7 <= i6) {
            while (i6 > i7) {
                n1(i6, uVar);
                i6--;
            }
        } else {
            for (int i8 = i7 - 1; i8 >= i6; i8--) {
                n1(i8, uVar);
            }
        }
    }

    private void x2(RecyclerView.u uVar, int i6, int i7) {
        int J = J();
        if (i6 < 0) {
            return;
        }
        int h6 = (this.f3215u.h() - i6) + i7;
        if (this.f3218x) {
            for (int i8 = 0; i8 < J; i8++) {
                View I = I(i8);
                if (this.f3215u.g(I) < h6 || this.f3215u.q(I) < h6) {
                    w2(uVar, 0, i8);
                    return;
                }
            }
            return;
        }
        int i9 = J - 1;
        for (int i10 = i9; i10 >= 0; i10--) {
            View I2 = I(i10);
            if (this.f3215u.g(I2) < h6 || this.f3215u.q(I2) < h6) {
                w2(uVar, i9, i10);
                return;
            }
        }
    }

    private void y2(RecyclerView.u uVar, int i6, int i7) {
        if (i6 < 0) {
            return;
        }
        int i8 = i6 - i7;
        int J = J();
        if (!this.f3218x) {
            for (int i9 = 0; i9 < J; i9++) {
                View I = I(i9);
                if (this.f3215u.d(I) > i8 || this.f3215u.p(I) > i8) {
                    w2(uVar, 0, i9);
                    return;
                }
            }
            return;
        }
        int i10 = J - 1;
        for (int i11 = i10; i11 >= 0; i11--) {
            View I2 = I(i11);
            if (this.f3215u.d(I2) > i8 || this.f3215u.p(I2) > i8) {
                w2(uVar, i10, i11);
                return;
            }
        }
    }

    int B2(int i6, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (J() == 0 || i6 == 0) {
            return 0;
        }
        T1();
        this.f3214t.f3230a = true;
        int i7 = i6 > 0 ? 1 : -1;
        int abs = Math.abs(i6);
        I2(i7, abs, true, zVar);
        c cVar = this.f3214t;
        int U1 = cVar.f3236g + U1(uVar, cVar, zVar, false);
        if (U1 < 0) {
            return 0;
        }
        if (abs > U1) {
            i6 = i7 * U1;
        }
        this.f3215u.r(-i6);
        this.f3214t.f3240k = i6;
        return i6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View C(int i6) {
        int J = J();
        if (J == 0) {
            return null;
        }
        int h02 = i6 - h0(I(0));
        if (h02 >= 0 && h02 < J) {
            View I = I(h02);
            if (h0(I) == i6) {
                return I;
            }
        }
        return super.C(i6);
    }

    public void C2(int i6) {
        if (i6 != 0 && i6 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i6);
        }
        g(null);
        if (i6 != this.f3213s || this.f3215u == null) {
            i b6 = i.b(this, i6);
            this.f3215u = b6;
            this.E.f3221a = b6;
            this.f3213s = i6;
            t1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p D() {
        return new RecyclerView.p(-2, -2);
    }

    public void D2(boolean z5) {
        g(null);
        if (z5 == this.f3217w) {
            return;
        }
        this.f3217w = z5;
        t1();
    }

    public void E2(boolean z5) {
        g(null);
        if (this.f3219y == z5) {
            return;
        }
        this.f3219y = z5;
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    boolean G1() {
        return (X() == 1073741824 || p0() == 1073741824 || !q0()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void I0(RecyclerView recyclerView, RecyclerView.u uVar) {
        super.I0(recyclerView, uVar);
        if (this.C) {
            k1(uVar);
            uVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void I1(RecyclerView recyclerView, RecyclerView.z zVar, int i6) {
        g gVar = new g(recyclerView.getContext());
        gVar.p(i6);
        J1(gVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View J0(View view, int i6, RecyclerView.u uVar, RecyclerView.z zVar) {
        int R1;
        A2();
        if (J() == 0 || (R1 = R1(i6)) == Integer.MIN_VALUE) {
            return null;
        }
        T1();
        I2(R1, (int) (this.f3215u.n() * 0.33333334f), false, zVar);
        c cVar = this.f3214t;
        cVar.f3236g = Integer.MIN_VALUE;
        cVar.f3230a = false;
        U1(uVar, cVar, zVar, true);
        View g22 = R1 == -1 ? g2() : f2();
        View n22 = R1 == -1 ? n2() : m2();
        if (!n22.hasFocusable()) {
            return g22;
        }
        if (g22 == null) {
            return null;
        }
        return n22;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void K0(AccessibilityEvent accessibilityEvent) {
        super.K0(accessibilityEvent);
        if (J() > 0) {
            accessibilityEvent.setFromIndex(Z1());
            accessibilityEvent.setToIndex(c2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean L1() {
        return this.D == null && this.f3216v == this.f3219y;
    }

    protected void M1(RecyclerView.z zVar, int[] iArr) {
        int i6;
        int o22 = o2(zVar);
        if (this.f3214t.f3235f == -1) {
            i6 = 0;
        } else {
            i6 = o22;
            o22 = 0;
        }
        iArr[0] = o22;
        iArr[1] = i6;
    }

    void N1(RecyclerView.z zVar, c cVar, RecyclerView.o.c cVar2) {
        int i6 = cVar.f3233d;
        if (i6 < 0 || i6 >= zVar.b()) {
            return;
        }
        cVar2.a(i6, Math.max(0, cVar.f3236g));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int R1(int i6) {
        return i6 != 1 ? i6 != 2 ? i6 != 17 ? i6 != 33 ? i6 != 66 ? (i6 == 130 && this.f3213s == 1) ? 1 : Integer.MIN_VALUE : this.f3213s == 0 ? 1 : Integer.MIN_VALUE : this.f3213s == 1 ? -1 : Integer.MIN_VALUE : this.f3213s == 0 ? -1 : Integer.MIN_VALUE : (this.f3213s != 1 && q2()) ? -1 : 1 : (this.f3213s != 1 && q2()) ? 1 : -1;
    }

    c S1() {
        return new c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T1() {
        if (this.f3214t == null) {
            this.f3214t = S1();
        }
    }

    int U1(RecyclerView.u uVar, c cVar, RecyclerView.z zVar, boolean z5) {
        int i6 = cVar.f3232c;
        int i7 = cVar.f3236g;
        if (i7 != Integer.MIN_VALUE) {
            if (i6 < 0) {
                cVar.f3236g = i7 + i6;
            }
            v2(uVar, cVar);
        }
        int i8 = cVar.f3232c + cVar.f3237h;
        b bVar = this.F;
        while (true) {
            if ((!cVar.f3242m && i8 <= 0) || !cVar.c(zVar)) {
                break;
            }
            bVar.a();
            s2(uVar, zVar, cVar, bVar);
            if (!bVar.f3227b) {
                cVar.f3231b += bVar.f3226a * cVar.f3235f;
                if (!bVar.f3228c || cVar.f3241l != null || !zVar.e()) {
                    int i9 = cVar.f3232c;
                    int i10 = bVar.f3226a;
                    cVar.f3232c = i9 - i10;
                    i8 -= i10;
                }
                int i11 = cVar.f3236g;
                if (i11 != Integer.MIN_VALUE) {
                    int i12 = i11 + bVar.f3226a;
                    cVar.f3236g = i12;
                    int i13 = cVar.f3232c;
                    if (i13 < 0) {
                        cVar.f3236g = i12 + i13;
                    }
                    v2(uVar, cVar);
                }
                if (z5 && bVar.f3229d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i6 - cVar.f3232c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void X0(RecyclerView.u uVar, RecyclerView.z zVar) {
        int i6;
        int i7;
        int i8;
        int i9;
        int k22;
        int i10;
        View C;
        int g6;
        int i11;
        int i12 = -1;
        if (!(this.D == null && this.A == -1) && zVar.b() == 0) {
            k1(uVar);
            return;
        }
        d dVar = this.D;
        if (dVar != null && dVar.a()) {
            this.A = this.D.f3243a;
        }
        T1();
        this.f3214t.f3230a = false;
        A2();
        View V = V();
        a aVar = this.E;
        if (!aVar.f3225e || this.A != -1 || this.D != null) {
            aVar.e();
            a aVar2 = this.E;
            aVar2.f3224d = this.f3218x ^ this.f3219y;
            H2(uVar, zVar, aVar2);
            this.E.f3225e = true;
        } else if (V != null && (this.f3215u.g(V) >= this.f3215u.i() || this.f3215u.d(V) <= this.f3215u.m())) {
            this.E.c(V, h0(V));
        }
        c cVar = this.f3214t;
        cVar.f3235f = cVar.f3240k >= 0 ? 1 : -1;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        M1(zVar, iArr);
        int max = Math.max(0, this.H[0]) + this.f3215u.m();
        int max2 = Math.max(0, this.H[1]) + this.f3215u.j();
        if (zVar.e() && (i10 = this.A) != -1 && this.B != Integer.MIN_VALUE && (C = C(i10)) != null) {
            if (this.f3218x) {
                i11 = this.f3215u.i() - this.f3215u.d(C);
                g6 = this.B;
            } else {
                g6 = this.f3215u.g(C) - this.f3215u.m();
                i11 = this.B;
            }
            int i13 = i11 - g6;
            if (i13 > 0) {
                max += i13;
            } else {
                max2 -= i13;
            }
        }
        a aVar3 = this.E;
        if (!aVar3.f3224d ? !this.f3218x : this.f3218x) {
            i12 = 1;
        }
        u2(uVar, zVar, aVar3, i12);
        w(uVar);
        this.f3214t.f3242m = z2();
        this.f3214t.f3239j = zVar.e();
        this.f3214t.f3238i = 0;
        a aVar4 = this.E;
        if (aVar4.f3224d) {
            M2(aVar4);
            c cVar2 = this.f3214t;
            cVar2.f3237h = max;
            U1(uVar, cVar2, zVar, false);
            c cVar3 = this.f3214t;
            i7 = cVar3.f3231b;
            int i14 = cVar3.f3233d;
            int i15 = cVar3.f3232c;
            if (i15 > 0) {
                max2 += i15;
            }
            K2(this.E);
            c cVar4 = this.f3214t;
            cVar4.f3237h = max2;
            cVar4.f3233d += cVar4.f3234e;
            U1(uVar, cVar4, zVar, false);
            c cVar5 = this.f3214t;
            i6 = cVar5.f3231b;
            int i16 = cVar5.f3232c;
            if (i16 > 0) {
                L2(i14, i7);
                c cVar6 = this.f3214t;
                cVar6.f3237h = i16;
                U1(uVar, cVar6, zVar, false);
                i7 = this.f3214t.f3231b;
            }
        } else {
            K2(aVar4);
            c cVar7 = this.f3214t;
            cVar7.f3237h = max2;
            U1(uVar, cVar7, zVar, false);
            c cVar8 = this.f3214t;
            i6 = cVar8.f3231b;
            int i17 = cVar8.f3233d;
            int i18 = cVar8.f3232c;
            if (i18 > 0) {
                max += i18;
            }
            M2(this.E);
            c cVar9 = this.f3214t;
            cVar9.f3237h = max;
            cVar9.f3233d += cVar9.f3234e;
            U1(uVar, cVar9, zVar, false);
            c cVar10 = this.f3214t;
            i7 = cVar10.f3231b;
            int i19 = cVar10.f3232c;
            if (i19 > 0) {
                J2(i17, i6);
                c cVar11 = this.f3214t;
                cVar11.f3237h = i19;
                U1(uVar, cVar11, zVar, false);
                i6 = this.f3214t.f3231b;
            }
        }
        if (J() > 0) {
            if (this.f3218x ^ this.f3219y) {
                int k23 = k2(i6, uVar, zVar, true);
                i8 = i7 + k23;
                i9 = i6 + k23;
                k22 = l2(i8, uVar, zVar, false);
            } else {
                int l22 = l2(i7, uVar, zVar, true);
                i8 = i7 + l22;
                i9 = i6 + l22;
                k22 = k2(i9, uVar, zVar, false);
            }
            i7 = i8 + k22;
            i6 = i9 + k22;
        }
        t2(uVar, zVar, i7, i6);
        if (zVar.e()) {
            this.E.e();
        } else {
            this.f3215u.s();
        }
        this.f3216v = this.f3219y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View X1(boolean z5, boolean z6) {
        int J;
        int i6;
        if (this.f3218x) {
            J = 0;
            i6 = J();
        } else {
            J = J() - 1;
            i6 = -1;
        }
        return e2(J, i6, z5, z6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Y0(RecyclerView.z zVar) {
        super.Y0(zVar);
        this.D = null;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.E.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View Y1(boolean z5, boolean z6) {
        int i6;
        int J;
        if (this.f3218x) {
            i6 = J() - 1;
            J = -1;
        } else {
            i6 = 0;
            J = J();
        }
        return e2(i6, J, z5, z6);
    }

    public int Z1() {
        View e22 = e2(0, J(), false, true);
        if (e22 == null) {
            return -1;
        }
        return h0(e22);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y.b
    public PointF a(int i6) {
        if (J() == 0) {
            return null;
        }
        int i7 = (i6 < h0(I(0))) != this.f3218x ? -1 : 1;
        return this.f3213s == 0 ? new PointF(i7, 0.0f) : new PointF(0.0f, i7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void c1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.D = (d) parcelable;
            t1();
        }
    }

    public int c2() {
        View e22 = e2(J() - 1, -1, false, true);
        if (e22 == null) {
            return -1;
        }
        return h0(e22);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable d1() {
        if (this.D != null) {
            return new d(this.D);
        }
        d dVar = new d();
        if (J() > 0) {
            T1();
            boolean z5 = this.f3216v ^ this.f3218x;
            dVar.f3245c = z5;
            if (z5) {
                View m22 = m2();
                dVar.f3244b = this.f3215u.i() - this.f3215u.d(m22);
                dVar.f3243a = h0(m22);
            } else {
                View n22 = n2();
                dVar.f3243a = h0(n22);
                dVar.f3244b = this.f3215u.g(n22) - this.f3215u.m();
            }
        } else {
            dVar.b();
        }
        return dVar;
    }

    View d2(int i6, int i7) {
        int i8;
        int i9;
        T1();
        if ((i7 > i6 ? (char) 1 : i7 < i6 ? (char) 65535 : (char) 0) == 0) {
            return I(i6);
        }
        if (this.f3215u.g(I(i6)) < this.f3215u.m()) {
            i8 = 16644;
            i9 = 16388;
        } else {
            i8 = 4161;
            i9 = 4097;
        }
        return (this.f3213s == 0 ? this.f3346e : this.f3347f).a(i6, i7, i8, i9);
    }

    View e2(int i6, int i7, boolean z5, boolean z6) {
        T1();
        return (this.f3213s == 0 ? this.f3346e : this.f3347f).a(i6, i7, z5 ? 24579 : 320, z6 ? 320 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g(String str) {
        if (this.D == null) {
            super.g(str);
        }
    }

    View h2(RecyclerView.u uVar, RecyclerView.z zVar, int i6, int i7, int i8) {
        T1();
        int m6 = this.f3215u.m();
        int i9 = this.f3215u.i();
        int i10 = i7 > i6 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i6 != i7) {
            View I = I(i6);
            int h02 = h0(I);
            if (h02 >= 0 && h02 < i8) {
                if (((RecyclerView.p) I.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = I;
                    }
                } else {
                    if (this.f3215u.g(I) < i9 && this.f3215u.d(I) >= m6) {
                        return I;
                    }
                    if (view == null) {
                        view = I;
                    }
                }
            }
            i6 += i10;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean k() {
        return this.f3213s == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean l() {
        return this.f3213s == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void o(int i6, int i7, RecyclerView.z zVar, RecyclerView.o.c cVar) {
        if (this.f3213s != 0) {
            i6 = i7;
        }
        if (J() == 0 || i6 == 0) {
            return;
        }
        T1();
        I2(i6 > 0 ? 1 : -1, Math.abs(i6), true, zVar);
        N1(zVar, this.f3214t, cVar);
    }

    protected int o2(RecyclerView.z zVar) {
        if (zVar.d()) {
            return this.f3215u.n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void p(int i6, RecyclerView.o.c cVar) {
        boolean z5;
        int i7;
        d dVar = this.D;
        if (dVar == null || !dVar.a()) {
            A2();
            z5 = this.f3218x;
            i7 = this.A;
            if (i7 == -1) {
                i7 = z5 ? i6 - 1 : 0;
            }
        } else {
            d dVar2 = this.D;
            z5 = dVar2.f3245c;
            i7 = dVar2.f3243a;
        }
        int i8 = z5 ? -1 : 1;
        for (int i9 = 0; i9 < this.G && i7 >= 0 && i7 < i6; i9++) {
            cVar.a(i7, 0);
            i7 += i8;
        }
    }

    public int p2() {
        return this.f3213s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int q(RecyclerView.z zVar) {
        return O1(zVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean q2() {
        return Z() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int r(RecyclerView.z zVar) {
        return P1(zVar);
    }

    public boolean r2() {
        return this.f3220z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int s(RecyclerView.z zVar) {
        return Q1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean s0() {
        return true;
    }

    void s2(RecyclerView.u uVar, RecyclerView.z zVar, c cVar, b bVar) {
        int i6;
        int i7;
        int i8;
        int i9;
        int f6;
        View d6 = cVar.d(uVar);
        if (d6 == null) {
            bVar.f3227b = true;
            return;
        }
        RecyclerView.p pVar = (RecyclerView.p) d6.getLayoutParams();
        if (cVar.f3241l == null) {
            if (this.f3218x == (cVar.f3235f == -1)) {
                d(d6);
            } else {
                e(d6, 0);
            }
        } else {
            if (this.f3218x == (cVar.f3235f == -1)) {
                b(d6);
            } else {
                c(d6, 0);
            }
        }
        A0(d6, 0, 0);
        bVar.f3226a = this.f3215u.e(d6);
        if (this.f3213s == 1) {
            if (q2()) {
                f6 = o0() - f0();
                i9 = f6 - this.f3215u.f(d6);
            } else {
                i9 = e0();
                f6 = this.f3215u.f(d6) + i9;
            }
            int i10 = cVar.f3235f;
            int i11 = cVar.f3231b;
            if (i10 == -1) {
                i8 = i11;
                i7 = f6;
                i6 = i11 - bVar.f3226a;
            } else {
                i6 = i11;
                i7 = f6;
                i8 = bVar.f3226a + i11;
            }
        } else {
            int g02 = g0();
            int f7 = this.f3215u.f(d6) + g02;
            int i12 = cVar.f3235f;
            int i13 = cVar.f3231b;
            if (i12 == -1) {
                i7 = i13;
                i6 = g02;
                i8 = f7;
                i9 = i13 - bVar.f3226a;
            } else {
                i6 = g02;
                i7 = bVar.f3226a + i13;
                i8 = f7;
                i9 = i13;
            }
        }
        z0(d6, i9, i6, i7, i8);
        if (pVar.c() || pVar.b()) {
            bVar.f3228c = true;
        }
        bVar.f3229d = d6.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int t(RecyclerView.z zVar) {
        return O1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int u(RecyclerView.z zVar) {
        return P1(zVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u2(RecyclerView.u uVar, RecyclerView.z zVar, a aVar, int i6) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int v(RecyclerView.z zVar) {
        return Q1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int w1(int i6, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.f3213s == 1) {
            return 0;
        }
        return B2(i6, uVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void x1(int i6) {
        this.A = i6;
        this.B = Integer.MIN_VALUE;
        d dVar = this.D;
        if (dVar != null) {
            dVar.b();
        }
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int y1(int i6, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.f3213s == 0) {
            return 0;
        }
        return B2(i6, uVar, zVar);
    }

    boolean z2() {
        return this.f3215u.k() == 0 && this.f3215u.h() == 0;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i6, int i7) {
        this.f3213s = 1;
        this.f3217w = false;
        this.f3218x = false;
        this.f3219y = false;
        this.f3220z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        RecyclerView.o.d i02 = RecyclerView.o.i0(context, attributeSet, i6, i7);
        C2(i02.f3362a);
        D2(i02.f3364c);
        E2(i02.f3365d);
    }
}
