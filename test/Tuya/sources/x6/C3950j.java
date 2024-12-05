package x6;

import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.C3145j;
import u6.AbstractC3808a;

/* renamed from: x6.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3950j extends j0 implements t6.b {

    /* renamed from: c, reason: collision with root package name */
    public static final C3950j f39577c = new C3950j();

    private C3950j() {
        super(AbstractC3808a.x(C3145j.f33778a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3935a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public int j(byte[] bArr) {
        AbstractC3159y.i(bArr, "<this>");
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.j0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public byte[] w() {
        return new byte[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3956p, x6.AbstractC3935a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(w6.c decoder, int i8, C3949i builder, boolean z8) {
        AbstractC3159y.i(decoder, "decoder");
        AbstractC3159y.i(builder, "builder");
        builder.e(decoder.m(a(), i8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3935a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public C3949i p(byte[] bArr) {
        AbstractC3159y.i(bArr, "<this>");
        return new C3949i(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.j0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void z(w6.d encoder, byte[] content, int i8) {
        AbstractC3159y.i(encoder, "encoder");
        AbstractC3159y.i(content, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            encoder.s(a(), i9, content[i9]);
        }
    }
}
