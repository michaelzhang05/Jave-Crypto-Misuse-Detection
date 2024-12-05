package com.airbnb.lottie.q.b;

import android.graphics.PointF;
import java.util.Collections;

/* compiled from: SplitDimensionPathKeyframeAnimation.java */
/* loaded from: classes.dex */
public class m extends a<PointF, PointF> {

    /* renamed from: g, reason: collision with root package name */
    private final PointF f8073g;

    /* renamed from: h, reason: collision with root package name */
    private final a<Float, Float> f8074h;

    /* renamed from: i, reason: collision with root package name */
    private final a<Float, Float> f8075i;

    public m(a<Float, Float> aVar, a<Float, Float> aVar2) {
        super(Collections.emptyList());
        this.f8073g = new PointF();
        this.f8074h = aVar;
        this.f8075i = aVar2;
        l(f());
    }

    @Override // com.airbnb.lottie.q.b.a
    public void l(float f2) {
        this.f8074h.l(f2);
        this.f8075i.l(f2);
        this.f8073g.set(this.f8074h.h().floatValue(), this.f8075i.h().floatValue());
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            this.a.get(i2).a();
        }
    }

    @Override // com.airbnb.lottie.q.b.a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public PointF h() {
        return i(null, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.q.b.a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public PointF i(com.airbnb.lottie.w.a<PointF> aVar, float f2) {
        return this.f8073g;
    }
}
