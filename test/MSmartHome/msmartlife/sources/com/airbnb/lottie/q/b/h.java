package com.airbnb.lottie.q.b;

import android.graphics.Path;
import android.graphics.PointF;

/* compiled from: PathKeyframe.java */
/* loaded from: classes.dex */
public class h extends com.airbnb.lottie.w.a<PointF> {

    /* renamed from: k, reason: collision with root package name */
    private Path f8065k;

    /* JADX WARN: Multi-variable type inference failed */
    public h(com.airbnb.lottie.d dVar, com.airbnb.lottie.w.a<PointF> aVar) {
        super(dVar, aVar.f8269b, aVar.f8270c, aVar.f8271d, aVar.f8272e, aVar.f8273f);
        T t;
        T t2 = this.f8270c;
        boolean z = (t2 == 0 || (t = this.f8269b) == 0 || !((PointF) t).equals(((PointF) t2).x, ((PointF) t2).y)) ? false : true;
        T t3 = this.f8270c;
        if (t3 == 0 || z) {
            return;
        }
        this.f8065k = com.airbnb.lottie.v.f.d((PointF) this.f8269b, (PointF) t3, aVar.f8276i, aVar.f8277j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Path e() {
        return this.f8065k;
    }
}
