package x6;

import kotlin.jvm.internal.AbstractC3159y;
import u6.AbstractC3808a;

/* renamed from: x6.A, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3933A extends j0 implements t6.b {

    /* renamed from: c, reason: collision with root package name */
    public static final C3933A f39500c = new C3933A();

    private C3933A() {
        super(AbstractC3808a.A(kotlin.jvm.internal.r.f33790a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3935a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public int j(float[] fArr) {
        AbstractC3159y.i(fArr, "<this>");
        return fArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.j0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public float[] w() {
        return new float[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3956p, x6.AbstractC3935a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(w6.c decoder, int i8, C3965z builder, boolean z8) {
        AbstractC3159y.i(decoder, "decoder");
        AbstractC3159y.i(builder, "builder");
        builder.e(decoder.f(a(), i8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3935a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public C3965z p(float[] fArr) {
        AbstractC3159y.i(fArr, "<this>");
        return new C3965z(fArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.j0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void z(w6.d encoder, float[] content, int i8) {
        AbstractC3159y.i(encoder, "encoder");
        AbstractC3159y.i(content, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            encoder.t(a(), i9, content[i9]);
        }
    }
}
