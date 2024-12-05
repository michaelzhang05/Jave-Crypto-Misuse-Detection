package x6;

import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.C3147l;
import u6.AbstractC3808a;

/* renamed from: x6.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3954n extends j0 implements t6.b {

    /* renamed from: c, reason: collision with root package name */
    public static final C3954n f39589c = new C3954n();

    private C3954n() {
        super(AbstractC3808a.y(C3147l.f33780a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3935a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public int j(char[] cArr) {
        AbstractC3159y.i(cArr, "<this>");
        return cArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.j0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public char[] w() {
        return new char[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3956p, x6.AbstractC3935a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(w6.c decoder, int i8, C3953m builder, boolean z8) {
        AbstractC3159y.i(decoder, "decoder");
        AbstractC3159y.i(builder, "builder");
        builder.e(decoder.i(a(), i8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3935a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public C3953m p(char[] cArr) {
        AbstractC3159y.i(cArr, "<this>");
        return new C3953m(cArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.j0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void z(w6.d encoder, char[] content, int i8) {
        AbstractC3159y.i(encoder, "encoder");
        AbstractC3159y.i(content, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            encoder.k(a(), i9, content[i9]);
        }
    }
}
