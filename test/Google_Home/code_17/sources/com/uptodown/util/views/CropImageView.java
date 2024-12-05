package com.uptodown.util.views;

import C4.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import q5.C3856e;

/* loaded from: classes5.dex */
public final class CropImageView extends AppCompatImageView {

    /* renamed from: a, reason: collision with root package name */
    private C3856e f31020a;

    /* renamed from: b, reason: collision with root package name */
    private int f31021b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3255y.i(context, "context");
    }

    private final void a() {
        setScaleType(ImageView.ScaleType.MATRIX);
        if (getDrawable() != null) {
            this.f31020a = new C3856e(this);
        }
    }

    private final void b(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, a.f1446d0);
        AbstractC3255y.h(obtainStyledAttributes, "context.obtainStyledAttr….styleable.CropImageView)");
        this.f31021b = obtainStyledAttributes.getInt(0, -1);
        obtainStyledAttributes.recycle();
    }

    public final int getCropType() {
        return this.f31021b;
    }

    public final void setCropType(int i8) {
        this.f31021b = i8;
    }

    @Override // android.widget.ImageView
    protected boolean setFrame(int i8, int i9, int i10, int i11) {
        boolean frame = super.setFrame(i8, i9, i10, i11);
        if (!isInEditMode() && this.f31020a != null && getDrawable() != null) {
            C3856e c3856e = this.f31020a;
            AbstractC3255y.f(c3856e);
            c3856e.a();
        }
        return frame;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bm) {
        AbstractC3255y.i(bm, "bm");
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
        AbstractC3255y.i(context, "context");
        this.f31021b = -1;
        b(attributeSet);
        a();
    }

    public /* synthetic */ CropImageView(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3247p abstractC3247p) {
        this(context, attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }
}
