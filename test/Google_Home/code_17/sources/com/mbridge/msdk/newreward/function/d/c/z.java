package com.mbridge.msdk.newreward.function.d.c;

/* loaded from: classes4.dex */
public final class z extends q {

    /* renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.newreward.function.d.a.b f22217a;

    /* renamed from: b, reason: collision with root package name */
    private final com.mbridge.msdk.newreward.function.d.a.a f22218b;

    /* renamed from: c, reason: collision with root package name */
    private final c f22219c;

    public z(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar, c cVar) {
        this.f22217a = bVar;
        this.f22218b = aVar;
        this.f22219c = cVar;
        cVar.b(true);
        cVar.a(false);
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.p
    public final void a(int i8, x xVar) {
        if (xVar != null) {
            xVar.a(this.f22217a, this.f22218b, this);
            xVar.b(this.f22217a, this.f22218b, this);
        }
    }
}
