package androidx.compose.ui.graphics.vector;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.ui.graphics.StrokeCap;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class VectorComposeKt$Path$2$10 extends AbstractC3256z implements InterfaceC1668n {
    public static final VectorComposeKt$Path$2$10 INSTANCE = new VectorComposeKt$Path$2$10();

    VectorComposeKt$Path$2$10() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        m3542invokeCSYIeUk((PathComponent) obj, ((StrokeCap) obj2).m3305unboximpl());
        return I.f8278a;
    }

    /* renamed from: invoke-CSYIeUk, reason: not valid java name */
    public final void m3542invokeCSYIeUk(PathComponent pathComponent, int i8) {
        pathComponent.m3535setStrokeLineCapBeK7IIE(i8);
    }
}
