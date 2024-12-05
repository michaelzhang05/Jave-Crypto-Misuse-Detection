package c3;

/* loaded from: classes.dex */
public class j extends d {

    /* renamed from: a, reason: collision with root package name */
    float f4076a = -1.0f;

    @Override // c3.d
    public void a(m mVar, float f6, float f7, float f8) {
        mVar.o(0.0f, f8 * f7, 180.0f, 180.0f - f6);
        float f9 = f8 * 2.0f * f7;
        mVar.a(0.0f, 0.0f, f9, f9, 180.0f, f6);
    }
}
