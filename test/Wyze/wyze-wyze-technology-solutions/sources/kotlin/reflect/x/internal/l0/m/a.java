package kotlin.reflect.x.internal.l0.m;

import cm.aptoide.pt.database.room.RoomNotification;
import java.util.Iterator;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.reflect.KClass;

/* compiled from: ArrayMapOwner.kt */
/* loaded from: classes2.dex */
public abstract class a<K, V> implements Iterable<V>, KMappedMarker {

    /* compiled from: ArrayMapOwner.kt */
    /* renamed from: kotlin.f0.x.e.l0.m.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC0360a<K, V, T extends V> {
        private final KClass<? extends K> a;

        /* renamed from: b, reason: collision with root package name */
        private final int f21396b;

        public AbstractC0360a(KClass<? extends K> kClass, int i2) {
            l.f(kClass, RoomNotification.KEY);
            this.a = kClass;
            this.f21396b = i2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final T c(a<K, V> aVar) {
            l.f(aVar, "thisRef");
            return aVar.a().get(this.f21396b);
        }
    }

    protected abstract c<V> a();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract s<K, V> b();

    public final boolean isEmpty() {
        return a().a() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<V> iterator() {
        return a().iterator();
    }
}
