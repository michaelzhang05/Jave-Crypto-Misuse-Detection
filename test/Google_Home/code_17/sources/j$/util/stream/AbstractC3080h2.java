package j$.util.stream;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.h2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3080h2 extends AbstractC3085i2 {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f33750l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC3080h2(AbstractC3047b abstractC3047b, int i8, int i9) {
        super(abstractC3047b, i8);
        this.f33750l = i9;
    }

    @Override // j$.util.stream.AbstractC3047b
    final boolean M() {
        switch (this.f33750l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.InterfaceC3077h
    public final InterfaceC3077h unordered() {
        switch (this.f33750l) {
            case 0:
                return !H() ? this : new AbstractC3080h2(this, EnumC3066e3.f33721r, 1);
            default:
                return !H() ? this : new AbstractC3080h2(this, EnumC3066e3.f33721r, 1);
        }
    }
}
