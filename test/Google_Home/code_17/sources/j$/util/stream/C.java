package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class C extends D {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f33474l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C(AbstractC3047b abstractC3047b, int i8, int i9) {
        super(abstractC3047b, i8);
        this.f33474l = i9;
    }

    @Override // j$.util.stream.AbstractC3047b
    final boolean M() {
        switch (this.f33474l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.AbstractC3047b, j$.util.stream.InterfaceC3077h, j$.util.stream.G
    public final /* bridge */ /* synthetic */ G parallel() {
        switch (this.f33474l) {
            case 0:
                parallel();
                return this;
            default:
                parallel();
                return this;
        }
    }

    @Override // j$.util.stream.AbstractC3047b, j$.util.stream.InterfaceC3077h, j$.util.stream.G
    public final /* bridge */ /* synthetic */ G sequential() {
        switch (this.f33474l) {
            case 0:
                sequential();
                return this;
            default:
                sequential();
                return this;
        }
    }

    @Override // j$.util.stream.AbstractC3047b, j$.util.stream.InterfaceC3077h
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        switch (this.f33474l) {
            case 0:
                return spliterator();
            default:
                return spliterator();
        }
    }

    @Override // j$.util.stream.InterfaceC3077h
    public final InterfaceC3077h unordered() {
        switch (this.f33474l) {
            case 0:
                return !H() ? this : new A(this, EnumC3066e3.f33721r, 0);
            default:
                return !H() ? this : new A(this, EnumC3066e3.f33721r, 0);
        }
    }
}
