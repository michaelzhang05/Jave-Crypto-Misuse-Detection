package kotlin.reflect.x.internal.l0.m;

import cm.aptoide.pt.database.room.RoomNotification;
import kotlin.jvm.internal.l;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.x.internal.l0.m.a;

/* compiled from: ArrayMapOwner.kt */
/* loaded from: classes2.dex */
public final class n<K, V, T extends V> extends a.AbstractC0360a<K, V, T> implements ReadOnlyProperty<a<K, V>, V> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(KClass<? extends K> kClass, int i2) {
        super(kClass, i2);
        l.f(kClass, RoomNotification.KEY);
    }

    @Override // kotlin.properties.ReadOnlyProperty
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public T a(a<K, V> aVar, KProperty<?> kProperty) {
        l.f(aVar, "thisRef");
        l.f(kProperty, "property");
        return c(aVar);
    }
}
