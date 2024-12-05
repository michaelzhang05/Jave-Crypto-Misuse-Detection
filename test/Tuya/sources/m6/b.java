package m6;

import L5.I;
import L5.s;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3159y;
import l6.InterfaceC3349K;

/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private d[] f35871a;

    /* renamed from: b, reason: collision with root package name */
    private int f35872b;

    /* renamed from: c, reason: collision with root package name */
    private int f35873c;

    /* renamed from: d, reason: collision with root package name */
    private y f35874d;

    public static final /* synthetic */ int f(b bVar) {
        return bVar.f35872b;
    }

    public static final /* synthetic */ d[] g(b bVar) {
        return bVar.f35871a;
    }

    public final InterfaceC3349K e() {
        y yVar;
        synchronized (this) {
            yVar = this.f35874d;
            if (yVar == null) {
                yVar = new y(this.f35872b);
                this.f35874d = yVar;
            }
        }
        return yVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final d h() {
        d dVar;
        y yVar;
        synchronized (this) {
            try {
                d[] dVarArr = this.f35871a;
                if (dVarArr == null) {
                    dVarArr = j(2);
                    this.f35871a = dVarArr;
                } else if (this.f35872b >= dVarArr.length) {
                    Object[] copyOf = Arrays.copyOf(dVarArr, dVarArr.length * 2);
                    AbstractC3159y.h(copyOf, "copyOf(this, newSize)");
                    this.f35871a = (d[]) copyOf;
                    dVarArr = (d[]) copyOf;
                }
                int i8 = this.f35873c;
                do {
                    dVar = dVarArr[i8];
                    if (dVar == null) {
                        dVar = i();
                        dVarArr[i8] = dVar;
                    }
                    i8++;
                    if (i8 >= dVarArr.length) {
                        i8 = 0;
                    }
                    AbstractC3159y.g(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!dVar.a(this));
                this.f35873c = i8;
                this.f35872b++;
                yVar = this.f35874d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (yVar != null) {
            yVar.Z(1);
        }
        return dVar;
    }

    protected abstract d i();

    protected abstract d[] j(int i8);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k(d dVar) {
        y yVar;
        int i8;
        P5.d[] b8;
        synchronized (this) {
            try {
                int i9 = this.f35872b - 1;
                this.f35872b = i9;
                yVar = this.f35874d;
                if (i9 == 0) {
                    this.f35873c = 0;
                }
                AbstractC3159y.g(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b8 = dVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (P5.d dVar2 : b8) {
            if (dVar2 != null) {
                s.a aVar = L5.s.f6511b;
                dVar2.resumeWith(L5.s.b(I.f6487a));
            }
        }
        if (yVar != null) {
            yVar.Z(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int l() {
        return this.f35872b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final d[] m() {
        return this.f35871a;
    }
}
