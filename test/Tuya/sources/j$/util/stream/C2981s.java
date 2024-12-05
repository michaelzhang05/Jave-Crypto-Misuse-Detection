package j$.util.stream;

import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2981s implements DoubleConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2975q2 f32615a;

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d8) {
        this.f32615a.accept(d8);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }
}
