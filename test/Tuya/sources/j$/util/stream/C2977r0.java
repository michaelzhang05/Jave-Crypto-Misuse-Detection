package j$.util.stream;

import java.util.function.Predicate;

/* renamed from: j$.util.stream.r0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2977r0 extends AbstractC2997v0 {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ EnumC3001w0 f32610c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Predicate f32611d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2977r0(EnumC3001w0 enumC3001w0, Predicate predicate) {
        super(enumC3001w0);
        this.f32610c = enumC3001w0;
        this.f32611d = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        boolean z8;
        boolean z9;
        if (this.f32633a) {
            return;
        }
        boolean test = this.f32611d.test(obj);
        EnumC3001w0 enumC3001w0 = this.f32610c;
        z8 = enumC3001w0.f32642a;
        if (test == z8) {
            this.f32633a = true;
            z9 = enumC3001w0.f32643b;
            this.f32634b = z9;
        }
    }
}
