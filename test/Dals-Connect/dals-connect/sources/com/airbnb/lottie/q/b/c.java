package com.airbnb.lottie.q.b;

import java.util.List;

/* compiled from: FloatKeyframeAnimation.java */
/* loaded from: classes.dex */
public class c extends f<Float> {
    public c(List<com.airbnb.lottie.w.a<Float>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.q.b.a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Float i(com.airbnb.lottie.w.a<Float> aVar, float f2) {
        Float f3;
        if (aVar.f8269b != null && aVar.f8270c != null) {
            com.airbnb.lottie.w.c<A> cVar = this.f8060e;
            return (cVar == 0 || (f3 = (Float) cVar.b(aVar.f8272e, aVar.f8273f.floatValue(), aVar.f8269b, aVar.f8270c, f2, e(), f())) == null) ? Float.valueOf(com.airbnb.lottie.v.e.j(aVar.f8269b.floatValue(), aVar.f8270c.floatValue(), f2)) : f3;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
