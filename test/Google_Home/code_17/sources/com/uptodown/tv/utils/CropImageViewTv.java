package com.uptodown.tv.utils;

import C4.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import m5.C3442a;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes5.dex */
public final class CropImageViewTv extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    private C3442a f31018a;

    /* renamed from: b, reason: collision with root package name */
    private int f31019b;

    public CropImageViewTv(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final void a() {
        setScaleType(ImageView.ScaleType.MATRIX);
        if (getDrawable() != null) {
            this.f31018a = new C3442a(this);
        }
    }

    private final void b(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, a.f1446d0);
        AbstractC3255y.h(obtainStyledAttributes, "context.obtainStyledAttr….styleable.CropImageView)");
        this.f31019b = obtainStyledAttributes.getInt(0, -1);
        obtainStyledAttributes.recycle();
    }

    public final int getCropType() {
        return this.f31019b;
    }

    public final void setCropType(int i8) {
        this.f31019b = i8;
    }

    @Override // android.widget.ImageView
    protected boolean setFrame(int i8, int i9, int i10, int i11) {
        boolean frame = super.setFrame(i8, i9, i10, i11);
        if (!isInEditMode() && this.f31018a != null && getDrawable() != null) {
            C3442a c3442a = this.f31018a;
            AbstractC3255y.f(c3442a);
            c3442a.a();
        }
        return frame;
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bm) {
        AbstractC3255y.i(bm, "bm");
        super.setImageBitmap(bm);
        a();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        a();
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i8) {
        super.setImageResource(i8);
        a();
    }

    public CropImageViewTv(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f31019b = -1;
        b(attributeSet);
        a();
    }

    public /* synthetic */ CropImageViewTv(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3247p abstractC3247p) {
        this(context, attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }
}
