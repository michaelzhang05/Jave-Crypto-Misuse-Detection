package kotlin.reflect.x.internal.l0.l;

import cm.aptoide.pt.database.room.RoomNotification;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.g;

/* compiled from: TypeSubstitution.kt */
/* loaded from: classes2.dex */
public class q extends j1 {

    /* renamed from: c, reason: collision with root package name */
    private final j1 f21285c;

    public q(j1 j1Var) {
        l.f(j1Var, "substitution");
        this.f21285c = j1Var;
    }

    @Override // kotlin.reflect.x.internal.l0.l.j1
    public boolean a() {
        return this.f21285c.a();
    }

    @Override // kotlin.reflect.x.internal.l0.l.j1
    public g d(g gVar) {
        l.f(gVar, "annotations");
        return this.f21285c.d(gVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.j1
    public g1 e(e0 e0Var) {
        l.f(e0Var, RoomNotification.KEY);
        return this.f21285c.e(e0Var);
    }

    @Override // kotlin.reflect.x.internal.l0.l.j1
    public boolean f() {
        return this.f21285c.f();
    }

    @Override // kotlin.reflect.x.internal.l0.l.j1
    public e0 g(e0 e0Var, r1 r1Var) {
        l.f(e0Var, "topLevelType");
        l.f(r1Var, "position");
        return this.f21285c.g(e0Var, r1Var);
    }
}
