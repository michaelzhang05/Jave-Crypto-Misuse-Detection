package kotlin.reflect.x.internal.l0.l;

import cm.aptoide.pt.database.room.RoomNotification;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.h;

/* compiled from: TypeSubstitution.kt */
/* loaded from: classes2.dex */
public final class c0 extends j1 {

    /* renamed from: c, reason: collision with root package name */
    private final e1[] f21187c;

    /* renamed from: d, reason: collision with root package name */
    private final g1[] f21188d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f21189e;

    public /* synthetic */ c0(e1[] e1VarArr, g1[] g1VarArr, boolean z, int i2, g gVar) {
        this(e1VarArr, g1VarArr, (i2 & 4) != 0 ? false : z);
    }

    @Override // kotlin.reflect.x.internal.l0.l.j1
    public boolean b() {
        return this.f21189e;
    }

    @Override // kotlin.reflect.x.internal.l0.l.j1
    public g1 e(e0 e0Var) {
        l.f(e0Var, RoomNotification.KEY);
        h c2 = e0Var.O0().c();
        e1 e1Var = c2 instanceof e1 ? (e1) c2 : null;
        if (e1Var == null) {
            return null;
        }
        int f2 = e1Var.f();
        e1[] e1VarArr = this.f21187c;
        if (f2 >= e1VarArr.length || !l.a(e1VarArr[f2].g(), e1Var.g())) {
            return null;
        }
        return this.f21188d[f2];
    }

    @Override // kotlin.reflect.x.internal.l0.l.j1
    public boolean f() {
        return this.f21188d.length == 0;
    }

    public final g1[] i() {
        return this.f21188d;
    }

    public final e1[] j() {
        return this.f21187c;
    }

    public c0(e1[] e1VarArr, g1[] g1VarArr, boolean z) {
        l.f(e1VarArr, "parameters");
        l.f(g1VarArr, "arguments");
        this.f21187c = e1VarArr;
        this.f21188d = g1VarArr;
        this.f21189e = z;
        int length = e1VarArr.length;
        int length2 = g1VarArr.length;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c0(java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.e1> r9, java.util.List<? extends kotlin.reflect.x.internal.l0.l.g1> r10) {
        /*
            r8 = this;
            java.lang.String r0 = "parameters"
            kotlin.jvm.internal.l.f(r9, r0)
            java.lang.String r0 = "argumentsList"
            kotlin.jvm.internal.l.f(r10, r0)
            r0 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.e1[] r1 = new kotlin.reflect.jvm.internal.impl.descriptors.e1[r0]
            java.lang.Object[] r9 = r9.toArray(r1)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            kotlin.jvm.internal.l.d(r9, r1)
            r3 = r9
            kotlin.reflect.jvm.internal.impl.descriptors.e1[] r3 = (kotlin.reflect.jvm.internal.impl.descriptors.e1[]) r3
            kotlin.f0.x.e.l0.l.g1[] r9 = new kotlin.reflect.x.internal.l0.l.g1[r0]
            java.lang.Object[] r9 = r10.toArray(r9)
            kotlin.jvm.internal.l.d(r9, r1)
            r4 = r9
            kotlin.f0.x.e.l0.l.g1[] r4 = (kotlin.reflect.x.internal.l0.l.g1[]) r4
            r5 = 0
            r6 = 4
            r7 = 0
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.l0.l.c0.<init>(java.util.List, java.util.List):void");
    }
}
