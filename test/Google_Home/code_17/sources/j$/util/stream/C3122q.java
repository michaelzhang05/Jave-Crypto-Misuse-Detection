package j$.util.stream;

import java.util.HashSet;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* renamed from: j$.util.stream.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3122q extends AbstractC3105m2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33796b;

    /* renamed from: c, reason: collision with root package name */
    Object f33797c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3122q(AbstractC3047b abstractC3047b, InterfaceC3125q2 interfaceC3125q2, int i8) {
        super(interfaceC3125q2);
        this.f33796b = i8;
        this.f33797c = abstractC3047b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3122q(InterfaceC3125q2 interfaceC3125q2) {
        super(interfaceC3125q2);
        this.f33796b = 0;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f33796b) {
            case 0:
                if (((HashSet) this.f33797c).contains(obj)) {
                    return;
                }
                ((HashSet) this.f33797c).add(obj);
                this.f33772a.accept((InterfaceC3125q2) obj);
                return;
            case 1:
                ((Consumer) ((C3146v) this.f33797c).f33826n).accept(obj);
                this.f33772a.accept((InterfaceC3125q2) obj);
                return;
            case 2:
                if (((Predicate) ((C3146v) this.f33797c).f33826n).test(obj)) {
                    this.f33772a.accept((InterfaceC3125q2) obj);
                    return;
                }
                return;
            case 3:
                this.f33772a.accept((InterfaceC3125q2) ((C3070f2) this.f33797c).f33734n.apply(obj));
                return;
            case 4:
                this.f33772a.accept(((ToIntFunction) ((Y) this.f33797c).f33655n).applyAsInt(obj));
                return;
            case 5:
                this.f33772a.accept(((ToLongFunction) ((C3088j0) this.f33797c).f33759n).applyAsLong(obj));
                return;
            default:
                this.f33772a.accept(((ToDoubleFunction) ((C3150w) this.f33797c).f33834n).applyAsDouble(obj));
                return;
        }
    }

    @Override // j$.util.stream.AbstractC3105m2, j$.util.stream.InterfaceC3125q2
    public void j() {
        switch (this.f33796b) {
            case 0:
                this.f33797c = null;
                this.f33772a.j();
                return;
            default:
                super.j();
                return;
        }
    }

    @Override // j$.util.stream.AbstractC3105m2, j$.util.stream.InterfaceC3125q2
    public void k(long j8) {
        switch (this.f33796b) {
            case 0:
                this.f33797c = new HashSet();
                this.f33772a.k(-1L);
                return;
            case 1:
            default:
                super.k(j8);
                return;
            case 2:
                this.f33772a.k(-1L);
                return;
        }
    }
}
