package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.s;
import i2.InterfaceC2774b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class k extends AbstractC2403a {

    /* renamed from: m, reason: collision with root package name */
    InterfaceC2774b f23279m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(s sVar, ImageView imageView, v vVar, int i8, int i9, int i10, Drawable drawable, String str, Object obj, InterfaceC2774b interfaceC2774b, boolean z8) {
        super(sVar, imageView, vVar, i8, i9, i10, drawable, str, obj, z8);
        this.f23279m = interfaceC2774b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.squareup.picasso.AbstractC2403a
    public void a() {
        super.a();
        if (this.f23279m != null) {
            this.f23279m = null;
        }
    }

    @Override // com.squareup.picasso.AbstractC2403a
    public void b(Bitmap bitmap, s.e eVar) {
        if (bitmap != null) {
            ImageView imageView = (ImageView) this.f23208c.get();
            if (imageView == null) {
                return;
            }
            s sVar = this.f23206a;
            t.c(imageView, sVar.f23320d, bitmap, eVar, this.f23209d, sVar.f23328l);
            InterfaceC2774b interfaceC2774b = this.f23279m;
            if (interfaceC2774b != null) {
                interfaceC2774b.b();
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
    }

    @Override // com.squareup.picasso.AbstractC2403a
    public void c(Exception exc) {
        ImageView imageView = (ImageView) this.f23208c.get();
        if (imageView == null) {
            return;
        }
        Object drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        int i8 = this.f23212g;
        if (i8 != 0) {
            imageView.setImageResource(i8);
        } else {
            Drawable drawable2 = this.f23213h;
            if (drawable2 != null) {
                imageView.setImageDrawable(drawable2);
            }
        }
        InterfaceC2774b interfaceC2774b = this.f23279m;
        if (interfaceC2774b != null) {
            interfaceC2774b.a(exc);
        }
    }
}
