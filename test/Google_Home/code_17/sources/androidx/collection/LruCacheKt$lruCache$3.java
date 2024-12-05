package androidx.collection;

import O5.I;
import a6.InterfaceC1670p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
public final class LruCacheKt$lruCache$3 extends AbstractC3256z implements InterfaceC1670p {
    public static final LruCacheKt$lruCache$3 INSTANCE = new LruCacheKt$lruCache$3();

    public LruCacheKt$lruCache$3() {
        super(4);
    }

    public final void invoke(boolean z8, Object obj, Object obj2, Object obj3) {
        AbstractC3255y.i(obj, "<anonymous parameter 1>");
        AbstractC3255y.i(obj2, "<anonymous parameter 2>");
    }

    @Override // a6.InterfaceC1670p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke(((Boolean) obj).booleanValue(), obj2, obj3, obj4);
        return I.f8278a;
    }
}
