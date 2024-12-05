package z6;

import kotlin.jvm.internal.AbstractC3159y;
import y6.AbstractC3999a;

/* loaded from: classes5.dex */
public final class r extends C4048h {

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC3999a f40565c;

    /* renamed from: d, reason: collision with root package name */
    private int f40566d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(InterfaceC4061v writer, AbstractC3999a json) {
        super(writer);
        AbstractC3159y.i(writer, "writer");
        AbstractC3159y.i(json, "json");
        this.f40565c = json;
    }

    @Override // z6.C4048h
    public void b() {
        n(true);
        this.f40566d++;
    }

    @Override // z6.C4048h
    public void c() {
        n(false);
        j("\n");
        int i8 = this.f40566d;
        for (int i9 = 0; i9 < i8; i9++) {
            j(this.f40565c.d().l());
        }
    }

    @Override // z6.C4048h
    public void o() {
        e(' ');
    }

    @Override // z6.C4048h
    public void p() {
        this.f40566d--;
    }
}
