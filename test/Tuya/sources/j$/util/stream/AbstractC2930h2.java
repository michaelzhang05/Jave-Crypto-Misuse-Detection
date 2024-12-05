package j$.util.stream;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.h2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2930h2 extends AbstractC2935i2 {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f32556l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC2930h2(AbstractC2897b abstractC2897b, int i8, int i9) {
        super(abstractC2897b, i8);
        this.f32556l = i9;
    }

    @Override // j$.util.stream.AbstractC2897b
    final boolean M() {
        switch (this.f32556l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.InterfaceC2927h
    public final InterfaceC2927h unordered() {
        switch (this.f32556l) {
            case 0:
                return !H() ? this : new AbstractC2930h2(this, EnumC2916e3.f32527r, 1);
            default:
                return !H() ? this : new AbstractC2930h2(this, EnumC2916e3.f32527r, 1);
        }
    }
}
