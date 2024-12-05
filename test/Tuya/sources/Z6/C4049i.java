package z6;

import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: z6.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4049i extends C4048h {

    /* renamed from: c, reason: collision with root package name */
    private final boolean f40563c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4049i(InterfaceC4061v writer, boolean z8) {
        super(writer);
        AbstractC3159y.i(writer, "writer");
        this.f40563c = z8;
    }

    @Override // z6.C4048h
    public void m(String value) {
        AbstractC3159y.i(value, "value");
        if (this.f40563c) {
            super.m(value);
        } else {
            super.j(value);
        }
    }
}
