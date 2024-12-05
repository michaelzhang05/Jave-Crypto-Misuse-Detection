package kotlin.reflect.x.internal.l0.i;

import android.R;
import java.util.Collection;
import java.util.LinkedList;
import kotlin.collections.r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.utils.f;
import kotlin.u;

/* compiled from: overridingUtils.kt */
/* loaded from: classes2.dex */
public final class l {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [H] */
    /* compiled from: overridingUtils.kt */
    /* loaded from: classes2.dex */
    public static final class a<H> extends Lambda implements Function1<H, u> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ f<H> f20859f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f<H> fVar) {
            super(1);
            this.f20859f = fVar;
        }

        public final void b(H h2) {
            f<H> fVar = this.f20859f;
            kotlin.jvm.internal.l.e(h2, "it");
            fVar.add(h2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ u invoke(Object obj) {
            b(obj);
            return u.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <H> Collection<H> a(Collection<? extends H> collection, Function1<? super H, ? extends kotlin.reflect.jvm.internal.impl.descriptors.a> function1) {
        kotlin.jvm.internal.l.f(collection, "<this>");
        kotlin.jvm.internal.l.f(function1, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        f a2 = f.f22019f.a();
        while (!linkedList.isEmpty()) {
            Object R = r.R(linkedList);
            f a3 = f.f22019f.a();
            Collection<R.attr> p = j.p(R, linkedList, function1, new a(a3));
            kotlin.jvm.internal.l.e(p, "val conflictedHandles = …nflictedHandles.add(it) }");
            if (p.size() == 1 && a3.isEmpty()) {
                Object m0 = r.m0(p);
                kotlin.jvm.internal.l.e(m0, "overridableGroup.single()");
                a2.add(m0);
            } else {
                R.attr attrVar = (Object) j.L(p, function1);
                kotlin.jvm.internal.l.e(attrVar, "selectMostSpecificMember…roup, descriptorByHandle)");
                kotlin.reflect.jvm.internal.impl.descriptors.a invoke = function1.invoke(attrVar);
                for (R.attr attrVar2 : p) {
                    kotlin.jvm.internal.l.e(attrVar2, "it");
                    if (!j.B(invoke, function1.invoke(attrVar2))) {
                        a3.add(attrVar2);
                    }
                }
                if (!a3.isEmpty()) {
                    a2.addAll(a3);
                }
                a2.add(attrVar);
            }
        }
        return a2;
    }
}
