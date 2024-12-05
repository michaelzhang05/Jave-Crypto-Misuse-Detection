package m0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.b1;
import java.util.Map;

/* loaded from: classes.dex */
public class c extends l {
    private static final String[] M = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property N = new b(PointF.class, "boundsOrigin");
    private static final Property O = new C0116c(PointF.class, "topLeft");
    private static final Property P = new d(PointF.class, "bottomRight");
    private static final Property Q = new e(PointF.class, "bottomRight");
    private static final Property R = new f(PointF.class, "topLeft");
    private static final Property S = new g(PointF.class, "position");
    private static m0.j T = new m0.j();
    private int[] J = new int[2];
    private boolean K = false;
    private boolean L = false;

    /* loaded from: classes.dex */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f7419a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ BitmapDrawable f7420b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f7421c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f7422d;

        a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f6) {
            this.f7419a = viewGroup;
            this.f7420b = bitmapDrawable;
            this.f7421c = view;
            this.f7422d = f6;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a0.b(this.f7419a).d(this.f7420b);
            a0.g(this.f7421c, this.f7422d);
        }
    }

    /* loaded from: classes.dex */
    static class b extends Property {

        /* renamed from: a, reason: collision with root package name */
        private Rect f7424a;

        b(Class cls, String str) {
            super(cls, str);
            this.f7424a = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f7424a);
            Rect rect = this.f7424a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f7424a);
            this.f7424a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f7424a);
        }
    }

    /* renamed from: m0.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0116c extends Property {
        C0116c(Class cls, String str) {
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

    /* loaded from: classes.dex */
    static class d extends Property {
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

    /* loaded from: classes.dex */
    static class e extends Property {
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
            a0.f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* loaded from: classes.dex */
    static class f extends Property {
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
            a0.f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* loaded from: classes.dex */
    static class g extends Property {
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
            a0.f(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* loaded from: classes.dex */
    class h extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f7425a;
        private k mViewBounds;

        h(k kVar) {
            this.f7425a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* loaded from: classes.dex */
    class i extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f7427a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f7428b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Rect f7429c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f7430d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f7431e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f7432f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f7433g;

        i(View view, Rect rect, int i6, int i7, int i8, int i9) {
            this.f7428b = view;
            this.f7429c = rect;
            this.f7430d = i6;
            this.f7431e = i7;
            this.f7432f = i8;
            this.f7433g = i9;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f7427a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f7427a) {
                return;
            }
            b1.x0(this.f7428b, this.f7429c);
            a0.f(this.f7428b, this.f7430d, this.f7431e, this.f7432f, this.f7433g);
        }
    }

    /* loaded from: classes.dex */
    class j extends m {

        /* renamed from: a, reason: collision with root package name */
        boolean f7435a = false;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f7436b;

        j(ViewGroup viewGroup) {
            this.f7436b = viewGroup;
        }

        @Override // m0.m, m0.l.f
        public void b(l lVar) {
            x.c(this.f7436b, false);
            this.f7435a = true;
        }

        @Override // m0.m, m0.l.f
        public void c(l lVar) {
            x.c(this.f7436b, false);
        }

        @Override // m0.l.f
        public void d(l lVar) {
            if (!this.f7435a) {
                x.c(this.f7436b, false);
            }
            lVar.Q(this);
        }

        @Override // m0.m, m0.l.f
        public void e(l lVar) {
            x.c(this.f7436b, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class k {

        /* renamed from: a, reason: collision with root package name */
        private int f7438a;

        /* renamed from: b, reason: collision with root package name */
        private int f7439b;

        /* renamed from: c, reason: collision with root package name */
        private int f7440c;

        /* renamed from: d, reason: collision with root package name */
        private int f7441d;

        /* renamed from: e, reason: collision with root package name */
        private View f7442e;

        /* renamed from: f, reason: collision with root package name */
        private int f7443f;

        /* renamed from: g, reason: collision with root package name */
        private int f7444g;

        k(View view) {
            this.f7442e = view;
        }

        private void b() {
            a0.f(this.f7442e, this.f7438a, this.f7439b, this.f7440c, this.f7441d);
            this.f7443f = 0;
            this.f7444g = 0;
        }

        void a(PointF pointF) {
            this.f7440c = Math.round(pointF.x);
            this.f7441d = Math.round(pointF.y);
            int i6 = this.f7444g + 1;
            this.f7444g = i6;
            if (this.f7443f == i6) {
                b();
            }
        }

        void c(PointF pointF) {
            this.f7438a = Math.round(pointF.x);
            this.f7439b = Math.round(pointF.y);
            int i6 = this.f7443f + 1;
            this.f7443f = i6;
            if (i6 == this.f7444g) {
                b();
            }
        }
    }

    private void d0(s sVar) {
        View view = sVar.f7538b;
        if (!b1.U(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        sVar.f7537a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        sVar.f7537a.put("android:changeBounds:parent", sVar.f7538b.getParent());
        if (this.L) {
            sVar.f7538b.getLocationInWindow(this.J);
            sVar.f7537a.put("android:changeBounds:windowX", Integer.valueOf(this.J[0]));
            sVar.f7537a.put("android:changeBounds:windowY", Integer.valueOf(this.J[1]));
        }
        if (this.K) {
            sVar.f7537a.put("android:changeBounds:clip", b1.w(view));
        }
    }

    private boolean e0(View view, View view2) {
        if (!this.L) {
            return true;
        }
        s u5 = u(view, true);
        if (u5 == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == u5.f7538b) {
            return true;
        }
        return false;
    }

    @Override // m0.l
    public String[] E() {
        return M;
    }

    @Override // m0.l
    public void h(s sVar) {
        d0(sVar);
    }

    @Override // m0.l
    public void k(s sVar) {
        d0(sVar);
    }

    @Override // m0.l
    public Animator o(ViewGroup viewGroup, s sVar, s sVar2) {
        int i6;
        View view;
        int i7;
        Rect rect;
        ObjectAnimator objectAnimator;
        Animator c6;
        Path a6;
        Property property;
        if (sVar == null || sVar2 == null) {
            return null;
        }
        Map map = sVar.f7537a;
        Map map2 = sVar2.f7537a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = sVar2.f7538b;
        if (!e0(viewGroup2, viewGroup3)) {
            int intValue = ((Integer) sVar.f7537a.get("android:changeBounds:windowX")).intValue();
            int intValue2 = ((Integer) sVar.f7537a.get("android:changeBounds:windowY")).intValue();
            int intValue3 = ((Integer) sVar2.f7537a.get("android:changeBounds:windowX")).intValue();
            int intValue4 = ((Integer) sVar2.f7537a.get("android:changeBounds:windowY")).intValue();
            if (intValue == intValue3 && intValue2 == intValue4) {
                return null;
            }
            viewGroup.getLocationInWindow(this.J);
            Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
            view2.draw(new Canvas(createBitmap));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
            float c7 = a0.c(view2);
            a0.g(view2, 0.0f);
            a0.b(viewGroup).b(bitmapDrawable);
            m0.g w5 = w();
            int[] iArr = this.J;
            int i8 = iArr[0];
            int i9 = iArr[1];
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, m0.h.a(N, w5.a(intValue - i8, intValue2 - i9, intValue3 - i8, intValue4 - i9)));
            ofPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, c7));
            return ofPropertyValuesHolder;
        }
        Rect rect2 = (Rect) sVar.f7537a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) sVar2.f7537a.get("android:changeBounds:bounds");
        int i10 = rect2.left;
        int i11 = rect3.left;
        int i12 = rect2.top;
        int i13 = rect3.top;
        int i14 = rect2.right;
        int i15 = rect3.right;
        int i16 = rect2.bottom;
        int i17 = rect3.bottom;
        int i18 = i14 - i10;
        int i19 = i16 - i12;
        int i20 = i15 - i11;
        int i21 = i17 - i13;
        Rect rect4 = (Rect) sVar.f7537a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) sVar2.f7537a.get("android:changeBounds:clip");
        if ((i18 == 0 || i19 == 0) && (i20 == 0 || i21 == 0)) {
            i6 = 0;
        } else {
            i6 = (i10 == i11 && i12 == i13) ? 0 : 1;
            if (i14 != i15 || i16 != i17) {
                i6++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i6++;
        }
        if (i6 <= 0) {
            return null;
        }
        if (this.K) {
            view = view2;
            a0.f(view, i10, i12, Math.max(i18, i20) + i10, Math.max(i19, i21) + i12);
            ObjectAnimator a7 = (i10 == i11 && i12 == i13) ? null : m0.f.a(view, S, w().a(i10, i12, i11, i13));
            if (rect4 == null) {
                i7 = 0;
                rect = new Rect(0, 0, i18, i19);
            } else {
                i7 = 0;
                rect = rect4;
            }
            Rect rect6 = rect5 == null ? new Rect(i7, i7, i20, i21) : rect5;
            if (rect.equals(rect6)) {
                objectAnimator = null;
            } else {
                b1.x0(view, rect);
                m0.j jVar = T;
                Object[] objArr = new Object[2];
                objArr[i7] = rect;
                objArr[1] = rect6;
                ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", jVar, objArr);
                ofObject.addListener(new i(view, rect5, i11, i13, i15, i17));
                objectAnimator = ofObject;
            }
            c6 = r.c(a7, objectAnimator);
        } else {
            view = view2;
            a0.f(view, i10, i12, i14, i16);
            if (i6 == 2) {
                if (i18 == i20 && i19 == i21) {
                    a6 = w().a(i10, i12, i11, i13);
                    property = S;
                } else {
                    k kVar = new k(view);
                    ObjectAnimator a8 = m0.f.a(kVar, O, w().a(i10, i12, i11, i13));
                    ObjectAnimator a9 = m0.f.a(kVar, P, w().a(i14, i16, i15, i17));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(a8, a9);
                    animatorSet.addListener(new h(kVar));
                    c6 = animatorSet;
                }
            } else if (i10 == i11 && i12 == i13) {
                a6 = w().a(i14, i16, i15, i17);
                property = Q;
            } else {
                a6 = w().a(i10, i12, i11, i13);
                property = R;
            }
            c6 = m0.f.a(view, property, a6);
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            x.c(viewGroup4, true);
            a(new j(viewGroup4));
        }
        return c6;
    }
}
