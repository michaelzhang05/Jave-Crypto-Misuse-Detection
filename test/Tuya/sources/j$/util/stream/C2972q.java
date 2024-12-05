package j$.util.stream;

import java.util.HashSet;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* renamed from: j$.util.stream.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2972q extends AbstractC2955m2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32602b;

    /* renamed from: c, reason: collision with root package name */
    Object f32603c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2972q(AbstractC2897b abstractC2897b, InterfaceC2975q2 interfaceC2975q2, int i8) {
        super(interfaceC2975q2);
        this.f32602b = i8;
        this.f32603c = abstractC2897b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2972q(InterfaceC2975q2 interfaceC2975q2) {
        super(interfaceC2975q2);
        this.f32602b = 0;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f32602b) {
            case 0:
                if (((HashSet) this.f32603c).contains(obj)) {
                    return;
                }
                ((HashSet) this.f32603c).add(obj);
                this.f32578a.accept((InterfaceC2975q2) obj);
                return;
            case 1:
                ((Consumer) ((C2996v) this.f32603c).f32632n).accept(obj);
                this.f32578a.accept((InterfaceC2975q2) obj);
                return;
            case 2:
                if (((Predicate) ((C2996v) this.f32603c).f32632n).test(obj)) {
                    this.f32578a.accept((InterfaceC2975q2) obj);
                    return;
                }
                return;
            case 3:
                this.f32578a.accept((InterfaceC2975q2) ((C2920f2) this.f32603c).f32540n.apply(obj));
                return;
            case 4:
                this.f32578a.accept(((ToIntFunction) ((Y) this.f32603c).f32461n).applyAsInt(obj));
                return;
            case 5:
                this.f32578a.accept(((ToLongFunction) ((C2938j0) this.f32603c).f32565n).applyAsLong(obj));
                return;
            default:
                this.f32578a.accept(((ToDoubleFunction) ((C3000w) this.f32603c).f32640n).applyAsDouble(obj));
                return;
        }
    }

    @Override // j$.util.stream.AbstractC2955m2, j$.util.stream.InterfaceC2975q2
    public void j() {
        switch (this.f32602b) {
            case 0:
                this.f32603c = null;
                this.f32578a.j();
                return;
            default:
                super.j();
                return;
        }
    }

    @Override // j$.util.stream.AbstractC2955m2, j$.util.stream.InterfaceC2975q2
    public void k(long j8) {
        switch (this.f32602b) {
            case 0:
                this.f32603c = new HashSet();
                this.f32578a.k(-1L);
                return;
            case 1:
            default:
                super.k(j8);
                return;
            case 2:
                this.f32578a.k(-1L);
                return;
        }
    }
}
