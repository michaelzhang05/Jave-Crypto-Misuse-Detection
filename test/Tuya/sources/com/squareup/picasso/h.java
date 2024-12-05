package com.squareup.picasso;

import android.graphics.Bitmap;
import com.squareup.picasso.s;
import i2.InterfaceC2774b;

/* loaded from: classes4.dex */
class h extends AbstractC2403a {

    /* renamed from: m, reason: collision with root package name */
    private final Object f23277m;

    /* renamed from: n, reason: collision with root package name */
    private InterfaceC2774b f23278n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(s sVar, v vVar, int i8, int i9, Object obj, String str, InterfaceC2774b interfaceC2774b) {
        super(sVar, null, vVar, i8, i9, 0, null, str, obj, false);
        this.f23277m = new Object();
        this.f23278n = interfaceC2774b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.squareup.picasso.AbstractC2403a
    public void a() {
        super.a();
        this.f23278n = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.squareup.picasso.AbstractC2403a
    public void b(Bitmap bitmap, s.e eVar) {
        InterfaceC2774b interfaceC2774b = this.f23278n;
        if (interfaceC2774b != null) {
            interfaceC2774b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.squareup.picasso.AbstractC2403a
    public void c(Exception exc) {
        InterfaceC2774b interfaceC2774b = this.f23278n;
        if (interfaceC2774b != null) {
            interfaceC2774b.a(exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.squareup.picasso.AbstractC2403a
    public Object k() {
        return this.f23277m;
    }
}
