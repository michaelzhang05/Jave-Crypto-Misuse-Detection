package kotlin.reflect.x.internal.l0.l.u1;

import java.util.Arrays;
import java.util.List;
import kotlin.collections.t;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.l.a1;
import kotlin.reflect.x.internal.l0.l.e1;
import kotlin.reflect.x.internal.l0.l.g1;
import kotlin.reflect.x.internal.l0.l.m0;

/* compiled from: ErrorType.kt */
/* loaded from: classes2.dex */
public final class h extends m0 {

    /* renamed from: g, reason: collision with root package name */
    private final e1 f21349g;

    /* renamed from: h, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.i.w.h f21350h;

    /* renamed from: i, reason: collision with root package name */
    private final j f21351i;

    /* renamed from: j, reason: collision with root package name */
    private final List<g1> f21352j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f21353k;
    private final String[] l;
    private final String m;

    public /* synthetic */ h(e1 e1Var, kotlin.reflect.x.internal.l0.i.w.h hVar, j jVar, List list, boolean z, String[] strArr, int i2, g gVar) {
        this(e1Var, hVar, jVar, (i2 & 8) != 0 ? t.i() : list, (i2 & 16) != 0 ? false : z, strArr);
    }

    @Override // kotlin.reflect.x.internal.l0.l.e0
    public List<g1> M0() {
        return this.f21352j;
    }

    @Override // kotlin.reflect.x.internal.l0.l.e0
    public a1 N0() {
        return a1.f21185g.h();
    }

    @Override // kotlin.reflect.x.internal.l0.l.e0
    public e1 O0() {
        return this.f21349g;
    }

    @Override // kotlin.reflect.x.internal.l0.l.e0
    public boolean P0() {
        return this.f21353k;
    }

    @Override // kotlin.reflect.x.internal.l0.l.q1
    /* renamed from: V0 */
    public m0 S0(boolean z) {
        e1 O0 = O0();
        kotlin.reflect.x.internal.l0.i.w.h q = q();
        j jVar = this.f21351i;
        List<g1> M0 = M0();
        String[] strArr = this.l;
        return new h(O0, q, jVar, M0, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // kotlin.reflect.x.internal.l0.l.q1
    /* renamed from: W0 */
    public m0 U0(a1 a1Var) {
        l.f(a1Var, "newAttributes");
        return this;
    }

    public final String X0() {
        return this.m;
    }

    public final j Y0() {
        return this.f21351i;
    }

    @Override // kotlin.reflect.x.internal.l0.l.q1
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public h Y0(kotlin.reflect.x.internal.l0.l.t1.g gVar) {
        l.f(gVar, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.x.internal.l0.l.e0
    public kotlin.reflect.x.internal.l0.i.w.h q() {
        return this.f21350h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(e1 e1Var, kotlin.reflect.x.internal.l0.i.w.h hVar, j jVar, List<? extends g1> list, boolean z, String... strArr) {
        l.f(e1Var, "constructor");
        l.f(hVar, "memberScope");
        l.f(jVar, "kind");
        l.f(list, "arguments");
        l.f(strArr, "formatParams");
        this.f21349g = e1Var;
        this.f21350h = hVar;
        this.f21351i = jVar;
        this.f21352j = list;
        this.f21353k = z;
        this.l = strArr;
        StringCompanionObject stringCompanionObject = StringCompanionObject.a;
        String f2 = jVar.f();
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        String format = String.format(f2, Arrays.copyOf(copyOf, copyOf.length));
        l.e(format, "format(format, *args)");
        this.m = format;
    }
}
