package A6;

import kotlin.jvm.internal.AbstractC3255y;
import y6.e;

/* renamed from: A6.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0992k implements w6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C0992k f574a = new C0992k();

    /* renamed from: b, reason: collision with root package name */
    private static final y6.f f575b = new k0("kotlin.Byte", e.b.f41026a);

    private C0992k() {
    }

    @Override // w6.b, w6.i, w6.InterfaceC4150a
    public y6.f a() {
        return f575b;
    }

    @Override // w6.i
    public /* bridge */ /* synthetic */ void d(z6.f fVar, Object obj) {
        g(fVar, ((Number) obj).byteValue());
    }

    @Override // w6.InterfaceC4150a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Byte b(z6.e decoder) {
        AbstractC3255y.i(decoder, "decoder");
        return Byte.valueOf(decoder.C());
    }

    public void g(z6.f encoder, byte b8) {
        AbstractC3255y.i(encoder, "encoder");
        encoder.m(b8);
    }
}
