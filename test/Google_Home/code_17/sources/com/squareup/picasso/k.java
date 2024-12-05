package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.s;
import l2.InterfaceC3309b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class k extends AbstractC2597a {

    /* renamed from: m, reason: collision with root package name */
    InterfaceC3309b f24334m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(s sVar, ImageView imageView, v vVar, int i8, int i9, int i10, Drawable drawable, String str, Object obj, InterfaceC3309b interfaceC3309b, boolean z8) {
        super(sVar, imageView, vVar, i8, i9, i10, drawable, str, obj, z8);
        this.f24334m = interfaceC3309b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.squareup.picasso.AbstractC2597a
    public void a() {
        super.a();
        if (this.f24334m != null) {
            this.f24334m = null;
        }
    }

    @Override // com.squareup.picasso.AbstractC2597a
    public void b(Bitmap bitmap, s.e eVar) {
        if (bitmap != null) {
            ImageView imageView = (ImageView) this.f24263c.get();
            if (imageView == null) {
                return;
            }
            s sVar = this.f24261a;
            t.c(imageView, sVar.f24375d, bitmap, eVar, this.f24264d, sVar.f24383l);
            InterfaceC3309b interfaceC3309b = this.f24334m;
            if (interfaceC3309b != null) {
                interfaceC3309b.b();
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
    }

    @Override // com.squareup.picasso.AbstractC2597a
    public void c(Exception exc) {
        ImageView imageView = (ImageView) this.f24263c.get();
        if (imageView == null) {
            return;
        }
        Object drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        int i8 = this.f24267g;
        if (i8 != 0) {
            imageView.setImageResource(i8);
        } else {
            Drawable drawable2 = this.f24268h;
            if (drawable2 != null) {
                imageView.setImageDrawable(drawable2);
            }
        }
        InterfaceC3309b interfaceC3309b = this.f24334m;
        if (interfaceC3309b != null) {
            interfaceC3309b.a(exc);
        }
    }
}
