package com.airbnb.lottie.q.b;

import java.util.List;

/* compiled from: IntegerKeyframeAnimation.java */
/* loaded from: classes.dex */
public class e extends f<Integer> {
    public e(List<com.airbnb.lottie.w.a<Integer>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.q.b.a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Integer i(com.airbnb.lottie.w.a<Integer> aVar, float f2) {
        Integer num;
        if (aVar.f8269b != null && aVar.f8270c != null) {
            com.airbnb.lottie.w.c<A> cVar = this.f8060e;
            return (cVar == 0 || (num = (Integer) cVar.b(aVar.f8272e, aVar.f8273f.floatValue(), aVar.f8269b, aVar.f8270c, f2, e(), f())) == null) ? Integer.valueOf(com.airbnb.lottie.v.e.k(aVar.f8269b.intValue(), aVar.f8270c.intValue(), f2)) : num;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
