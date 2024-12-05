package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.l2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2388l2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f17691a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f17692b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Object f17693c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ Object f17694d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Object f17695e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ C2367i2 f17696f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2388l2(C2367i2 c2367i2, int i8, String str, Object obj, Object obj2, Object obj3) {
        this.f17691a = i8;
        this.f17692b = str;
        this.f17693c = obj;
        this.f17694d = obj2;
        this.f17695e = obj3;
        this.f17696f = c2367i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c8;
        long j8;
        char c9;
        long j9;
        C2443t2 F8 = this.f17696f.f17844a.F();
        if (F8.p()) {
            c8 = this.f17696f.f17630c;
            if (c8 == 0) {
                if (this.f17696f.a().s()) {
                    this.f17696f.f17630c = 'C';
                } else {
                    this.f17696f.f17630c = 'c';
                }
            }
            j8 = this.f17696f.f17631d;
            if (j8 < 0) {
                this.f17696f.f17631d = 102001L;
            }
            char charAt = "01VDIWEA?".charAt(this.f17691a);
            c9 = this.f17696f.f17630c;
            j9 = this.f17696f.f17631d;
            String str = "2" + charAt + c9 + j9 + ":" + C2367i2.u(true, this.f17692b, this.f17693c, this.f17694d, this.f17695e);
            if (str.length() > 1024) {
                str = this.f17692b.substring(0, 1024);
            }
            C2471x2 c2471x2 = F8.f17816f;
            if (c2471x2 != null) {
                c2471x2.b(str, 1L);
                return;
            }
            return;
        }
        this.f17696f.v(6, "Persisted config not initialized. Not logging error/warn");
    }
}
