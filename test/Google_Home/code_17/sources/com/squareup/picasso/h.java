package com.squareup.picasso;

import android.graphics.Bitmap;
import com.squareup.picasso.s;
import l2.InterfaceC3309b;

/* loaded from: classes4.dex */
class h extends AbstractC2597a {

    /* renamed from: m, reason: collision with root package name */
    private final Object f24332m;

    /* renamed from: n, reason: collision with root package name */
    private InterfaceC3309b f24333n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(s sVar, v vVar, int i8, int i9, Object obj, String str, InterfaceC3309b interfaceC3309b) {
        super(sVar, null, vVar, i8, i9, 0, null, str, obj, false);
        this.f24332m = new Object();
        this.f24333n = interfaceC3309b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.squareup.picasso.AbstractC2597a
    public void a() {
        super.a();
        this.f24333n = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.squareup.picasso.AbstractC2597a
    public void b(Bitmap bitmap, s.e eVar) {
        InterfaceC3309b interfaceC3309b = this.f24333n;
        if (interfaceC3309b != null) {
            interfaceC3309b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.squareup.picasso.AbstractC2597a
    public void c(Exception exc) {
        InterfaceC3309b interfaceC3309b = this.f24333n;
        if (interfaceC3309b != null) {
            interfaceC3309b.a(exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.squareup.picasso.AbstractC2597a
    public Object k() {
        return this.f24332m;
    }
}
