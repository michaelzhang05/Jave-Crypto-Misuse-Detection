package com.airbnb.lottie.q.a;

import android.graphics.Path;
import com.airbnb.lottie.q.b.a;
import com.airbnb.lottie.s.j.q;
import java.util.List;

/* compiled from: ShapeContent.java */
/* loaded from: classes.dex */
public class p implements l, a.InterfaceC0101a {
    private final Path a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final String f8047b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.f f8048c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.q.b.a<?, Path> f8049d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f8050e;

    /* renamed from: f, reason: collision with root package name */
    private r f8051f;

    public p(com.airbnb.lottie.f fVar, com.airbnb.lottie.s.k.a aVar, com.airbnb.lottie.s.j.o oVar) {
        this.f8047b = oVar.b();
        this.f8048c = fVar;
        com.airbnb.lottie.q.b.a<com.airbnb.lottie.s.j.l, Path> a = oVar.c().a();
        this.f8049d = a;
        aVar.i(a);
        a.a(this);
    }

    private void d() {
        this.f8050e = false;
        this.f8048c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.q.b.a.InterfaceC0101a
    public void a() {
        d();
    }

    @Override // com.airbnb.lottie.q.a.b
    public void b(List<b> list, List<b> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            b bVar = list.get(i2);
            if (bVar instanceof r) {
                r rVar = (r) bVar;
                if (rVar.j() == q.a.Simultaneously) {
                    this.f8051f = rVar;
                    rVar.d(this);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.q.a.l
    public Path c() {
        if (this.f8050e) {
            return this.a;
        }
        this.a.reset();
        this.a.set(this.f8049d.h());
        this.a.setFillType(Path.FillType.EVEN_ODD);
        com.airbnb.lottie.v.f.b(this.a, this.f8051f);
        this.f8050e = true;
        return this.a;
    }
}
