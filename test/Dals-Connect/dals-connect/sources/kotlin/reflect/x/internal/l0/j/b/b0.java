package kotlin.reflect.x.internal.l0.j.b;

import cm.aptoide.pt.dataprovider.model.v7.store.Store;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.x.internal.l0.e.j;
import kotlin.reflect.x.internal.l0.e.x;

/* compiled from: ProtoEnumFlagsUtils.kt */
/* loaded from: classes2.dex */
public final class b0 {

    /* compiled from: ProtoEnumFlagsUtils.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f20980b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f20981c;

        static {
            int[] iArr = new int[j.values().length];
            iArr[j.DECLARATION.ordinal()] = 1;
            iArr[j.FAKE_OVERRIDE.ordinal()] = 2;
            iArr[j.DELEGATION.ordinal()] = 3;
            iArr[j.SYNTHESIZED.ordinal()] = 4;
            a = iArr;
            int[] iArr2 = new int[b.a.values().length];
            iArr2[b.a.DECLARATION.ordinal()] = 1;
            iArr2[b.a.FAKE_OVERRIDE.ordinal()] = 2;
            iArr2[b.a.DELEGATION.ordinal()] = 3;
            iArr2[b.a.SYNTHESIZED.ordinal()] = 4;
            f20980b = iArr2;
            int[] iArr3 = new int[x.values().length];
            iArr3[x.INTERNAL.ordinal()] = 1;
            iArr3[x.PRIVATE.ordinal()] = 2;
            iArr3[x.PRIVATE_TO_THIS.ordinal()] = 3;
            iArr3[x.PROTECTED.ordinal()] = 4;
            iArr3[x.PUBLIC.ordinal()] = 5;
            iArr3[x.LOCAL.ordinal()] = 6;
            f20981c = iArr3;
        }
    }

    public static final u a(a0 a0Var, x xVar) {
        l.f(a0Var, "<this>");
        switch (xVar == null ? -1 : a.f20981c[xVar.ordinal()]) {
            case 1:
                u uVar = t.f21862d;
                l.e(uVar, "INTERNAL");
                return uVar;
            case 2:
                u uVar2 = t.a;
                l.e(uVar2, "PRIVATE");
                return uVar2;
            case 3:
                u uVar3 = t.f21860b;
                l.e(uVar3, "PRIVATE_TO_THIS");
                return uVar3;
            case 4:
                u uVar4 = t.f21861c;
                l.e(uVar4, "PROTECTED");
                return uVar4;
            case 5:
                u uVar5 = t.f21863e;
                l.e(uVar5, Store.PUBLIC_ACCESS);
                return uVar5;
            case 6:
                u uVar6 = t.f21864f;
                l.e(uVar6, "LOCAL");
                return uVar6;
            default:
                u uVar7 = t.a;
                l.e(uVar7, "PRIVATE");
                return uVar7;
        }
    }

    public static final b.a b(a0 a0Var, j jVar) {
        l.f(a0Var, "<this>");
        int i2 = jVar == null ? -1 : a.a[jVar.ordinal()];
        if (i2 == 1) {
            return b.a.DECLARATION;
        }
        if (i2 == 2) {
            return b.a.FAKE_OVERRIDE;
        }
        if (i2 == 3) {
            return b.a.DELEGATION;
        }
        if (i2 != 4) {
            return b.a.DECLARATION;
        }
        return b.a.SYNTHESIZED;
    }
}
