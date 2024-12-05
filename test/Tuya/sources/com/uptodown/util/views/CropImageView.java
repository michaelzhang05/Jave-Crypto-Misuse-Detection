package com.uptodown.util.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import n5.C3477e;
import z4.AbstractC4023a;

/* loaded from: classes5.dex */
public final class CropImageView extends AppCompatImageView {

    /* renamed from: a, reason: collision with root package name */
    private C3477e f29988a;

    /* renamed from: b, reason: collision with root package name */
    private int f29989b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3159y.i(context, "context");
    }

    private final void a() {
        setScaleType(ImageView.ScaleType.MATRIX);
        if (getDrawable() != null) {
            this.f29988a = new C3477e(this);
        }
    }

    private final void b(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC4023a.f40328d0);
        AbstractC3159y.h(obtainStyledAttributes, "context.obtainStyledAttr….styleable.CropImageView)");
        this.f29989b = obtainStyledAttributes.getInt(0, -1);
        obtainStyledAttributes.recycle();
    }

    public final int getCropType() {
        return this.f29989b;
    }

    public final void setCropType(int i8) {
        this.f29989b = i8;
    }

    @Override // android.widget.ImageView
    protected boolean setFrame(int i8, int i9, int i10, int i11) {
        boolean frame = super.setFrame(i8, i9, i10, i11);
        if (!isInEditMode() && this.f29988a != null && getDrawable() != null) {
            C3477e c3477e = this.f29988a;
            AbstractC3159y.f(c3477e);
            c3477e.a();
        }
        return frame;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bm) {
        AbstractC3159y.i(bm, "bm");
        super.setImageBitmap(bm);
        a();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        a();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i8) {
        super.setImageResource(i8);
        a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CropImageView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3159y.i(context, "context");
        this.f29989b = -1;
        b(attributeSet);
        a();
    }

    public /* synthetic */ CropImageView(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3151p abstractC3151p) {
        this(context, attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }
}
