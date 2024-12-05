package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class C extends D {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f32280l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C(AbstractC2897b abstractC2897b, int i8, int i9) {
        super(abstractC2897b, i8);
        this.f32280l = i9;
    }

    @Override // j$.util.stream.AbstractC2897b
    final boolean M() {
        switch (this.f32280l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.AbstractC2897b, j$.util.stream.InterfaceC2927h, j$.util.stream.G
    public final /* bridge */ /* synthetic */ G parallel() {
        switch (this.f32280l) {
            case 0:
                parallel();
                return this;
            default:
                parallel();
                return this;
        }
    }

    @Override // j$.util.stream.AbstractC2897b, j$.util.stream.InterfaceC2927h, j$.util.stream.G
    public final /* bridge */ /* synthetic */ G sequential() {
        switch (this.f32280l) {
            case 0:
                sequential();
                return this;
            default:
                sequential();
                return this;
        }
    }

    @Override // j$.util.stream.AbstractC2897b, j$.util.stream.InterfaceC2927h
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        switch (this.f32280l) {
            case 0:
                return spliterator();
            default:
                return spliterator();
        }
    }

    @Override // j$.util.stream.InterfaceC2927h
    public final InterfaceC2927h unordered() {
        switch (this.f32280l) {
            case 0:
                return !H() ? this : new A(this, EnumC2916e3.f32527r, 0);
            default:
                return !H() ? this : new A(this, EnumC2916e3.f32527r, 0);
        }
    }
}
