package C6;

import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: C6.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1038i extends C1037h {

    /* renamed from: c, reason: collision with root package name */
    private final boolean f1681c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1038i(InterfaceC1050v writer, boolean z8) {
        super(writer);
        AbstractC3255y.i(writer, "writer");
        this.f1681c = z8;
    }

    @Override // C6.C1037h
    public void m(String value) {
        AbstractC3255y.i(value, "value");
        if (this.f1681c) {
            super.m(value);
        } else {
            super.j(value);
        }
    }
}
