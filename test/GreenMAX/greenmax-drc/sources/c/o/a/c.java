package c.o.a;

/* compiled from: Target.java */
/* loaded from: classes.dex */
public final class c {
    public static final c a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f2870b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f2871c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f2872d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f2873e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f2874f;

    /* renamed from: g, reason: collision with root package name */
    final float[] f2875g;

    /* renamed from: h, reason: collision with root package name */
    final float[] f2876h;

    /* renamed from: i, reason: collision with root package name */
    final float[] f2877i = new float[3];

    /* renamed from: j, reason: collision with root package name */
    boolean f2878j = true;

    static {
        c cVar = new c();
        a = cVar;
        m(cVar);
        p(cVar);
        c cVar2 = new c();
        f2870b = cVar2;
        o(cVar2);
        p(cVar2);
        c cVar3 = new c();
        f2871c = cVar3;
        l(cVar3);
        p(cVar3);
        c cVar4 = new c();
        f2872d = cVar4;
        m(cVar4);
        n(cVar4);
        c cVar5 = new c();
        f2873e = cVar5;
        o(cVar5);
        n(cVar5);
        c cVar6 = new c();
        f2874f = cVar6;
        l(cVar6);
        n(cVar6);
    }

    c() {
        float[] fArr = new float[3];
        this.f2875g = fArr;
        float[] fArr2 = new float[3];
        this.f2876h = fArr2;
        r(fArr);
        r(fArr2);
        q();
    }

    private static void l(c cVar) {
        float[] fArr = cVar.f2876h;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    private static void m(c cVar) {
        float[] fArr = cVar.f2876h;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    private static void n(c cVar) {
        float[] fArr = cVar.f2875g;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    private static void o(c cVar) {
        float[] fArr = cVar.f2876h;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    private static void p(c cVar) {
        float[] fArr = cVar.f2875g;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    private void q() {
        float[] fArr = this.f2877i;
        fArr[0] = 0.24f;
        fArr[1] = 0.52f;
        fArr[2] = 0.24f;
    }

    private static void r(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    public float a() {
        return this.f2877i[1];
    }

    public float b() {
        return this.f2876h[2];
    }

    public float c() {
        return this.f2875g[2];
    }

    public float d() {
        return this.f2876h[0];
    }

    public float e() {
        return this.f2875g[0];
    }

    public float f() {
        return this.f2877i[2];
    }

    public float g() {
        return this.f2877i[0];
    }

    public float h() {
        return this.f2876h[1];
    }

    public float i() {
        return this.f2875g[1];
    }

    public boolean j() {
        return this.f2878j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k() {
        int length = this.f2877i.length;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < length; i2++) {
            float f3 = this.f2877i[i2];
            if (f3 > 0.0f) {
                f2 += f3;
            }
        }
        if (f2 != 0.0f) {
            int length2 = this.f2877i.length;
            for (int i3 = 0; i3 < length2; i3++) {
                float[] fArr = this.f2877i;
                if (fArr[i3] > 0.0f) {
                    fArr[i3] = fArr[i3] / f2;
                }
            }
        }
    }
}
