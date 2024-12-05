package com.uptodown.tv.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import j5.C3088a;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import z4.AbstractC4023a;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes5.dex */
public final class CropImageViewTv extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    private C3088a f29986a;

    /* renamed from: b, reason: collision with root package name */
    private int f29987b;

    public CropImageViewTv(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final void a() {
        setScaleType(ImageView.ScaleType.MATRIX);
        if (getDrawable() != null) {
            this.f29986a = new C3088a(this);
        }
    }

    private final void b(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC4023a.f40328d0);
        AbstractC3159y.h(obtainStyledAttributes, "context.obtainStyledAttr….styleable.CropImageView)");
        this.f29987b = obtainStyledAttributes.getInt(0, -1);
        obtainStyledAttributes.recycle();
    }

    public final int getCropType() {
        return this.f29987b;
    }

    public final void setCropType(int i8) {
        this.f29987b = i8;
    }

    @Override // android.widget.ImageView
    protected boolean setFrame(int i8, int i9, int i10, int i11) {
        boolean frame = super.setFrame(i8, i9, i10, i11);
        if (!isInEditMode() && this.f29986a != null && getDrawable() != null) {
            C3088a c3088a = this.f29986a;
            AbstractC3159y.f(c3088a);
            c3088a.a();
        }
        return frame;
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bm) {
        AbstractC3159y.i(bm, "bm");
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
        this.f29987b = -1;
        b(attributeSet);
        a();
    }

    public /* synthetic */ CropImageViewTv(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3151p abstractC3151p) {
        this(context, attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }
}
