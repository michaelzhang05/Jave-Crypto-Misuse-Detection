package x6;

import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.C3152q;
import u6.AbstractC3808a;

/* renamed from: x6.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3958s extends j0 implements t6.b {

    /* renamed from: c, reason: collision with root package name */
    public static final C3958s f39602c = new C3958s();

    private C3958s() {
        super(AbstractC3808a.z(C3152q.f33789a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3935a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public int j(double[] dArr) {
        AbstractC3159y.i(dArr, "<this>");
        return dArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.j0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public double[] w() {
        return new double[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3956p, x6.AbstractC3935a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(w6.c decoder, int i8, r builder, boolean z8) {
        AbstractC3159y.i(decoder, "decoder");
        AbstractC3159y.i(builder, "builder");
        builder.e(decoder.B(a(), i8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3935a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public r p(double[] dArr) {
        AbstractC3159y.i(dArr, "<this>");
        return new r(dArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.j0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void z(w6.d encoder, double[] content, int i8) {
        AbstractC3159y.i(encoder, "encoder");
        AbstractC3159y.i(content, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            encoder.D(a(), i9, content[i9]);
        }
    }
}
