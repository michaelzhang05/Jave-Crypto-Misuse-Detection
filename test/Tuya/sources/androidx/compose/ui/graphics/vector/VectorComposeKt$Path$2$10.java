package androidx.compose.ui.graphics.vector;

import L5.I;
import X5.n;
import androidx.compose.ui.graphics.StrokeCap;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class VectorComposeKt$Path$2$10 extends AbstractC3160z implements n {
    public static final VectorComposeKt$Path$2$10 INSTANCE = new VectorComposeKt$Path$2$10();

    VectorComposeKt$Path$2$10() {
        super(2);
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        m3537invokeCSYIeUk((PathComponent) obj, ((StrokeCap) obj2).m3300unboximpl());
        return I.f6487a;
    }

    /* renamed from: invoke-CSYIeUk, reason: not valid java name */
    public final void m3537invokeCSYIeUk(PathComponent pathComponent, int i8) {
        pathComponent.m3530setStrokeLineCapBeK7IIE(i8);
    }
}
