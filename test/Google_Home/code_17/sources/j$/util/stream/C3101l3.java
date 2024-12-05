package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.l3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3101l3 extends AbstractC3106m3 implements Consumer {

    /* renamed from: b, reason: collision with root package name */
    final Object[] f33768b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3101l3(int i8) {
        this.f33768b = new Object[i8];
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i8 = this.f33773a;
        this.f33773a = i8 + 1;
        this.f33768b[i8] = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
