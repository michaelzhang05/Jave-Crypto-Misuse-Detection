package kotlin.reflect.x.internal.l0.d.a.j0;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.i1;
import kotlin.reflect.x.internal.l0.f.f;
import kotlin.reflect.x.internal.l0.i.h;
import kotlin.reflect.x.internal.l0.i.j;
import kotlin.reflect.x.internal.l0.j.b.r;
import kotlin.u;

/* compiled from: DescriptorResolverUtils.java */
/* loaded from: classes2.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DescriptorResolverUtils.java */
    /* renamed from: kotlin.f0.x.e.l0.d.a.j0.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0287a extends h {
        final /* synthetic */ r a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f19912b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f19913c;

        /* compiled from: DescriptorResolverUtils.java */
        /* renamed from: kotlin.f0.x.e.l0.d.a.j0.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class C0288a implements Function1<b, u> {
            C0288a() {
            }

            private static /* synthetic */ void b(int i2) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"));
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public u invoke(b bVar) {
                if (bVar == null) {
                    b(0);
                }
                C0287a.this.a.a(bVar);
                return u.a;
            }
        }

        C0287a(r rVar, Set set, boolean z) {
            this.a = rVar;
            this.f19912b = set;
            this.f19913c = z;
        }

        private static /* synthetic */ void f(int i2) {
            Object[] objArr = new Object[3];
            if (i2 == 1) {
                objArr[0] = "fromSuper";
            } else if (i2 == 2) {
                objArr[0] = "fromCurrent";
            } else if (i2 == 3) {
                objArr[0] = "member";
            } else if (i2 != 4) {
                objArr[0] = "fakeOverride";
            } else {
                objArr[0] = "overridden";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
            if (i2 == 1 || i2 == 2) {
                objArr[2] = "conflict";
            } else if (i2 == 3 || i2 == 4) {
                objArr[2] = "setOverriddenDescriptors";
            } else {
                objArr[2] = "addFakeOverride";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.x.internal.l0.i.i
        public void a(b bVar) {
            if (bVar == null) {
                f(0);
            }
            j.K(bVar, new C0288a());
            this.f19912b.add(bVar);
        }

        @Override // kotlin.reflect.x.internal.l0.i.i
        public void d(b bVar, Collection<? extends b> collection) {
            if (bVar == null) {
                f(3);
            }
            if (collection == null) {
                f(4);
            }
            if (!this.f19913c || bVar.i() == b.a.FAKE_OVERRIDE) {
                super.d(bVar, collection);
            }
        }

        @Override // kotlin.reflect.x.internal.l0.i.h
        public void e(b bVar, b bVar2) {
            if (bVar == null) {
                f(1);
            }
            if (bVar2 == null) {
                f(2);
            }
        }
    }

    private static /* synthetic */ void a(int i2) {
        String str = i2 != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i2 != 18 ? 3 : 2];
        switch (i2) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i2 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i2) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String format = String.format(str, objArr);
        if (i2 == 18) {
            throw new IllegalStateException(format);
        }
    }

    public static i1 b(f fVar, e eVar) {
        if (fVar == null) {
            a(19);
        }
        if (eVar == null) {
            a(20);
        }
        Collection<d> k2 = eVar.k();
        if (k2.size() != 1) {
            return null;
        }
        for (i1 i1Var : k2.iterator().next().h()) {
            if (i1Var.getName().equals(fVar)) {
                return i1Var;
            }
        }
        return null;
    }

    private static <D extends b> Collection<D> c(f fVar, Collection<D> collection, Collection<D> collection2, e eVar, r rVar, j jVar, boolean z) {
        if (fVar == null) {
            a(12);
        }
        if (collection == null) {
            a(13);
        }
        if (collection2 == null) {
            a(14);
        }
        if (eVar == null) {
            a(15);
        }
        if (rVar == null) {
            a(16);
        }
        if (jVar == null) {
            a(17);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        jVar.v(fVar, collection, collection2, eVar, new C0287a(rVar, linkedHashSet, z));
        return linkedHashSet;
    }

    public static <D extends b> Collection<D> d(f fVar, Collection<D> collection, Collection<D> collection2, e eVar, r rVar, j jVar) {
        if (fVar == null) {
            a(0);
        }
        if (collection == null) {
            a(1);
        }
        if (collection2 == null) {
            a(2);
        }
        if (eVar == null) {
            a(3);
        }
        if (rVar == null) {
            a(4);
        }
        if (jVar == null) {
            a(5);
        }
        return c(fVar, collection, collection2, eVar, rVar, jVar, false);
    }

    public static <D extends b> Collection<D> e(f fVar, Collection<D> collection, Collection<D> collection2, e eVar, r rVar, j jVar) {
        if (fVar == null) {
            a(6);
        }
        if (collection == null) {
            a(7);
        }
        if (collection2 == null) {
            a(8);
        }
        if (eVar == null) {
            a(9);
        }
        if (rVar == null) {
            a(10);
        }
        if (jVar == null) {
            a(11);
        }
        return c(fVar, collection, collection2, eVar, rVar, jVar, true);
    }
}
