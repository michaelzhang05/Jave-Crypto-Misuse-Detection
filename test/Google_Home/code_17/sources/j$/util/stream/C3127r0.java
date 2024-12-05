package j$.util.stream;

import java.util.function.Predicate;

/* renamed from: j$.util.stream.r0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3127r0 extends AbstractC3147v0 {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ EnumC3151w0 f33804c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Predicate f33805d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3127r0(EnumC3151w0 enumC3151w0, Predicate predicate) {
        super(enumC3151w0);
        this.f33804c = enumC3151w0;
        this.f33805d = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        boolean z8;
        boolean z9;
        if (this.f33827a) {
            return;
        }
        boolean test = this.f33805d.test(obj);
        EnumC3151w0 enumC3151w0 = this.f33804c;
        z8 = enumC3151w0.f33836a;
        if (test == z8) {
            this.f33827a = true;
            z9 = enumC3151w0.f33837b;
            this.f33828b = z9;
        }
    }
}
