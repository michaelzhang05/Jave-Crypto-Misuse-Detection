package kotlin.reflect.x.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.x.internal.KMutableProperty2Impl;

/* JADX INFO: Add missing generic type declarations: [D, E, V] */
/* compiled from: KProperty2Impl.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0000\u001a.\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004 \u0005*\u0016\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/KMutableProperty2Impl$Setter;", "D", "E", "V", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
final class n<D, E, V> extends Lambda implements Function0<KMutableProperty2Impl.a<D, E, V>> {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ KMutableProperty2Impl<D, E, V> f21465f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(KMutableProperty2Impl<D, E, V> kMutableProperty2Impl) {
        super(0);
        this.f21465f = kMutableProperty2Impl;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final KMutableProperty2Impl.a<D, E, V> invoke() {
        return new KMutableProperty2Impl.a<>(this.f21465f);
    }
}
