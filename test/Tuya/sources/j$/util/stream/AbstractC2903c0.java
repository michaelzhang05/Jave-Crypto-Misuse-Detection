package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.c0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2903c0 extends AbstractC2908d0 {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f32495l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC2903c0(AbstractC2897b abstractC2897b, int i8, int i9) {
        super(abstractC2897b, i8);
        this.f32495l = i9;
    }

    @Override // j$.util.stream.AbstractC2897b
    final boolean M() {
        switch (this.f32495l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.AbstractC2897b, j$.util.stream.InterfaceC2927h, j$.util.stream.G
    public final /* bridge */ /* synthetic */ IntStream parallel() {
        switch (this.f32495l) {
            case 0:
                parallel();
                return this;
            default:
                parallel();
                return this;
        }
    }

    @Override // j$.util.stream.AbstractC2897b, j$.util.stream.InterfaceC2927h, j$.util.stream.G
    public final /* bridge */ /* synthetic */ IntStream sequential() {
        switch (this.f32495l) {
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
        switch (this.f32495l) {
            case 0:
                return spliterator();
            default:
                return spliterator();
        }
    }

    @Override // j$.util.stream.InterfaceC2927h
    public final InterfaceC2927h unordered() {
        switch (this.f32495l) {
            case 0:
                return !H() ? this : new C3004x(this, EnumC2916e3.f32527r, 2);
            default:
                return !H() ? this : new C3004x(this, EnumC2916e3.f32527r, 2);
        }
    }
}
