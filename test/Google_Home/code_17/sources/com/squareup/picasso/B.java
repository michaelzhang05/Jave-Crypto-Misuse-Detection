package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.s;

/* loaded from: classes4.dex */
final class B extends AbstractC2597a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public B(s sVar, A a8, v vVar, int i8, int i9, Drawable drawable, String str, Object obj, int i10) {
        super(sVar, a8, vVar, i8, i9, i10, drawable, str, obj, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.squareup.picasso.AbstractC2597a
    public void b(Bitmap bitmap, s.e eVar) {
        if (bitmap != null) {
            A a8 = (A) k();
            if (a8 != null) {
                a8.c(bitmap, eVar);
                if (bitmap.isRecycled()) {
                    throw new IllegalStateException("Target callback must not recycle bitmap!");
                }
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.squareup.picasso.AbstractC2597a
    public void c(Exception exc) {
        A a8 = (A) k();
        if (a8 != null) {
            if (this.f24267g != 0) {
                a8.a(exc, this.f24261a.f24375d.getResources().getDrawable(this.f24267g));
            } else {
                a8.a(exc, this.f24268h);
            }
        }
    }
}
