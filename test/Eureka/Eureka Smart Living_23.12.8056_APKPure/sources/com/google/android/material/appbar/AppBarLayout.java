package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.f0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.g0;
import androidx.core.view.b1;
import java.lang.ref.WeakReference;
import java.util.List;
import m2.j;

/* loaded from: classes.dex */
public abstract class AppBarLayout extends LinearLayout {

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends com.google.android.material.appbar.a {

        /* renamed from: k, reason: collision with root package name */
        private int f4650k;

        /* renamed from: l, reason: collision with root package name */
        private int f4651l;

        /* renamed from: m, reason: collision with root package name */
        private a f4652m;

        /* renamed from: n, reason: collision with root package name */
        private WeakReference f4653n;

        /* JADX INFO: Access modifiers changed from: protected */
        /* loaded from: classes.dex */
        public static class a extends x.a {
            public static final Parcelable.Creator<a> CREATOR = new C0079a();

            /* renamed from: c, reason: collision with root package name */
            boolean f4654c;

            /* renamed from: d, reason: collision with root package name */
            boolean f4655d;

            /* renamed from: e, reason: collision with root package name */
            int f4656e;

            /* renamed from: f, reason: collision with root package name */
            float f4657f;

            /* renamed from: g, reason: collision with root package name */
            boolean f4658g;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            class C0079a implements Parcelable.ClassLoaderCreator {
                C0079a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new a(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public a[] newArray(int i6) {
                    return new a[i6];
                }
            }

            public a(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f4654c = parcel.readByte() != 0;
                this.f4655d = parcel.readByte() != 0;
                this.f4656e = parcel.readInt();
                this.f4657f = parcel.readFloat();
                this.f4658g = parcel.readByte() != 0;
            }

            @Override // x.a, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i6) {
                super.writeToParcel(parcel, i6);
                parcel.writeByte(this.f4654c ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f4655d ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f4656e);
                parcel.writeFloat(this.f4657f);
                parcel.writeByte(this.f4658g ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        private void g0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            throw null;
        }

        private void h0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            b1.k0(coordinatorLayout, g0.a.f2292q.b());
            b1.k0(coordinatorLayout, g0.a.f2293r.b());
            throw null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i6, int i7) {
            f0.a(view);
            return b0(coordinatorLayout, null, view2, view3, i6, i7);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ void C(CoordinatorLayout coordinatorLayout, View view, View view2, int i6) {
            f0.a(view);
            c0(coordinatorLayout, null, view2, i6);
        }

        @Override // com.google.android.material.appbar.a
        /* bridge */ /* synthetic */ boolean G(View view) {
            f0.a(view);
            return R(null);
        }

        @Override // com.google.android.material.appbar.a
        /* bridge */ /* synthetic */ int J(View view) {
            f0.a(view);
            return S(null);
        }

        @Override // com.google.android.material.appbar.a
        /* bridge */ /* synthetic */ int K(View view) {
            f0.a(view);
            return T(null);
        }

        @Override // com.google.android.material.appbar.a
        int L() {
            return E() + this.f4650k;
        }

        @Override // com.google.android.material.appbar.a
        /* bridge */ /* synthetic */ void M(CoordinatorLayout coordinatorLayout, View view) {
            f0.a(view);
            U(coordinatorLayout, null);
        }

        @Override // com.google.android.material.appbar.a
        /* bridge */ /* synthetic */ int P(CoordinatorLayout coordinatorLayout, View view, int i6, int i7, int i8) {
            f0.a(view);
            return f0(coordinatorLayout, null, i6, i7, i8);
        }

        boolean R(AppBarLayout appBarLayout) {
            WeakReference weakReference = this.f4653n;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        int S(AppBarLayout appBarLayout) {
            throw null;
        }

        int T(AppBarLayout appBarLayout) {
            throw null;
        }

        void U(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            g0(coordinatorLayout, appBarLayout);
            throw null;
        }

        public boolean V(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i6) {
            super.l(coordinatorLayout, appBarLayout, i6);
            throw null;
        }

        public boolean W(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i6, int i7, int i8, int i9) {
            throw null;
        }

        public void X(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i6, int i7, int[] iArr, int i8) {
            throw null;
        }

        public void Y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i6, int i7, int i8, int i9, int i10, int[] iArr) {
            if (i9 < 0) {
                throw null;
            }
            if (i9 == 0) {
                h0(coordinatorLayout, appBarLayout);
            }
        }

        public void Z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof a) {
                d0((a) parcelable, true);
                super.x(coordinatorLayout, appBarLayout, this.f4652m.a());
            } else {
                super.x(coordinatorLayout, appBarLayout, parcelable);
                this.f4652m = null;
            }
        }

        public Parcelable a0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            Parcelable y5 = super.y(coordinatorLayout, appBarLayout);
            a e02 = e0(y5, appBarLayout);
            return e02 == null ? y5 : e02;
        }

