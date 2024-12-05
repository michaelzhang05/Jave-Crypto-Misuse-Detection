package A6;

import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.C3241j;
import x6.AbstractC4193a;

/* renamed from: A6.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0991j extends j0 implements w6.b {

    /* renamed from: c, reason: collision with root package name */
    public static final C0991j f572c = new C0991j();

    private C0991j() {
        super(AbstractC4193a.x(C3241j.f34179a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0976a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public int j(byte[] bArr) {
        AbstractC3255y.i(bArr, "<this>");
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.j0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public byte[] w() {
        return new byte[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0997p, A6.AbstractC0976a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(z6.c decoder, int i8, C0990i builder, boolean z8) {
        AbstractC3255y.i(decoder, "decoder");
        AbstractC3255y.i(builder, "builder");
        builder.e(decoder.k(a(), i8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0976a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public C0990i p(byte[] bArr) {
        AbstractC3255y.i(bArr, "<this>");
        return new C0990i(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.j0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void z(z6.d encoder, byte[] content, int i8) {
        AbstractC3255y.i(encoder, "encoder");
        AbstractC3255y.i(content, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            encoder.y(a(), i9, content[i9]);
        }
    }
}
