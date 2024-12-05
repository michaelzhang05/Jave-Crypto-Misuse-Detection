package com.google.android.material.bottomappbar;

import e.e.b.b.z.f;
import e.e.b.b.z.m;

/* compiled from: BottomAppBarTopEdgeTreatment.java */
/* loaded from: classes2.dex */
public class a extends f implements Cloneable {

    /* renamed from: f, reason: collision with root package name */
    private float f16440f;

    /* renamed from: g, reason: collision with root package name */
    private float f16441g;

    /* renamed from: h, reason: collision with root package name */
    private float f16442h;

    /* renamed from: i, reason: collision with root package name */
    private float f16443i;

    /* renamed from: j, reason: collision with root package name */
    private float f16444j;

    @Override // e.e.b.b.z.f
    public void c(float f2, float f3, float f4, m mVar) {
        float f5 = this.f16442h;
        if (f5 == 0.0f) {
            mVar.m(f2, 0.0f);
            return;
        }
        float f6 = ((this.f16441g * 2.0f) + f5) / 2.0f;
        float f7 = f4 * this.f16440f;
        float f8 = f3 + this.f16444j;
        float f9 = (this.f16443i * f4) + ((1.0f - f4) * f6);
        if (f9 / f6 >= 1.0f) {
            mVar.m(f2, 0.0f);
            return;
        }
        float f10 = f6 + f7;
        float f11 = f9 + f7;
        float sqrt = (float) Math.sqrt((f10 * f10) - (f11 * f11));
        float f12 = f8 - sqrt;
        float f13 = f8 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f11));
        float f14 = 90.0f - degrees;
        mVar.m(f12, 0.0f);
        float f15 = f7 * 2.0f;
        mVar.a(f12 - f7, 0.0f, f12 + f7, f15, 270.0f, degrees);
        mVar.a(f8 - f6, (-f6) - f9, f8 + f6, f6 - f9, 180.0f - f14, (f14 * 2.0f) - 180.0f);
        mVar.a(f13 - f7, 0.0f, f13 + f7, f15, 270.0f - degrees, degrees);
        mVar.m(f2, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float d() {
        return this.f16443i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float e() {
        return this.f16441g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float g() {
        return this.f16440f;
    }

    public float h() {
        return this.f16442h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(float f2) {
        if (f2 >= 0.0f) {
            this.f16443i = f2;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(float f2) {
        this.f16441g = f2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(float f2) {
        this.f16440f = f2;
    }

    public void l(float f2) {
        this.f16442h = f2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(float f2) {
        this.f16444j = f2;
    }
}
