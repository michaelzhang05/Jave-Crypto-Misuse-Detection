package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.u;
import com.google.android.material.internal.h;
import com.google.android.material.internal.j;
import e.e.b.b.b;
import e.e.b.b.d;
import e.e.b.b.i;
import e.e.b.b.k;
import e.e.b.b.z.g;
import java.lang.ref.WeakReference;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public class BadgeDrawable extends Drawable implements h.b {

    /* renamed from: f, reason: collision with root package name */
    private static final int f16400f = k.n;

    /* renamed from: g, reason: collision with root package name */
    private static final int f16401g = b.f17422c;

    /* renamed from: h, reason: collision with root package name */
    private final WeakReference<Context> f16402h;

    /* renamed from: i, reason: collision with root package name */
    private final g f16403i;

    /* renamed from: j, reason: collision with root package name */
    private final h f16404j;

    /* renamed from: k, reason: collision with root package name */
    private final Rect f16405k;
    private final float l;
    private final float m;
    private final float n;
    private final SavedState o;
    private float p;
    private float q;
    private int r;
    private float s;
    private float t;
    private float u;
    private WeakReference<View> v;
    private WeakReference<ViewGroup> w;

    private BadgeDrawable(Context context) {
        this.f16402h = new WeakReference<>(context);
        j.c(context);
        Resources resources = context.getResources();
        this.f16405k = new Rect();
        this.f16403i = new g();
        this.l = resources.getDimensionPixelSize(d.s);
        this.n = resources.getDimensionPixelSize(d.r);
        this.m = resources.getDimensionPixelSize(d.u);
        h hVar = new h(this);
        this.f16404j = hVar;
        hVar.e().setTextAlign(Paint.Align.CENTER);
        this.o = new SavedState(context);
        s(k.f17488d);
    }

    private void b(Context context, Rect rect, View view) {
        int i2 = this.o.n;
        if (i2 == 8388691 || i2 == 8388693) {
            this.q = rect.bottom - this.o.p;
        } else {
            this.q = rect.top + this.o.p;
        }
        if (h() <= 9) {
            float f2 = !j() ? this.l : this.m;
            this.s = f2;
            this.u = f2;
            this.t = f2;
        } else {
            float f3 = this.m;
            this.s = f3;
            this.u = f3;
            this.t = (this.f16404j.f(e()) / 2.0f) + this.n;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(j() ? d.t : d.q);
        int i3 = this.o.n;
        if (i3 != 8388659 && i3 != 8388691) {
            this.p = u.y(view) == 0 ? ((rect.right + this.t) - dimensionPixelSize) - this.o.o : (rect.left - this.t) + dimensionPixelSize + this.o.o;
        } else {
            this.p = u.y(view) == 0 ? (rect.left - this.t) + dimensionPixelSize + this.o.o : ((rect.right + this.t) - dimensionPixelSize) - this.o.o;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static BadgeDrawable c(Context context, SavedState savedState) {
        BadgeDrawable badgeDrawable = new BadgeDrawable(context);
        badgeDrawable.k(savedState);
        return badgeDrawable;
    }

    private void d(Canvas canvas) {
        Rect rect = new Rect();
        String e2 = e();
        this.f16404j.e().getTextBounds(e2, 0, e2.length(), rect);
        canvas.drawText(e2, this.p, this.q + (rect.height() / 2), this.f16404j.e());
    }

    private String e() {
        if (h() <= this.r) {
            return Integer.toString(h());
        }
        Context context = this.f16402h.get();
        return context == null ? HttpUrl.FRAGMENT_ENCODE_SET : context.getString(e.e.b.b.j.f17485k, Integer.valueOf(this.r), "+");
    }

    private void k(SavedState savedState) {
        p(savedState.f16410j);
        if (savedState.f16409i != -1) {
            q(savedState.f16409i);
        }
        l(savedState.f16406f);
        n(savedState.f16407g);
        m(savedState.n);
        o(savedState.o);
        t(savedState.p);
    }

    private void r(e.e.b.b.w.d dVar) {
        Context context;
        if (this.f16404j.d() == dVar || (context = this.f16402h.get()) == null) {
            return;
        }
        this.f16404j.h(dVar, context);
        v();
    }

    private void s(int i2) {
        Context context = this.f16402h.get();
        if (context == null) {
            return;
        }
        r(new e.e.b.b.w.d(context, i2));
    }

    private void v() {
        Context context = this.f16402h.get();
        WeakReference<View> weakReference = this.v;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f16405k);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference<ViewGroup> weakReference2 = this.w;
        ViewGroup viewGroup = weakReference2 != null ? weakReference2.get() : null;
        if (viewGroup != null || a.a) {
            if (viewGroup == null) {
                viewGroup = (ViewGroup) view.getParent();
            }
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        }
        b(context, rect2, view);
        a.f(this.f16405k, this.p, this.q, this.t, this.u);
        this.f16403i.V(this.s);
        if (rect.equals(this.f16405k)) {
            return;
        }
        this.f16403i.setBounds(this.f16405k);
    }

    private void w() {
        Double.isNaN(g());
        this.r = ((int) Math.pow(10.0d, r0 - 1.0d)) - 1;
    }

    @Override // com.google.android.material.internal.h.b
    public void a() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f16403i.draw(canvas);
        if (j()) {
            d(canvas);
        }
    }

    public CharSequence f() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (j()) {
            if (this.o.l <= 0 || (context = this.f16402h.get()) == null) {
                return null;
            }
            if (h() <= this.r) {
                return context.getResources().getQuantityString(this.o.l, h(), Integer.valueOf(h()));
            }
            return context.getString(this.o.m, Integer.valueOf(this.r));
        }
        return this.o.f16411k;
    }

    public int g() {
        return this.o.f16410j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.o.f16408h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f16405k.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f16405k.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public int h() {
        if (j()) {
            return this.o.f16409i;
        }
        return 0;
    }

    public SavedState i() {
        return this.o;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    public boolean j() {
        return this.o.f16409i != -1;
    }

    public void l(int i2) {
        this.o.f16406f = i2;
        ColorStateList valueOf = ColorStateList.valueOf(i2);
        if (this.f16403i.x() != valueOf) {
            this.f16403i.X(valueOf);
            invalidateSelf();
        }
    }

    public void m(int i2) {
        if (this.o.n != i2) {
            this.o.n = i2;
            WeakReference<View> weakReference = this.v;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            View view = this.v.get();
            WeakReference<ViewGroup> weakReference2 = this.w;
            u(view, weakReference2 != null ? weakReference2.get() : null);
        }
    }

    public void n(int i2) {
        this.o.f16407g = i2;
        if (this.f16404j.e().getColor() != i2) {
            this.f16404j.e().setColor(i2);
            invalidateSelf();
        }
    }

    public void o(int i2) {
        this.o.o = i2;
        v();
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.h.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public void p(int i2) {
        if (this.o.f16410j != i2) {
            this.o.f16410j = i2;
            w();
            this.f16404j.i(true);
            v();
            invalidateSelf();
        }
    }

    public void q(int i2) {
        int max = Math.max(0, i2);
        if (this.o.f16409i != max) {
            this.o.f16409i = max;
            this.f16404j.i(true);
            v();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.o.f16408h = i2;
        this.f16404j.e().setAlpha(i2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void t(int i2) {
        this.o.p = i2;
        v();
    }

    public void u(View view, ViewGroup viewGroup) {
        this.v = new WeakReference<>(view);
        this.w = new WeakReference<>(viewGroup);
        v();
        invalidateSelf();
    }

    /* loaded from: classes2.dex */
    public static final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: f, reason: collision with root package name */
        private int f16406f;

        /* renamed from: g, reason: collision with root package name */
        private int f16407g;

        /* renamed from: h, reason: collision with root package name */
        private int f16408h;

        /* renamed from: i, reason: collision with root package name */
        private int f16409i;

        /* renamed from: j, reason: collision with root package name */
        private int f16410j;

        /* renamed from: k, reason: collision with root package name */
        private CharSequence f16411k;
        private int l;
        private int m;
        private int n;
        private int o;
        private int p;

        /* loaded from: classes2.dex */
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

        public SavedState(Context context) {
            this.f16408h = 255;
            this.f16409i = -1;
            this.f16407g = new e.e.b.b.w.d(context, k.f17488d).f17537b.getDefaultColor();
            this.f16411k = context.getString(e.e.b.b.j.f17482h);
            this.l = i.a;
            this.m = e.e.b.b.j.f17484j;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f16406f);
            parcel.writeInt(this.f16407g);
            parcel.writeInt(this.f16408h);
            parcel.writeInt(this.f16409i);
            parcel.writeInt(this.f16410j);
            parcel.writeString(this.f16411k.toString());
            parcel.writeInt(this.l);
            parcel.writeInt(this.n);
            parcel.writeInt(this.o);
            parcel.writeInt(this.p);
        }

        protected SavedState(Parcel parcel) {
            this.f16408h = 255;
            this.f16409i = -1;
            this.f16406f = parcel.readInt();
            this.f16407g = parcel.readInt();
            this.f16408h = parcel.readInt();
            this.f16409i = parcel.readInt();
            this.f16410j = parcel.readInt();
            this.f16411k = parcel.readString();
            this.l = parcel.readInt();
            this.n = parcel.readInt();
            this.o = parcel.readInt();
            this.p = parcel.readInt();
        }
    }
}
