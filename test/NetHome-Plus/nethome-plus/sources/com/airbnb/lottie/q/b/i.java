package com.airbnb.lottie.q.b;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* compiled from: PathKeyframeAnimation.java */
/* loaded from: classes.dex */
public class i extends f<PointF> {

    /* renamed from: g, reason: collision with root package name */
    private final PointF f8066g;

    /* renamed from: h, reason: collision with root package name */
    private final float[] f8067h;

    /* renamed from: i, reason: collision with root package name */
    private h f8068i;

    /* renamed from: j, reason: collision with root package name */
    private PathMeasure f8069j;

    public i(List<? extends com.airbnb.lottie.w.a<PointF>> list) {
        super(list);
        this.f8066g = new PointF();
        this.f8067h = new float[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.q.b.a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public PointF i(com.airbnb.lottie.w.a<PointF> aVar, float f2) {
        PointF pointF;
        h hVar = (h) aVar;
        Path e2 = hVar.e();
        if (e2 == null) {
            return aVar.f8269b;
        }
        com.airbnb.lottie.w.c<A> cVar = this.f8060e;
        if (cVar != 0 && (pointF = (PointF) cVar.b(hVar.f8272e, hVar.f8273f.floatValue(), hVar.f8269b, hVar.f8270c, e(), f2, f())) != null) {
            return pointF;
        }
        if (this.f8068i != hVar) {
            this.f8069j = new PathMeasure(e2, false);
            this.f8068i = hVar;
        }
        PathMeasure pathMeasure = this.f8069j;
        pathMeasure.getPosTan(f2 * pathMeasure.getLength(), this.f8067h, null);
        PointF pointF2 = this.f8066g;
        float[] fArr = this.f8067h;
        pointF2.set(fArr[0], fArr[1]);
        return this.f8066g;
    }
}
