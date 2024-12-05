package kotlin.reflect.jvm.internal.impl.descriptors.o1;

import java.util.Collection;
import java.util.List;
import kotlin.collections.t;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.l.e0;

/* compiled from: AdditionalClassPartsProvider.kt */
/* loaded from: classes2.dex */
public interface a {

    /* compiled from: AdditionalClassPartsProvider.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.o1.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0367a implements a {
        public static final C0367a a = new C0367a();

        private C0367a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o1.a
        public Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> a(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
            List i2;
            l.f(eVar, "classDescriptor");
            i2 = t.i();
            return i2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o1.a
        public Collection<y0> b(f fVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
            List i2;
            l.f(fVar, "name");
            l.f(eVar, "classDescriptor");
            i2 = t.i();
            return i2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o1.a
        public Collection<e0> d(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
            List i2;
            l.f(eVar, "classDescriptor");
            i2 = t.i();
            return i2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o1.a
        public Collection<f> e(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
            List i2;
            l.f(eVar, "classDescriptor");
            i2 = t.i();
            return i2;
        }
    }

    Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> a(kotlin.reflect.jvm.internal.impl.descriptors.e eVar);

    Collection<y0> b(f fVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar);

    Collection<e0> d(kotlin.reflect.jvm.internal.impl.descriptors.e eVar);

    Collection<f> e(kotlin.reflect.jvm.internal.impl.descriptors.e eVar);
}
