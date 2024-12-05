package j$.util.stream;

import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3131s implements DoubleConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3125q2 f33809a;

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d8) {
        this.f33809a.accept(d8);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }
}