        public boolean b0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i6, int i7) {
            if ((i6 & 2) != 0) {
                throw null;
            }
            this.f4653n = null;
            this.f4651l = i7;
            return false;
        }

        public void c0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i6) {
            if (this.f4651l == 0 || i6 == 1) {
                g0(coordinatorLayout, appBarLayout);
                throw null;
            }
            this.f4653n = new WeakReference(view);
        }

        void d0(a aVar, boolean z5) {
            if (this.f4652m == null || z5) {
                this.f4652m = aVar;
            }
        }

        a e0(Parcelable parcelable, AppBarLayout appBarLayout) {
            E();
            throw null;
        }

        int f0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i6, int i7, int i8) {
            int L = L();
            if (i7 == 0 || L < i7 || L > i8) {
                this.f4650k = 0;
            } else if (L != u.a.b(i6, i7, i8)) {
                throw null;
            }
            h0(coordinatorLayout, appBarLayout);
            return 0;
        }

        @Override // com.google.android.material.appbar.c, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i6) {
            f0.a(view);
            return V(coordinatorLayout, null, i6);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, View view, int i6, int i7, int i8, int i9) {
            f0.a(view);
            return W(coordinatorLayout, null, i6, i7, i8, i9);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i6, int i7, int[] iArr, int i8) {
            f0.a(view);
            X(coordinatorLayout, null, view2, i6, i7, iArr, i8);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i6, int i7, int i8, int i9, int i10, int[] iArr) {
            f0.a(view);
            Y(coordinatorLayout, null, view2, i6, i7, i8, i9, i10, iArr);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            f0.a(view);
            Z(coordinatorLayout, null, parcelable);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
            f0.a(view);
            return a0(coordinatorLayout, null);
        }
    }

    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.appbar.a, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.D(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.c
        public /* bridge */ /* synthetic */ int E() {
            return super.E();
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean V(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i6) {
            return super.V(coordinatorLayout, appBarLayout, i6);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean W(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i6, int i7, int i8, int i9) {
            return super.W(coordinatorLayout, appBarLayout, i6, i7, i8, i9);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void X(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i6, int i7, int[] iArr, int i8) {
            super.X(coordinatorLayout, appBarLayout, view, i6, i7, iArr, i8);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void Y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i6, int i7, int i8, int i9, int i10, int[] iArr) {
            super.Y(coordinatorLayout, appBarLayout, view, i6, i7, i8, i9, i10, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void Z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.Z(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ Parcelable a0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.a0(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean b0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i6, int i7) {
            return super.b0(coordinatorLayout, appBarLayout, view, view2, i6, i7);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void c0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i6) {
            super.c0(coordinatorLayout, appBarLayout, view, i6);
        }

        @Override // com.google.android.material.appbar.a, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.k(coordinatorLayout, view, motionEvent);
        }
    }

    /* loaded from: classes.dex */
    public static class ScrollingViewBehavior extends b {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f7705a4);
            M(obtainStyledAttributes.getDimensionPixelSize(j.f7712b4, 0));
            obtainStyledAttributes.recycle();
        }

        private void P(View view, View view2) {
            CoordinatorLayout.b e6 = ((CoordinatorLayout.e) view2.getLayoutParams()).e();
            if (e6 instanceof BaseBehavior) {
                b1.b0(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) e6).f4650k) + K()) - H(view2));
            }
        }

        private void Q(View view, View view2) {
        }

        @Override // com.google.android.material.appbar.b
        /* bridge */ /* synthetic */ View G(List list) {
            O(list);
            return null;
        }

        @Override // com.google.android.material.appbar.b
        float I(View view) {
            return 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.b
        public int J(View view) {
            return super.J(view);
        }

        AppBarLayout O(List list) {
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            P(view, view2);
            Q(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        @Override // com.google.android.material.appbar.c, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i6) {
            return super.l(coordinatorLayout, view, i6);
        }

        @Override // com.google.android.material.appbar.b, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, View view, int i6, int i7, int i8, int i9) {
            return super.m(coordinatorLayout, view, i6, i7, i8, i9);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z5) {
            O(coordinatorLayout.r(view));
            return false;
        }
    }
}
