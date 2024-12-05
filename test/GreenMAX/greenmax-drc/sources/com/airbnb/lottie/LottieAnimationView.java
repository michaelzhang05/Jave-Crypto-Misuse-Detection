package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.JsonReader;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import java.io.StringReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* renamed from: h, reason: collision with root package name */
    private static final String f7886h = LottieAnimationView.class.getSimpleName();

    /* renamed from: i, reason: collision with root package name */
    private final h<d> f7887i;

    /* renamed from: j, reason: collision with root package name */
    private final h<Throwable> f7888j;

    /* renamed from: k, reason: collision with root package name */
    private final f f7889k;
    private String l;
    private int m;
    private boolean n;
    private boolean o;
    private boolean p;
    private Set<i> q;
    private l<d> r;
    private d s;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: f, reason: collision with root package name */
        String f7890f;

        /* renamed from: g, reason: collision with root package name */
        int f7891g;

        /* renamed from: h, reason: collision with root package name */
        float f7892h;

        /* renamed from: i, reason: collision with root package name */
        boolean f7893i;

        /* renamed from: j, reason: collision with root package name */
        String f7894j;

        /* renamed from: k, reason: collision with root package name */
        int f7895k;
        int l;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        /* synthetic */ SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeString(this.f7890f);
            parcel.writeFloat(this.f7892h);
            parcel.writeInt(this.f7893i ? 1 : 0);
            parcel.writeString(this.f7894j);
            parcel.writeInt(this.f7895k);
            parcel.writeInt(this.l);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f7890f = parcel.readString();
            this.f7892h = parcel.readFloat();
            this.f7893i = parcel.readInt() == 1;
            this.f7894j = parcel.readString();
            this.f7895k = parcel.readInt();
            this.l = parcel.readInt();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements h<d> {
        a() {
        }

        @Override // com.airbnb.lottie.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(d dVar) {
            LottieAnimationView.this.setComposition(dVar);
        }
    }

    /* loaded from: classes.dex */
    class b implements h<Throwable> {
        b() {
        }

        @Override // com.airbnb.lottie.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Throwable th) {
            throw new IllegalStateException("Unable to parse composition", th);
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.f7887i = new a();
        this.f7888j = new b();
        this.f7889k = new f();
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = new HashSet();
        i(null);
    }

    private void e() {
        l<d> lVar = this.r;
        if (lVar != null) {
            lVar.m(this.f7887i);
            this.r.l(this.f7888j);
        }
    }

    private void f() {
        this.s = null;
        this.f7889k.f();
    }

    private void h() {
        setLayerType(this.p && this.f7889k.B() ? 2 : 1, null);
    }

    private void i(AttributeSet attributeSet) {
        String string;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, n.w);
        if (!isInEditMode()) {
            int i2 = n.E;
            boolean hasValue = obtainStyledAttributes.hasValue(i2);
            int i3 = n.A;
            boolean hasValue2 = obtainStyledAttributes.hasValue(i3);
            int i4 = n.I;
            boolean hasValue3 = obtainStyledAttributes.hasValue(i4);
            if (hasValue && hasValue2) {
                throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            }
            if (hasValue) {
                int resourceId = obtainStyledAttributes.getResourceId(i2, 0);
                if (resourceId != 0) {
                    setAnimation(resourceId);
                }
            } else if (hasValue2) {
                String string2 = obtainStyledAttributes.getString(i3);
                if (string2 != null) {
                    setAnimation(string2);
                }
            } else if (hasValue3 && (string = obtainStyledAttributes.getString(i4)) != null) {
                setAnimationFromUrl(string);
            }
        }
        if (obtainStyledAttributes.getBoolean(n.x, false)) {
            this.n = true;
            this.o = true;
        }
        if (obtainStyledAttributes.getBoolean(n.C, false)) {
            this.f7889k.Q(-1);
        }
        int i5 = n.G;
        if (obtainStyledAttributes.hasValue(i5)) {
            setRepeatMode(obtainStyledAttributes.getInt(i5, 1));
        }
        int i6 = n.F;
        if (obtainStyledAttributes.hasValue(i6)) {
            setRepeatCount(obtainStyledAttributes.getInt(i6, -1));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(n.B));
        setProgress(obtainStyledAttributes.getFloat(n.D, 0.0f));
        g(obtainStyledAttributes.getBoolean(n.z, false));
        int i7 = n.y;
        if (obtainStyledAttributes.hasValue(i7)) {
            c(new com.airbnb.lottie.s.e("**"), j.x, new com.airbnb.lottie.w.c(new o(obtainStyledAttributes.getColor(i7, 0))));
        }
        int i8 = n.H;
        if (obtainStyledAttributes.hasValue(i8)) {
            this.f7889k.S(obtainStyledAttributes.getFloat(i8, 1.0f));
        }
        obtainStyledAttributes.recycle();
        h();
    }

    private void p(Drawable drawable, boolean z) {
        if (z && drawable != this.f7889k) {
            m();
        }
        e();
        super.setImageDrawable(drawable);
    }

    private void setCompositionTask(l<d> lVar) {
        f();
        e();
        this.r = lVar.h(this.f7887i).g(this.f7888j);
    }

    public <T> void c(com.airbnb.lottie.s.e eVar, T t, com.airbnb.lottie.w.c<T> cVar) {
        this.f7889k.c(eVar, t, cVar);
    }

    public void d() {
        this.f7889k.e();
        h();
    }

    public void g(boolean z) {
        this.f7889k.g(z);
    }

    public d getComposition() {
        return this.s;
    }

    public long getDuration() {
        if (this.s != null) {
            return r0.d();
        }
        return 0L;
    }

    public int getFrame() {
        return this.f7889k.m();
    }

    public String getImageAssetsFolder() {
        return this.f7889k.p();
    }

    public float getMaxFrame() {
        return this.f7889k.q();
    }

    public float getMinFrame() {
        return this.f7889k.s();
    }

    public m getPerformanceTracker() {
        return this.f7889k.t();
    }

    public float getProgress() {
        return this.f7889k.u();
    }

    public int getRepeatCount() {
        return this.f7889k.v();
    }

    public int getRepeatMode() {
        return this.f7889k.w();
    }

    public float getScale() {
        return this.f7889k.x();
    }

    public float getSpeed() {
        return this.f7889k.y();
    }

    public boolean getUseHardwareAcceleration() {
        return this.p;
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        f fVar = this.f7889k;
        if (drawable2 == fVar) {
            super.invalidateDrawable(fVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public boolean j() {
        return this.f7889k.B();
    }

    @Deprecated
    public void k(boolean z) {
        this.f7889k.Q(z ? -1 : 0);
    }

    public void l() {
        this.f7889k.C();
        h();
    }

    void m() {
        this.f7889k.D();
    }

    public void n(JsonReader jsonReader, String str) {
        setCompositionTask(e.h(jsonReader, str));
    }

    public void o(String str, String str2) {
        n(new JsonReader(new StringReader(str)), str2);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.o && this.n) {
            l();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        if (j()) {
            d();
            this.n = true;
        }
        m();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        String str = savedState.f7890f;
        this.l = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.l);
        }
        int i2 = savedState.f7891g;
        this.m = i2;
        if (i2 != 0) {
            setAnimation(i2);
        }
        setProgress(savedState.f7892h);
        if (savedState.f7893i) {
            l();
        }
        this.f7889k.J(savedState.f7894j);
        setRepeatMode(savedState.f7895k);
        setRepeatCount(savedState.l);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f7890f = this.l;
        savedState.f7891g = this.m;
        savedState.f7892h = this.f7889k.u();
        savedState.f7893i = this.f7889k.B();
        savedState.f7894j = this.f7889k.p();
        savedState.f7895k = this.f7889k.w();
        savedState.l = this.f7889k.v();
        return savedState;
    }

    public void setAnimation(int i2) {
        this.m = i2;
        this.l = null;
        setCompositionTask(e.j(getContext(), i2));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        o(str, null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(e.l(getContext(), str));
    }

    public void setComposition(d dVar) {
        if (c.a) {
            Log.v(f7886h, "Set Composition \n" + dVar);
        }
        this.f7889k.setCallback(this);
        this.s = dVar;
        boolean F = this.f7889k.F(dVar);
        h();
        if (getDrawable() != this.f7889k || F) {
            setImageDrawable(null);
            setImageDrawable(this.f7889k);
            requestLayout();
            Iterator<i> it = this.q.iterator();
            while (it.hasNext()) {
                it.next().a(dVar);
            }
        }
    }

    public void setFontAssetDelegate(com.airbnb.lottie.a aVar) {
        this.f7889k.G(aVar);
    }

    public void setFrame(int i2) {
        this.f7889k.H(i2);
    }

    public void setImageAssetDelegate(com.airbnb.lottie.b bVar) {
        this.f7889k.I(bVar);
    }

    public void setImageAssetsFolder(String str) {
        this.f7889k.J(str);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        m();
        e();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        p(drawable, true);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i2) {
        m();
        e();
        super.setImageResource(i2);
    }

    public void setMaxFrame(int i2) {
        this.f7889k.K(i2);
    }

    public void setMaxProgress(float f2) {
        this.f7889k.L(f2);
    }

    public void setMinFrame(int i2) {
        this.f7889k.M(i2);
    }

    public void setMinProgress(float f2) {
        this.f7889k.N(f2);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.f7889k.O(z);
    }

    public void setProgress(float f2) {
        this.f7889k.P(f2);
    }

    public void setRepeatCount(int i2) {
        this.f7889k.Q(i2);
    }

    public void setRepeatMode(int i2) {
        this.f7889k.R(i2);
    }

    public void setScale(float f2) {
        this.f7889k.S(f2);
        if (getDrawable() == this.f7889k) {
            p(null, false);
            p(this.f7889k, false);
        }
    }

    public void setSpeed(float f2) {
        this.f7889k.T(f2);
    }

    public void setTextDelegate(p pVar) {
        this.f7889k.U(pVar);
    }

    public void setAnimation(String str) {
        this.l = str;
        this.m = 0;
        setCompositionTask(e.d(getContext(), str));
    }
}
