package kotlin.reflect.x.internal.l0.i;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.b0;
import kotlin.collections.t;
import kotlin.comparisons.b;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.i.w.d;
import kotlin.reflect.x.internal.l0.i.w.h;
import kotlin.reflect.x.internal.l0.i.w.k;

/* compiled from: SealedClassInheritorsProvider.kt */
/* loaded from: classes2.dex */
public final class a extends o {
    public static final a a = new a();

    /* compiled from: Comparisons.kt */
    /* renamed from: kotlin.f0.x.e.l0.i.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0335a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int a;
            a = b.a(kotlin.reflect.x.internal.l0.i.t.a.h((e) t).b(), kotlin.reflect.x.internal.l0.i.t.a.h((e) t2).b());
            return a;
        }
    }

    private a() {
    }

    private static final void b(e eVar, LinkedHashSet<e> linkedHashSet, h hVar, boolean z) {
        for (m mVar : k.a.a(hVar, d.r, null, 2, null)) {
            if (mVar instanceof e) {
                e eVar2 = (e) mVar;
                if (eVar2.M()) {
                    f name = eVar2.getName();
                    l.e(name, "descriptor.name");
                    kotlin.reflect.jvm.internal.impl.descriptors.h f2 = hVar.f(name, kotlin.reflect.x.internal.l0.c.b.d.WHEN_GET_ALL_DESCRIPTORS);
                    if (f2 instanceof e) {
                        eVar2 = (e) f2;
                    } else {
                        eVar2 = f2 instanceof d1 ? ((d1) f2).r() : null;
                    }
                }
                if (eVar2 != null) {
                    if (d.z(eVar2, eVar)) {
                        linkedHashSet.add(eVar2);
                    }
                    if (z) {
                        h y0 = eVar2.y0();
                        l.e(y0, "refinedDescriptor.unsubstitutedInnerClassesScope");
                        b(eVar, linkedHashSet, y0, z);
                    }
                }
            }
        }
    }

    public Collection<e> a(e eVar, boolean z) {
        m mVar;
        m mVar2;
        List r0;
        List i2;
        l.f(eVar, "sealedClass");
        if (eVar.j() != d0.SEALED) {
            i2 = t.i();
            return i2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!z) {
            mVar2 = eVar.b();
        } else {
            Iterator<m> it = kotlin.reflect.x.internal.l0.i.t.a.m(eVar).iterator();
            while (true) {
                if (!it.hasNext()) {
                    mVar = null;
                    break;
                }
                mVar = it.next();
                if (mVar instanceof k0) {
                    break;
                }
            }
            mVar2 = mVar;
        }
        if (mVar2 instanceof k0) {
            b(eVar, linkedHashSet, ((k0) mVar2).q(), z);
        }
        h y0 = eVar.y0();
        l.e(y0, "sealedClass.unsubstitutedInnerClassesScope");
        b(eVar, linkedHashSet, y0, true);
        r0 = b0.r0(linkedHashSet, new C0335a());
        return r0;
    }
}
