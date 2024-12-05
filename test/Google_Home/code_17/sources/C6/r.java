package C6;

import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class r extends C1037h {

    /* renamed from: c, reason: collision with root package name */
    private final B6.a f1683c;

    /* renamed from: d, reason: collision with root package name */
    private int f1684d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(InterfaceC1050v writer, B6.a json) {
        super(writer);
        AbstractC3255y.i(writer, "writer");
        AbstractC3255y.i(json, "json");
        this.f1683c = json;
    }

    @Override // C6.C1037h
    public void b() {
        n(true);
        this.f1684d++;
    }

    @Override // C6.C1037h
    public void c() {
        n(false);
        j("\n");
        int i8 = this.f1684d;
        for (int i9 = 0; i9 < i8; i9++) {
            j(this.f1683c.d().l());
        }
    }

    @Override // C6.C1037h
    public void o() {
        e(' ');
    }

    @Override // C6.C1037h
    public void p() {
        this.f1684d--;
    }
}
