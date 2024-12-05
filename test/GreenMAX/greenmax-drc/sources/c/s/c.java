package c.s;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* compiled from: ChangeBounds.java */
/* loaded from: classes.dex */
public class c extends m {
    private static final String[] P = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property<Drawable, PointF> Q = new b(PointF.class, "boundsOrigin");
    private static final Property<k, PointF> R = new C0084c(PointF.class, "topLeft");
    private static final Property<k, PointF> S = new d(PointF.class, "bottomRight");
    private static final Property<View, PointF> T = new e(PointF.class, "bottomRight");
    private static final Property<View, PointF> U = new f(PointF.class, "topLeft");
    private static final Property<View, PointF> V = new g(PointF.class, "position");
    private static c.s.k W = new c.s.k();
    private int[] X = new int[2];
    private boolean Y = false;
    private boolean Z = false;

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    class a extends AnimatorListenerAdapter {
        final /* synthetic */ ViewGroup a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ BitmapDrawable f2947b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f2948c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f2949d;

        a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f2) {
            this.a = viewGroup;
            this.f2947b = bitmapDrawable;
            this.f2948c = view;
            this.f2949d = f2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c0.b(this.a).b(this.f2947b);
            c0.g(this.f2948c, this.f2949d);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    static class b extends Property<Drawable, PointF> {
        private Rect a;

        b(Class cls, String str) {
            super(cls, str);
            this.a = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.a);
            Rect rect = this.a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.a);
            this.a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.a);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: c.s.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0084c extends Property<k, PointF> {
        C0084c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    static class d extends Property<k, PointF> {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    static class e extends Property<View, PointF> {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            c0.f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    static class f extends Property<View, PointF> {
        f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            c0.f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    static class g extends Property<View, PointF> {
        g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            c0.f(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    class h extends AnimatorListenerAdapter {
        final /* synthetic */ k a;
        private k mViewBounds;

        h(k kVar) {
            this.a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    class i extends AnimatorListenerAdapter {
        private boolean a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f2952b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Rect f2953c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f2954d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f2955e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f2956f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f2957g;

        i(View view, Rect rect, int i2, int i3, int i4, int i5) {
            this.f2952b = view;
            this.f2953c = rect;
            this.f2954d = i2;
            this.f2955e = i3;
            this.f2956f = i4;
            this.f2957g = i5;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.a) {
                return;
            }
            androidx.core.view.u.p0(this.f2952b, this.f2953c);
            c0.f(this.f2952b, this.f2954d, this.f2955e, this.f2956f, this.f2957g);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    class j extends n {
        boolean a = false;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f2959b;

        j(ViewGroup viewGroup) {
            this.f2959b = viewGroup;
        }

        @Override // c.s.n, c.s.m.f
        public void b(m mVar) {
            x.c(this.f2959b, false);
        }

        @Override // c.s.m.f
        public void c(m mVar) {
            if (!this.a) {
                x.c(this.f2959b, false);
            }
            mVar.W(this);
        }

        @Override // c.s.n, c.s.m.f
        public void d(m mVar) {
            x.c(this.f2959b, false);
            this.a = true;
        }

        @Override // c.s.n, c.s.m.f
        public void e(m mVar) {
            x.c(this.f2959b, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public static class k {
        private int a;

        /* renamed from: b, reason: collision with root package name */
        private int f2961b;

        /* renamed from: c, reason: collision with root package name */
        private int f2962c;

        /* renamed from: d, reason: collision with root package name */
        private int f2963d;

        /* renamed from: e, reason: collision with root package name */
        private View f2964e;

        /* renamed from: f, reason: collision with root package name */
        private int f2965f;

        /* renamed from: g, reason: collision with root package name */
        private int f2966g;

        k(View view) {
            this.f2964e = view;
        }

        private void b() {
            c0.f(this.f2964e, this.a, this.f2961b, this.f2962c, this.f2963d);
            this.f2965f = 0;
            this.f2966g = 0;
        }

        void a(PointF pointF) {
            this.f2962c = Math.round(pointF.x);
            this.f2963d = Math.round(pointF.y);
            int i2 = this.f2966g + 1;
            this.f2966g = i2;
            if (this.f2965f == i2) {
                b();
            }
        }

        void c(PointF pointF) {
            this.a = Math.round(pointF.x);
            this.f2961b = Math.round(pointF.y);
            int i2 = this.f2965f + 1;
            this.f2965f = i2;
            if (i2 == this.f2966g) {
                b();
            }
        }
    }

    private void l0(s sVar) {
        View view = sVar.f3030b;
        if (!androidx.core.view.u.O(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        sVar.a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        sVar.a.put("android:changeBounds:parent", sVar.f3030b.getParent());
        if (this.Z) {
            sVar.f3030b.getLocationInWindow(this.X);
            sVar.a.put("android:changeBounds:windowX", Integer.valueOf(this.X[0]));
            sVar.a.put("android:changeBounds:windowY", Integer.valueOf(this.X[1]));
        }
        if (this.Y) {
            sVar.a.put("android:changeBounds:clip", androidx.core.view.u.r(view));
        }
    }

    private boolean m0(View view, View view2) {
        if (!this.Z) {
            return true;
        }
        s u = u(view, true);
        if (u == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == u.f3030b) {
            return true;
        }
        return false;
    }

    @Override // c.s.m
    public String[] H() {
        return P;
    }

    @Override // c.s.m
    public void h(s sVar) {
        l0(sVar);
    }

    @Override // c.s.m
    public void k(s sVar) {
        l0(sVar);
    }

    @Override // c.s.m
    public Animator o(ViewGroup viewGroup, s sVar, s sVar2) {
        int i2;
        View view;
        int i3;
        Rect rect;
        ObjectAnimator objectAnimator;
        Animator c2;
        if (sVar == null || sVar2 == null) {
            return null;
        }
        Map<String, Object> map = sVar.a;
        Map<String, Object> map2 = sVar2.a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = sVar2.f3030b;
        if (m0(viewGroup2, viewGroup3)) {
            Rect rect2 = (Rect) sVar.a.get("android:changeBounds:bounds");
            Rect rect3 = (Rect) sVar2.a.get("android:changeBounds:bounds");
            int i4 = rect2.left;
            int i5 = rect3.left;
            int i6 = rect2.top;
            int i7 = rect3.top;
            int i8 = rect2.right;
            int i9 = rect3.right;
            int i10 = rect2.bottom;
            int i11 = rect3.bottom;
            int i12 = i8 - i4;
            int i13 = i10 - i6;
            int i14 = i9 - i5;
            int i15 = i11 - i7;
            Rect rect4 = (Rect) sVar.a.get("android:changeBounds:clip");
            Rect rect5 = (Rect) sVar2.a.get("android:changeBounds:clip");
            if ((i12 == 0 || i13 == 0) && (i14 == 0 || i15 == 0)) {
                i2 = 0;
            } else {
                i2 = (i4 == i5 && i6 == i7) ? 0 : 1;
                if (i8 != i9 || i10 != i11) {
                    i2++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i2++;
            }
            if (i2 <= 0) {
                return null;
            }
            if (!this.Y) {
                view = view2;
                c0.f(view, i4, i6, i8, i10);
                if (i2 == 2) {
                    if (i12 == i14 && i13 == i15) {
                        c2 = c.s.f.a(view, V, x().a(i4, i6, i5, i7));
                    } else {
                        k kVar = new k(view);
                        ObjectAnimator a2 = c.s.f.a(kVar, R, x().a(i4, i6, i5, i7));
                        ObjectAnimator a3 = c.s.f.a(kVar, S, x().a(i8, i10, i9, i11));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(a2, a3);
                        animatorSet.addListener(new h(kVar));
                        c2 = animatorSet;
                    }
                } else if (i4 == i5 && i6 == i7) {
                    c2 = c.s.f.a(view, T, x().a(i8, i10, i9, i11));
                } else {
                    c2 = c.s.f.a(view, U, x().a(i4, i6, i5, i7));
                }
            } else {
                view = view2;
                c0.f(view, i4, i6, Math.max(i12, i14) + i4, Math.max(i13, i15) + i6);
                ObjectAnimator a4 = (i4 == i5 && i6 == i7) ? null : c.s.f.a(view, V, x().a(i4, i6, i5, i7));
                if (rect4 == null) {
                    i3 = 0;
                    rect = new Rect(0, 0, i12, i13);
                } else {
                    i3 = 0;
                    rect = rect4;
                }
                Rect rect6 = rect5 == null ? new Rect(i3, i3, i14, i15) : rect5;
                if (rect.equals(rect6)) {
                    objectAnimator = null;
                } else {
                    androidx.core.view.u.p0(view, rect);
                    c.s.k kVar2 = W;
                    Object[] objArr = new Object[2];
                    objArr[i3] = rect;
                    objArr[1] = rect6;
                    ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", kVar2, objArr);
                    ofObject.addListener(new i(view, rect5, i5, i7, i9, i11));
                    objectAnimator = ofObject;
                }
                c2 = r.c(a4, objectAnimator);
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                x.c(viewGroup4, true);
                b(new j(viewGroup4));
            }
            return c2;
        }
        int intValue = ((Integer) sVar.a.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) sVar.a.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) sVar2.a.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) sVar2.a.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.X);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float c3 = c0.c(view2);
        c0.g(view2, 0.0f);
        c0.b(viewGroup).a(bitmapDrawable);
        c.s.g x = x();
        int[] iArr = this.X;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, c.s.i.a(Q, x.a(intValue - iArr[0], intValue2 - iArr[1], intValue3 - iArr[0], intValue4 - iArr[1])));
        ofPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, c3));
        return ofPropertyValuesHolder;
    }
}
