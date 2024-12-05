package c.s;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewOverlayApi14.java */
/* loaded from: classes.dex */
public class z implements b0 {
    protected a a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewOverlayApi14.java */
    /* loaded from: classes.dex */
    public static class a extends ViewGroup {

        /* renamed from: f, reason: collision with root package name */
        static Method f3039f;

        /* renamed from: g, reason: collision with root package name */
        ViewGroup f3040g;

        /* renamed from: h, reason: collision with root package name */
        View f3041h;

        /* renamed from: i, reason: collision with root package name */
        ArrayList<Drawable> f3042i;

        /* renamed from: j, reason: collision with root package name */
        z f3043j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f3044k;

        static {
            try {
                Class cls = Integer.TYPE;
                f3039f = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", cls, cls, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        a(Context context, ViewGroup viewGroup, View view, z zVar) {
            super(context);
            this.f3042i = null;
            this.f3040g = viewGroup;
            this.f3041h = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f3043j = zVar;
        }

        private void c() {
            if (this.f3044k) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        private void d() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f3042i;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f3044k = true;
                    this.f3040g.removeView(this);
                }
            }
        }

        private void e(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f3040g.getLocationOnScreen(iArr2);
            this.f3041h.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        public void a(Drawable drawable) {
            c();
            if (this.f3042i == null) {
                this.f3042i = new ArrayList<>();
            }
            if (this.f3042i.contains(drawable)) {
                return;
            }
            this.f3042i.add(drawable);
            invalidate(drawable.getBounds());
            drawable.setCallback(this);
        }

        public void b(View view) {
            c();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != this.f3040g && viewGroup.getParent() != null && androidx.core.view.u.N(viewGroup)) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f3040g.getLocationOnScreen(iArr2);
                    androidx.core.view.u.T(view, iArr[0] - iArr2[0]);
                    androidx.core.view.u.U(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            this.f3040g.getLocationOnScreen(new int[2]);
            this.f3041h.getLocationOnScreen(new int[2]);
            canvas.translate(r0[0] - r1[0], r0[1] - r1[1]);
            canvas.clipRect(new Rect(0, 0, this.f3041h.getWidth(), this.f3041h.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f3042i;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f3042i.get(i2).draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public void f(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f3042i;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
                d();
            }
        }

        public void g(View view) {
            super.removeView(view);
            d();
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f3040g == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.f3040g instanceof ViewGroup) {
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                e(iArr2);
                rect.offset(iArr2[0], iArr2[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            invalidate(rect);
            return null;
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        }

        @Override // android.view.View
        protected boolean verifyDrawable(Drawable drawable) {
            ArrayList<Drawable> arrayList;
            return super.verifyDrawable(drawable) || ((arrayList = this.f3042i) != null && arrayList.contains(drawable));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(Context context, ViewGroup viewGroup, View view) {
        this.a = new a(context, viewGroup, view, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static z e(View view) {
        ViewGroup f2 = f(view);
        if (f2 == null) {
            return null;
        }
        int childCount = f2.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = f2.getChildAt(i2);
            if (childAt instanceof a) {
                return ((a) childAt).f3043j;
            }
        }
        return new u(f2.getContext(), f2, view);
    }

    static ViewGroup f(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    @Override // c.s.b0
    public void a(Drawable drawable) {
        this.a.a(drawable);
    }

    @Override // c.s.b0
    public void b(Drawable drawable) {
        this.a.f(drawable);
    }
}
